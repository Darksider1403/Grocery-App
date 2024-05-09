package com.example.mygrocerystore;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {
    Button signIn;
    EditText email, password;
    TextView signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signIn = findViewById(R.id.login_btn);
        email = findViewById(R.id.email_login);
        password = findViewById(R.id.password_login);

        signUp = findViewById(R.id.sign_in);

        signUp.setOnClickListener(v -> startActivity(new Intent(LoginActivity.this, RegistrationActivity.class)));

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}