package com.example.menzaappp;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapterv2 extends BaseAdapter {

    Context context;
    String  Listnazivjela[];
    String  Listcijenajela[];
    String  Listsadrzajjela[];
    ImageView Listabackground;

    LayoutInflater inflater;
    public CustomBaseAdapterv2(Context ctx,String [] nazivjela,String [] cijenajela, String [] sadrzajjela)
    {
        this.context = ctx ;

        this.Listcijenajela =cijenajela;
        this.Listsadrzajjela =sadrzajjela;
        this.Listnazivjela =nazivjela;
        inflater = LayoutInflater.from(ctx);

    }
    @Override
    public int getCount() {
        return Listcijenajela.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    // nazivjela cijenajela sadrzajjela
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_custom_list_viewv2,null);
        TextView txtnazivjela = (TextView) convertView.findViewById(R.id.nazivjela);
        TextView txtcijenajela = (TextView) convertView.findViewById(R.id.cijenajela);
        TextView txtsadrzajjela = (TextView) convertView.findViewById(R.id.sadrzajjela);
        ImageView background = (ImageView) convertView.findViewById(R.id.foodboxv2);

        txtcijenajela.setText(Listcijenajela[position]);
        txtnazivjela.setText(Listnazivjela[position]);
        txtsadrzajjela.setText(Listsadrzajjela[position]);
        background.setImageResource(R.drawable.foodboxv2);
        return convertView;
    }
}
