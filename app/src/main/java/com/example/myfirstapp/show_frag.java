package com.example.myfirstapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class show_frag extends Fragment {

    //create the vars
    View view;
    Button btn_1;


    public show_frag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment - bind the View "view" to below
        return inflater.inflate(R.layout.fragment_show_frag, container, false);
    }
}


/**
 get reference for the button and create an onclicklistener
 btn_1 = view.findViewById(R.id.btn_1);
 btn_1.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
Toast.makeText(getActivity(), "This is the first frag!" , Toast.LENGTH_SHORT).show();
}
});

 return view;
 **/