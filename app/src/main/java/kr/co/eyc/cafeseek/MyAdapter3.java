package kr.co.eyc.cafeseek;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MyAdapter3 extends RecyclerView.Adapter {

    Context context;
    ArrayList<Item> items;


    public MyAdapter3(Context context, ArrayList<Item> items){
        this.context= context;
        this.items= items;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View itemView= inflater.inflate(R.layout.item_cardview, parent, false);



        VH holder= new VH(itemView);

        return holder;


    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        VH vh= (VH)holder;

        final Item item2= items.get(position);

        Glide.with(context).load(item2.img).into(vh.iv1);

/*
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(context, MyAdapter.class);
                intent.putExtra("tv1", items.)

            }
        });*/
    }


    @Override
    public int getItemCount() {
        return items.size();
    }

    class VH extends RecyclerView.ViewHolder{

        ImageView iv1;

        public VH(@NonNull View itemView) {
            super(itemView);
            iv1= itemView.findViewById(R.id.iv);


        }
    }
}
