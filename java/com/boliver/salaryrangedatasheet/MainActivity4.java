package com.boliver.salaryrangedatasheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    TextView tvBody;
    int ds_from, ds_upto;
    String str1, str2, str3, str_line, str_rem_i1, str_t_s, pr_line;
    int num1, num2, num3, diff, left2, left3, cn1, cn2, cn3;
    int count_newline;
    int rem_X;
    int body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        tvBody=findViewById(R.id.tvBody4);


        count_newline=1;
        ds_from=10000;
        ds_upto=99999;
        str_line=" ";
        cn2=cn3=1;
        str_t_s=" ";
        while(ds_from<=ds_upto){
            num1=ds_from;
            num2=num1*31;
            num3=num2*12;

/*
            while(num2!=0)
            {
                num2=num2/10;
                cn2+=1;
            }

            while(num3!=0)
            {
                num3=num3/10;
                cn3+=1;
            }
*/

            /*
            cn2= (int) (Math. log10(num2) + 1);
            cn3= (int) (Math. log10(num3) + 1);

            left2=7-cn2;
            left3=8-cn3;

            //adding commas on the num1
            {
                //1
                body = num1;
                rem_X = body % 1000;
                body = body / 1000;
                if (body != 0)
                    str_rem_i1 = "," + rem_X;
                else
                    str_rem_i1 = String.valueOf(rem_X);
                str_t_s = str_t_s + str_rem_i1;
                //2
                rem_X = body % 100;
                body = body / 100;
                if (body != 0)
                    str_rem_i1 = "," + rem_X;
                else
                    str_rem_i1 = String.valueOf(rem_X);
                str_t_s = new StringBuilder().append(str_rem_i1).append(str_t_s).toString();
                //3
                rem_X = body % 100;
                body = body / 100;
                if (body != 0)
                    str_rem_i1 = "," + rem_X;
                else
                    str_rem_i1 = String.valueOf(rem_X);
                str_t_s = new StringBuilder().append(str_rem_i1).append(str_t_s).toString();
                //4
                rem_X = body % 100;
                body = body / 100;
                if (body != 0)
                    str_rem_i1 = "," + rem_X;
                else
                    str_rem_i1 = String.valueOf(rem_X);
                str_t_s = new StringBuilder().append(str_rem_i1).append(str_t_s).toString();

                str1 = str_t_s;
            }

            //adding commas on the num2
            {
                //1
                body = num2;
                rem_X = body % 1000;
                body = body / 1000;
                if (body != 0)
                    str_rem_i1 = "," + rem_X;
                else
                    str_rem_i1 = String.valueOf(rem_X);
                str_t_s += str_rem_i1;
                //2
                rem_X = body % 100;
                body = body / 100;
                if (body != 0)
                    str_rem_i1 = "," + rem_X;
                else
                    str_rem_i1 = String.valueOf(rem_X);
                str_t_s = new StringBuilder().append(str_rem_i1).append(str_t_s).toString();
                //3
                rem_X = body % 100;
                body = body / 100;
                if (body != 0)
                    str_rem_i1 = "," + rem_X;
                else
                    str_rem_i1 = String.valueOf(rem_X);
                str_t_s = new StringBuilder().append(str_rem_i1).append(str_t_s).toString();
                //4
                rem_X = body % 100;
                body = body / 100;
                if (body != 0)
                    str_rem_i1 = "," + rem_X;
                else
                    str_rem_i1 = String.valueOf(rem_X);
                str_t_s = new StringBuilder().append(str_rem_i1).append(str_t_s).toString();

                str2 = str_t_s;
            }

            //adding commas on the num3
            {
                //1
                body = num3;
                rem_X = body % 1000;
                body = body / 1000;
                if (body != 0)
                    str_rem_i1 = "," + rem_X;
                else
                    str_rem_i1 = String.valueOf(rem_X);
                str_t_s += str_rem_i1;
                //2
                rem_X = body % 100;
                body = body / 100;
                if (body != 0)
                    str_rem_i1 = "," + rem_X;
                else
                    str_rem_i1 = String.valueOf(rem_X);
                str_t_s = new StringBuilder().append(str_rem_i1).append(str_t_s).toString();
                //3
                rem_X = body % 100;
                body = body / 100;
                if (body != 0)
                    str_rem_i1 = "," + rem_X;
                else
                    str_rem_i1 = String.valueOf(rem_X);
                str_t_s = new StringBuilder().append(str_rem_i1).append(str_t_s).toString();
                //4
                rem_X = body % 100;
                body = body / 100;
                if (body != 0)
                    str_rem_i1 = "," + rem_X;
                else
                    str_rem_i1 = String.valueOf(rem_X);
                str_t_s = new StringBuilder().append(str_rem_i1).append(str_t_s).toString();

                str3 = str_t_s;
            }

            //Start Adding spaces  ....
            //str1

            //str2

             if(left2==1)
                 str2 += " ";
             if(left2==2) {
                 str2 += "  ";
                 if(left3==1)
                     str3 += " ";
             } else {
                 if(left3==1)
                     str3 += " ";
             }
            //str3

            //Developing the line ....
            pr_line= new StringBuilder().append("\n").append(count_newline).append(". ").append(str1).append("__________").append(str2).append("__________").append(str3).append("\n").toString();

            ds_from+=5000;
            str_line=str_line+pr_line;
            count_newline+=1;

*/





            pr_line="\n"+count_newline+". "+num1+"___________"+num2+"____________"+num3+"\n" ;
            ds_from+=500;
            str_line=str_line+pr_line;
            count_newline+=1;
        }

        tvBody.setText(str_line);

    }
}