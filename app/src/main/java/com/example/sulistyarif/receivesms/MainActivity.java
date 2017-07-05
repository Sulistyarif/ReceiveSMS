package com.example.sulistyarif.receivesms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    public class SMS extends BroadcastReceiver{
//
//        private SharedPreferences preferences;
//
//        @Override
//        public void onReceive(Context context, Intent intent) {
//
//
//        }
//    }

}
