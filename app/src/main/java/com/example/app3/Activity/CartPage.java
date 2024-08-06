package com.example.app3.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.app3.R;
import com.example.app3.databinding.ActivityCartPageBinding;
import com.example.app3.databinding.ActivityFavouratePageBinding;

public class CartPage extends AppCompatActivity {

     ActivityCartPageBinding binding;
    private static final String PREFS_NAME = "MyPrefsFile";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityCartPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        binding.PhomeBtn.setOnClickListener(v -> startActivity(new Intent(CartPage.this, MainActivity.class)));
        binding.PhomeTxt.setOnClickListener(v -> startActivity(new Intent(CartPage.this, MainActivity.class)));
        binding.favourateBtn.setOnClickListener(v -> startActivity(new Intent(CartPage.this, FavouratePage.class)));
        binding.favoutateTxt.setOnClickListener(v -> startActivity(new Intent(CartPage.this, FavouratePage.class)));
        binding.profileBtn.setOnClickListener(v -> startActivity(new Intent(CartPage.this, ProfilePage.class)));
        binding.profileTxt.setOnClickListener(v -> startActivity(new Intent(CartPage.this, ProfilePage.class)));
        binding.profileTxt.setOnClickListener(v -> startActivity(new Intent(CartPage.this, ProfilePage.class)));
    }
}