package com.wugaldeq.udemy.mymail.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wugaldeq.udemy.mymail.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListMailFragment extends Fragment {


    public ListMailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_mail, container, false);
    }

}
