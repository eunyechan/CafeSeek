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
import android.view.Menu;
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




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        BottomNavigationView = findViewById(R.id.bottom_navigation);

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.addToBackStack(null);
        transaction.replace(R.id.frame, homeFragment).commitAllowingStateLoss();


        Navigation();
    }

    


    void Navigation() {
        BottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.addToBackStack(null);
                switch (menuItem.getItemId()) {
                    case R.id.navigation_home: {
                        transaction.replace(R.id.frame, homeFragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_favorite: {
                        transaction.replace(R.id.frame, favoriteFragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_search: {
                        transaction.replace(R.id.frame, searchFragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_group: {
                        transaction.replace(R.id.frame, usersFragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_person: {
                        transaction.replace(R.id.frame, userFragment).commitAllowingStateLoss();
                        break;
                    }
                }
                return true;
            }
        });



    }

}
