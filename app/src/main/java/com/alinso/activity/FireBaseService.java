package com.alinso.activity;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class FireBaseService extends FirebaseMessagingService {

    public static final String TAG = "MsgFirebaseServ";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        //check for the data/notification entry from the payload

        String title = remoteMessage.getData().get("title");
        String body = remoteMessage.getData().get("body");
        //String objectId = remoteMessage.getData().get(object_id);
        String objectType = remoteMessage.getData().get("objectType");

        System.out.println(title);

    }
}