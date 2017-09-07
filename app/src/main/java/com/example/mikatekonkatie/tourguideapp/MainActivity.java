package com.example.mikatekonkatie.tourguideapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    // image=(ImageView)findViewById(R.id.imageView3);
        AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);



        dialog.setTitle("Tour Guide Instructions")   ;


        dialog.setMessage("The tour guide consists of pictures and information to help you understand the place." +
                "Each picture in the tour guide is clear and easy to understand  \n\n.Read each description carefully and get all information you need then click to view one by one");



        dialog.setPositiveButton(" Start ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                dialog.dismiss();
            }
        });
        dialog.setNegativeButton(" Cancel ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        dialog.show();

    }


    public void malamulele(View v){
        AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);



        dialog.setTitle("Tour Guide Instructions")   ;


        dialog.setMessage("The tour guide consists of pictures and information to help you understand the place." +
                "Each picture in the tour guide is clear and easy to understand  \n\n.Read each description carefully and get all information you need then click to view one by one");



        dialog.setPositiveButton(" Start ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                dialog.dismiss();
            }
        });
        dialog.setNegativeButton(" Cancel ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        dialog.show();

    }


}

