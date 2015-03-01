package jp.co.shiratsu.cafesagashi.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import jp.co.shiratsu.cafesagashi.R;


public class FirstTab extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Get the view from fragmenttab3.xml
        View view = inflater.inflate(R.layout.fragment_first_tab, container, false);
        return view;
    }
}

