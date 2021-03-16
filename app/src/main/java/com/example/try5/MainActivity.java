package com.example.try5;
import zendesk.chat.Chat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import zendesk.chat.Chat;
import zendesk.chat.ChatEngine;
import zendesk.messaging.MessagingActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Chat.INSTANCE.init(this, "WAE131cp1TaPW7AIWd48o2tNEJHxuYGe");

        Button mChatButton;
        mChatButton = (Button) findViewById(R.id.chat_button);

        mChatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                MessagingActivity.builder()
                        .withEngines(ChatEngine.engine())
                        .show(v.getContext());
            }
        });
    }
}