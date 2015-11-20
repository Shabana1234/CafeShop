package com.example.exa0022.cafeshop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Exa0022 on 11/3/2015.
 */
public class Registration extends Activity {

    EditText ed_reg_name, ed_reg_mo_no, ed_reg_email, ed_reg_pwd, ed_reg_confirm_pwd;
    Button btn_reg_submit;
    TextView tv_reg_terms;
    String str_name, str_mo_no, str_email, str_pwd;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.registration);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        initializeWidget();
        setOnClickListener();

    }

    private void initializeWidget() {

        ed_reg_name = (EditText) findViewById(R.id.ed_cafe_reg_name);
        ed_reg_mo_no = (EditText) findViewById(R.id.ed_cafe_reg_mo_no);
        ed_reg_email = (EditText) findViewById(R.id.ed_cafe_reg_email);
        ed_reg_pwd = (EditText) findViewById(R.id.ed_cafe_reg_pwd);

        btn_reg_submit = (Button) findViewById(R.id.btn_cafe_reg_submit);

        tv_reg_terms = (TextView) findViewById(R.id.tv_cafe_reg_terms);
    }

    private void setOnClickListener() {

        btn_reg_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                str_name = ed_reg_name.getText().toString();
                str_mo_no = ed_reg_mo_no.getText().toString();
                str_email = ed_reg_email.getText().toString();
                str_pwd = ed_reg_pwd.getText().toString();

                Intent i = new Intent(Registration.this, login.class);
                startActivity(i);

            }
        });
        tv_reg_terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Registration.this, Terms_conditions.class);
            }
        });
    }
}

