package kr.co.eyc.cafeseek;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class UsersFragment extends Fragment {
    TabLayout tabLayout;
    ViewPager viewPager;



    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_users, container, false);


        tabLayout= view.findViewById(R.id.tabs);
        tabLayout.addTab(tabLayout.newTab().setText("인기카페"));
        tabLayout.addTab(tabLayout.newTab().setText("개인"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        viewPager= view.findViewById(R.id.viewpager);

        TabAdapter tabAdapter= new TabAdapter(getChildFragmentManager(), 2);

        viewPager.setAdapter(tabAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        return view;
    }

}
