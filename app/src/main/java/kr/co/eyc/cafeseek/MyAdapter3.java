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
        View itemView= inflater.inflate(R.layout.item_cardview2, parent, false);

        VH holder= new VH(itemView);

        return holder;


    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        VH vh= (VH)holder;

        Item item= items.get(position);

        Glide.with(context).load(item.img).into(vh.iv);
        vh.title.setText(item.title);
        vh.address.setText(item.address);

    }


    @Override
    public int getItemCount() {
        return items.size();
    }

    class VH extends RecyclerView.ViewHolder{

        ImageView iv;
        TextView title;
        TextView address;


        public VH(@NonNull final View itemView) {
            super(itemView);


            title= itemView.findViewById(R.id.title);
            address= itemView.findViewById(R.id.address);
            iv= itemView.findViewById(R.id.iv);


        }
    }
}
