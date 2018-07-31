package id.erizawamayu.bnspsoal1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Tampilan extends AppCompatActivity {

    TextView tampilNama, tampilAlamat, tampilNomor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan);

        tampilNama = findViewById(R.id.tampilNama);
        tampilAlamat = findViewById(R.id.tampilAlamat);
        tampilNomor = findViewById(R.id.tampilNomor);

        Intent i = getIntent();
        String nama = i.getStringExtra("Nama");
        tampilNama.setText(nama);

        String alamat = i.getStringExtra("Alamat");
        tampilAlamat.setText(alamat);

        String nomor = i.getStringExtra("Nomor");
        tampilNomor.setText(nomor);
    }
}
