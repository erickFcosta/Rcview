package com.developer.rcview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String[] s1;
    String[] s2;
    int[] images = {R.drawable.icon_add, R.drawable.icon_cars, R.drawable.icon_clock,
                    R.drawable.icon_conf, R.drawable.icon_date_hour, R.drawable.icon_login,
                    R.drawable.icon_logout, R.drawable.icon_map_point, R.drawable.icon_trash, R.drawable.icon_user};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.programming_languages);
        s2 = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}