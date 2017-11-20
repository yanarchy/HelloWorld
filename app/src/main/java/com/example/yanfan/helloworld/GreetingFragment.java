package com.example.yanfan.helloworld;

import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.util.Log;

/**
 * A placeholder fragment containing a simple view.
 */
public class GreetingFragment extends Fragment {
    private int mCount;
    private static final String TAG = "MyFragment";

    public GreetingFragment(){
        Log.i(TAG, "string message");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_greeting, container, false);
        FloatingActionButton fab = layout.findViewById(R.id.fab);
        final TextView greeting = layout.findViewById(R.id.hello_world);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCount++;
                greeting.setText(mCount);
            }
        };
        fab.setOnClickListener(listener);
        return layout;
    }
}
