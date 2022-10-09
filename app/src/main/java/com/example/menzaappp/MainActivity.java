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
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    String a = "kurac";

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
        //dan u tijednu
        Dan = findViewById(R.id.dan);
        DanTijednu();
        // find ids

        rucakvecera= findViewById(R.id.obrok);
        RVslika = findViewById(R.id.sun);
        // Datumi

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

    String EnglishToCroatian(String S) // treba dodati s jer nece raditi
    {
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




    public void DanTijednu ()
    {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        String S = EnglishToCroatian(new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime()));
        Toast.makeText(this, S, Toast.LENGTH_SHORT).show();
        Dan.setText(EnglishToCroatian(S));
        String nazivjela []={} ;
        String sadrzajjela[]={};
        String cijenajela[]={};


        switch (EnglishToCroatian(S))
        {
            case "Ponedjeljak":
                 String Ponnazivjela[] = {"Juha od kosti\n" +
                        "Pečena piletina\n" +
                        "Mlinci\n" +
                        "Salata miješana\n" +
                        "Puding","Juha od povrća\n" +
                        "Pečena svinjetina\n" +
                        "Krumpir - kiseli kupus\n" +
                        "Salata miješana\n" +
                        "Puding","juha od povrća\n" +
                        "Odrezak od blitve\n" +
                        "Pečeni krumpir\n" +
                        "Salata miješana\n" +
                        "Puding"};
                String Ponsadrzajjela[]= {"Pšenično brašno,jaja i mlijeko","Celer","Celer"};
                String Poncijenajela[]= {"Ručak 1","Ručak 2","Vege"};
                nazivjela =Ponnazivjela ;
                sadrzajjela=Ponsadrzajjela;
                cijenajela= Poncijenajela;


                break;
            case "Utorak":
                String Utonazivjela[] = {"Juha od kosti\n" +
                        "Punjena paprika\n" +
                        "Pire krumpir\n" +
                        "Salata miješana\n" +
                        "Puding","Juha od povrća\n" +
                        "Kobasice kranjske\n" +
                        "Pomfrit\n" +
                        "Salata miješana\n" +
                        "Puding","Juha od povrća\n" +
                        "Savijača s povrćem\n" +
                        "Pire krumpir\n" +
                        "Salata miješana\n" +
                        "Puding","Juneći odrezak\n" +
                        "Njoki"};
                String Utosadrzajjela[]= {"Pšenično brašno,celer,jaja i mlijeko","Celer,jaja,pše.brašno","Pšenično brašno,celer,jaja i mlijeko","Pšenično brašno,celer i gorušicu"};
                String Utocijenajela[]= {"Ručak 1","Ručak 2","Vege","Izbor"};
                nazivjela =Utonazivjela ;
                sadrzajjela=Utosadrzajjela;
                cijenajela= Utocijenajela;

                break;
            case "Srijeda":
                String Srinazivjela[] = {"Juha od kosti\n" +
                        "Kosana štruca\n" +
                        "Salata miješana\n" +
                        "Puding\n" +
                        "Pekarski krumpir","Juha od kosti\n" +
                        "Riblji štapići\n" +
                        "Pečeni krumpir\n" +
                        "Salata miješana\n" +
                        "Puding","Juha od povrća\n" +
                        "Tortelini sa špinatom i umakom od rajčice\n" +
                        "Salata miješana\n" +
                        "Puding"};
                String Sriosadrzajjela[]= {"Pšenično brašno,jaja i mlijeko"};
                String Sricijenajela[]= {"Ručak 1","Ručak 2","Vege"};
                nazivjela =Srinazivjela;
                sadrzajjela=Sriosadrzajjela;
                cijenajela= Sricijenajela;

                break;
            case "Četvrtak":
                String Cetnazivjela[] = {"Juha od kosti\n" +
                        "Svinjetina pirjana\n" +
                        "Rizi-bizi\n" +
                        "Salata miješana\n" +
                        "Puding","juha od kosti\n" +
                        "sadr: pšenično\n" +
                        "Salata miješana\n" +
                        "Grah varivo\n" +
                        "Kobasice kranjske\n" +
                        "Puding","Juha od povrća\n" +
                        "Soja steak u umaku\n" +
                        "Rizi-bizi\n" +
                        "Salata miješana\n" +
                        "Puding"};
                String Cetosadrzajjela[]= {"Pšenično brašno,mlijeko,jaja,celer i gorušicu","Pšenično brašno,brašno,jaja,mlijeko,celer i gorušicu","pšenično brašno,mlijeko,celer i gorušicu"};
                String Cetcijenajela[]= {"Ručak 1","Ručak 2","Vege"};
                nazivjela =Cetnazivjela ;
                sadrzajjela=Cetcijenajela;
                cijenajela= Cetcijenajela;

                break;
            case "Petak":
                String Petnazivjela[] = {"Juha od povrća\n" +
                        "Pohani oslić file\n" +
                        "Kelj na lešo\n" +
                        "Salata miješana\n" +
                        "Puding","Juha od kosti\n" +
                        "Mesne okruglice u umaku od rajčice\n" +
                        "Tjestenina\n" +
                        "Salata miješana\n" +
                        "Puding","Juha od povrca\n" +
                        "Odrezak od kelja\n" +
                        "Tjestenina - Šalša\n" +
                        "Salata miješana\n" +
                        "Puding"};
                String Petosadrzajjela[]= {"Pšenično brašno,celer,jaja,riba i mlijeko","šenično brašno,celer,jaja i mlijeko","Pšenično brašno,jaja,celer i mlijeko"};
                String Petcijenajela[]= {"Ručak 1","Ručak 2","Vege"};
                nazivjela =Petnazivjela ;
                sadrzajjela=Petosadrzajjela;
                cijenajela= Petcijenajela;

                break;
            case "Subota":
                String Subnazivjela[] = {"Juha od kosti\n" +
                        "Svinjski odrezak u umaku\n" +
                        "Riža kuhana ili pirjana\n" +
                        "Salata miješana\n" +
                        "Desert","Juha od kosti\n" +
                        "Pečena piletina\n" +
                        "Mlinci\n" +
                        "Salata miješana\n" +
                        "Desert","Juha od povrća\n" +
                        "Zapečena cvjetača\n" +
                        "Mrkva i grašak\n" +
                        "Salata miješana\n" +
                        "Desert"};
                String Subosadrzajjela[]= {"Pšenično brašno,jaja i mlijeko","Pšenično brašno,jaja i mlijeko","Brašno,celer,jaja i mlijeko"};
                String Subcijenajela[]= {"Ručak 1","Ručak 2","Vege"};
                nazivjela =Subnazivjela;
                sadrzajjela=Subosadrzajjela;
                cijenajela= Subcijenajela;

                break;
            case "Nedjelja":
                try {
                    String Nednazivjela[] = {"Juha od kosti\n" +
                            "Pohani pileći file\n" +
                            "Restani krumpir\n" +
                            "Salata miješana\n" +
                            "Desert","Juha bistra\n" +
                            "Bolonjez\n" +
                            "Tjestenina\n" +
                            "Salata miješana\n" +
                            "Desert","Juha bistra\n" +
                            "Pohani sir\n" +
                            "Restani krumpir\n" +
                            "Salata miješana\n" +
                            "Desert"};
                    String Nedosadrzajjela[]= {"Pšenično brašno,jaja i mlijeko","Pšenično brašno,jaja,celer i gorušicu","Pšenično brašno,celer,jaja i mlijeko"};
                    String Nedcijenajela[]= {"Ručak 1","Ručak 2","Vege"};

                    nazivjela =Nednazivjela;
                    sadrzajjela=Nedosadrzajjela;
                    cijenajela= Nedcijenajela;
                }
                catch (Exception e)
                {
                    Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
                }

                break;
            default:
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }

        CustomBaseAdapterv2 customBaseAdapterv2 = new CustomBaseAdapterv2(getApplicationContext(),nazivjela,cijenajela,sadrzajjela);
        listView.setAdapter(customBaseAdapterv2);

    }

}