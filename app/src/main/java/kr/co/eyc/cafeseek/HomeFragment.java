package kr.co.eyc.cafeseek;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;


public class HomeFragment extends Fragment {

    ArrayList<Item> white= new ArrayList<>();
    ArrayList<Item> black= new ArrayList<>();
    ArrayList<Item> wood= new ArrayList<>();
    ArrayList<Item> cafeview= new ArrayList<>();

    MyAdapter adapter1;
    MyAdapter adapter2;
    MyAdapter adapter3;
    MyAdapter adapter4;

    RecyclerView recyclerview1;
    RecyclerView recyclerview2;
    RecyclerView recyclerview3;
    RecyclerView recyclerview4;



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        white.add( new Item(R.drawable.white1));
        white.add( new Item(R.drawable.white2));
        white.add( new Item(R.drawable.liked_list_1));
        white.add( new Item(R.drawable.white4));


        black.add( new Item(R.drawable.black1));
        black.add( new Item(R.drawable.black2));
        black.add( new Item(R.drawable.liked_list_2));
        black.add( new Item(R.drawable.black4));


        wood.add( new Item(R.drawable.liked_list_13));
        wood.add( new Item(R.drawable.liked_list_15));
        wood.add( new Item(R.drawable.liked_list_7));
        wood.add( new Item(R.drawable.liked_list_6));


        cafeview.add( new Item(R.drawable.sunny_cafe_1));
        cafeview.add( new Item(R.drawable.sunny_cafe_2));
        cafeview.add( new Item(R.drawable.sunny_cafe_3));
        cafeview.add( new Item(R.drawable.sunny_cafe_4));

        adapter1= new MyAdapter(getActivity(), white);
        adapter2= new MyAdapter(getActivity(), black);
        adapter3= new MyAdapter(getActivity(), wood);
        adapter4= new MyAdapter(getActivity(), cafeview);


    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       ViewGroup rootView= (ViewGroup)inflater.inflate(R.layout.fragment_home, container, false);



       recyclerview1= rootView.findViewById(R.id.recycler1);
       recyclerview2= rootView.findViewById(R.id.recycler2);
       recyclerview3= rootView.findViewById(R.id.recycler3);
       recyclerview4= rootView.findViewById(R.id.recycler4);

       recyclerview1.setAdapter(adapter1);
       recyclerview2.setAdapter(adapter2);
       recyclerview3.setAdapter(adapter3);
       recyclerview4.setAdapter(adapter4);

       return rootView;
    }

}
