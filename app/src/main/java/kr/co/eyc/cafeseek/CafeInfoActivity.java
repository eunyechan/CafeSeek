package kr.co.eyc.cafeseek;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class CafeInfoActivity extends AppCompatActivity {

    ArrayList<Item> items= new ArrayList<>();
    MyAdapter3 myAdapter3;
    RecyclerView recyclerView;
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_info);

        items.add( new Item( "커피냅로스터스", "서울시 마포구 성미산로 27길 70", R.drawable.sunny_cafe_1));
        items.add( new Item( "벤허", "서울시 용산구 이태원로 42길 62", R.drawable.sunny_cafe_2));
        items.add( new Item( "메리그린", "서울시 종로구 대학로 11길 49", R.drawable.sunny_cafe_3));
        items.add( new Item( "아이라이크마운틴", "서울시 용산구 한남동 753-9", R.drawable.sunny_cafe_4));
        items.add( new Item( "쎈느", "서울시 성동구 성수동 2가 314-2", R.drawable.sunny_cafe_5));
        items.add( new Item( "택스커피", "서울시 성북구 삼선교로 14길 35", R.drawable.sunny_cafe_6));
        items.add( new Item( "섬광", "서울시 중구 충무로 4가 32-16", R.drawable.liked_list_1));
        items.add( new Item( "아이라이크마운틴", "서울시 용산구 신흥로 5길 70", R.drawable.liked_list_3));
        items.add( new Item( "콜마인", "서울시 마포구 잔다리로", R.drawable.liked_list_7));
        items.add( new Item( "슬로우포레스트", "서울시 삼청로 5길 20", R.drawable.liked_list_6));
        items.add( new Item( "왓코", "서울시 마포구 서강로 16길 63", R.drawable.liked_list_4));
        items.add( new Item( "땡스오트", "서울시 마포구 연남동 375-113", R.drawable.liked_list_2));
        items.add( new Item( "라토커피", "청주시 상당구 성안로 74번길 94-12", R.drawable.black1));
        items.add( new Item( "섬광", "서울시 중구 충무로 4가 32-16", R.drawable.black2));
        items.add( new Item( "콜링우드", "수원시 팔달구 정조로 888", R.drawable.black3));
        items.add( new Item( "파온", "서울시 한남동 745-13", R.drawable.black4));

        myAdapter3= new MyAdapter3(this, items);
        recyclerView= findViewById(R.id.rc);
        recyclerView.setAdapter(myAdapter3);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 1));

        /*Intent intent= getIntent();
        String title= intent.getStringExtra("title");
        String address= intent.getStringExtra("address");
        int imgid= intent.getIntExtra("img", R.drawable.black1);

        Glide.with(this).load(imgid).into(iv);

        getSupportActionBar().getTitle().toString();
        getSupportActionBar().getTitle().toString();*/


       /* tabLayout= findViewById(R.id.tabs);
        tabLayout.addTab(tabLayout.newTab().setText("자리"));
        tabLayout.addTab(tabLayout.newTab().setText("메뉴"));
        tabLayout.addTab(tabLayout.newTab().setText("사진"));
        tabLayout.addTab(tabLayout.newTab().setText("공지"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        viewPager= findViewById(R.id.viewpager);

        InfoAdapter infoAdapter= new InfoAdapter(getSupportFragmentManager(), 4);

        viewPager.setAdapter(infoAdapter);
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
        });*/


    }

}
