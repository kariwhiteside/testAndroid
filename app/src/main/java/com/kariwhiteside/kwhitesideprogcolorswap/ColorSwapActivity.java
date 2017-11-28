// Kari Whiteside, CS 184, HW #1

package com.kariwhiteside.kwhitesideprogcolorswap;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class ColorSwapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // create the linear layout
        LinearLayout myLayout = new LinearLayout(this);

        // create the text view
        final TextView myTextView = new TextView(this);
        myTextView.setText("Tap to Change Color");

        // create the button
        Button myButton = new Button(this);
        myButton.setText("Tap me!");

        // add text view and button to layout, add layout to screen
        myLayout.addView(myTextView);
        myLayout.addView(myButton);
        setContentView(myLayout);

        // set layout attributes
        myLayout.setHorizontalGravity(Gravity.CENTER_HORIZONTAL);
        myLayout.setOrientation(LinearLayout.VERTICAL);

        // set text view attributes
        myTextView.setPadding(0, 20, 0, 20);
        myTextView.setTextSize(30);

        myButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // generate random rgb values
                Random rand = new Random();
                int red, green, blue;
                red = rand.nextInt(256);
                green = rand.nextInt(256);
                blue = rand.nextInt(256);

                myTextView.setTextColor(Color.rgb(red, green, blue));
                myTextView.setText("COLOR: " + red + "r " + green + "g " + blue + "b");
            }
        });


    }

}
