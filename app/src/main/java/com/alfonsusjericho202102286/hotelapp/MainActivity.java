package com.alfonsusjericho202102286.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = findViewById(R.id.imageview1);

        String imageUrl = "https://www.jetsetter.com//uploads/sites/7/2018/04/9moWvSV8-1380x690.jpeg";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}