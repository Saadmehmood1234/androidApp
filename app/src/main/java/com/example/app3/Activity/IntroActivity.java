//package com.example.app3.Activity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.WindowManager;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.example.app3.databinding.ActivityIntroBinding;
//
//public class IntroActivity extends AppCompatActivity {
//    private static final String TAG = "IntroActivity";
//    ActivityIntroBinding binding;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        binding=ActivityIntroBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
//        binding.startBtn.setOnClickListener(v -> startActivity(new Intent(IntroActivity.this,LoginPage.class)));
//        binding.text13.setOnClickListener(v -> startActivity(new Intent(IntroActivity.this, SignUpPage1.class)));
//
//    }
//}

package com.example.app3.Activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app3.databinding.ActivityIntroBinding;

public class IntroActivity extends AppCompatActivity {
    private static final String TAG = "IntroActivity";
    private static final String PREFS_NAME = "MyPrefsFile";
    ActivityIntroBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIntroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        // Check if user is logged in
        SharedPreferences preferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        boolean isLoggedIn = preferences.getBoolean("isLoggedIn", false);

        if (isLoggedIn) {
            Intent splashIntent = SplashScreen.createIntent(this, MainActivity.class);
            splashIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(splashIntent);
            finish();
            return;
        }

        // Set up click listeners
        binding.startBtn.setOnClickListener(v -> startActivity(new Intent(IntroActivity.this, LoginPage.class)));
        binding.text13.setOnClickListener(v -> startActivity(new Intent(IntroActivity.this, SignUpPage1.class)));
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Check if user is logged in when the activity is resumed
        SharedPreferences preferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        boolean isLoggedIn = preferences.getBoolean("isLoggedIn", false);

        if (isLoggedIn) {
             Intent splashIntent = SplashScreen.createIntent(this, MainActivity.class);
            splashIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(splashIntent);
            finish();




        }
    }
}
