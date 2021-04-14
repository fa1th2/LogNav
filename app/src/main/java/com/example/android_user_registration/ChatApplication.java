package com.example.android_user_registration;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
/*
public class ChatApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Message.class);


        // Use for monitoring Parse network traffic
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        // Can be Level.BASIC, Level.HEADERS, or Level.BODY
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        // any network interceptors must be added with the Configuration Builder given this syntax
        builder.networkInterceptors().add(httpLoggingInterceptor);

        // set applicationId and server based on the values in the Back4App settings.
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("AS8uS5tqzJRAcB5F4AqptrIdu216QQqt7l6wBaPX") // Application ID from Back4App Dashboard
                .clientKey("BfbjVuVnb8k0D0Jsp6rRkp8d5CxftcNkiY9wON3g") // Client Key from Back4App Dashboard
                .clientBuilder(builder)
                .server("https://parseapi.back4app.com").build());


    }
}
*/