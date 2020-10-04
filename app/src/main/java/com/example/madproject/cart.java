package com.example.madproject;



        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.telecom.Call;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageButton;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.example.madproject.DATABASE.cart_DB;
        import com.google.firebase.database.DatabaseReference;
        import com.google.firebase.database.FirebaseDatabase;


public class cart extends AppCompatActivity {

    Button shopbtn, pay;
    TextView item1, item2, item3, item4, item5, price1, price2, price3, price4, price5;
    DatabaseReference datab;
    cart_DB insertCart;
    ImageButton delete1, delete2, delete3, delete4, delete5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);


        shopbtn = (Button) findViewById(R.id.shopbtn);
        shopbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_main();
            }
        });

        item1 = (TextView) findViewById(R.id.item1);
        item2 = (TextView) findViewById(R.id.item2);
        item3 = (TextView) findViewById(R.id.item3);
        item4 = (TextView) findViewById(R.id.item4);
        item5 = (TextView) findViewById(R.id.item5);

        price1 = (TextView) findViewById(R.id.price1);
        price2 = (TextView) findViewById(R.id.price2);
        price3 = (TextView) findViewById(R.id.price3);
        price4 = (TextView) findViewById(R.id.price4);
        price5 = (TextView) findViewById(R.id.price5);

        insertCart = new cart_DB();
        datab = FirebaseDatabase.getInstance().getReference().child("insertCart");

        pay = (Button) findViewById(R.id.pay);
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Price1 = Double.parseDouble(price1.getText().toString().trim());
                double Price2 = Double.parseDouble(price2.getText().toString().trim());
                double Price3 = Double.parseDouble(price3.getText().toString().trim());
                double Price4 = Double.parseDouble(price4.getText().toString().trim());
                double Price5 = Double.parseDouble(price5.getText().toString().trim());

                insertCart.setItem1(item1.getText().toString().trim());
                insertCart.setPrice1(Price1);
                insertCart.setItem2(item2.getText().toString().trim());
                insertCart.setPrice2(Price2);
                insertCart.setItem3(item3.getText().toString().trim());
                insertCart.setPrice3(Price3);
                insertCart.setItem4(item4.getText().toString().trim());
                insertCart.setPrice4(Price4);
                insertCart.setItem5(item5.getText().toString().trim());
                insertCart.setPrice5(Price5);


                datab.push().setValue(insertCart);
                Toast.makeText(cart.this, "Done", Toast.LENGTH_LONG).show();
            }
        });

        delete1 = (ImageButton) findViewById(R.id.delete1);
        delete1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

            }
        });
    }


    public void openActivity_main()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    }

