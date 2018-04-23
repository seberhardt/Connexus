package com.example.leoconnelly.connexus;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
//    ImageButton FindCareButton;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

//        FindCareButton = (findViewById(R.id.find_care_button));

//        FindCareButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openFindCare();
//            }
//        });

        /*
        GetStartedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSearchActivity();
            }
        });
         */

    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new MainScreenTab(), "Home");
        adapter.addFragment(new FindCareTab(), "Find Care");
        adapter.addFragment(new LearnTab(), "Learn");
        adapter.addFragment(new EmergencyTab(), "Emergency");
        adapter.addFragment(new MessageTab(), "Message");
        viewPager.setAdapter(adapter);
    }

//    public void openFindCare () {
//       Intent mainActivityToFindCare = new Intent (this, HealthCenterListActivity.class);
//        startActivity(mainActivityToFindCare);
//    }

}
