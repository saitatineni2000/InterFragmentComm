package com.example.saisandeep.interfragmentcomm;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by saisandeep on 12/16/2014.
 */
public class FragmentB extends Fragment {

    TextView text;
    String Data;

    @Nullable
    @Override


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_b,container,false);
        if(savedInstanceState==null)
        {

        }
        else
        {
            Data=savedInstanceState.getString("data given");
            TextView tv= (TextView) v.findViewById(R.id.textView);
            tv.setText(Data);
        }
        return v;
    }



    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        text= (TextView) getActivity().findViewById(R.id.textView);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("data given",Data);
    }

    public void changeData(String Data)
    {

        text.setText(Data);
    }
}
