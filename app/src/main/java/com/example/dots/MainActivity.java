package com.example.dots;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.dots.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
 //ViewPager2 viewPager2;
 //TabLayout tabLayout;
    private ActivityMainBinding binding;
 TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);


        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

       // viewPager2=findViewById(R.id.vpid);
        //tabLayout=findViewById(R.id.tab_layout);
        VpAdapter vpAdapter=new VpAdapter(this);
     binding.viewpager.setAdapter(vpAdapter);


        new TabLayoutMediator(binding.tabLayout, binding.viewpager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

            }
        }).attach();


        binding.tvid.setText(R.string.viewpager_Text);
        binding.tv2id.setText(R.string.viewpager_Text2);
    }
}