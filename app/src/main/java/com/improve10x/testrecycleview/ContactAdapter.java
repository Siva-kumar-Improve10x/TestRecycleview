package com.improve10x.testrecycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class ContactAdapter extends RecyclerView.Adapter<ContactRv> {
    public CallLogItems[] items;
    public ContactAdapter(CallLogItems[] callLogItems ){
      items = callLogItems;
    }

    @NonNull
    @Override
    public ContactRv onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.call_log_item,parent,false);
        ContactRv contactRv = new ContactRv(view);
        return contactRv;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactRv holder, int position) {
        CallLogItems callLogItems = items[position];
        holder.contact.setText(callLogItems.contact);
        holder.callHistory.setText(callLogItems.callHistory);
        Picasso.get().load(callLogItems.icon).into(holder.icon);



    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
