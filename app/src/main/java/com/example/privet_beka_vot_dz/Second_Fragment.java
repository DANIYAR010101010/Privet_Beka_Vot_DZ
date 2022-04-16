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


public class Second_Fragment extends Fragment {
    private TextView textView;
    private Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
        getData();
        senData();


    }

    private void senData() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                String string = textView.getText().toString();
                bundle.putString("key", string);
                Third_Fragment third_fragment = new Third_Fragment();
                third_fragment.setArguments(bundle);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, third_fragment).commit();
            }
        });
    }

    private void getData() {
        Bundle bundle = getArguments();
        String string = (String) bundle.get("key");
        textView.setText(string);
    }

    private void init(View view) {
        textView = view.findViewById(R.id.qwerty_get);
        button = view.findViewById(R.id.button_1);
    }
}