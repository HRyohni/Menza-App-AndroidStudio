package com.example.menzaappp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    String nazivjela [] = {"kurac","kurac","kurac","kurac"};
    String cijenajela[]= {"pička","pička","pička","pička"};
    String sadrzajjela[]= {"sisa","sisa","sisa","Pšenično brašno,jaja i mlijeko"};
    TextView Dan,rucakvecera;
    ImageView RVslika;
    ListView listView;


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent;
        switch (item.getItemId())
        {
            case R.id.restoran:
                 intent=new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);

                return true;

            case R.id.fastfood:
                 intent=new Intent(MainActivity.this,FastFood.class);
                startActivity(intent);
                return true;

            case R.id.about:
                 intent=new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);
                return true;

            case R.id.pizzeria:
                intent=new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);
                return true;
            case R.id.pitanja:
                intent=new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= (ListView) findViewById(R.id.customListView);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(),nazivjela,cijenajela,sadrzajjela);
        listView.setAdapter(customBaseAdapter);
        // find ids
        Dan = findViewById(R.id.dan);
        rucakvecera= findViewById(R.id.obrok);
        RVslika = findViewById(R.id.sun);
        // Datumi
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        Dan.setText(EnglishToCroatian(new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime())));
    }

    public void rucak_vecera(View v)
    {
        if (rucakvecera.getText().equals("Ručak"))

        {
            RVslika.setImageResource(R.drawable.sun);
            rucakvecera.setText("Večera");
        }
        else
        {  RVslika.setImageResource(R.drawable.moon);
            rucakvecera.setText("Ručak");
        }

    }

    String EnglishToCroatian(String S)
    { S.equals("null");
        switch (S)
        {
            case "Monday":
                S="Ponedjeljak";
                break;
            case "Tuesday":
                S="Utorak";
                break;
            case "Wednesday":
                S="Srijeda";
                break;
            case "Thursday":
                S="Četvrtak";
                break;
            case "Friday":
                S="Petak";
                break;
            case "Saturday":
                S="Subota";
                break;
            case "Sunday":
                S="Nedjelja";
                break;
        }
        return S;
    }

}