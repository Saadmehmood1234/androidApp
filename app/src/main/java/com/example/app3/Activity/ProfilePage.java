package com.example.app3.Activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.app3.Adapter.WorkoutAdapter;
import com.example.app3.R;
import com.example.app3.databinding.ActivityMainBinding;
import com.example.app3.databinding.ActivityProfilePageBinding;

public class ProfilePage extends AppCompatActivity {
    ActivityProfilePageBinding binding;
    private static final String PREFS_NAME = "MyPrefsFile";
    Button logoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProfilePageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        binding.PhomeBtn.setOnClickListener(v -> startActivity(new Intent(ProfilePage.this, MainActivity.class)));
        binding.PhomeTxt.setOnClickListener(v -> startActivity(new Intent(ProfilePage.this, MainActivity.class)));

        binding.PfavourateBtn.setOnClickListener(v -> startActivity(new Intent(ProfilePage.this, FavouratePage.class)));
        binding.PfavourateTxt.setOnClickListener(v -> startActivity(new Intent(ProfilePage.this, FavouratePage.class)));

        binding.PhomeBtn.setOnClickListener(v -> startActivity(new Intent(ProfilePage.this, CartPage.class)));
        binding.PcartTxt.setOnClickListener(v -> startActivity(new Intent(ProfilePage.this, CartPage.class)));

        logoutBtn = binding.logoutBtn;
        logoutBtn.setOnClickListener(v -> {
            SharedPreferences.Editor editor = getSharedPreferences(PREFS_NAME, MODE_PRIVATE).edit();
            editor.putBoolean("isLoggedIn", false);
            editor.apply();
            Intent splashIntent = SplashScreen.createIntent(this,IntroActivity.class);
            splashIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(splashIntent);
            finish();

        });
    }
}