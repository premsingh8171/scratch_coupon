package com.premsinghdaksha.scratchcoupondemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.premsinghdaksha.scratchcoupon.ScratchCardView;

public class MainActivity extends AppCompatActivity {
    ScratchCardView scratchCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scratchCardView = findViewById(R.id.scratchCardView);
        scratchCardView.setOnScratchListener(new ScratchCardView.OnScratchListener() {
            @Override
            public void onScratch(ScratchCardView scratchCard, float visiblePercent) {
                if (visiblePercent > 0.7) {
                    scratchCard.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "" + getString(R.string.rupee_20), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}