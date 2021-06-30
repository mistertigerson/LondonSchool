package com.example.recycleview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Manegers#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Manegers extends Fragment {


    public Manegers() {
        // Required empty public constructor
    }


    public static Manegers newInstance(String param1, String param2) {
        Manegers fragment = new Manegers();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_manegers, container, false);
    }
}