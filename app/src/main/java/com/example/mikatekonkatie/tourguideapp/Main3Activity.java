package com.example.mikatekonkatie.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView tv1,tv2;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tv1=(TextView)findViewById(R.id.textView);
        tv2=(TextView)findViewById(R.id.textView4);
        image=(ImageView)findViewById(R.id.imageView5);



        Intent intent = getIntent();

        MalaTouring malaTouring = (MalaTouring) intent.getSerializableExtra("name");

        tv1.setText(malaTouring.getName());
        tv2.setText(malaTouring.getDescribe());
        image.setImageResource(malaTouring.getImage());
    }
}
