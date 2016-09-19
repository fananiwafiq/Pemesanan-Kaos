package id.sch.smktelkom_mlg.xirpl2015.pemesanankaos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText etNama;
    TextView tvNegara, tvJenis, tvUkuran, tvHasil;
    Spinner spNegara;
    CheckBox cbKo, cbKp, cbKs, cbKj, cbKpolo;
    RadioGroup rgUkuran;
    Button bVo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editText);
        spNegara = (Spinner) findViewById(R.id.spinner);
        rgUkuran = (RadioGroup) findViewById(R.id.radioGroup);
        cbKo = (CheckBox) findViewById(R.id.checkBox);
        cbKpolo = (CheckBox) findViewById(R.id.checkBox2);
        cbKs = (CheckBox) findViewById(R.id.checkBox3);
        cbKj = (CheckBox) findViewById(R.id.checkBox4);
        cbKp = (CheckBox) findViewById(R.id.checkBox5);
        bVo = (Button) findViewById(R.id.button);
        tvHasil = (TextView) findViewById(R.id.textView5);

        bVo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doProsess();
            }
        });
    }

    private void doProsess() {
        if (isValid()) {
        }
        String nama = etNama.getText().toString();
        String hasil = null;


        if (hasil == null) {
            tvHasil.setText("Belum Mengisi Ukuran");
        } else {
            tvHasil.setText("Kaos Anda Ukuran :" + hasil);
        }


        tvHasil.setText("Nama : " + nama + "\n Negara :" + spNegara.getSelectedItem().toString() + "\n Ukuran Kaos :" + hasil);

    }

    private boolean isValid() {
        boolean valid = true;

        String nama = etNama.getText().toString();

        if (nama.isEmpty()) {
            etNama.setError("Nama Belum Diisi");
            valid = false;
        } else if (nama.length() < 3) {
            etNama.setError("Nama Minimal 3 Karakter");
            valid = false;
        } else {
            etNama.setError(null);
        }
        return valid;
    }
}
