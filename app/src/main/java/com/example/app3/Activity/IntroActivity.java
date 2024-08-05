package com.example.app3.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app3.databinding.ActivityIntroBinding;

public class IntroActivity extends AppCompatActivity {
    private static final String TAG = "IntroActivity";
    ActivityIntroBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityIntroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        binding.startBtn.setOnClickListener(v -> startActivity(new Intent(IntroActivity.this,LoginPage.class)));
        binding.text13.setOnClickListener(v -> startActivity(new Intent(IntroActivity.this, SignUpPage1.class)));

    }
}