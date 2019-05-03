package com.example.nz.countryprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CountryProfileActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_profile);

        imageView = (ImageView) findViewById(R.id.imageView);
        textView = (TextView) findViewById(R.id.textView);


       Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String name = bundle.getString("key");
            showDetails(name);
        }

    }

    void  showDetails (String name){
        if(name.equals("Bangladesh")){
            Toast.makeText(CountryProfileActivity.this,name,Toast.LENGTH_SHORT).show();
            imageView.setImageResource(R.drawable.bangladesh);
            textView.setText(R.string.bangladesh);
        }
        if(name.equals("Japan")){
            imageView.setImageResource(R.drawable.japan);
            textView.setText(R.string.japan);
        }
        if(name.equals("Canada")){
            imageView.setImageResource(R.drawable.canada);
            textView.setText(R.string.canada);
        }




    }



}
