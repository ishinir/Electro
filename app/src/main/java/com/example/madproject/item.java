package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class item extends AppCompatActivity
{

    Button searchbtn, addCbtn;
    ImageButton login, cart;
    private static ImageView itemImage,itemImage1,itemImage2;
    private int current_image;
    int[] images={R.id.itemImage, R.id.item1};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        searchbtn = (Button) findViewById(R.id.searchbtn);
        searchbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View V)
            {
                openActivity_items();
            }

        });


        addCbtn = (Button) findViewById(R.id.addCbtn);
        addCbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openActivity_cart();
            }
        });


        cart = (ImageButton) findViewById(R.id.cart);
        cart.setOnClickListener(new View.OnClickListener()
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
        });       */


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

   /*public void openActivity_login()
    {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }
    */
}