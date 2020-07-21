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


public class HomeFragment extends Fragment {

    ArrayList<Item> items1= new ArrayList<>();
    ArrayList<Item> items2= new ArrayList<>();
    ArrayList<Item> items3= new ArrayList<>();
    ArrayList<Item> items4= new ArrayList<>();

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

        items1.add( new Item(R.drawable.japi));
        items1.add( new Item(R.drawable.japi));
        items1.add( new Item(R.drawable.japi));
        items1.add( new Item(R.drawable.japi));
        items1.add( new Item(R.drawable.japi));
        items1.add( new Item(R.drawable.japi));

        items2.add( new Item(R.drawable.tuuli));
        items2.add( new Item(R.drawable.tuuli));
        items2.add( new Item(R.drawable.tuuli));
        items2.add( new Item(R.drawable.tuuli));
        items2.add( new Item(R.drawable.tuuli));
        items2.add( new Item(R.drawable.tuuli));

        items3.add( new Item(R.drawable.ca1));
        items3.add( new Item(R.drawable.ca1));
        items3.add( new Item(R.drawable.ca1));
        items3.add( new Item(R.drawable.ca1));
        items3.add( new Item(R.drawable.ca1));
        items3.add( new Item(R.drawable.ca1));

        items4.add( new Item(R.drawable.ca3));
        items4.add( new Item(R.drawable.ca3));
        items4.add( new Item(R.drawable.ca3));
        items4.add( new Item(R.drawable.ca3));
        items4.add( new Item(R.drawable.ca3));
        items4.add( new Item(R.drawable.ca3));


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       ViewGroup rootView= (ViewGroup)inflater.inflate(R.layout.fragment_home, container, false);
       recyclerview1= rootView.findViewById(R.id.recycler1);
       recyclerview2= rootView.findViewById(R.id.recycler2);
       recyclerview3= rootView.findViewById(R.id.recycler3);
       recyclerview4= rootView.findViewById(R.id.recycler4);



       adapter1= new MyAdapter(getActivity(), items1);
       adapter2= new MyAdapter(getActivity(), items2);
       adapter3= new MyAdapter(getActivity(), items3);
       adapter4= new MyAdapter(getActivity(), items4);


       recyclerview1.setAdapter(adapter1);
       recyclerview2.setAdapter(adapter2);
       recyclerview3.setAdapter(adapter3);
       recyclerview4.setAdapter(adapter4);

       adapter1.notifyDataSetChanged();

        return rootView;
    }
}
