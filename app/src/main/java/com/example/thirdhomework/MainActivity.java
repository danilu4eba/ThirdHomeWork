package com.example.thirdhomework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.thirdhomework.recycler.ContactAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> arrayList;
    private ContactAdapter contactAdapter;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initList();
    }

    private void initList() {
        arrayList = new ArrayList<>();
        arrayList.add("Danil");
        arrayList.add("Danil");
        arrayList.add("Danil");
        arrayList.add("Danil");
        arrayList.add("Danil");
        arrayList.add("Danil");
        arrayList.add("Danil");
        arrayList.add("Danil");
        arrayList.add("Danil");
        arrayList.add("Danil");
        arrayList.add("Danil");
        arrayList.add("Danil");
        arrayList.add("Danil");
        arrayList.add("Danil");
        arrayList.add("Danil");
        arrayList.add("Danil");
        arrayList.add("Danil");
        arrayList.add("Danil");
        arrayList.add("Danil");
        arrayList.add("Danil");
        arrayList.add("Danil");
        arrayList.add("Danil");
        contactAdapter = new ContactAdapter(arrayList);
        recyclerView = findViewById(R.id.recucler_view);
        recyclerView.setAdapter(contactAdapter);
    }
}