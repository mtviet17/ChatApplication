package com.chat.chatapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.chat.Adapter.MessagesListAdapter;
import com.chat.model.Message;

import java.util.List;

public class ChatActivity extends AppCompatActivity {

    private MessagesListAdapter adapter;
    private List<Message> listMessages;
    private ListView listViewMessages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

    }
}
