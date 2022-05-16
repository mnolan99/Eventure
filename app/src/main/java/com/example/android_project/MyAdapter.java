package com.example.android_project;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;



public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    final int NUMBER_OF_DATA = 2;

    String data1[], data2[], data3[];
    int images[], videos[];
    Context context;
    double coordinates [] [];

    public MyAdapter(Context ct, String s1[], String s2[],String s3[], int img[], int vid[], double cood[][]){
        context = ct;
        data1 = s1;
        data2 = s2;
        data3  = s3;
        images = img;
        videos = vid;
        coordinates = cood;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myImage.setImageResource(images[position]);

        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, EventPage.class);
                intent.putExtra("data1",data1[position]);
                intent.putExtra("data2",data2[position]);
                intent.putExtra("data3",data3[position]);
                intent.putExtra("myImage",images[position]);
                intent.putExtra("myVideo",videos[position]);
                intent.putExtra("myCoordinates",coordinates[position]);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView myText1, myText2;
        ImageView myImage;
        ConstraintLayout mainLayout;

        public MyViewHolder(@NonNull View itemView){
            super (itemView);
            myText1 = itemView.findViewById(R.id.event_name);
            myText2 = itemView.findViewById(R.id.event_location);
            myImage = itemView.findViewById(R.id.myImage_View);
            mainLayout = itemView.findViewById(R.id.mainLayout);

        }

    }
    public String [] itemToStringArray(String item){
        int N = 26;
        int rank = 0;
        String eventArray[] = new String[NUMBER_OF_DATA];
        String data = "";
        for(int i = 0; i<N; i++)
        {
            data = data + item.charAt(i);
            if(N-i>2 && ("%!%").equals(item.charAt(i+1)+item.charAt(i+2)+item.charAt(i+3)))
            {
                eventArray[rank]=data;
                data ="";
                rank=rank+1;
                i=i+4;
            }
            if(N-1==i){
                eventArray[rank]=data;
            }
        }
        return eventArray;
    }
}
