package com.example.thirdhomework.recycler;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thirdhomework.R;

public class ContactsViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;
    private TextView textView;

    public ContactsViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void onBind(String contactName) {
        imageView = itemView.findViewById(R.id.iv_one);
        textView = itemView.findViewById(R.id.appCompatTextView);
        textView.setText(contactName);
    }
}
