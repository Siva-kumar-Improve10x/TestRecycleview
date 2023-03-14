package com.improve10x.testrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class CallLogActivity extends AppCompatActivity {
    CallLogItems[] callLogItems;
    RecyclerView contactRv;
    ContactAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_log);
        initViews();
        addContactData();
        setUpAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        contactRv.setAdapter(adapter);
        contactRv.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpAdapter() {
        adapter = new ContactAdapter(callLogItems);
    }

    private void addContactData() {
        callLogItems = new CallLogItems[5];
        CallLogItems items = new CallLogItems();
        items.icon = "https://o.remove.bg/downloads/30176994-1bbf-4bf8-b649-5d121d9b0382/470-4703547_icon-user-icon-hd-png-download-removebg-preview.png";
        items.contact = "+91 7680807352";
        items.callHistory = "↙ India, 46 min.ago";
        callLogItems[0] = items;

        CallLogItems items1 = new CallLogItems();
        items1.icon = "https://o.remove.bg/downloads/30176994-1bbf-4bf8-b649-5d121d9b0382/470-4703547_icon-user-icon-hd-png-download-removebg-preview.png";
        items1.contact = "WIFI";
        items1.callHistory = "↩ India, 2 hrs ago";
        callLogItems[1] = items1;

        CallLogItems items2 = new CallLogItems();
        items2.icon = "https://o.remove.bg/downloads/30176994-1bbf-4bf8-b649-5d121d9b0382/470-4703547_icon-user-icon-hd-png-download-removebg-preview.png";
        items2.contact = "+91 76786 05379";
        items2.callHistory = "↗ India, 22 hrs.ago";
        callLogItems[2] = items2;

        CallLogItems items3 = new CallLogItems();
        items3.icon = "https://o.remove.bg/downloads/30176994-1bbf-4bf8-b649-5d121d9b0382/470-4703547_icon-user-icon-hd-png-download-removebg-preview.png";
        items3.contact = "+91 8130592542";
        items3.callHistory = "↗ India, 2 days.ago";
        callLogItems[3] = items3;

        CallLogItems items4 = new CallLogItems();
        items4.icon = "data:image/png;base64,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";
        items4.contact = "+91 11 4940 2363";
        items4.callHistory = "↩ India, 2 days ago";
        callLogItems[4] = items4;
    }

    private void initViews() {
        contactRv = findViewById(R.id.contact_rv);
    }

}