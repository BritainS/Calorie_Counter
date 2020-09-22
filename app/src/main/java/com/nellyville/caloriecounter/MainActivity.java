package com.nellyville.caloriecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox checkKetchup;
    CheckBox checkRelish;
    CheckBox checkMustard;
    TextView textView;
    SeekBar seekBar;
    Button finalCalories;
    Glizzy glizzy;
    RadioGroup glizzyType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        glizzy = new Glizzy();
        finalCalories = (Button) findViewById((R.id.button));
        glizzyType = (RadioGroup) findViewById(R.id.glizzies);
        textView = (TextView) findViewById(R.id.textView);
        checkKetchup = (CheckBox) findViewById(R.id.checkKetchup);
        checkRelish = (CheckBox) findViewById(R.id.checkRelish);
        checkMustard = (CheckBox) findViewById(R.id.checkMustard);
        seekBar = (SeekBar) findViewById(R.id.seekBar);

        glizzyType.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                switch (id) {
                    case R.id.standard_glizzy_radio:
                        glizzy.meatNum(1);
                        break;
                    case R.id.summer_sausage_radio:
                        glizzy.meatNum(2);
                        break;
                    case R.id.beyond_glizzy_radio:
                        glizzy.meatNum(3);
                        break;
                }
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int ffc = (int) (seekBar.getProgress() * 0.1 * 5);
                glizzy.getGlizzyCal(ffc);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    public void ketchup(View view) {
        if (checkKetchup.isChecked()) {
            glizzy.setKetchup(true);
        } else {
            glizzy.setKetchup(false);
        }
    }
        public void relish (View view) {
            if (checkRelish.isChecked()) {
                glizzy.setRelish(true);
            } else {
                glizzy.setRelish(false);
            }
        }

            public void mustard (View view)
            {
                if (checkMustard.isChecked()) {
                    glizzy.setMustard(true);
                } else {
                    glizzy.setMustard(false);
                }

            }
            public void calorieChecker (View view)
            {
                String glizzyCalories = String.valueOf(glizzy.totalGlizzyCal());
                glizzyCalories += " Calories";
                textView.setText(glizzyCalories);
            }


}