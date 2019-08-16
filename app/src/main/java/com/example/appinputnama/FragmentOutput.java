package com.example.appinputnama;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentOutput extends Fragment {
View view;
TextView txtNama;
    public static final String Key_nama = "Key_nama";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            view = inflater.inflate(R.layout.tv_output, container, false);
            txtNama = view.findViewById(R.id.txt_nama);
            try {
               String nama = getArguments().getString(Key_nama);
                if(nama != null) {
                    txtNama.setText(nama);
                }else {
                    txtNama.setText("kosong");
                }
            }catch (Exception ex){
                ex.printStackTrace();
            }
   return view;
    }

}
