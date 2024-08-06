//package com.example.app3.Activity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.os.Handler;
//import android.view.WindowManager;
//
//import androidx.activity.EdgeToEdge;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;
//import com.example.app3.R;
//import com.example.app3.databinding.ActivitySplashScreenBinding;
//
//public class SplashScreen extends AppCompatActivity {
//
//    ActivitySplashScreenBinding binding;
//    private static final String PREFS_NAME = "MyPrefsFile";
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        binding =ActivitySplashScreenBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
//
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        }, 2000);
//
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        }, 2000);
//
//    }
//}
//


package com.example.app3.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import androidx.appcompat.app.AppCompatActivity;

import com.example.app3.R;
import com.example.app3.databinding.ActivitySplashScreenBinding;

public class SplashScreen extends AppCompatActivity {

    private static final String EXTRA_NEXT_ACTIVITY = "EXTRA_NEXT_ACTIVITY";
    ActivitySplashScreenBinding binding;

    public static Intent createIntent(AppCompatActivity currentActivity, Class<?> nextActivity) {
        Intent intent = new Intent(currentActivity, SplashScreen.class);
        intent.putExtra(EXTRA_NEXT_ACTIVITY, nextActivity);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        ImageView imageView;

            imageView = findViewById(R.id.imageview);
            Glide.with(this).load(R.drawable.firstanimation).into(imageView);


        Class<?> nextActivity = (Class<?>) getIntent().getSerializableExtra(EXTRA_NEXT_ACTIVITY);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, nextActivity);
                startActivity(intent);
                finish();
            }
        }, 2500);
    }
}
