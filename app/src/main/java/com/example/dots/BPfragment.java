package com.example.dots;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class BPfragment extends Fragment {

    static ImageView imageView;
  static     Integer[] images={R.drawable.flower,R.drawable.weatherapp1,R.drawable.river};


    private static final String ARG_PARAM1 = "param1";


    private Integer mParam1;


    public BPfragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static BPfragment newInstance(int param1) {
        BPfragment fragment = new BPfragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, param1);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getInt(ARG_PARAM1);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b_pfragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
         imageView=view.findViewById(R.id.ivid);
         imageView.setImageResource(images[mParam1]);

    }
}
