package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView greetingText;
    int clickcount=0;
    List ageMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greetingText = findViewById(R.id.greeting_hello_world);
        ageMessage = new ArrayList<String>();

        ageMessage.add("NewBorn");
        ageMessage.add("Toddler");
        ageMessage.add("Walking");
        ageMessage.add("Talking");
        ageMessage.add("Starting School");
        ageMessage.add("Teenage Years");
        ageMessage.add("Driving Age");
        ageMessage.add("Young Adult");
        ageMessage.add("Fully Grown Adult");
        ageMessage.add("Elder Adult");
        ageMessage.add("Deceased");

        greetingText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickcount <= ageMessage.size()){
                    greetingText.setText(ageMessage.get(clickcount).toString());
                    clickcount++;

                    if(clickcount == 5){
                        Toast.makeText(MainActivity.this,"Welcome to School!", Toast.LENGTH_LONG).show();
                    }
                    else if(clickcount == 9){
                        Toast.makeText(MainActivity.this,"Enjoying Adulthood Yet!", Toast.LENGTH_LONG).show();
                    }
                    else if(clickcount == 11){
                        Toast.makeText(MainActivity.this,"Thats all folks!", Toast.LENGTH_LONG).show();
                    }
                    if(clickcount == ageMessage.size()){
                        clickcount = 0;
                    }
                }


            }
        });
    }
}
