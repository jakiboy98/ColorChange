package com.example.jwil9706.colorchange;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.view.View;
import android.graphics.Color;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;

public class StupidActivity extends Activity
{

    private Button colorChangeButton;
    private Button SwapScreenButton;
    private RelativeLayout background;
    private TextView basicText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_change);

        basicText = (TextView) findViewById(R.id.sillyText);
        background = (RelativeLayout) findViewById(R.id.backgroundLayout);
        colorChangeButton = (Button) findViewById(R.id.colorChangeButton);
        SwapScreenButton = (Button) findViewById (R.id.swapScreenButton);

        setupListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_color_change, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void changeBackgroundColor()
    {
        int redColor;
        int greenColor;
        int blueColor;

        redColor = (int) Math.random() * 256);
        greenColor = (int) Math.random() * 256);
        blueColor = (int) Math.random() * 256);

        background.setBackgroundColor(Color.rgb(redColor, greenColor, blueColor));

        redColor = (int) Math.random() * 256);
        greenColor = (int) Math.random() * 256);
        blueColor = (int) Math.random() * 256);

        colorChangeButton.setBackgroundColor (int color)

    }
    private void changeVisibility()
    {
        if(basicText.getVisibility() = View.VISIBLE)
        {
            basicText.setVisibility(View.VISIBLE);
        }
        else
        {
            basicText.setVisibility(View.VISIBLE);
        }

        basicText.setVisibility(View.GONE);
    }
    private void setupListeners()
    {
        colorChangeButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                //this is where the action happens
                changeBackgroundColor();
            }
        });
        SwapScreenButton.setOnClickListener(new View.OnClickListener());
        {
            public void onClick(View buttonView)
            {
                Intent myIntent = new Intent(buttonView.getContext(), RunningActivity.class);
                startActivityForResult(myIntent, 0);
            }
        }
    }


}

