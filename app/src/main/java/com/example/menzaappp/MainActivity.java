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
                 intent=new Intent(MainActivity.this,About.class);
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
        if (rucakvecera.getText().equals("Ru??ak"))

        {
            RVslika.setImageResource(R.drawable.sun);
            rucakvecera.setText("Ve??era");
        }
        else
        {  RVslika.setImageResource(R.drawable.moon);
            rucakvecera.setText("Ru??ak");
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
                S="??etvrtak";
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
        Dan.setText(EnglishToCroatian(S));
        String nazivjela []={} ;
        String sadrzajjela[]={};
        String cijenajela[]={};


        switch (EnglishToCroatian(S))
        {
            case "Ponedjeljak":
                 String Ponnazivjela[] = {"Juha od kosti\n" +
                        "Pe??ena piletina\n" +
                        "Mlinci\n" +
                        "Salata mije??ana\n" +
                        "Puding","Juha od povr??a\n" +
                        "Pe??ena svinjetina\n" +
                        "Krumpir - kiseli kupus\n" +
                        "Salata mije??ana\n" +
                        "Puding","juha od povr??a\n" +
                        "Odrezak od blitve\n" +
                        "Pe??eni krumpir\n" +
                        "Salata mije??ana\n" +
                        "Puding"};
                String Ponsadrzajjela[]= {"P??eni??no bra??no,jaja i mlijeko","Celer","Celer"};
                String Poncijenajela[]= {"Ru??ak 1","Ru??ak 2","Vege"};
                nazivjela =Ponnazivjela ;
                sadrzajjela=Ponsadrzajjela;
                cijenajela= Poncijenajela;


                break;
            case "Utorak":
                String Utonazivjela[] = {"Juha od kosti\n" +
                        "Punjena paprika\n" +
                        "Pire krumpir\n" +
                        "Salata mije??ana\n" +
                        "Puding","Juha od povr??a\n" +
                        "Kobasice kranjske\n" +
                        "Pomfrit\n" +
                        "Salata mije??ana\n" +
                        "Puding","Juha od povr??a\n" +
                        "Savija??a s povr??em\n" +
                        "Pire krumpir\n" +
                        "Salata mije??ana\n" +
                        "Puding","June??i odrezak\n" +
                        "Njoki"};
                String Utosadrzajjela[]= {"P??eni??no bra??no,celer,jaja i mlijeko","Celer,jaja,p??e.bra??no","P??eni??no bra??no,celer,jaja i mlijeko","P??eni??no bra??no,celer i goru??icu"};
                String Utocijenajela[]= {"Ru??ak 1","Ru??ak 2","Vege","Izbor"};
                nazivjela =Utonazivjela ;
                sadrzajjela=Utosadrzajjela;
                cijenajela= Utocijenajela;

                break;
            case "Srijeda":
                String Srinazivjela[] = {"Juha od kosti\n" +
                        "Kosana ??truca\n" +
                        "Salata mije??ana\n" +
                        "Puding\n" +
                        "Pekarski krumpir","Juha od kosti\n" +
                        "Riblji ??tapi??i\n" +
                        "Pe??eni krumpir\n" +
                        "Salata mije??ana\n" +
                        "Puding","Juha od povr??a\n" +
                        "Tortelini sa ??pinatom i umakom od raj??ice\n" +
                        "Salata mije??ana\n" +
                        "Puding"};
                String Sriosadrzajjela[]= {"P??eni??no bra??no,jaja i mlijeko","P??eni??no bra??no,jaja,soju i mlijeko","P??eni??no bra??no,celer i goru??icu"};
                String Sricijenajela[]= {"Ru??ak 1","Ru??ak 2","Vege"};
                nazivjela =Srinazivjela;
                sadrzajjela=Sriosadrzajjela;
                cijenajela= Sricijenajela;

                break;
            case "??etvrtak":
                String Cetnazivjela[] = {"Juha od kosti\n" +
                        "Svinjetina pirjana\n" +
                        "Rizi-bizi\n" +
                        "Salata mije??ana\n" +
                        "Puding","juha od kosti\n" +
                        "sadr: p??eni??no\n" +
                        "Salata mije??ana\n" +
                        "Grah varivo\n" +
                        "Kobasice kranjske\n" +
                        "Puding","Juha od povr??a\n" +
                        "Soja steak u umaku\n" +
                        "Rizi-bizi\n" +
                        "Salata mije??ana\n" +
                        "Puding"};
                String Cetosadrzajjela[]= {"P??eni??no bra??no,mlijeko,jaja,celer i goru??icu","P??eni??no bra??no,bra??no,jaja,mlijeko,celer i goru??icu","p??eni??no bra??no,mlijeko,celer i goru??icu"};
                String Cetcijenajela[]= {"Ru??ak 1","Ru??ak 2","Vege"};
                nazivjela =Cetnazivjela ;
                sadrzajjela=Cetcijenajela;
                cijenajela= Cetcijenajela;

                break;
            case "Petak":
                String Petnazivjela[] = {"Juha od povr??a\n" +
                        "Pohani osli?? file\n" +
                        "Kelj na le??o\n" +
                        "Salata mije??ana\n" +
                        "Puding","Juha od kosti\n" +
                        "Mesne okruglice u umaku od raj??ice\n" +
                        "Tjestenina\n" +
                        "Salata mije??ana\n" +
                        "Puding","Juha od povrca\n" +
                        "Odrezak od kelja\n" +
                        "Tjestenina - ??al??a\n" +
                        "Salata mije??ana\n" +
                        "Puding"};
                String Petosadrzajjela[]= {"P??eni??no bra??no,celer,jaja,riba i mlijeko","??eni??no bra??no,celer,jaja i mlijeko","P??eni??no bra??no,jaja,celer i mlijeko"};
                String Petcijenajela[]= {"Ru??ak 1","Ru??ak 2","Vege"};
                nazivjela =Petnazivjela ;
                sadrzajjela=Petosadrzajjela;
                cijenajela= Petcijenajela;

                break;
            case "Subota":
                String Subnazivjela[] = {"Juha od kosti\n" +
                        "Svinjski odrezak u umaku\n" +
                        "Ri??a kuhana ili pirjana\n" +
                        "Salata mije??ana\n" +
                        "Desert","Juha od kosti\n" +
                        "Pe??ena piletina\n" +
                        "Mlinci\n" +
                        "Salata mije??ana\n" +
                        "Desert","Juha od povr??a\n" +
                        "Zape??ena cvjeta??a\n" +
                        "Mrkva i gra??ak\n" +
                        "Salata mije??ana\n" +
                        "Desert"};
                String Subosadrzajjela[]= {"P??eni??no bra??no,jaja i mlijeko","P??eni??no bra??no,jaja i mlijeko","Bra??no,celer,jaja i mlijeko"};
                String Subcijenajela[]= {"Ru??ak 1","Ru??ak 2","Vege"};
                nazivjela =Subnazivjela;
                sadrzajjela=Subosadrzajjela;
                cijenajela= Subcijenajela;

                break;
            case "Nedjelja":
                try {
                    String Nednazivjela[] = {"Juha od kosti\n" +
                            "Pohani pile??i file\n" +
                            "Restani krumpir\n" +
                            "Salata mije??ana\n" +
                            "Desert","Juha bistra\n" +
                            "Bolonjez\n" +
                            "Tjestenina\n" +
                            "Salata mije??ana\n" +
                            "Desert","Juha bistra\n" +
                            "Pohani sir\n" +
                            "Restani krumpir\n" +
                            "Salata mije??ana\n" +
                            "Desert"};
                    String Nedosadrzajjela[]= {"P??eni??no bra??no,jaja i mlijeko","P??eni??no bra??no,jaja,celer i goru??icu","P??eni??no bra??no,celer,jaja i mlijeko"};
                    String Nedcijenajela[]= {"Ru??ak 1","Ru??ak 2","Vege"};

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