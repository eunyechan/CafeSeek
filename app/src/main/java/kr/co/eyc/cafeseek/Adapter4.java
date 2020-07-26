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

class MyAdapter4 extends RecyclerView.Adapter {
    Context context;
    ArrayList<Item3> items3;

    public MyAdapter4(Context context, ArrayList<Item3> items3){
        this.context= context;
        this.items3= items3;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View itemview= inflater.inflate(R.layout.item_cardview3, parent, false);

        VH holder= new VH(itemview);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        VH vh= (VH)holder;

        final Item3 item3= items3.get(position);
        Glide.with(context).load(item3.img).into(vh.iv);

        vh.num.setText(item3.num);
        vh.address.setText(item3.address);
        vh.title.setText(item3.name);

    }

    @Override
    public int getItemCount() {
        return items3.size();
    }

    class VH extends RecyclerView.ViewHolder{
        ImageView iv;
        TextView num;
        TextView title;
        TextView address;

        public VH(@NonNull View itemView) {
            super(itemView);

            iv= (ImageView)itemView.findViewById(R.id.iv);
            num= (TextView)itemView.findViewById(R.id.num);
            title= (TextView)itemView.findViewById(R.id.title);
            address= (TextView)itemView.findViewById(R.id.address);
        }
    }
}




