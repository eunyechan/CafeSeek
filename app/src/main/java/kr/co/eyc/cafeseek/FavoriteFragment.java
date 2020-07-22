package kr.co.eyc.cafeseek;

import android.app.Application;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FavoriteFragment extends Fragment {
    public static FavoriteFragment newInstance() {

        return new FavoriteFragment();

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_fav, container, false);
        Button button=view.findViewById(R.id.Btn_id);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(), FavoriteActivity2.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
