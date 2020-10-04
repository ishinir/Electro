package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class Items extends AppCompatActivity {

    SearchView searchItem;
    ListView listItem;
    ImageButton login, cart;

    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    Button searchbtn,more1, more2, more3, more4, more5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        searchItem = (SearchView) findViewById(R.id.searchItem);
        listItem = (ListView) findViewById(R.id.listItem);

        list=new ArrayList<String>();

        list.add("Phone");
        list.add("Head Phone");
        list.add("Chargers");
        list.add("Phone Covers");
        list.add("Screen Protectors");
        list.add("Data Cables");
        list.add("Bluetooth Headset");
        list.add("Memory Cards");

        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);
        listItem.setAdapter(adapter);

        searchItem.setOnQueryTextListener(new SearchView.OnQueryTextListener()
        {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s)
            {
                adapter.getFilter().filter(s);
                return false;
            }
        });


        more1 = (Button) findViewById(R.id.more1);
        more1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openActivity_item();
            }
        });

        more2 = (Button) findViewById(R.id.more2);
        more2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openActivity_item();
            }
        });

        more3 = (Button) findViewById(R.id.more3);
        more3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openActivity_item();
            }
        });

        more4 = (Button) findViewById(R.id.more4);
        more4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openActivity_item();
            }
        });

        //more5 = (Button) findViewById(R.id.more5);
        //more5.setOnClickListener(new View.OnClickListener()
      /*  {
            @Override
            public void onClick(View v)
            {
                openActivity_item();
            }
        });

       */

        cart = (ImageButton) findViewById(R.id.cart);
        cart.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openActivity_cart();
            }
        });


        //navigation to login view
       /*login = (ImageButton) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openActivity_login();
            }
        });*/


        searchbtn = (Button) findViewById(R.id.searchbtn);
        searchbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openActivity_Items();
            }
        });

    }

    public void openActivity_item()
    {
        Intent intent = new Intent(this,item.class);
        startActivity(intent);
    }

    public void openActivity_Items()
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