package com.example.privet_beka_vot_dz;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class Fifth_Fragment extends Fragment {
    private TextView textView;
    private Button button;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fifth_, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);




     init(view);
      getData();
    }

    private void init(View view) {
        button = view.findViewById(R.id.button_4);
        textView= view.findViewById(R.id.qwerty_get_5);
    }

    private void getData() {
        Bundle bundle= getArguments();
        String string = (String) bundle.get("key");
        textView.setText(string);
    }


}