package com.example.app3.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.app3.Adapter.WorkoutAdapter;
import com.example.app3.R;
import com.example.app3.databinding.ActivityFavouratePageBinding;
import com.example.app3.databinding.ActivityMainBinding;

public class FavouratePage extends AppCompatActivity {

    ActivityFavouratePageBinding binding;
    private static final String PREFS_NAME = "MyPrefsFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFavouratePageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);


        binding.PhomeBtn.setOnClickListener(v -> startActivity(new Intent(FavouratePage.this, MainActivity.class)));
        binding.PhomeTxt.setOnClickListener(v -> startActivity(new Intent(FavouratePage.this, MainActivity.class)));
        binding.PcartTxt.setOnClickListener(v -> startActivity(new Intent(FavouratePage.this, CartPage.class)));
        binding.PcartBtn.setOnClickListener(v -> startActivity(new Intent(FavouratePage.this, CartPage.class)));
        binding.profileBtn.setOnClickListener(v -> startActivity(new Intent(FavouratePage.this, ProfilePage.class)));
        binding.profileTxt.setOnClickListener(v -> startActivity(new Intent(FavouratePage.this, ProfilePage.class)));
        binding.profileTxt.setOnClickListener(v -> startActivity(new Intent(FavouratePage.this, ProfilePage.class)));
    }
}