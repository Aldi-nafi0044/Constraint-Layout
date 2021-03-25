package com.example.contohconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    // deklarasi variabel untuk button
    Button edsignin;
    // deklarasi variabel untuk edit text
    EditText edemail, edpassword;
    // deklarasi variabel untuk untuk menyimpan email dan password
    String nama, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edsignin=findViewById(R.id.edit_signin);
        edemail=findViewById(R.id.ed_e_mail);
        edpassword=findViewById(R.id.edit_password);

        edsignin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                nama = edemail.getText().toString();
                password = edpassword.getText().toString();
                Toast t = Toast.makeText(getApplicationContext(),
                        "email anda : "+nama+"password : "+password,Toast.LENGTH_LONG);
                t.show();
            }
        });

    }
}