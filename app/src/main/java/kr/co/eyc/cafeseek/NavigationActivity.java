package kr.co.eyc.cafeseek;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class NavigationActivity extends AppCompatActivity {

    private FragmentManager fragmentManager= getSupportFragmentManager();

    private HomeFragment homeFragment= new HomeFragment();
    private FavoriteFragment favoriteFragment= new FavoriteFragment();
    private SearchFragment searchFragment= new SearchFragment();
    private UsersFragment usersFragment= new UsersFragment();
    private UserFragment userFragment= new UserFragment();

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        bottomNavigationView= findViewById(R.id.bottom_navigation_view);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame, homeFragment).commitAllowingStateLoss();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                FragmentTransaction transaction= fragmentManager.beginTransaction();
                switch (menuItem.getItemId()){
                    case R.id.navigation_home:{
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, homeFragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_favorite:{
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, favoriteFragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_search:{
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, searchFragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_group:{
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, usersFragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_person:{
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, userFragment).commitAllowingStateLoss();
                        break;
                    }
                }
                return true;
            }
        });

    }
}
