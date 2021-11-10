package com.example.crypto;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        ArrayList<Icon> icons = new ArrayList<>();
        Intent ii = new Intent(MainActivity.this,BankActivity.class);
        icons.add(new Icon("نرخ ارزها", R.drawable.currency, new Intent(MainActivity.this,CurrencyActivity.class)));
        icons.add(new Icon("تاپ لیست معاملات", R.drawable.toplist, new Intent(MainActivity.this,TopListActivity.class)));
        icons.add(new Icon("تبدیلگر ارز", R.drawable.converter, new Intent(MainActivity.this,ConverterActivity.class)));
        icons.add(new Icon("دسترسی به بانکها", R.drawable.bank, new Intent(MainActivity.this,BankActivity.class)));


        gridView = findViewById(R.id.main_grid);
        GridAdapter adapter = new GridAdapter(icons);
        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);
        gridView.setVerticalSpacing(2);
        gridView.setHorizontalSpacing(1);

        gridView.setOnItemClickListener((adapterView, view, i, l) -> startActivity(icons.get(i).getActivity()));


    }

    class GridAdapter extends BaseAdapter {

        ArrayList<Icon> icons ;
        public GridAdapter(ArrayList<Icon> icons){
            this.icons=icons;
        }


        @Override
        public int getCount() {
            return icons.size();
        }

        @Override
        public Icon getItem(int position) {
            return icons.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {
            if (view == null){
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_page_grid,parent,false);
            }
            TextView text;
            ImageView image;
            text = view.findViewById(R.id.button_text);
            image = view.findViewById(R.id.icon);
            text.setText(icons.get(position).getName());
            image.setImageResource(icons.get(position).getId());
            return view;
        }
    }

}