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

public class userfragment2 extends Fragment {

    ArrayList<Item> arrayList= new ArrayList<>();
    MyAdapter adapter;
    RecyclerView recyclerView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        arrayList.add(new Item("", "", R.drawable.white1));
        arrayList.add(new Item("", "", R.drawable.white2));
        arrayList.add(new Item("", "", R.drawable.white4));
        arrayList.add(new Item("", "", R.drawable.liked_list_3));
        arrayList.add(new Item("", "", R.drawable.liked_list_15));
        arrayList.add(new Item("", "", R.drawable.liked_list_12));
        arrayList.add(new Item("", "", R.drawable.liked_list_14));
        arrayList.add(new Item("", "", R.drawable.liked_list_1));
        arrayList.add(new Item("", "", R.drawable.liked_list_2));
        arrayList.add(new Item("", "", R.drawable.black4));
        arrayList.add(new Item("", "", R.drawable.black2));
        arrayList.add(new Item("", "", R.drawable.black1));
        arrayList.add(new Item("", "", R.drawable.liked_list_13));
        arrayList.add(new Item("", "", R.drawable.liked_list_6));
        arrayList.add(new Item("", "", R.drawable.liked_list_10));
        arrayList.add(new Item("", "", R.drawable.liked_list_16));

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView= (ViewGroup) inflater.inflate(R.layout.userfragment2, container, false);

        adapter= new MyAdapter(getActivity(), arrayList);
        recyclerView= rootView.findViewById(R.id.rc);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));


        return rootView;
    }
}
