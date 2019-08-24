package com.aldindo.ocrscanner;


import android.app.Application;

import com.google.firebase.FirebaseApp;


public class TextRec extends Application {
    public static final String Result_TEXT="Result_TEXT";

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
