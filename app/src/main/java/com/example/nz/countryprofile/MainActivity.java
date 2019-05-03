package com.example.nz.countryprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.bangladesh);
        button2 = (Button) findViewById(R.id.japan);
        button3 = (Button) findViewById(R.id.canada);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);






    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.bangladesh){
            Intent intent = new Intent(MainActivity.this,CountryProfileActivity.class);
            intent.putExtra("key","Bangladesh");
            startActivity(intent);
        }
        if(v.getId()==R.id.japan){
            Intent intent = new Intent(MainActivity.this,CountryProfileActivity.class);
            intent.putExtra("key","Japan");
            startActivity(intent);
        }
        if(v.getId()==R.id.canada){
            Intent intent = new Intent(MainActivity.this,CountryProfileActivity.class);
            intent.putExtra("key","Canada");
            startActivity(intent);
        }





    }
}
