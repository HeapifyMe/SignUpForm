package com.temple.edu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Email;
    private EditText Password;
    private EditText PasswordConfirmation;
    private Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = (EditText)findViewById(R.id.etName);
        Email = (EditText)findViewById(R.id.etEmail);
        Password = (EditText)findViewById(R.id.etPassword);
        PasswordConfirmation = (EditText)findViewById(R.id.etPasswordConfirmation);
        Login = (Button)findViewById(R.id.btSave);
        if (Name.toString().isEmpty() || Email.toString().isEmpty() || Password.toString().isEmpty() || PasswordConfirmation.toString().isEmpty())
        {
            Toast.makeText(this, "Must enter all fields", Toast.LENGTH_SHORT).show();
        }
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Email.getText().toString(), Password.getText().toString(), PasswordConfirmation.getText().toString());
            }
        });
    }



    private void validate(String Name, String Email,String userPass, String passConfirm)
    {
        
        if (Name.isEmpty() || Email.isEmpty() || userPass.isEmpty() || passConfirm.isEmpty())
        {
            Toast.makeText(this, "Must enter all fields", Toast.LENGTH_SHORT).show();
        }

        else if(!userPass.equals(passConfirm))
        {
            Toast.makeText(this, "Passwords do not match idiot", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, Name, Toast.LENGTH_SHORT).show();
        }
    }
}
