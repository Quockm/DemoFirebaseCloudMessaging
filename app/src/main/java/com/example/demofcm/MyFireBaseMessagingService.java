package com.example.demofcm;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;

public class MyFireBaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onNewToken(@NonNull String s) {
        Log.d("BBB","The Token Refreshed:$s");
        super.onNewToken(s);
    }
}
