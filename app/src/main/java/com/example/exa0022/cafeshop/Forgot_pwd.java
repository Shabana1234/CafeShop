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
public class Forgot_pwd extends Activity {

    EditText ed_cafe_fp_mo_no;

    Button btn_cafe_fp_ok;

    Button btn_cafe_fp_cancel;

    protected void onCreate(Bundle savedInstanceState) {

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_pwd);
        initializewiget();
        setclicklistner();
    }
    // This is comment

    private void initializewiget() {

        ed_cafe_fp_mo_no = (EditText)findViewById(R.id.ed_cafe_fp_mo_no);
        btn_cafe_fp_ok = (Button)findViewById(R.id.btn_cafe_fp_ok);
        btn_cafe_fp_cancel = (Button)findViewById(R.id.btn_cafe_fp_cancel);
    }
    private void setclicklistner() {

        btn_cafe_fp_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Forgot_pwd.this,Reset_pwd.class);
                startActivity(i);
            }
        });

        btn_cafe_fp_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Forgot_pwd.this,login.class);
                startActivity(i);
            }
        });


    }
}

