package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.UFormat;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    class Number{
        int numb ;
        int triangular =1;


        public boolean Trinum(){
            int x = 1;

         while (triangular<numb) {
            x++;
            triangular=triangular+x;
         }
         if (triangular==numb){
             return  true;
         }
         else {
             return  false;
         }

        }

        public boolean sqrtnum(){
            double sqrtnumber= Math.sqrt(numb);

            if (sqrtnumber==Math.floor(sqrtnumber)){
                return  true;
            }
            else {
                return  false;
            }
        }
    }

    public void shapenumb(View view){

        EditText input = findViewById(R.id.input);
        TextView output = findViewById(R.id.output);
        Button continueb = findViewById(R.id.continueb);
        Number number = new Number();
        String messege=input.getText().toString();

        if(messege.isEmpty()){
            Toast.makeText(this, "Pleas Enter a number !!", Toast.LENGTH_SHORT).show();
        }
        else
            {
                number.numb=Integer.parseInt(input.getText().toString());
                if (number.Trinum() && number.sqrtnum()){
                    messege += " Is Square and Triangular !!";
                }
                else if (number.Trinum()){
                    messege += " Is a Triangular number !!";
                }
                else if (number.sqrtnum()){
                    messege += " Is a Square number !!";
                }
                else {
                    messege +=" is not square or Triangular !!";
                }

                output.setText(messege);
            }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}