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
public class showfrag3 extends Fragment {

    //create the vars
    View view;
    Button btn_3;


    public showfrag3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_showfrag3, container, false);
    }
}


/**
 //find the button and create an onclicklistener
 btn_3 = view.findViewById(R.id.btn_3);
 btn_3.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
Toast.makeText(getActivity(), "This is the third fragment!!", Toast.LENGTH_SHORT).show();
}
});
 return view;
 **/