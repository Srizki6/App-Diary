package com.example.appdiary.Fragment;
//10120133 - Muhammad Saeful Rizki - IF 4
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.appdiary.R;


public class FragmentHome extends Fragment {

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_home, container, false);
            return rootView;
        }
    }