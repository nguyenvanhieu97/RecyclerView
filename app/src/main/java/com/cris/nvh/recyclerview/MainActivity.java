package com.cris.nvh.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
		RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
		RecyclerView.Adapter adapter = new MyAdapter();
		recyclerView.setLayoutManager(layoutManager);
		recyclerView.setAdapter(adapter);
	}
}
