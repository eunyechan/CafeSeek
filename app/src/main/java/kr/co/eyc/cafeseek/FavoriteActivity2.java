package kr.co.eyc.cafeseek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FavoriteActivity2 extends AppCompatActivity {
    ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite2);

        iv1= findViewById(R.id.iv1);

    }

    public void clickiv(View view) {
        Intent intent= new Intent(FavoriteActivity2.this, CafeInfoActivity.class);
        startActivity(intent);
        finish();
    }


}
