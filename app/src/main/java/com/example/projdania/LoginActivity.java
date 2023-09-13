package com.example.projdania;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {
 EditText Email;
 EditText Password;
 Button login;
 TextView createanaccount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Email=findViewById(R.id.ETemailLOG);
        Password =findViewById(R.id.etpasswordLOG);
        login=findViewById(R.id.btlogin);
        createanaccount=findViewById(R.id.ETsignup);
        createanaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,SignupActivity.class));
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final FirebaseAuth mAuth=FirebaseAuth.getInstance();
                mAuth.signInWithEmailAndPassword(Email.getText().toString(), Password.getText().toString())
                        .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    FirebaseUser user = mAuth.getCurrentUser();

                                    startActivity(new Intent(LoginActivity.this,MainActivity.class));

                                } else {

                                    Log.d("error","erro");

                                }
                            }
                        });
            }
        });
    }
}