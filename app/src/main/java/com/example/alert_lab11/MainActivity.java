package com.example.alert_lab11;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3;
    Switch S1,s2;
String apps[]={"linkedin","bluetooth","fb","gmail","twitter"};
//int images[]={R.drawable.in,R.drawable.blue, R.drawable.fb,R.drawable.gmail,R.drawable.tw};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        S1= findViewById(R.id.switch1);
        if(S1.isChecked())
        {
            Toast.makeText(MainActivity.this, "This is a Prime Account.", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(MainActivity.this, "Not a Prime Account.", Toast.LENGTH_LONG).show();
        }
        b2=findViewById(R.id.button3);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder1 =new AlertDialog.Builder(MainActivity.this);
                builder1.setTitle("Your Account");
                builder1.setMessage("choose your Brand");
                // Adding the alert box to the main activity.
                View view= LayoutInflater.from(MainActivity.this).inflate(R.layout.brand,null);

                builder1.setView(view);
                builder1.setNegativeButton("Clear Filters", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                builder1.setPositiveButton("Show 4,024 results", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                    }
                });
                builder1.create().show();
            }
        });
        b3=findViewById(R.id.button4);
        s2=findViewById(R.id.switch2);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder2 =new AlertDialog.Builder(MainActivity.this);
                builder2.setTitle("Your Account");
                builder2.setMessage("Select your Prize range:");
                // Adding the alert box to the main activity.
                View view= LayoutInflater.from(MainActivity.this).inflate(R.layout.prize,null);

                builder2.setView(view);
                builder2.setNegativeButton("Clear", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                builder2.setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (s2.isChecked())
                        Toast.makeText(MainActivity.this, "Below 2000", Toast.LENGTH_SHORT).show();


                    }
                });
                builder2.create().show();
            }
        });

        b1=findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Your Account");

                builder.setMessage("choose your option");
                // Adding the alert box to the main activity.
                View view= LayoutInflater.from(MainActivity.this).inflate(R.layout.mydesign,null);

                builder.setView(view);
                builder.setNegativeButton("Clear Filters", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                builder.setPositiveButton("Show 4,024 results", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                    }
                });
                builder.create().show();
            }
        });


    }

}