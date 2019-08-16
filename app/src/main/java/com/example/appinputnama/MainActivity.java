package com.example.appinputnama;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.appinputnama.FragmentOutput.Key_nama;

public class MainActivity extends AppCompatActivity {
EditText edtNama;
//public static final String Key_nama = "Key_nama";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNama = findViewById(R.id.editText);
    }



    public void btn_lihat(View view) {
//        String nama = edtNama.getText().toString();
//        if(nama.isEmpty()){
//            Toast.makeText(this,"nama kosong",Toast.LENGTH_SHORT).show();
//        }else {
            try {
                String nama = edtNama.getText().toString();
                Bundle data = new Bundle();
                data.putString(Key_nama,nama);
                FragmentOutput fragmentOutput = new FragmentOutput();
                fragmentOutput.setArguments(data);

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_output,fragmentOutput)
                        .commit();
            }catch (Exception e){
            e.printStackTrace();
        }
//        }
    }
//    private void loadFragment (Fragment fragment){
//        FragmentManager fm = getSupportFragmentManager();
//        FragmentTransaction ft = fm.beginTransaction();
//        ft.replace(R.id.frame_output, fragment);
//      //  ft.add()
//        ft.commit();
//    }
}
