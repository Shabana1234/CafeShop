package com.example.exa0022.cafeshop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Exa0022 on 11/7/2015.
 */
public class Reset_pwd extends Activity{

    EditText ed_cafe_reset_pwd_code,ed_cafe_reset_pwd_new_pwd,ed_cafe_reset_pwd_confirm_pwd;
    Button btn_cafe_reset_pwd_reset,btn_cafe_reset_pwd_cancel;

    protected void onCreate(Bundle savedInstanceState) {

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reset_pwd);
        initializewiget();
        setclicklistner();
    }

    private void initializewiget() {

        ed_cafe_reset_pwd_code = (EditText)findViewById(R.id.ed_cafe_reset_pwd_code);
        ed_cafe_reset_pwd_new_pwd = (EditText)findViewById(R.id.ed_cafe_reset_pwd_new_pwd);
        ed_cafe_reset_pwd_confirm_pwd = (EditText)findViewById(R.id.ed_cafe_reset_pwd_confirm_pwd);

        btn_cafe_reset_pwd_cancel = (Button)findViewById(R.id.btn_cafe_reset_pwd_cancel);
        btn_cafe_reset_pwd_reset = (Button)findViewById(R.id.btn_cafe_reset_pwd_reset);


    }
    private void setclicklistner() {

        btn_cafe_reset_pwd_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Reset_pwd.this,login.class);
                startActivity(i);
            }
        });

        btn_cafe_reset_pwd_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Reset_pwd.this,Forgot_pwd.class);
                startActivity(i);
            }
        });
    }
}
