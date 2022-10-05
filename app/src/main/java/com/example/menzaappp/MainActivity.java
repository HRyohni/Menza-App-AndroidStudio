package com.example.menzaappp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    String nazivjela [] = {"kurac","kurac","kurac","kurac"};
    String cijenajela[]= {"pička","pička","pička","pička"};
    String sadrzajjela[]= {"sisa","sisa","sisa","Pšenično brašno,jaja i mlijeko"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= (ListView) findViewById(R.id.customListView);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(),nazivjela,cijenajela,sadrzajjela);
        listView.setAdapter(customBaseAdapter);
    }


    public  void FastFood(View v)
        {
            Intent intent=new Intent(MainActivity.this,FastFood.class);

            startActivity(intent);
        }
}