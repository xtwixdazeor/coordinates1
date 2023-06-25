package com.example.coordinates1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.BreakIterator;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView txtShir = (TextView) findViewById(R.id.lat);
        TextView txtDolg = (TextView) findViewById(R.id.lon);
        Button btnMap = (Button) findViewById(R.id.btnmap);

        View.OnClickListener oc1btnMap = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.setAction(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("geo: " + txtShir.getText().toString() + ", " + txtDolg.getText().toString()));
                startActivity(intent1);
            }
        };
        btnMap.setOnClickListener(oc1btnMap);
    }
}