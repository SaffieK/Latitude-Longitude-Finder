package com.saffiek.bgcolor.locationprinter;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivityFragment extends Fragment {

    View rootView;
    TextView tv;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_main, container,
                false);

        tv = (TextView) rootView.findViewById(R.id.textView);

        return rootView;
    }
}
