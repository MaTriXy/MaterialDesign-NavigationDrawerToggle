package com.example.jhordan.navigationdrawertoggle;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.two, container, false);


        return v;
    }
}

