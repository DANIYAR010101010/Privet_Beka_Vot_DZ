package com.example.privet_beka_vot_dz;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Main_fragment extends Fragment {
    private Button button;
    private  EditText editText;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
        sendData();

    }


    private void sendData() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!editText.getText().toString().isEmpty()){
                    Bundle bundle = new Bundle();
                    String string = editText.getText().toString();
                    bundle.putString("key",string);
                    Second_Fragment secondFragment = new Second_Fragment();
                    secondFragment.setArguments(bundle);
                    requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,secondFragment).commit();
                }else {
                    editText.setError("пополниете поле ");
                }

            }
        });
    }

    private void init(View view) {
        button = view.findViewById(R.id.button);
        editText = view.findViewById(R.id.qwerty);
    }
}