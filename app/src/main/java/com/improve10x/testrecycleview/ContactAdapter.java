package com.improve10x.testrecycleview;

import androidx.recyclerview.widget.RecyclerView;

public class ContactAdapter extends RecyclerView.Adapter<CallLogItems> {
    public CallLogItems[] items;
    public ContactAdapter(CallLogItems[] callLogItems){
        callLogItems = items;
    }
}
