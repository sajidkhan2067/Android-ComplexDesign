package com.example.sajidkhan.complexdesign;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SinglePagertLayoutFragment extends Fragment {

    CommunicationChannel mCommChListner = null;
    private static final String TAG = SinglePagertLayoutFragment.class.getSimpleName();
    View rootView;
    TextView leftTab;
    String str;

    public static SinglePagertLayoutFragment newInstance() {
        SinglePagertLayoutFragment singlePagertLayoutFragment = new SinglePagertLayoutFragment();
        return singlePagertLayoutFragment;
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


    public SinglePagertLayoutFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_single_pager_layout, container, false);
        }

        leftTab = (TextView) rootView.findViewById(R.id.textViewLeft);

        leftTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCommChListner.setCommunicationMessage("Left");
            }
        });

        return rootView;

    }


}