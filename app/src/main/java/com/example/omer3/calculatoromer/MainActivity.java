package com.example.omer3.calculatoromer;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    double scom1 = 0;
    double var1;
    EditText om1;
    boolean bo1;
    boolean bo2;
    boolean bo3;
    boolean bo4;
    int counter1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById|(R.id.btn1);
        btn2 = (Button) findViewById|(R.id.btn2);
        btn3 = (Button) findViewById|(R.id.btn3);
        btn4 = (Button) findViewById|(R.id.btn4);
        btn5 = (Button) findViewById|(R.id.btn5);
        btn6 = (Button) findViewById|(R.id.btn6);
        btn7 = (Button) findViewById|(R.id.btn7);
        om1 = (Button) findViewById|(R.id.om1);
    }

    public void omer1(View view) {//add

        counter1++;


        String st = om1.getText().toString();
        var1 = Double.parseDouble(st);


        bo1 = true;
        bo2 = false;
        bo3 = false;
        bo4 = false;


        scom1 = scom1 + var1;

        om1.setText("  ");
    }


    public void omer2(View view){//sub

        counter1++;

        String st = om1.getText().toString();
        var1 = Double.parseDouble(st);


        if (counter1 == 1) {
            scom1 = var1*2;
        }

        bo1 = false;
        bo2 = true;
        bo3 = false;
        bo4 = false;


        scom1 = scom1 - var1;
        om1.setText("  ");
    }

    public void omer3(View view) {//multi

        counter1++;

        String st = om1.getText().toString();
        var1 = Double.parseDouble(st);


        if (counter1 == 1) {
            scom1 = 1;
        }

        bo1 = false;
        bo2 = false;
        bo3 = true;
        bo4 = false;

        scom1 = scom1 * var1;
        om1.setText("  ");
    }



    public void omer4(View view) {//div

        counter1++;

        String st = om1.getText().toString();
        var1 = Double.parseDouble(st);

        if (counter1 == 1) {
            scom1 = var1 * var1;
        }

        bo1 = false;
        bo2 = false;
        bo3 = false;
        bo4 = true;

        if (var1 == 0){
            Toast.makeText(this, "math ERROR",Toast.LENGTH_LONG)
        }



    }
