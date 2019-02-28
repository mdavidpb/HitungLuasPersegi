package id.sch.smktelkom_mlg.www.hitungluaspersegi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editSisi, edithasil, editkeliling;
    private Button btnOk;
    private TextView txtsisi, textLuas, textkeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEvent();

    }

    private void initUI() {
        txtsisi = findViewById(R.id.txtsisi);
        textLuas = findViewById(R.id.textLuas);
        textkeliling = findViewById(R.id.textkeliling);
        editSisi = findViewById(R.id.editSisi);
        edithasil = findViewById(R.id.edithasil);
        editkeliling = findViewById(R.id.editkeliling);
        btnOk = findViewById(R.id.btnOk);

    }

    private void initEvent() {
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuas();
                hitungKeliling();

            }
        });
    }

    private void hitungLuas() {
        int sisi = Integer.parseInt(editSisi.getText().toString());
        int luas = sisi * sisi;
        edithasil.setText(luas + "");

    }

    private void hitungKeliling() {
        int sisi = Integer.parseInt(editSisi.getText().toString());
        int keliling = 4 * sisi;
        editkeliling.setText(keliling + "");
    }

}

