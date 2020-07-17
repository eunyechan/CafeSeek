package kr.co.eyc.cafeseek;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.bumptech.glide.Glide;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.Login;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.kakao.auth.ISessionCallback;
import com.kakao.auth.Session;
import com.kakao.network.ErrorResult;
import com.kakao.usermgmt.UserManagement;
import com.kakao.usermgmt.callback.LogoutResponseCallback;
import com.kakao.usermgmt.callback.MeV2ResponseCallback;
import com.kakao.usermgmt.response.MeV2Response;
import com.kakao.usermgmt.response.model.Profile;
import com.kakao.usermgmt.response.model.UserAccount;
import com.kakao.util.exception.KakaoException;
import com.kakao.util.helper.log.Tag;


import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;

import de.hdodenhof.circleimageview.CircleImageView;




public class MainActivity extends AppCompatActivity {

    TextView tv_email;
    CircleImageView iv_pro;
    TextView tv_nickname;
    Profile imgUrl;
    Profile nickname;

    private LoginButton facebook_login;
    private CallbackManager callbackManager;

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FacebookSdk.sdkInitialize(getApplicationContext()); // SDK 초기화
        AppEventsLogger.activateApp(this);
        // (setContentView 보다 먼저 실행되어야합니다 안그러면 에러)
        setContentView(R.layout.activity_main);

        iv= findViewById(R.id.iv);


        Session.getCurrentSession().addCallback(sessionCallback);
        requesUserInfo();


        facebook_login= findViewById(R.id.facebook_login);
        facebook_login.setReadPermissions("email");
        callbackManager= CallbackManager.Factory.create(); //로그인 응답처리할 콜백 관리자
        
        facebook();
    }


    //페이스북
    void facebook_login() {
        LoginManager.getInstance().logInWithReadPermissions(this, Arrays.asList("public_profile"));
    }

    void facebook(){
        facebook_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    facebook_login();
                }
            }
        });
        LoginManager.getInstance().registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                Log.i("LoginActivity", "onSucces Login");
                Toast.makeText(MainActivity.this, "로그인 성공", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancel() {

            }

            @Override
            public void onError(FacebookException error) {
                Log.e("LoginActivity", "ERROR : "+ error.getMessage());

            }
        });

    }


    //카카오 시작
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);

    }

    ISessionCallback sessionCallback= new ISessionCallback() {
        @Override
        public void onSessionOpened() {
            Toast.makeText(MainActivity.this, "로그인 성공", Toast.LENGTH_SHORT).show();
            requesUserInfo();

        }

        @Override
        public void onSessionOpenFailed(KakaoException exception) {
            Toast.makeText(MainActivity.this, "로그인 실패", Toast.LENGTH_SHORT).show();

        }
    };

    void requesUserInfo(){
        UserManagement.getInstance().me(new MeV2ResponseCallback() {
            @Override
            public void onSessionClosed(ErrorResult errorResult) {

            }

            @Override
            public void onSuccess(MeV2Response result) {
                //사용자 계정 정보 객체
                UserAccount userAccount= result.getKakaoAccount();
                if (userAccount== null) return;

                Profile profile= userAccount.getProfile();
                if (profile== null) return;

                ProFile.imgUrl= profile.getProfileImageUrl();
                ProFile.nickName= profile.getNickname();

                Intent intent= new Intent(getApplicationContext(), NavigationActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void ClickLogout(View view) {
        UserManagement.getInstance().requestLogout(new LogoutResponseCallback() {
            @Override
            public void onCompleteLogout() {
                redirectLoginActivity();
            }
        });
    }

    private void redirectLoginActivity() {
        final Intent intent = new Intent(this, kakaologin.class);
        startActivity(intent);
        finish();
    }
    //카카오 끝

    public void clickinput(View view) {
        Intent intent= new Intent(this, NavigationActivity.class);
        startActivity(intent);


    }
}

