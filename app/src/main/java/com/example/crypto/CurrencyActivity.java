package com.example.crypto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CurrencyActivity extends AppCompatActivity {
ArrayList<String> symbols = new ArrayList<>() , names = new ArrayList<>();
ArrayList<Integer> icons = new ArrayList<>();
GridView currencies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        currencies = findViewById(R.id.currency_grid);
        Intent intent = new Intent(CurrencyActivity.this,Show_currency.class);

        symbols.add("BTN");
        icons.add(R.drawable.btc);
        symbols.add("ABT");
        icons.add(R.drawable.abt);
        symbols.add("ACT");
        icons.add(R.drawable.act);
        symbols.add("ACTN");
        icons.add(R.drawable.actn);
        symbols.add("ADA");
        icons.add(R.drawable.ada);
        symbols.add("ADD");
        icons.add(R.drawable.add);
        symbols.add("ADX");
        icons.add(R.drawable.adx);
        symbols.add("AE");
        icons.add(R.drawable.ae);
        symbols.add("AEON");
        icons.add(R.drawable.aeon);
        symbols.add("AEUR");
        icons.add(R.drawable.aeur);
        symbols.add("AGI");
        icons.add(R.drawable.agi);
        symbols.add("AGRS");
        icons.add(R.drawable.agrs);
        symbols.add("AION");
        icons.add(R.drawable.aion);
        symbols.add("ALGO");
        icons.add(R.drawable.algo);
        symbols.add("AMB");
        icons.add(R.drawable.amb);
        symbols.add("AMP");
        icons.add(R.drawable.amp);
        symbols.add("AMPL");
        icons.add(R.drawable.ampl);
        symbols.add("ANT");
        icons.add(R.drawable.ant);
        symbols.add("APEX");
        icons.add(R.drawable.apex);
        symbols.add("APPC");
        icons.add(R.drawable.appc);
        symbols.add("ARDR");
        icons.add(R.drawable.ardr);
        symbols.add("ARG");
        icons.add(R.drawable.arg);
        symbols.add("ARK");
        icons.add(R.drawable.ark);
        symbols.add("ARN");
        icons.add(R.drawable.arn);
        symbols.add("ARNX");
        icons.add(R.drawable.arnx);
        symbols.add("ARY");
        icons.add(R.drawable.ary);
        symbols.add("AST");
        icons.add(R.drawable.ast);
        symbols.add("ATM");
        icons.add(R.drawable.atm);
        symbols.add("ATOM");
        icons.add(R.drawable.atom);
        symbols.add("AUDR");
        icons.add(R.drawable.audr);
        symbols.add("AUTO");
        icons.add(R.drawable.auto);
        symbols.add("AYWA");
        icons.add(R.drawable.aywa);
        symbols.add("BAB");
        icons.add(R.drawable.bab);
        symbols.add("BAL");
        icons.add(R.drawable.bal);
        symbols.add("BAND");
        icons.add(R.drawable.band);
        symbols.add("BAT");
        icons.add(R.drawable.bat);
        symbols.add("BAY");
        icons.add(R.drawable.bay);
        symbols.add("BCBC");
        icons.add(R.drawable.bcbc);
        symbols.add("BCC");
        icons.add(R.drawable.bcc);
        symbols.add("BCD");
        icons.add(R.drawable.bcd);
        symbols.add("BCH");
        icons.add(R.drawable.bch);
        symbols.add("BCIO");
        icons.add(R.drawable.bcio);
        symbols.add("BCN");
        icons.add(R.drawable.bcn);
        symbols.add("BCO");
        icons.add(R.drawable.bco);
        symbols.add("BCPT");
        icons.add(R.drawable.bcpt);
        symbols.add("BDL");
        icons.add(R.drawable.bdl);
        symbols.add("BEAM");
        icons.add(R.drawable.beam);
        symbols.add("BELA");
        icons.add(R.drawable.bela);
        symbols.add("BIX");
        icons.add(R.drawable.bix);
        symbols.add("BLCN");
        icons.add(R.drawable.blcn);

        GridAdapter gridAdapter = new GridAdapter(icons,symbols);
        currencies.setAdapter(gridAdapter);
        currencies.setNumColumns(1);



    }
    class GridAdapter extends BaseAdapter {

        ArrayList<Integer> icons ;
        ArrayList<String> syms;
        public GridAdapter(ArrayList<Integer> icons , ArrayList<String> syms){
            this.icons=icons;
            this.syms = syms;
        }


        @Override
        public int getCount() {
            return icons.size();
        }

        @Override
        public Integer getItem(int position) {
            return icons.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {
            if (view == null){
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.currency_grid,parent,false);
            }
            TextView text;
            ImageView image;
            text = view.findViewById(R.id.currency_name);
            image = view.findViewById(R.id.currency_icon);
            text.setText(syms.get(position));
            image.setImageResource(icons.get(position));
            return view;
        }
    }
}