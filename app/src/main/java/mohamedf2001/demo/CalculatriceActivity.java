package mohamedf2001.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatriceActivity extends AppCompatActivity {
    private String calcul = "", calcul2 = "";
    String value1;
    private String operation ="";
    boolean click = false;
    private TextView textEcran;
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    private Button btnPlus,btnMoins,btnFois,btnDiv,btnEquals,btnMP,btnPourcent;
    private Button btnVir,btnAC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatrice);

        textEcran = findViewById(R.id.textView);
        btn0 = findViewById(R.id.buttonZERO);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btnPlus = findViewById(R.id.buttonPlus);
        btnMoins = findViewById(R.id.buttonMoins);
        btnFois = findViewById(R.id.buttonFois);
        btnDiv = findViewById(R.id.buttonDiv);
        btnEquals = findViewById(R.id.button_equal);
        btnPourcent = findViewById(R.id.buttonPour);
        btnMP = findViewById(R.id.buttonMP);
        btnVir = findViewById(R.id.buttonVir);
        btnAC = findViewById(R.id.buttonAC);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click){
                    calcul2 = calcul2 + "0";
                }
                calcul = calcul + "0";
                textEcran.setText(calcul);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click == true){
                    calcul2 = calcul2 + "1";
                }
                calcul = calcul + "1";
                textEcran.setText(calcul);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click){
                    calcul2 = calcul2 + "2";
                }
                calcul = calcul + "2";
                textEcran.setText(calcul);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click){
                    calcul2 = calcul2 + "3";
                }
                calcul = calcul + "3";
                textEcran.setText(calcul);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click){
                    calcul2 = calcul2 + "4";
                }
                calcul = calcul + "4";
                textEcran.setText(calcul);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click){
                    calcul2 = calcul2 + "5";
                }
                calcul = calcul + "5";
                textEcran.setText(calcul);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click){
                    calcul2 = calcul2 + "6";
                }
                calcul = calcul + "6";
                textEcran.setText(calcul);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click){
                    calcul2 = calcul2 + "7";
                }
                calcul = calcul + "7";
                textEcran.setText(calcul);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click){
                    calcul2 = calcul2 + "8";
                }
                calcul = calcul + "8";
                textEcran.setText(calcul);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click){
                    calcul2 = calcul2 + "9";
                }
                calcul = calcul + "9";
                textEcran.setText(calcul);
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = calcul;
                click = true;
                operation = "+";
                calcul = calcul + "+";
                textEcran.setText(calcul);
            }
        });
        btnMoins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = calcul;
                click = true;
                operation = "-";
                calcul = calcul + "-";
                textEcran.setText(calcul);
            }
        });
        btnFois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = calcul;
                click = true;
                operation = "*";
                calcul = calcul + "*";
                textEcran.setText(calcul);
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = calcul;
                click = true;
                operation = "/";
                calcul = calcul + "/";
                textEcran.setText(calcul);
            }
        });
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (operation == "+")
                        calcul = (Double.parseDouble(value1) + Double.parseDouble(calcul2)) + "";

                    if (operation == "-")
                        calcul = (Double.parseDouble(value1) - Double.parseDouble(calcul2)) + "";

                    if (operation == "*")
                        calcul = (Double.parseDouble(value1) * Double.parseDouble(calcul2)) + "";

                    if (operation == "/")
                        calcul = (Double.parseDouble(value1) / Double.parseDouble(calcul2)) + "";

                    click = false;
                    value1 = calcul;
                    calcul2 = "";
                    textEcran.setText(calcul);
                    calcul = "";

                }catch (Exception e){
                    Toast.makeText(CalculatriceActivity.this, ""+e, Toast.LENGTH_LONG).show();
                }
            }
        });
        btnPourcent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcul = calcul + "%";
                textEcran.setText(calcul);
            }
        });
        btnMP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcul = calcul + "+/-";
                textEcran.setText(calcul);
            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcul = "";
                click = false;
                value1 = "";
                calcul2 = "";
                textEcran.setText(calcul);
            }
        });
        btnVir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcul = calcul + ".";
                textEcran.setText(calcul);
            }
        });

        textEcran.setText(calcul);
    }
}