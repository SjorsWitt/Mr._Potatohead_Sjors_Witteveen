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

        arms_checkbox = (CheckBox) findViewById(R.id.arms_checkbox);
        ears_checkbox = (CheckBox) findViewById(R.id.ears_checkbox);
        eyebrows_checkbox = (CheckBox) findViewById(R.id.eyebrows_checkbox);
        eyes_checkbox = (CheckBox) findViewById(R.id.eyes_checkbox);
        glasses_checkbox = (CheckBox) findViewById(R.id.glasses_checkbox);
        hat_checkbox = (CheckBox) findViewById(R.id.hat_checkbox);
        mouth_checkbox = (CheckBox) findViewById(R.id.mouth_checkbox);
        mustache_checkbox = (CheckBox) findViewById(R.id.mustache_checkbox);
        nose_checkbox = (CheckBox) findViewById(R.id.nose_checkbox);
        shoes_checkbox = (CheckBox) findViewById(R.id.shoes_checkbox);

        arms_image = (ImageView) findViewById(R.id.arms_image);
        ears_image = (ImageView) findViewById(R.id.ears_image);
        eyebrows_image = (ImageView) findViewById(R.id.eyebrows_image);
        eyes_image = (ImageView) findViewById(R.id.eyes_image);
        glasses_image = (ImageView) findViewById(R.id.glasses_image);
        hat_image = (ImageView) findViewById(R.id.hat_image);
        mouth_image = (ImageView) findViewById(R.id.mouth_image);
        mustache_image = (ImageView) findViewById(R.id.mustache_image);
        nose_image = (ImageView) findViewById(R.id.nose_image);
        shoes_image = (ImageView) findViewById(R.id.shoes_image);
    }

    public void armsCheckBoxIsClicked(View view) {
        changeVisibility(view, arms_checkbox, arms_image);
    }

    public void earsCheckBoxIsClicked(View view) {
        changeVisibility(view, ears_checkbox, ears_image);
    }

    public void eyebrowsCheckBoxIsClicked(View view) {
        changeVisibility(view, eyebrows_checkbox, eyebrows_image);
    }

    public void eyesCheckBoxIsClicked(View view) {
        changeVisibility(view, eyes_checkbox, eyes_image);
    }

    public void glassesCheckBoxIsClicked(View view) {
        changeVisibility(view, glasses_checkbox, glasses_image);
    }

    public void hatCheckBoxIsClicked(View view) {
        changeVisibility(view, hat_checkbox, hat_image);
    }

    public void mouthCheckBoxIsClicked(View view) {
        changeVisibility(view, mouth_checkbox, mouth_image);
    }

    public void mustacheCheckBoxIsClicked(View view) {
        changeVisibility(view, mustache_checkbox, mustache_image);
    }

    public void noseCheckBoxIsClicked(View view) {
        changeVisibility(view, nose_checkbox, nose_image);
    }

    public void shoesCheckBoxIsClicked(View view) {
        changeVisibility(view, shoes_checkbox, shoes_image);
    }

    private void changeVisibility(View view, CheckBox checkbox, ImageView image) {
        if (checkbox.isChecked()) {
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.INVISIBLE);
        }
    }
}
