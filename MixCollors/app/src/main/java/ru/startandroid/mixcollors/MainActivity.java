package ru.startandroid.mixcollors;

import android.graphics.Color;
import android.graphics.ColorSpace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    private int mixColors(final int red, final int green, final int blue){
         int mix = Color.rgb(red, green, blue);
         return mix;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final LinearLayout layout = findViewById(R.id.layout);
        SeekBar red = findViewById(R.id.red);
        final SeekBar green = findViewById(R.id.green);
        SeekBar blue = findViewById(R.id.blue);
        red.setMax(255);
        green.setMax(255);
        blue.setMax(255);
        final int[] array = {0,0,0};
        final TextView redText = findViewById(R.id.redNumber);
        final TextView greenText = findViewById(R.id.greenNumber);
        final TextView blueText = findViewById(R.id.blueNumber);
        red.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                array[0] = progress;
                layout.setBackgroundColor(mixColors(array[0], array[1], array[2]));
                redText.setText(String.valueOf(array[0]));
                //es knayes xi chi ashxatum?

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        green.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                array[1] = progress;
                layout.setBackgroundColor(mixColors(array[0], array[1], array[2]));
                greenText.setText(String.valueOf(array[1]));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        blue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                array[2] = progress;
                layout.setBackgroundColor(mixColors(array[0], array[1], array[2]));
                blueText.setText(String.valueOf(array[2]));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
