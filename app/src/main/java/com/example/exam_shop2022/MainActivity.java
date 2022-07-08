package com.example.exam_shop2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView img_product_main;
    EditText edit_count;
    TextView txt_price, txt_delivery, txt_pay;
    CheckBox chk_agree;

    int val_price;
    int val_delivery = 2500;
    int val_pay;

    int selected_price = 1500;
    int selected_count = 1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_product_main.findViewById(R.id.img_product_main);
        edit_count.findViewById(R.id.edit_count);
        txt_price.findViewById(R.id.txt_price);
        txt_delivery.findViewById(R.id.txt_delivery);
        txt_pay.findViewById(R.id.txt_pay);

        findViewById(R.id.radio1).setOnClickListener(this);
        findViewById(R.id.radio2).setOnClickListener(this);
        findViewById(R.id.radio3).setOnClickListener(this);
        findViewById(R.id.btn_minus).setOnClickListener(this);
        findViewById(R.id.btn_plus).setOnClickListener(this);
        findViewById(R.id.btn_pay).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int count;
        switch (v.getId()) {
            case R.id.radio1:
                img_product_main.setImageResource(R.drawable.product1);
                selected_price = 1500;
                sumTotal();
                break;

            case R.id.radio2:
                img_product_main.setImageResource(R.drawable.product2);
                selected_price = 2000;
                sumTotal();
                break;

            case R.id.radio3:
                img_product_main.setImageResource(R.drawable.product3);
                selected_price = 3000;
                sumTotal();
                break;

            case  R.id.btn_minus:
                count = Integer.parseInt(edit_count.getText().toString());
                if (count == 1) {
                    Toast.makeText(this, "최소 1개 ㅇㅇ", Toast.LENGTH_SHORT).show();
                } else {
                    --count;
                    edit_count.setText(Integer.toString(count));
                }
                sumTotal();
                break;

            case  R.id.btn_plus:
                count = Integer.parseInt(edit_count.getText().toString());
                    edit_count.setText(Integer.toString(count));
                    sumTotal();
                    break;

            case R.id.btn_pay:
                Intent intent = new Intent(this, SubActivity.class);
                startActivity(intent);
        }
    }

    private void sumTotal() {
    }
}