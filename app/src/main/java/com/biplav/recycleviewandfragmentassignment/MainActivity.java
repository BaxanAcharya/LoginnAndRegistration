package com.biplav.recycleviewandfragmentassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.biplav.recycleviewandfragmentassignment.adapter.ViewPagerAdapter;
import com.biplav.recycleviewandfragmentassignment.fragments.LoginFragment;
import com.biplav.recycleviewandfragmentassignment.fragments.RegisterFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.viewpager);

        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragmentAndTitle(new LoginFragment(),"login");
        viewPagerAdapter.addFragmentAndTitle(new RegisterFragment(), "register");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
