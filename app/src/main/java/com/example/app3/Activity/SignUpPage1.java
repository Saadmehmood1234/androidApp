//package com.example.app3.Activity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.WindowManager;
//
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.example.app3.databinding.ActivitySignUpPage1Binding;
//
//public class SignUpPage1 extends AppCompatActivity {
//   ActivitySignUpPage1Binding binding;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        binding=ActivitySignUpPage1Binding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
//        binding.signupBtn.setOnClickListener(v -> startActivity(new Intent(SignUpPage1.this,MainActivity.class)));
//    }
//}
package com.example.app3.Activity;
import android.view.WindowManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.app3.databinding.ActivitySignUpPage1Binding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import android.util.Log;

public class SignUpPage1 extends AppCompatActivity {
    private static final String TAG = "SignUpPage1";
    private ActivitySignUpPage1Binding binding;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpPage1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mAuth = FirebaseAuth.getInstance();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        binding.signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = binding.inputEmail.getText().toString().trim();
                String password = binding.inputPassword.getText().toString().trim();
                String Repassword = binding.inputRePassword.getText().toString().trim();
                if (email.isEmpty() || password.isEmpty() || Repassword.isEmpty()) {
                    Toast.makeText(SignUpPage1.this, "Email and Password fields cannot be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (!password.equals(Repassword)) {
                    Toast.makeText(SignUpPage1.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(SignUpPage1.this, "Email and Password cannot be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    Toast.makeText(SignUpPage1.this, "Invalid email format", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (password.length() < 6) {
                    Toast.makeText(SignUpPage1.this, "Password should be at least 6 characters", Toast.LENGTH_SHORT).show();
                    return;
                }
                createAccount(email, password);
            }
        });
    }

    private void createAccount(String email, String password) {
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, task -> {
                    if (task.isSuccessful()) {
                        Log.d(TAG, "createUserWithEmail:success");
                        FirebaseUser user = mAuth.getCurrentUser();
                        updateUI(user);
                    } else {
                        Log.w(TAG, "createUserWithEmail:failure", task.getException());
                        Toast.makeText(SignUpPage1.this, "Authentication failed.", Toast.LENGTH_SHORT).show();
                        updateUI(null);
                    }
                });
    }

    private void updateUI(FirebaseUser user) {
        if (user != null) {
            Toast.makeText(SignUpPage1.this, "Sign Up Successful", Toast.LENGTH_SHORT).show();
            Intent splashIntent = SplashScreen.createIntent(this, MainActivity.class);
            startActivity(splashIntent);
            finish();
        } else {
            Toast.makeText(SignUpPage1.this, "Sign Up Failed", Toast.LENGTH_SHORT).show();
        }
    }
}
