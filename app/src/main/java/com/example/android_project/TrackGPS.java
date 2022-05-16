package com.example.android_project;

import static android.location.LocationManager.GPS_PROVIDER;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import android.provider.Settings;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;

import android.app.Service;


public class TrackGPS extends Service implements LocationListener {
    private  final Context  ctxt;
    boolean checkGPS = false;
    boolean checkNetwork = false;
    boolean canGetLocation = false;

    Location loc;
    double latitude;
    double longitude;
    protected LocationManager locationManager;

    private final static long MINDISTANCE = 10;
    private final static long MINDELAY = 1000*60;

    public TrackGPS(Context ctxt){
        this.ctxt = ctxt;
        getLocation();
    }

    public double getLatitude() {
        if (loc!=null){return loc.getLatitude();}
        return latitude;
    }

    public double getLongitude() {
        if (loc!=null)return loc.getLongitude();
        return longitude;
    }

    public boolean canGetLocation() {
        return this.canGetLocation;
    }

    private void getLocation(){
        try {
            locationManager = (LocationManager) ctxt.getSystemService(Context.LOCATION_SERVICE);
            checkGPS = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
            checkNetwork = locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
            if (!checkNetwork && !checkGPS) {
                Toast.makeText(ctxt, "No service available", Toast.LENGTH_SHORT).show();
            }
            else {
                canGetLocation = true;
                String provider = checkNetwork ? LocationManager.NETWORK_PROVIDER : LocationManager.GPS_PROVIDER;
                try {
                    locationManager.requestLocationUpdates(
                            provider,
                            MINDELAY,
                            MINDISTANCE,this
                    );
                    if (locationManager!=null) {
                        loc = locationManager.getLastKnownLocation(provider);
                        if(loc!=null) {
                            latitude = loc.getLatitude();
                            longitude = loc.getLongitude();
                        }
                    }
                }
                catch (SecurityException e){
                    Toast.makeText(ctxt, "No permission to access provider", Toast.LENGTH_SHORT).show();
                }
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void stopGPS(){
        if (locationManager != null){
            try{
                locationManager.removeUpdates(TrackGPS.this);
            }catch (SecurityException e){
                Toast.makeText(ctxt,"No permission to access GPS",Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void  showAlert (){
        AlertDialog.Builder  dialog = new AlertDialog.Builder(ctxt);
        dialog.setTitle("GPS disabled");
        dialog.setMessage("Do you want to turn the GPS on ?");
        dialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent (Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                ctxt.startActivity(intent);
            }
        });
        dialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        dialog.show();
    }

    @Override
    public void onLocationChanged(@NonNull Location location) {

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(@NonNull String provider) {

    }

    @Override
    public void onProviderDisabled(@NonNull String provider) {

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}