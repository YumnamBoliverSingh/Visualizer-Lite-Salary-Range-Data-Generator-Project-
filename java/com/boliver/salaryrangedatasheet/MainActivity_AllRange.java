package com.boliver.salaryrangedatasheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity_AllRange extends AppCompatActivity {
    TextView tvBody;
    int ds_from, ds_upto;
    String str1, str2, str3, str_line, str_rem_i1, str_t_s, pr_line;
    int num1, num2, num3, diff, left2, left3, cn1, cn2, cn3;
    int count_newline;
    int rem_X;
    int body;
    String str_whole;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_all_range);
        tvBody = findViewById(R.id.tvBody5);
        str_whole=" ";



        //1
        count_newline = 1;
        ds_from = 100;
        ds_upto = 999;

        cn2 = cn3 = 1;
        str_t_s = " ";
        while (ds_from <= ds_upto) {
            num1 = ds_from;
            num2 = num1 * 31;
            num3 = num2 * 12;

            pr_line="\n"+count_newline+". Rs "+num1+"___________Rs "+num2+"___________Rs "+num3+"\n" ;
            ds_from += 50;
            str_line = str_line + pr_line;
            count_newline += 1;
        }
        str_whole+=str_line;

        //2

        ds_from=1000;
        ds_upto=9999;

        cn2=cn3=1;
        str_t_s=" ";
        while(ds_from<=ds_upto){
            num1=ds_from;
            num2=num1*31;
            num3=num2*12;

            pr_line="\n"+count_newline+". Rs "+num1+"________Rs "+num2+"_________Rs "+num3+"\n" ;
            ds_from+=250;
            str_line=str_line+pr_line;
            count_newline+=1;
        }
        str_whole+=str_line;

        //3

        ds_from=10000;
        ds_upto=99999;

        cn2=cn3=1;
        str_t_s=" ";
        while(ds_from<=ds_upto){
            num1=ds_from;
            num2=num1*31;
            num3=num2*12;

            pr_line="\n"+count_newline+". Rs "+num1+"_____Rs "+num2+"________Rs "+num3+"\n" ;
            ds_from+=500;
            str_line=str_line+pr_line;
            count_newline+=1;
        }
        str_whole+=str_line;


        tvBody.setText(str_line);
    }
}