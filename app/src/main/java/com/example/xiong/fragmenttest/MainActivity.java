package com.example.xiong.fragmenttest;

import android.os.Bundle;

import java.util.List;


public class MainActivity extends IndicatorFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int supplyTabs(List<TabInfo> tabs) {
        tabs.add(new TabInfo(0, "xiong",
                FragmentOne.class));
        tabs.add(new TabInfo(1, "jia",
                FragmentOne.class));
        tabs.add(new TabInfo(2, "chen",
                FragmentOne.class));
        tabs.add(new TabInfo(3, "hao",
                FragmentOne.class));
        tabs.add(new TabInfo(4, "shuai",
                FragmentOne.class));

        return 0;
    }

}
