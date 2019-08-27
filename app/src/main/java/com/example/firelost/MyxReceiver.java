package com.example.firelost;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyxReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(MainActivity.getIstance(),"ashish message",Toast.LENGTH_LONG).show();
    }
}
