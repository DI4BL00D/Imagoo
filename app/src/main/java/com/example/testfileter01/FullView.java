package com.example.testfileter01;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FullView extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.full_image_view);

        ImageView imageView=findViewById(R.id.img_full);
        int img_id = getIntent().getExtras().getInt("img_id");
        imageView.setImageResource(img_id);
    }
}
