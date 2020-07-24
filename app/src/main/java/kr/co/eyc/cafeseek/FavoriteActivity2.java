package kr.co.eyc.cafeseek;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class FavoriteActivity2 extends AppCompatActivity {

    ArrayList<Item> arrayList= new ArrayList<>();
    MyAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite2);


        arrayList.add(new Item(R.drawable.white1));
        arrayList.add(new Item(R.drawable.white2));
        arrayList.add(new Item(R.drawable.white3));
        arrayList.add(new Item(R.drawable.white4));
        arrayList.add(new Item(R.drawable.wood2));
        arrayList.add(new Item(R.drawable.wood4));
        arrayList.add(new Item(R.drawable.wood3));
        arrayList.add(new Item(R.drawable.wood1));
        arrayList.add(new Item(R.drawable.white1));
        arrayList.add(new Item(R.drawable.white1));
        arrayList.add(new Item(R.drawable.white2));
        arrayList.add(new Item(R.drawable.white3));
        arrayList.add(new Item(R.drawable.white4));
        arrayList.add(new Item(R.drawable.wood2));
        arrayList.add(new Item(R.drawable.wood4));
        arrayList.add(new Item(R.drawable.wood3));
        arrayList.add(new Item(R.drawable.wood1));
        arrayList.add(new Item(R.drawable.white1));


        adapter= new MyAdapter(this, arrayList);
        recyclerView= findViewById(R.id.recycler1);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));


    }

}
