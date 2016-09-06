package com.example.sjors.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private CheckBox arms_checkbox, ears_checkbox, eyebrows_checkbox,
            eyes_checkbox, glasses_checkbox, hat_checkbox, mouth_checkbox,
            mustache_checkbox, nose_checkbox, shoes_checkbox;

    private ImageView arms_image, ears_image, eyebrows_image,
            eyes_image, glasses_image, hat_image, mouth_image,
            mustache_image, nose_image, shoes_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        glasses_checkbox = (CheckBox) findViewById(R.id.glasses_checkbox);


        glasses_image = (ImageView) findViewById(R.id.glasses_image);
    }

    public void glassesCheckBoxIsClicked(View view) {
        changeVisibility(view, glasses_checkbox, glasses_image);
    }

    public void shoesCheckBoxIsClicked(View view) {
    }

    public void noseCheckBoxIsClicked(View view) {
    }

    public void eyesCheckBoxIsClicked(View view) {
    }

    public void mustacheCheckBoxIsClicked(View view) {
    }

    public void eyebrowsCheckBoxIsClicked(View view) {
    }

    public void mouthCheckBoxIsClicked(View view) {
    }

    public void earsCheckBoxIsClicked(View view) {
    }

    public void hatCheckBoxIsClicked(View view) {
    }

    public void armsCheckBoxIsClicked(View view) {
    }

    private void changeVisibility(View view, CheckBox checkbox, ImageView image) {
        if (checkbox.isChecked()) {
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.INVISIBLE);
        }
    }
}
