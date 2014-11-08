package com.example.jhordan.navigationdrawertoggle;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Jhordan on 07/11/14.
 */
public class FragmentoTwo extends Fragment {

    public FragmentoTwo() {
    }

    public static FragmentoTwo newInstance(int position) {

        FragmentoTwo fragmentCercanos = new FragmentoTwo();
        Bundle extraArguments = new Bundle();

        String h = Integer.toString(position);
        Log.i("position", h);
        fragmentCercanos.setArguments(extraArguments);
        return fragmentCercanos;
    }

    Button btn;
    EditText edt;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.two, container, false);

        btn = (Button) v.findViewById(R.id.button);
        edt = (EditText)v.findViewById(R.id.editText);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(getActivity(),edt.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });



        return v;
    }
}

