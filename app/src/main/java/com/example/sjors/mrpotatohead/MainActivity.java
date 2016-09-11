package com.example.sjors.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    static final int NUMBER_OF_COMPONENTS = 10;

    // component index in arrays
    static final int ARMS = 0;
    static final int EARS = 1;
    static final int EYEBROWS = 2;
    static final int EYES = 3;
    static final int GLASSES = 4;
    static final int HAT = 5;
    static final int MOUTH = 6;
    static final int MUSTACHE = 7;
    static final int NOSE = 8;
    static final int SHOES = 9;

    // used for Bundle saved instance state
    private String[] visibility_array = {"arms_visibility", "ears_visibility",
            "eyebrows_visibility", "eyes_visibility", "glasses_visibility", "hat_visibility",
            "mouth_visibility", "mustache_visibility", "nose_visibility", "shoes_visibility"};
    
    private CheckBox[] checkbox_array = new CheckBox[NUMBER_OF_COMPONENTS];
    private ImageView[] image_array = new ImageView[NUMBER_OF_COMPONENTS];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkbox_array[ARMS] = (CheckBox) findViewById(R.id.arms_checkbox);
        checkbox_array[EARS] = (CheckBox) findViewById(R.id.ears_checkbox);
        checkbox_array[EYEBROWS] = (CheckBox) findViewById(R.id.eyebrows_checkbox);
        checkbox_array[EYES] = (CheckBox) findViewById(R.id.eyes_checkbox);
        checkbox_array[GLASSES] = (CheckBox) findViewById(R.id.glasses_checkbox);
        checkbox_array[HAT] = (CheckBox) findViewById(R.id.hat_checkbox);
        checkbox_array[MOUTH] = (CheckBox) findViewById(R.id.mouth_checkbox);
        checkbox_array[MUSTACHE] = (CheckBox) findViewById(R.id.mustache_checkbox);
        checkbox_array[NOSE] = (CheckBox) findViewById(R.id.nose_checkbox);
        checkbox_array[SHOES] = (CheckBox) findViewById(R.id.shoes_checkbox);

        image_array[ARMS] = (ImageView) findViewById(R.id.arms_image);
        image_array[EARS] = (ImageView) findViewById(R.id.ears_image);
        image_array[EYEBROWS] = (ImageView) findViewById(R.id.eyebrows_image);
        image_array[EYES] = (ImageView) findViewById(R.id.eyes_image);
        image_array[GLASSES] = (ImageView) findViewById(R.id.glasses_image);
        image_array[HAT] = (ImageView) findViewById(R.id.hat_image);
        image_array[MOUTH] = (ImageView) findViewById(R.id.mouth_image);
        image_array[MUSTACHE] = (ImageView) findViewById(R.id.mustache_image);
        image_array[NOSE] = (ImageView) findViewById(R.id.nose_image);
        image_array[SHOES] = (ImageView) findViewById(R.id.shoes_image);

        // resetting image visibility from previous layout
        if (savedInstanceState != null) {
            for (int i = 0; i < NUMBER_OF_COMPONENTS; i++) {
                if (savedInstanceState.getInt(visibility_array[i]) == View.VISIBLE) {
                    image_array[i].setVisibility(View.VISIBLE);
                } else {
                    image_array[i].setVisibility(View.INVISIBLE);
                }
            }
        }
    }

    @Override
    protected void onSaveInstanceState (Bundle outState) {
        super.onSaveInstanceState(outState);

        // remembering image visibility from previous layout
        for (int i = 0; i < NUMBER_OF_COMPONENTS; i ++) {
            outState.putInt(visibility_array[i], image_array[i].getVisibility());
        }
    }

    // change visibility when box is (un)checked
    public void armsCheckBoxIsClicked(View view) {
        changeVisibility(view, checkbox_array[ARMS], image_array[ARMS]);
    }

    public void earsCheckBoxIsClicked(View view) {
        changeVisibility(view, checkbox_array[EARS], image_array[EARS]);
    }

    public void eyebrowsCheckBoxIsClicked(View view) {
        changeVisibility(view, checkbox_array[EYEBROWS], image_array[EYEBROWS]);
    }

    public void eyesCheckBoxIsClicked(View view) {
        changeVisibility(view, checkbox_array[EYES], image_array[EYES]);
    }

    public void glassesCheckBoxIsClicked(View view) {
        changeVisibility(view, checkbox_array[GLASSES], image_array[GLASSES]);
    }

    public void hatCheckBoxIsClicked(View view) {
        changeVisibility(view, checkbox_array[HAT], image_array[HAT]);
    }

    public void mouthCheckBoxIsClicked(View view) {
        changeVisibility(view, checkbox_array[MOUTH], image_array[MOUTH]);
    }

    public void mustacheCheckBoxIsClicked(View view) {
        changeVisibility(view, checkbox_array[MUSTACHE], image_array[MUSTACHE]);
    }

    public void noseCheckBoxIsClicked(View view) {
        changeVisibility(view, checkbox_array[NOSE], image_array[NOSE]);
    }

    public void shoesCheckBoxIsClicked(View view) {
        changeVisibility(view, checkbox_array[SHOES], image_array[SHOES]);
    }

    // change image visibility
    private void changeVisibility(View view, CheckBox checkbox, ImageView image) {

        // make visibile when checked
        if (checkbox.isChecked()) {
            image.setVisibility(View.VISIBLE);

        // make invisible when unchecked
        } else {
            image.setVisibility(View.INVISIBLE);
        }
    }
}
