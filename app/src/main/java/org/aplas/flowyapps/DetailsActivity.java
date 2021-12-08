package org.aplas.flowyapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ImageView imgBunga = findViewById(R.id.imgDetail);
        TextView txtJudul = findViewById(R.id.txtJudulDetail);
        TextView txtDeskripsi = findViewById(R.id.txtDeskripsiDetail);


    }
}