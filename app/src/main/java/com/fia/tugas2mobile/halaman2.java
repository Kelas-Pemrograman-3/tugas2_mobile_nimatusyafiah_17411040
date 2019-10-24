package com.fia.tugas2mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class halaman2 extends AppCompatActivity {
    TextView txtdata,txtdata2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);

        txtdata =(TextView) findViewById(R.id.txtnama);
        txtdata2=(TextView) findViewById(R.id.txtnpm);

        Intent datas =getIntent();
        String npm = datas.getStringExtra("data");
        String nama = datas.getStringExtra("datas");
        txtdata.setText(nama + "\n" +npm);
    }

    @Override
    public void onBackPressed(){
        Intent back = new Intent(halaman2.this,MainActivity.class);
        startActivity(back);
        finish();
    }

}
