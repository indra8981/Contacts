package com.example.android.lv;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Androids extends ArrayAdapter<Andy> {
    private Context co;
    private ArrayList<Andy> ar;
    Andy item;
    public Androids(Context c, ArrayList<Andy> an){
        super(c,0,an);
        this.co=c;
        this.ar=an;
    }
    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        View gg=convertView;

        if(gg==null){
            gg=LayoutInflater.from(getContext()).inflate(R.layout.and_list,parent,false);
        }
        item=ar.get(position);
        TextView t1=(TextView)gg.findViewById(R.id.name);
        TextView t2=(TextView)gg.findViewById(R.id.ver);
        t1.setText(item.getName());
        t2.setText(item.getVersion());
        gg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View gg) {
                Toast.makeText(getContext(),item.getName()+"\n"+item.getVersion(),Toast.LENGTH_LONG).show();
            }
        });
        return gg;
    }
}
