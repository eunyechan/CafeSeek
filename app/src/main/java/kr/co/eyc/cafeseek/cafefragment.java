package kr.co.eyc.cafeseek;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class cafefragment extends Fragment {

    ArrayList<Item3> list= new ArrayList<>();
    MyAdapter4 adapter4;
    RecyclerView recyclerView;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        list.add( new Item3("1", "라토커피", "청주시 상당구 성안로 74번길 94-12", R.drawable.black1));
        list.add( new Item3("2", "섬광", "서울시 중구 충무로 4가 32-16", R.drawable.black2));
        list.add( new Item3("3", "콜링우드", "수원시 팔달구 정조로 888", R.drawable.black3));
        list.add( new Item3("4", "파온", "서울시 한남동 745-13", R.drawable.black4));
        list.add( new Item3("5", "섬광", "서울시 중구 충무로 4가 32-16", R.drawable.liked_list_1));
        list.add( new Item3("6", "땡스오트", "서울시 마포구 연남동 375-113", R.drawable.liked_list_2));
        list.add( new Item3("7", "아이라이크마운틴", "서울시 용산구 신흥로 5길 70", R.drawable.liked_list_3));
        list.add( new Item3("8", "왓코", "서울시 마포구 서강로 16길 63", R.drawable.liked_list_4));
        list.add( new Item3("9", "업사이드커피", "서울시 용산구 신흥로 5길 70", R.drawable.liked_list_5));
        list.add( new Item3("10", "슬로우포레스트", "서울시 삼청로 5길 20", R.drawable.liked_list_6));
        list.add( new Item3("11", "콜마인", "서울시 마포구 잔다리로", R.drawable.liked_list_7));
        list.add( new Item3("12", "선과점", "서울시 은평구 갈현로 7가길 11", R.drawable.liked_list_8));
        list.add( new Item3("13", "55라이트", "서울시 마포구 희우정로 58", R.drawable.liked_list_9));
        list.add( new Item3("14", "3FLOBBY", "서울시 용산구 한강대로 15길 19-19", R.drawable.liked_list_10));
        list.add( new Item3("15", "오제로", "서울시 대학로 1길 31", R.drawable.liked_list_11));
        list.add( new Item3("16", "로터리과자점", "마포구 망원로 6길 65", R.drawable.liked_list_12));
        list.add( new Item3("17", "푸어링아웃", "서울시 서대문구 연희로 11나길 7-7", R.drawable.liked_list_13));
        list.add( new Item3("18", "세이트커피", "서울시 마포구 월드컵북로 42가길 28", R.drawable.liked_list_14));
        list.add( new Item3("19", "유목", "서울시 동서문로 24길 47", R.drawable.liked_list_15));
        list.add( new Item3("20", "PERCCOFFEE", "서울시 강남구 압구정로 42길 43", R.drawable.liked_list_16));
        list.add( new Item3("21", "커피냅로스터스", "서울시 마포구 성미산로 27길 70", R.drawable.sunny_cafe_1));
        list.add( new Item3("22", "벤허", "서울시 용산구 이태원로 42길 62", R.drawable.sunny_cafe_2));
        list.add( new Item3("23", "메리그린", "서울시 종로구 대학로 11길 49", R.drawable.sunny_cafe_3));
        list.add( new Item3("24", "아이라이크마운틴", "서울시 용산구 한남동 753-9", R.drawable.sunny_cafe_4));
        list.add( new Item3("25", "쎈느", "서울시 성동구 성수동 2가 314-2", R.drawable.sunny_cafe_5));
        list.add( new Item3("26", "택스커피", "서울시 성북구 삼선교로 14길 35", R.drawable.sunny_cafe_6));
        list.add( new Item3("27", "세이트커피", "서울시 마포구 월드컵북로 42가길 28", R.drawable.white1));
        list.add( new Item3("28", "세이트커피", "서울시 마포구 월드컵북로 42가길 28", R.drawable.white2));
        list.add( new Item3("29", "노맨틱", "서울시 용산구 두텁바위로 59-1", R.drawable.white3));
        list.add( new Item3("30", "tulli", "서울시 서대문구 홍제천로 198 ", R.drawable.white4));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootview= (ViewGroup)inflater.inflate(R.layout.cafefragment, container, false);

        adapter4= new MyAdapter4(getActivity(), list);
        recyclerView= rootview.findViewById(R.id.rc);
        recyclerView.setAdapter(adapter4);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 1));



        return rootview;
    }
}
