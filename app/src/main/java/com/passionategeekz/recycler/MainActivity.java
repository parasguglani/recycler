package com.passionategeekz.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));
        String[] s={"java","ekjnkj","jkenjknkjkj","ejbjefjbej","java","ekjnkj","jkenjknkjkj","ejbjefjbej","java","ekjnkj","jkenjknkjkj","ejbjefjbej","java","ekjnkj","jkenjknkjkj","ejbjefjbej","java","ekjnkj","jkenjknkjkj","ejbjefjbej","java","ekjnkj","jkenjknkjkj","ejbjefjbej"};
         recyclerView.setAdapter(new MyAdapter(s));
    }
}
