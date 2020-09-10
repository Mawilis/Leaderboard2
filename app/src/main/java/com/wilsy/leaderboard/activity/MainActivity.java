package com.wilsy.leaderboard.activity;

import android.os.Bundle;
import android.widget.Adapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.wilsy.leaderboard.R;
import com.wilsy.leaderboard.model.Hours;
import com.wilsy.leaderboard.ui.main.SectionsPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
            RecyclerView mRecyclerView;
            List<Hours>mHours;
            private static String BASE_URL = "https://gadsapi.herokuapp.com/api/hours";
            Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        mRecyclerView = findViewById(R.id.recyclerview);
        mHours = new ArrayList<>();





    }
}