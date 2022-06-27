package com.example.viewpagerfes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    AdapterViewPager adapterViewPager;
    WormDotsIndicator dots;
    LinearLayout layout_utama;

    int[] background = {
            R.color.bg1,
            R.color.bg2,
            R.color.bg3

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.view_pager);
        dots = findViewById(R.id.dot);

        adapterViewPager = new AdapterViewPager(this);
        viewPager.setAdapter(adapterViewPager);
        layout_utama = findViewById(R.id.layout_utama);
        dots.setViewPager(viewPager);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                layout_utama.setBackgroundResource(background[position]);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



    }
}