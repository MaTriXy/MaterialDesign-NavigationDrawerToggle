package com.example.jhordan.navigationdrawertoggle;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jhordan on 07/11/14.
 */
public class FragmentoOne extends Fragment {

    public FragmentoOne() {
    }

    public static FragmentoOne newInstance(int position) {

       FragmentoOne fragmentCercanos = new FragmentoOne();
        Bundle extraArguments = new Bundle();

        fragmentCercanos.setArguments(extraArguments);
        return fragmentCercanos;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.one, container, false);


        return v;
    }
}
