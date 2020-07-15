package kr.co.eyc.cafeseek;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.text.SimpleDateFormat;
import java.util.Date;


public class UserFragment extends Fragment {
    ImageView iv;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_user, container, false);
        Button button= view.findViewById(R.id.btn_upload);
        iv= view.findViewById(R.id.iv);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");

                startActivityForResult(intent, 10);
            }

        });
        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode== 10 && resultCode== Activity.RESULT_OK){
            Uri uri= data.getData();
            Glide.with(this).load(iv);

            imgUri= uri;
            UploadFile();

        }
    }
    Uri imgUri;

    void UploadFile(){
        FirebaseStorage firebaseStorage= FirebaseStorage.getInstance();

        //업로드해서 저장될 파일명이 같으면 덮어쓰기 되므로 날짜를 이용해 파일명 만들기
        SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMddhhmmss");
        String fileName= sdf.format(new Date()) + ".png";

        //업로드할 파일의 참조객체 만들기 [ 파일데이터는 없고 파일명만 만들어진 상태 ]
        StorageReference imgRef= firebaseStorage.getReference("CafeImage/"+fileName);

        UploadTask task= imgRef.putFile(imgUri);
        task.addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                Toast.makeText(getContext(), "업로드 성공", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
