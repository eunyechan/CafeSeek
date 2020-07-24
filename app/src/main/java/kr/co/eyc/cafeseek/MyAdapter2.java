package kr.co.eyc.cafeseek;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MyAdapter2 extends RecyclerView.Adapter {

    Context context;
    ArrayList<Item2> items2;

    public MyAdapter2(Context context, ArrayList<Item2>items2){
        this.context= context;
        this.items2= items2;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View itemview= inflater.inflate(R.layout.item_cardview2, parent, false);

        VH holder= new VH(itemview);
        return holder;


    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        VH vh= (VH)holder;

        Item2 item2= items2.get(position);
        Glide.with(context).load(item2.img).into(vh.iv);
        vh.title.setText(item2.title);
        vh.address.setText(item2.address);

    }

    @Override
    public int getItemCount() {
        return items2.size();
    }

    class VH extends RecyclerView.ViewHolder{
        ImageView iv;
        TextView title;
        TextView address;

        public VH(@NonNull View itemView) {
            super(itemView);

            iv= itemView.findViewById(R.id.iv);
            title= itemView.findViewById(R.id.title);
            address= itemView.findViewById(R.id.address);

        }
    }
}
