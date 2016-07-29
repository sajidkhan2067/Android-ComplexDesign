package com.example.sajidkhan.complexdesign;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sajid on 11/6/2015.
 */
public class RightFragment extends Fragment {

    View rootView;
    TextView textViewRight;
    CommunicationChannel mCommChListner = null;
    private static final String TAG = RightFragment.class.getSimpleName();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        try {
            mCommChListner = (CommunicationChannel) getActivity();

        } catch (Exception e) {
            Log.d(TAG, "mCommChListnerException - " + e);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        rootView = inflater.inflate(R.layout.fragment_right_layout, container, false);

        textViewRight = (TextView) rootView.findViewById(R.id.textViewRight);
        textViewRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCommChListner.setCommunicationMessage("Right");

            }
        });

        //  return inflater.inflate(R.layout.fragment_right_layout, container, false);

        return rootView;
    }


    public void setReceivedText(String str) {
        textViewRight.setText(str);
    }


}
