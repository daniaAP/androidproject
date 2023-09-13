package com.example.projdania;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;

public class SignupActivity extends AppCompatActivity {

    EditText username;
    EditText email;
    EditText password;
    EditText passwordc;
    Button signup;
    TextView error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        username=findViewById(R.id.ETuserSIG);
        email=findViewById(R.id.ETemailSIG);
        password=findViewById(R.id.ETpasswordSIG);
        passwordc=findViewById(R.id.cPassword);
        signup=findViewById(R.id.btSIGNUP);
        error=findViewById(R.id.errortext);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createNewAccount();
            }
        });
    }
    private void createNewAccount(){
        error.setVisibility(View.GONE);
        if(username.getText().toString().equals("")){
            error.setVisibility(View.VISIBLE);
            error.setText("please enter your full name");
            return;
        }
        if(email.getText().toString().equals("")){
            error.setVisibility(View.VISIBLE);
            error.setText("please enter your email");
            return;
        }
        if(password.getText().toString().equals("")){
            error.setVisibility(View.VISIBLE);
            error.setText("please enter your password");
            return;
        }
        if(passwordc.getText().toString().equals("")){
            error.setVisibility(View.VISIBLE);
            error.setText("please confirm your password");
            return;
        }
        if(!passwordc.getText().toString().equals(password.getText().toString())){
            error.setVisibility(View.VISIBLE);
            error.setText("password dosn't match");
            return;
        }
        final FirebaseAuth mAuth=FirebaseAuth.getInstance();
        mAuth.createUserWithEmailAndPassword(email.getText().toString(), password.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {

                            FirebaseUser user = mAuth.getCurrentUser();

                            UserProfileChangeRequest profileUpdates = new UserProfileChangeRequest.Builder()
                                    .setDisplayName(username.getText().toString())
                                    .build();

                            user.updateProfile(profileUpdates)
                                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {
                                            if (task.isSuccessful()) {
                                                startActivity(new Intent(SignupActivity.this,MainActivity.class));
                                            }
                                        }
                                    });
                        } else {

                            //Log.w(TAG, "createUserWithEmail:failure", task.getException());
                            error.setVisibility(View.VISIBLE);
                            error.setText(task.getException().getMessage());

                        }
                    }
                });
    }
}