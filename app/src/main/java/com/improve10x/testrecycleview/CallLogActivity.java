package com.improve10x.testrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class CallLogActivity extends AppCompatActivity {
    CallLogItems[] callLogItems;
    RecyclerView contactRv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_log);
        initViews();
        addContactData();
    }

    private void addContactData() {
        callLogItems = new CallLogItems[5];
        CallLogItems items = new CallLogItems();
        items.icon = "";
        items.contact = "";
        items.callHistory = "";
        callLogItems[0] = items;

        CallLogItems items1 = new CallLogItems();
        items1.icon = "";
        items1.contact = "";
        items1.callHistory = "";
        callLogItems[1] = items1;

        CallLogItems items2 = new CallLogItems();
        items2.icon = "";
        items2.contact = "";
        items2.callHistory = "";
        callLogItems[2] = items2;

        CallLogItems items3 = new CallLogItems();
        items3.icon = "";
        items3.contact = "";
        items3.callHistory = "";
        callLogItems[3] = items3;

        CallLogItems items4 = new CallLogItems();
        items4.icon = "";
        items4.contact = "";
        items4.callHistory = "";
        callLogItems[5] = items4;
    }

    private void initViews() {
        contactRv = findViewById(R.id.contact_rv);
    }

}