package com.example.bananaquciktip;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etName, etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = (EditText) findViewById(R.id.login_input);
        etPassword = (EditText) findViewById(R.id.password_input);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etName.getText().toString().equals("admin") && etPassword.getText().toString().equals("1234")) {
                    Intent B1 = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(B1);
                } else {
                    Toast.makeText(getApplicationContext(), "รหัสผ่านไม่ถูกต้อง", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}