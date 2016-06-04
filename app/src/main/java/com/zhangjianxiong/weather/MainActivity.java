package com.zhangjianxiong.weather;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

        TabLayout tabLayout;
        Toolbar toolbar;
        ViewPager viewPager;
        TabAdapter tabAdapter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.avtivity_main);

          viewPager = (ViewPager)findViewById(R.id.viewPager);
            tabAdapter=new TabAdapter(getSupportFragmentManager());
            viewPager.setAdapter(tabAdapter);

            toolbar = (Toolbar)findViewById(R.id.toolbar);

            //使用toolbar代替actionbar
            setSupportActionBar(toolbar);
            getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_tag_faces_24dp);

            tabLayout =(TabLayout)findViewById(R.id.tabLayout);
            tabLayout.setupWithViewPager(viewPager);


        }

        private class TabAdapter extends FragmentPagerAdapter {

            List<Fragment> fragmentList =new ArrayList<>();
            String[] title ={"实时","小时","一周"};


            public TabAdapter(FragmentManager fm) {
                super(fm);
                fragmentList.add();
                fragmentList.add();
                fragmentList.add();
            }

            @Override
            public Fragment getItem(int position) {
                return null;
            }

            @Override
            public int getCount() {
                return 0;
            }
        }
    }
