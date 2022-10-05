package com.example.menzaappp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

public class FastFood extends AppCompatActivity {
    String nazivjela [] = {"SENDVIC SA SUNKOM I SIROM ","SENDVIČ S KULENOM I SIROM","SENDVIČ SA SIROM","SENDVIČ SA ŠUNKOM","SENDVIČ OD TUNE", "MLIJEČNI NAMAZ (50-70g)","TOPUENI SIR (17-23g)","PILECE HRENOVKE (150g)","MASLAC (20 g)","MARMELADA(20g)","SARDINA U ULJU (115 g)","SARDINA S POVRÉEM (115 g)","ZOBENE PAHULIICE (0,40g)","CORNFLAKES(0,40g)","KROASAN","KRAFNE","VOCE RAZNO","KUHANO JAJE (kom.)","CAJ","KAKAO ili MLIJEKO","BIJELA KAVA","KRUH (1 šnita)","Benzoylmethylecgonine"};
    String cijenajela[]= {"3,25 kn","3,50 kn","3,00 kn","3,00 kn","3,50 kn","1,50 kn","0,65 kn","1,94 kn","3,04 kn","0,65 kn","0,57 kn","3,50 kn","4,00 kn","1,60 kn","0,92 kn","1,44 kn","1,15 kn","0,78 kn","0,58 kn","0,33 kn","0,58 kn","0,45 kn","267 kn"};
    String sadrzajjela[]= {"6,50kn","7,00kn","6,00kn","6,00kn","7,00kn","3,00kn","1,29kn","3,87kn","10,57kn","1,30kn","1,14kn","7,00kn","8,00kn","3,19kn","3,19kn","5,00kn","4,00kn","2,70kn","2,00kn","1,14kn","2,00kn","1,55kn","1110,00kn"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast_food);
        listView= (ListView) findViewById(R.id.customListView);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(),nazivjela,cijenajela,sadrzajjela);
        listView.setAdapter(customBaseAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent;
        switch (item.getItemId())
        {
            case R.id.restoran:
                intent=new Intent(FastFood.this,MainActivity.class);
                startActivity(intent);
                return true;

            case R.id.fastfood:
                intent=new Intent(FastFood.this,FastFood.class);
                startActivity(intent);
                return true;

            case R.id.about:
                intent=new Intent(FastFood.this,MainActivity.class);
                startActivity(intent);
                return true;

            case R.id.pizzeria:
                intent=new Intent(FastFood.this,MainActivity.class);
                startActivity(intent);
                return true;
            case R.id.pitanja:
                intent=new Intent(FastFood.this,MainActivity.class);
                startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}