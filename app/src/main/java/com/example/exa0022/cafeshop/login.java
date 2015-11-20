package com.example.exa0022.cafeshop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Exa0022 on 11/3/2015.
 */
public class login extends Activity {

    EditText ed_cafe_username, ed_cafe_pwd;
    String str_username, str_password;
    Button btn_cafe_login_submit;

    TextView tv_cafe_login_forgot_pwd;

    TextView tv_cafe_login_create_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        initializewiget();
        setclicklistner();
    }

    private void initializewiget() {

        ed_cafe_username = (EditText) findViewById(R.id.ed_cafe_username);
        ed_cafe_pwd = (EditText) findViewById(R.id.ed_cafe_password);
        btn_cafe_login_submit = (Button) findViewById(R.id.btn_cafe_login_submit);
        tv_cafe_login_forgot_pwd = (TextView)findViewById(R.id.tv_cafe_login_forgot_pwd);
        tv_cafe_login_create_account = (TextView)findViewById(R.id.tv_cafe_login_create_account);

    }



    private void setclicklistner() {

        str_username = ed_cafe_username.getText().toString();
        str_password = ed_cafe_pwd.getText().toString();

        btn_cafe_login_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(login.this, Main_coffee.class);
                startActivity(i);
            }
        });

        tv_cafe_login_forgot_pwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(login.this, Forgot_pwd.class);
                startActivity(i);
            }
        });

        tv_cafe_login_create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(login.this, Registration.class);
                startActivity(i);
            }
        });
    }


}
