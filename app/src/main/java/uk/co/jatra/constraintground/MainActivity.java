package uk.co.jatra.constraintground;

import android.os.Bundle;
import android.support.constraint.Group;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        Group tvGroup = findViewById(R.id.tvGroup);

        Switch sw1 = findViewById(R.id.switch1);
        Switch sw2 = findViewById(R.id.switch2);

        sw1.setOnCheckedChangeListener((v, on) -> tvGroup.setVisibility(on ? View.VISIBLE : View.GONE));
        sw2.setOnCheckedChangeListener((v, on) -> {
            if (on) {
                tv1Longer();
            }
            else {
                tv2Longer();
            }
        });
    }

    private void tv2Longer() {
        tv1.setText(R.string.very_short);
        tv2.setText(R.string.very_long);
    }

    private void tv1Longer() {
        tv1.setText(R.string.longish);
        tv2.setText(R.string.shortish);
    }
}
