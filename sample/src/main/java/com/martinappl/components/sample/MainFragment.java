package com.martinappl.components.sample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.martinappl.components.sample.adapter.SampleImageAdapter;
import com.martinappl.components.ui.containers.FeatureCoverFlow;

/**
 * Created by SemonCat on 2014/7/1.
 */
public class MainFragment extends Fragment {

    private static final String TAG = MainFragment.class.getName();

    private FeatureCoverFlow mCoverFlow;

    public MainFragment() {
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        SampleImageAdapter sampleImageAdapter =  new SampleImageAdapter();
        mCoverFlow.setAdapter(sampleImageAdapter);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        mCoverFlow = (FeatureCoverFlow) rootView.findViewById(R.id.CoverFlow);

        return rootView;
    }



}
