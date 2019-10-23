package com.example.colors;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    //1. Initialize components -> Null
    private SeekBar sbrRed = null;
    private SeekBar sbrGreen = null;
    private SeekBar sbrBlue = null;
    private SeekBar sbrAlpha = null;
    private View vieColors = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2. Get components ids
        sbrRed = findViewById(R.id.sbrRed);
        sbrGreen = findViewById(R.id.sbrGreen);
        sbrBlue = findViewById(R.id.sbrBlue);
        sbrAlpha = findViewById(R.id.sbrAlpha);
        vieColors = findViewById(R.id.vieColors);

        //3. Enable View component as ContextMenu.
        registerForContextMenu(vieColors);

        //4. Get SeekBar progress => value
        sbrRed.setOnSeekBarChangeListener(this);
        sbrGreen.setOnSeekBarChangeListener(this);
        sbrBlue.setOnSeekBarChangeListener(this);
        sbrAlpha.setOnSeekBarChangeListener(this);


    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.colors_menu2, menu);

    }

    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (item.getItemId()) {
            case R.id.iteRed:
                sbrRed.setProgress(255);
                sbrGreen.setProgress(0);
                sbrBlue.setProgress(0);
                sbrAlpha.setProgress(100);
                return true;
            case R.id.iteGreen:
                sbrRed.setProgress(0);
                sbrGreen.setProgress(255);
                sbrBlue.setProgress(0);
                sbrAlpha.setProgress(100);
                return true;
            case R.id.iteBlue:
                sbrRed.setProgress(0);
                sbrGreen.setProgress(0);
                sbrBlue.setProgress(255);
                sbrAlpha.setProgress(100);
                return true;
            case R.id.iteYellow:

                sbrRed.setProgress(255);
                sbrGreen.setProgress(255);
                sbrBlue.setProgress(0);
                sbrAlpha.setProgress(100);
                return true;
            case R.id.iteTransparent:
                sbrRed.setProgress(0);
                sbrGreen.setProgress(0);
                sbrBlue.setProgress(0);
                sbrAlpha.setProgress(100);
                return true;
            case R.id.iteMagenta:
                sbrRed.setProgress(0);
                sbrGreen.setProgress(255);
                sbrBlue.setProgress(255);
                sbrAlpha.setProgress(100);
                return true;
            case R.id.iteSemiTransparent:
                sbrRed.setProgress(128);
                sbrGreen.setProgress(0);
                sbrBlue.setProgress(0);
                sbrAlpha.setProgress(100);
                return true;
            case R.id.iteCyan:
                sbrRed.setProgress(0);
                sbrGreen.setProgress(160);
                sbrBlue.setProgress(227);
                sbrAlpha.setProgress(100);
                return true;
            case R.id.iteBrown:
                sbrRed.setProgress(165);
                sbrGreen.setProgress(42);
                sbrBlue.setProgress(42);
                sbrAlpha.setProgress(100);
                return true;
        }
        return super.onContextItemSelected(item);
    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean bo) {
        //5. Change colors
        int r = sbrRed.getProgress();
        int g = sbrGreen.getProgress();
        int b = sbrBlue.getProgress();
        int a = sbrAlpha.getProgress();

        int colorHex = Color.argb(a, r, g, b);
        vieColors.setBackgroundColor(colorHex);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.colors_menu1, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (item.getItemId()) {
            case R.id.iteRed:
                sbrRed.setProgress(255);
                sbrGreen.setProgress(0);
                sbrBlue.setProgress(0);
                sbrAlpha.setProgress(100);
                return true;
            case R.id.iteGreen:
                sbrRed.setProgress(0);
                sbrGreen.setProgress(255);
                sbrBlue.setProgress(0);
                sbrAlpha.setProgress(100);
                return true;
            case R.id.iteBlue:
                sbrRed.setProgress(0);
                sbrGreen.setProgress(0);
                sbrBlue.setProgress(255);
                sbrAlpha.setProgress(100);
                return true;
            case R.id.iteYellow:

                sbrRed.setProgress(255);
                sbrGreen.setProgress(255);
                sbrBlue.setProgress(0);
                sbrAlpha.setProgress(100);
                return true;
            case R.id.iteTransparent:
                sbrRed.setProgress(0);
                sbrGreen.setProgress(0);
                sbrBlue.setProgress(0);
                sbrAlpha.setProgress(100);
                return true;
            case R.id.iteMagenta:
                sbrRed.setProgress(0);
                sbrGreen.setProgress(255);
                sbrBlue.setProgress(255);
                sbrAlpha.setProgress(100);
                return true;
            case R.id.iteSemiTransparent:
                sbrRed.setProgress(128);
                sbrGreen.setProgress(0);
                sbrBlue.setProgress(0);
                sbrAlpha.setProgress(100);
                return true;
            case R.id.iteCyan:
                sbrRed.setProgress(0);
                sbrGreen.setProgress(160);
                sbrBlue.setProgress(227);
                sbrAlpha.setProgress(100);
                return true;
            case R.id.iteBrown:
                sbrRed.setProgress(165);
                sbrGreen.setProgress(42);
                sbrBlue.setProgress(42);
                sbrAlpha.setProgress(100);
                return true;
            case R.id.About:
                Intent myIntent = new Intent(MainActivity.this, About.class);
                startActivity(myIntent);

                return true;


        }
        return super.onOptionsItemSelected(item);
    }
}
