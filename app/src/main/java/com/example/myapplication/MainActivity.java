package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private CheckBox arms;
    private CheckBox ears;
    private CheckBox eyebrows;
    private CheckBox eyes;
    private CheckBox glasses;
    private CheckBox hat;
    private CheckBox mouth;
    private CheckBox mustache;
    private CheckBox nose;
    private CheckBox shoes;
    private ImageView imagearms;
    private ImageView imageears;
    private ImageView imageeyebrows;
    private ImageView imageeyes;
    private ImageView imageglasses;
    private ImageView imagehat;
    private ImageView imagemouth;
    private ImageView imagemustache;
    private ImageView imagenose;
    private ImageView imageshoes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arms=findViewById(R.id.arms);
        ears=findViewById(R.id.ears);
        eyebrows=findViewById(R.id.eyebrows);
        eyes=findViewById(R.id.eyes);
        glasses=findViewById(R.id.glasses);
        hat=findViewById(R.id.hat);
        mouth=findViewById(R.id.mouth);
        mustache=findViewById(R.id.mustache);
        nose=findViewById(R.id.nose);
        shoes=findViewById(R.id.shoes);
        imagearms=findViewById(R.id.imagearms);
        imageears=findViewById(R.id.imageears);
        imageeyebrows=findViewById(R.id.imageeyebrows);
        imageeyes=findViewById(R.id.imageeyes);
        imageglasses=findViewById(R.id.imageglasses);
        imagehat=findViewById(R.id.imagehat);
        imagemouth=findViewById(R.id.imagemouth);
        imagemustache=findViewById(R.id.imagemustache);
        imagenose=findViewById(R.id.imagenose);
        imageshoes=findViewById(R.id.imageshoes);
        imagearms.setVisibility(View.INVISIBLE);
        imageears.setVisibility(View.INVISIBLE);
        imageeyebrows.setVisibility(View.INVISIBLE);
        imageeyes.setVisibility(View.INVISIBLE);
        imageglasses.setVisibility(View.INVISIBLE);
        imagehat.setVisibility(View.INVISIBLE);
        imagemouth.setVisibility(View.INVISIBLE);
        imagemustache.setVisibility(View.INVISIBLE);
        imagenose.setVisibility(View.INVISIBLE);
        imageshoes.setVisibility(View.INVISIBLE);
        arms.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    imagearms.setVisibility(View.VISIBLE);
                }
                else {
                    imagearms.setVisibility(View.INVISIBLE);
                }
            }
        });
        ears.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    imageears.setVisibility(View.VISIBLE);
                }
                else {
                    imageears.setVisibility(View.INVISIBLE);
                }
            }
        });
        eyebrows.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    imageeyebrows.setVisibility(View.VISIBLE);
                }
                else {
                    imageeyebrows.setVisibility(View.INVISIBLE);
                }
            }
        });
        eyes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    imageeyes.setVisibility(View.VISIBLE);
                }
                else {
                    imageeyes.setVisibility(View.INVISIBLE);
                }
            }
        });
        glasses.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    imageglasses.setVisibility(View.VISIBLE);
                }
                else {
                    imageglasses.setVisibility(View.INVISIBLE);
                }
            }
        });
        hat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    imagehat.setVisibility(View.VISIBLE);
                }
                else {
                    imagehat.setVisibility(View.INVISIBLE);
                }
            }
        });
        mouth.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    imagemouth.setVisibility(View.VISIBLE);
                }
                else {
                    imagemouth.setVisibility(View.INVISIBLE);
                }
            }
        });
        mustache.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    imagemustache.setVisibility(View.VISIBLE);
                }
                else {
                    imagemustache.setVisibility(View.INVISIBLE);
                }
            }
        });
        nose.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    imagenose.setVisibility(View.VISIBLE);
                }
                else {
                    imagenose.setVisibility(View.INVISIBLE);
                }
            }
        });
        shoes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    imageshoes.setVisibility(View.VISIBLE);
                }
                else {
                    imageshoes.setVisibility(View.INVISIBLE);
                }
            }
        });


        /*arms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               imagearms.setVisibility(View.VISIBLE);
            }
        });
        ears.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageears.setVisibility(View.VISIBLE);
            }
        });
        eyebrows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageeyebrows.setVisibility(View.VISIBLE);
            }
        });
        eyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageeyes.setVisibility(View.VISIBLE);
            }
        });
        glasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageglasses.setVisibility(View.VISIBLE);
            }
        });
        hat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagehat.setVisibility(View.VISIBLE);
            }
        });
        mouth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagemouth.setVisibility(View.VISIBLE);
            }
        });
        mustache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagemustache.setVisibility(View.VISIBLE);
            }
        });
        nose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imagenose.setVisibility(View.VISIBLE);
            }
        });
        shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageshoes.setVisibility(View.VISIBLE);
            }
        });*/
    }
}
