package kr.co.eyc.cafeseek;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class cafefragment extends Fragment {

    ArrayList<Item3> list= new ArrayList<>();
    MyAdapter4 adapter4;
    RecyclerView recyclerView;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        list.add(new Item3(R.drawable.white1));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootview= (ViewGroup)inflater.inflate(R.layout.cafefragment, container, false);

        //recyclerView= rootview.findViewById(R.id.rc);

        recyclerView.setAdapter(adapter4);



        return rootview;
    }
}
