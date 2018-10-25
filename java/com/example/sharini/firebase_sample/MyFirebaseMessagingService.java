package com.example.sharini.firebase_sample;


import android.util.Log;
import android.widget.Toast;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by Belal on 12/8/2017.
 */

//class extending FirebaseMessagingService
public class MyFirebaseMessagingService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        //Toast.makeText(this,"sdfsdfdrtrdtrd",Toast.LENGTH_LONG).show();
       // Log.d("receivedmessage", String.valueOf(remoteMessage.getData()));
        //if the message contains data payload
        //It is a map of custom keyvalues
        //we can read it easily
        if(remoteMessage.getData().size() > 0){
            //handle the data message here
            //Log.d("Message", String.valueOf(remoteMessage.getMessageId()));
            //Toast.makeText(this,"sdfsdfdrtrdtrd",Toast.LENGTH_LONG).show();
            String title = "hello";
            String body = "hiii";
            MyNotificationManager.getInstance(this).displayNotification(title, body);
        }

        //getting the title and the body


        //then here we can use the title and body to build a notification
       // MyNotificationManager.getInstance(this).displayNotification(title, body);
    }
}
