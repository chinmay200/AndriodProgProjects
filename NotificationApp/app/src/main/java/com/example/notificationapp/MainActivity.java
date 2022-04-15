package com.example.notificationapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("mynotif" , "my Notif" , NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }
        btn = findViewById(R.id.notif);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this , "mynotif");
                builder.setContentTitle("My notifiacation");
                builder.setContentText("This is a notification");
                builder.setAutoCancel(true);
                builder.setSmallIcon(R.drawable.ic_launcher_foreground);

                NotificationManagerCompat managerCompat = NotificationManagerCompat.from(MainActivity.this);
                managerCompat.notify(1 , builder.build());
            }
        });
    }
}