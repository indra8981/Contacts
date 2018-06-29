package com.example.android.lv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ArrayList<Andy> an;
    EditText ed1;
    EditText ed2;
    Button bn;
    Androids and;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.ed1);
        ed2=(EditText)findViewById(R.id.ed2);
        bn=(Button)findViewById(R.id.bn) ;
        an=new ArrayList<Andy>();
        and=new Androids(this,an);
        ListView listView=(ListView)findViewById(R.id.listy);
        listView.setAdapter(and);
        bn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=ed1.getText().toString();
                String s2=ed2.getText().toString();
                if(s1.length()==0 || s2.length()==0 || s2.length()<10){
                    Toast.makeText(getApplicationContext(),"Both Fields are required with specified format",Toast.LENGTH_SHORT).show();
                }else{
                    and.add(new Andy(s1,s2));
                }

                //and.remove();
            }
        });


    }
}
