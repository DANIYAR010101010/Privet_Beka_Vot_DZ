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
import android.widget.TextView;


public class Fourth_Fragment extends Fragment {

    private Button button;
    private TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fourth_, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
       init(view);
       getData();
       sendData();

    }

    private void sendData() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                String string = textView.getText().toString();
                bundle.putString("key",string);
                Fifth_Fragment fifth_fragment = new Fifth_Fragment();
                fifth_fragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,fifth_fragment).commit();
            }
        });
    }

    private void getData() {
        Bundle bundle= getArguments();
        String string = (String) bundle.get("key");
        textView.setText(string);
    }



    private void init(View view) {
        button = view.findViewById(R.id.button_3);
        textView= view.findViewById(R.id.qwerty_get_4);
        button = view.findViewById(R.id.button_4);
        textView = view.findViewById(R.id.qwerty_get_4);


    }

}