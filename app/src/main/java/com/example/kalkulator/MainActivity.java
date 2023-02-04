package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String SHARED_PREFS = "shared_prefs";
    public static final String EMAIL_KEY = "email_key";
    public static final String PASSWORD_KEY = "password_key";

    //list widget yang akan dikenakan aksi
    EditText txtUsername;
    EditText txtPassword;
    Button btnLogin;

    SharedPreferences sharedpreferences;
    String email, password;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // konekkan semua komponen dengan xml nya
        txtUsername = (EditText) findViewById(R.id.txtUsername);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        btnLogin = (Button) findViewById(R.id.btnPassword);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = txtUsername.getText().toString();
                String password = txtPassword.getText().toString();
                if (username.equalsIgnoreCase("admin") &&
                        password.equalsIgnoreCase("admin")) {

 //                   Toast.makeText(getApplicationContext(), "Sukses Login", Toast.LENGTH_SHORT).show();

                    sharedpreferences = getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedpreferences.edit();

                    editor.putString(EMAIL_KEY, txtUsername.getText().toString());
                    editor.putString(PASSWORD_KEY, txtPassword.getText().toString());
 //                   new AlertDialog.Builder(MainActivity.this)
 //                           .setTitle("Sukses")
 //                           .setMessage("Login Sukses")
 //                           .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
 //                               @Override
 //                               public void onClick(DialogInterface dialogInterface, int i) {
 //                                   // Continue with delete operation
 //                               }
 //                           })
                            // A null listener allows the button to dismiss the dialog and take no further action.
 //                           .setNegativeButton(android.R.string.no, null)
 //                           .setIcon(android.R.drawable.ic_dialog_alert)
 //                           .show();
                            editor.apply();
                            startActivity(new Intent(MainActivity.this, Kalkulator.class));
                            finish();
                }else {
                    Toast.makeText(getApplicationContext(), "Gagal Login", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}