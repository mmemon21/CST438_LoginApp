package com.example.cst438_loginapp_mustafamemon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ename;
    EditText epassword;
    Button login;

//    String yname = "zidane1";
//    String ypass = "zidane1";
    String[] names = {
            "zidane1",
            "guardiola33",
            "christoph22",
            "mustafa21",
            "a",
            "b"
    };
    String[] password = {
            "hala_madrid",
            "joker-fan",
            "random-pass",
            "whatismypass",
            "y",
            "z"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ename = findViewById(R.id.username);
        epassword = findViewById(R.id.etPassword);
        login = findViewById(R.id.btnLogin);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName = ename.getText().toString();
                String inputPass = epassword.getText().toString();
                boolean passValid = false;
                boolean nameValid = false;
                int n = 0;
                    for (int i = 0; i < 6; i++) {
                        if (inputName.equalsIgnoreCase(names[i]) & inputPass.toString().equals(password[i])) {
                            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                            startActivity(intent);
                            break;
                        }
                        if (!(inputPass.toString().equals(password[i])) & ((inputName.equalsIgnoreCase(names[i])))){
                            epassword.setError("Incorrect");
                        }
                        else if (!(inputName.equalsIgnoreCase(names[i])) & ((inputPass.toString().equals(password[i])))){

                            ename.setError("Incorrect");
                        }


                    }



                    n++;
                }
            //}

        });
    }


//    private void validate(String userName, String userPassword) {
//        for(int i = 0; i < names.length; i++) {
//            if ((userName.equals(names[i])) && (userPassword.equals(password[i]))) {
//                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
//                startActivity(intent);
//            }
//        }
//    }
}