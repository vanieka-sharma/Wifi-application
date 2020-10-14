package com.example.mywifioperation;

import androidx.appcompat.app.AppCompatActivity;


import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aSwitch=(Switch)findViewById(R.id.switch1);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b==true)
                {
                    WifiManager wifiManager=(WifiManager)getSystemService(getApplicationContext().WIFI_SERVICE);
                    wifiManager.setWifiEnabled(true);
                    Toast.makeText(getApplicationContext(),"WIFI ON",Toast.LENGTH_LONG).show();
                }
                else{
                    WifiManager wifiManager=(WifiManager)getSystemService(getApplicationContext().WIFI_SERVICE);
                    wifiManager.setWifiEnabled(false);
                    Toast.makeText(getApplicationContext(),"WIFI OFF",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

