package com.example.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class NativeBroadCastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e("Entry Point: ","NativeBroadCastReceiver");
        final String receiverAction="android.intent.action.AIRPLANE_MODE";
        if(intent.getAction().toString().equals(receiverAction)){
            Toast.makeText(context, "Airplane_mode activated", Toast.LENGTH_SHORT).show();
        }
    }
}
