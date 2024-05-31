package com.example.mygrocerystore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

//import com.example.mygroceryappstore.MainActivity;
//import com.example.mygroceryappstore.R;
import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {
    ProgressBar processBar;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        auth = FirebaseAuth.getInstance();
        processBar = findViewById(R.id.progressbar);
        processBar.setVisibility(View.GONE);
        if (auth.getCurrentUser() != null){
            processBar.setVisibility(View.VISIBLE);
            Toast.makeText(this, "please wait you are already logged in", Toast.LENGTH_SHORT).show();
            finish();
        }


    }

    public void login(View view) {
        startActivity(new Intent(HomeActivity.this, LoginActivity.class));
    }

    public void registration(View view) {

        startActivity(new Intent(HomeActivity.this, RegistrationActivity.class));
    }

}
}
