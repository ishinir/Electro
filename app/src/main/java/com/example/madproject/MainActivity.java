package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private Button searchbtn;
    ImageButton  cart1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        searchbtn = (Button) findViewById(R.id.searchbtn);
        searchbtn.setOnClickListener(new View.OnClickListener()
          {
             @Override
              public void onClick(View V)
             {
                 openActivity_items();
             }

          });

        cart1 = (ImageButton) findViewById(R.id.cart1);
        cart1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openActivity_cart();
            }
        });


       /*login = (ImageButton) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openActivity_login();
            }
        });*/


    }

    public void openActivity_items()
    {
        Intent intent = new Intent(this, Items.class);
        startActivity(intent);
    }

    public void openActivity_cart()
    {
        Intent intent = new Intent(this, cart.class);
        startActivity(intent);
    }

   /* public void openActivity_login()
    {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }*/



}