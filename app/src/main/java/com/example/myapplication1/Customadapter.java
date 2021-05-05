package com.example.myapplication1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Customadapter extends BaseAdapter {
    Context c;
    String [] title={"fb","insta","wa","yt"};
    String [] d={"fb d","insta d","wa d","yt d"};
    Customadapter(Context c){

       this.c=c;


    }
    @Override
    public int getCount() {

        return title.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater li = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=li.inflate(R.layout.items,null);
        TextView t;
        TextView t1;
        t =convertView.findViewById(R.id.textView);
        t1 =convertView.findViewById(R.id.textView2);
        t.setText(title[position]);
        t1.setText(d[position]);
        return convertView;

    }
}
