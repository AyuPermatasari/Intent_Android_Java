package id.erizawamayu.bnspsoal1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityMain extends AppCompatActivity {

    Button btnSimpan;
    EditText txtNama;
    EditText txtAlamat;
    EditText txtNomor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSimpan = findViewById(R.id.btnSimpan);
        txtNama = findViewById(R.id.txtNama);
        txtAlamat = findViewById(R.id.txtAlamat);
        txtNomor = findViewById(R.id.txtNomor);
        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Tampilan.class);

                i.putExtra("Nama", txtNama.getText().toString());
                i.putExtra("Alamat", txtAlamat.getText().toString());
                i.putExtra("Nomor", txtNomor.getText().toString());

                startActivity(i);
            }
        });
    }
}
