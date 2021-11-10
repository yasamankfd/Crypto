package com.example.crypto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class BankActivity extends AppCompatActivity {

    GridView banks_grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);

        banks_grid = findViewById(R.id.bank_grid);
        ArrayList<Icon> icons = new ArrayList<>();
        ArrayList<String> bankLinks = new ArrayList<>();
        bankLinks.add("https://bmi.ir/");
        bankLinks.add("https://www.ebanksepah.ir/");
        bankLinks.add("https://www.postbank.ir/");
        bankLinks.add("https://www.tejaratbank.ir/index.php");
        bankLinks.add("http://en.bankmellat.ir/");
        bankLinks.add("https://bsi.ir/Pages/Home.aspx");
        bankLinks.add("https://ttbank.ir/fa/");
        bankLinks.add("https://www.bim.ir/fa-IR/Portal/1/page/%D8%B5%D9%81%D8%AD%D9%87-%D8%A7%D8%B5%D9%84%DB%8C");
        bankLinks.add("https://ib.bki.ir/pid2.lmx");
        bankLinks.add("https://ibn.bank-maskan.ir/login");
        bankLinks.add("https://www.refah-bank.ir/");
        bankLinks.add("https://www.enbank.ir/");
        bankLinks.add("https://www.parsian-bank.ir/");
        bankLinks.add("https://www.karafarinbank.ir/");
        bankLinks.add("https://sb24.ir/");
        bankLinks.add("https://www.bpi.ir/");
        bankLinks.add("https://www.sbank.ir/sis_products_services/102065/102065.htm");
        bankLinks.add("https://www.sinabank.ir/");
        bankLinks.add("https://www.shahr-bank.ir/");
        bankLinks.add("https://ibank.tourism-bank.com/");
        bankLinks.add("https://www.izbank.ir/");
        bankLinks.add("https://en.middleeastbank.ir/");
        bankLinks.add("https://ba24.ir/");
        bankLinks.add("https://www.bank-day.ir/");
        bankLinks.add("https://qmb.ir/index.aspx?tempname=Average&lang=1&sub=0&epageId=1310&isPopUp=false");



        Intent i = new Intent(BankActivity.this,MainActivity.class);
        icons.add(new Icon("بانک ملی",R.drawable.meli,i));
        icons.add(new Icon("بانک سپه",R.drawable.sepah,i));
        icons.add(new Icon("پست بانک ایران",R.drawable.post,new Intent(BankActivity.this,ConverterActivity.class)));
        icons.add(new Icon("بانک تجارت",R.drawable.tejarat,new Intent(BankActivity.this,ConverterActivity.class)));
        icons.add(new Icon("بانک ملت",R.drawable.melat,new Intent(BankActivity.this,ConverterActivity.class)));
        icons.add(new Icon("بانک صادرات ایران",R.drawable.saderat,new Intent(BankActivity.this,ConverterActivity.class)));
        icons.add(new Icon("بانک توسعه تعاون",R.drawable.tosetavon,new Intent(BankActivity.this,ConverterActivity.class)));
        icons.add(new Icon("بانک صنعت و معدن",R.drawable.sanatomadan,new Intent(BankActivity.this,ConverterActivity.class)));
        icons.add(new Icon("بانک کشاورزی",R.drawable.keshavarzi,new Intent(BankActivity.this,ConverterActivity.class)));
        icons.add(new Icon("بانک مسکن",R.drawable.maskan,new Intent(BankActivity.this,ConverterActivity.class)));
        icons.add(new Icon("بانک رفاه کارگران",R.drawable.refah,new Intent(BankActivity.this,ConverterActivity.class)));
        icons.add(new Icon("بانک اقتصاد نوین",R.drawable.eqtesad,new Intent(BankActivity.this,ConverterActivity.class)));
        icons.add(new Icon("بانک پارسیان",R.drawable.parsian,new Intent(BankActivity.this,ConverterActivity.class)));
        icons.add(new Icon("بانک کارآفرین",R.drawable.karafarin,new Intent(BankActivity.this,ConverterActivity.class)));
        icons.add(new Icon("بانک سامان",R.drawable.saman,new Intent(BankActivity.this,ConverterActivity.class)));
        icons.add(new Icon("بانک پاسارگاد",R.drawable.pasargad,new Intent(BankActivity.this,ConverterActivity.class)));
        icons.add(new Icon("بانک سرمایه",R.drawable.sarmaye,new Intent(BankActivity.this,ConverterActivity.class)));
        icons.add(new Icon("بانک سینا",R.drawable.sina,new Intent(BankActivity.this,ConverterActivity.class)));
        icons.add(new Icon("بانک شهر",R.drawable.shahr,new Intent(BankActivity.this,ConverterActivity.class)));
        icons.add(new Icon("بانک گردشگری",R.drawable.ardeshgari,new Intent(BankActivity.this,ConverterActivity.class)));
        icons.add(new Icon("بانک ایران زمین",R.drawable.iranzamin,new Intent(BankActivity.this,ConverterActivity.class)));
        icons.add(new Icon("بانک خاورمیانه",R.drawable.khavarmianeh,new Intent(BankActivity.this,ConverterActivity.class)));
        icons.add(new Icon("بانک آینده",R.drawable.ayande,new Intent(BankActivity.this,ConverterActivity.class)));
        icons.add(new Icon("بانک دی",R.drawable.dey,new Intent(BankActivity.this,ConverterActivity.class)));
        icons.add(new Icon("بانک قرض الحسنه مهر ایران",R.drawable.mehr,new Intent(BankActivity.this,ConverterActivity.class)));

        Banks_grid_adapter banks_grid_adapter = new Banks_grid_adapter(icons);
        banks_grid.setAdapter(banks_grid_adapter);
        banks_grid.setNumColumns(1);

        banks_grid.setOnItemClickListener((adapterView, view, i1, l) -> {
            String url = bankLinks.get(i1);
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(url));
            startActivity(intent);
        });

    }
    class Banks_grid_adapter extends BaseAdapter {

        ArrayList<Icon> icon;
        public  Banks_grid_adapter(ArrayList<Icon> icons)
        {
            this.icon = icons;
        }
        @Override
        public int getCount() {
            return icon.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null){
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.banks_grid,viewGroup,false);
            }
            TextView text;
            ImageView image;
            text = view.findViewById(R.id.bank_name);
            image = view.findViewById(R.id.bank_icon);
            text.setText(icon.get(i).getName());
            image.setImageResource(icon.get(i).getId());
            return view;
        }
    }
}