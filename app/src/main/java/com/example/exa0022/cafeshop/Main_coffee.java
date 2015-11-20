package com.example.exa0022.cafeshop;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

/**
 * Created by Exa0022 on 11/3/2015.
 */
public class Main_coffee extends Activity {

    ImageButton img_btn_cafe_main_menu;

    ImageButton img_btn_cafe_main_gallery;

    ImageButton img_btn_cafe_main_offers;

    ImageView img_cafe_main_cafe_img;

    TextView tv_cafe_main_clicking_text;

    Point p;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main_cafe);
        initializeWidget();
        setOnClickLIstener();
    }

    private void initializeWidget() {

        img_cafe_main_cafe_img = (ImageView) findViewById(R.id.img_cafe_main_cafe_img);
        img_btn_cafe_main_gallery = (ImageButton) findViewById(R.id.img_btn_cafe_main_gallery);
        img_btn_cafe_main_menu = (ImageButton) findViewById(R.id.img_btn_cafe_main_menu);
        img_btn_cafe_main_offers = (ImageButton) findViewById(R.id.img_btn_cafe_main_offers);
        tv_cafe_main_clicking_text = (TextView) findViewById(R.id.tv_cafe_main_clicking_text);

    }

    private void setOnClickLIstener() {

        img_btn_cafe_main_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main_coffee.this, Menu_file.class);
                startActivity(i);
            }
        });

        img_btn_cafe_main_gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main_coffee.this, Gallery_file.class);
                startActivity(i);
            }
        });

        img_btn_cafe_main_offers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Main_coffee.this, Offers_file.class);
                startActivity(i);
            }
        });

        tv_cafe_main_clicking_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p != null)
                    showPopup(Main_coffee.this, p);
            }
        });
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {

        int[] location = new int[2];
        tv_cafe_main_clicking_text = (TextView) findViewById(R.id.tv_cafe_main_clicking_text);

        tv_cafe_main_clicking_text.getLocationOnScreen(location);

        p = new Point();
        p.x = location[0];
        p.y = location[0];
    }

    // The method that displays the popup.
    private void showPopup(final Activity context, Point p) {

        int popupWidth = 600;
        int popupHeight = 250;

        LinearLayout viewGroup = (LinearLayout) context.findViewById(R.id.popup);
        LayoutInflater layoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = layoutInflater.inflate(R.layout.popup_layout, viewGroup);

        // Creating the PopupWindow
        final PopupWindow popup = new PopupWindow(context);
        popup.setContentView(layout);
        popup.setWidth(popupWidth);
        popup.setHeight(popupHeight);
        popup.setFocusable(true);
        popup.setAnimationStyle(R.style.Animation);

       /* int OFFSET_X = 30;
        int OFFSET_Y = 30;*/

        popup.setBackgroundDrawable(new BitmapDrawable());

        popup.showAtLocation(layout, Gravity.CENTER, 0, 0);

        Button btn_popup_online = (Button) layout.findViewById(R.id.btn_popup_online);
        btn_popup_online.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent int_online_payment = new Intent(Main_coffee.this, Online_payment.class);
                startActivity(int_online_payment);
            }
        });

        Button btn_popup_offline = (Button) layout.findViewById(R.id.btn_popup_offline);
        btn_popup_offline.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent int_offline_payment = new Intent(Main_coffee.this, Offline_payment.class);
                startActivity(int_offline_payment);
            }
        });
        Button btn_popup_cancel = (Button) layout.findViewById(R.id.btn_popup_cancel);
        btn_popup_cancel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                popup.dismiss();
            }
        });
    }
}
