package kr.co.eyc.cafeseek;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class NavigationActivity extends AppCompatActivity {

    private FragmentManager fragmentManager = getSupportFragmentManager();
    private HomeFragment homeFragment = new HomeFragment();
    private FavoriteFragment favoriteFragment = new FavoriteFragment();
    private SearchFragment searchFragment = new SearchFragment();
    private UsersFragment usersFragment = new UsersFragment();
    private UserFragment userFragment = new UserFragment();

    private BottomNavigationView BottomNavigationView;

    private TabLayout tabLayout;
    private ArrayList<String> tabNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

       /* TabLayout tabLayout= findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("계절"));
        tabLayout.addTab(tabLayout.newTab().setText("분위기"));
        tabLayout.addTab(tabLayout.newTab().setText("지역"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);*/

        BottomNavigationView = findViewById(R.id.bottom_navigation);


        Navigation();
    }

    


    void Navigation() {
        BottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                switch (menuItem.getItemId()) {
                    case R.id.navigation_home: {
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, homeFragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_favorite: {
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, favoriteFragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_search: {
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, searchFragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_group: {
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, usersFragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_person: {
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, userFragment).commitAllowingStateLoss();
                        break;
                    }
                }
                return true;
            }
        });


    /*void ViewPager(){
        final ViewPager viewPager= findViewById(R.id.view_pager);
        ContentsPagerAdapter adapter= new ContentsPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
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

    }*/


    }
}
