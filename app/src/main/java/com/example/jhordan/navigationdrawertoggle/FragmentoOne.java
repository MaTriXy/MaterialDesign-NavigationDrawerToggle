package com.example.jhordan.navigationdrawertoggle;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
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
    private Toolbar toolbar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // needed to indicate that the fragment would
        // like to add items to the Options Menu
        setHasOptionsMenu(true);
        // update the actionbar to show the up carat/affordance




    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.one, container, false);


        return v;
    }
}
