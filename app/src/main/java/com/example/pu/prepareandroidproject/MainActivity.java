package com.example.pu.prepareandroidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.example.pu.prepareandroidproject.fragment.main.MainFragment;
import com.example.pu.prepareandroidproject.fragment.main.MainRecyclerView;
import com.example.pu.prepareandroidproject.fragment.top.TopFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.topContainer, TopFragment.newInstance(),"topFragment")
                    .add(R.id.bottomContainer,MainFragment.newInstance(),"mainFragment")
                    .commit();
        }
    }

}
