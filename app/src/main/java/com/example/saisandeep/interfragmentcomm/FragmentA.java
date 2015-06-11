package com.example.saisandeep.interfragmentcomm;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by saisandeep on 12/16/2014.
 */
public class FragmentA extends Fragment implements View.OnClickListener {

    Button button;
    Communicator comm;
    int counter=0;
    @Nullable
    @Override




    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(savedInstanceState==null)
        {
            counter=0;
        }
        else
        {
            counter=savedInstanceState.getInt("COUNTER",0);

        }
        return inflater.inflate(R.layout.fragment_a,container,false);

    }

    //@Override
    /*public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState==null)
        {
            counter=0;
        }
        else
        {
            counter=savedInstanceState.getInt("COUNTER",0);

        }
    }*/

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        comm= (Communicator) getActivity();
        button= (Button) getActivity().findViewById(R.id.button);
        button.setOnClickListener(this);

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("COUNTER",counter);
    }

    @Override
    public void onClick(View view) {
        counter++;
        comm.respond("THe counter was clicked"+counter+" times.");
    }
}
