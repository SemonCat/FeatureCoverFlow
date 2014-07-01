package com.martinappl.components.sample.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.martinappl.components.sample.Data;
import com.martinappl.components.sample.R;
import com.squareup.picasso.Picasso;

/**
 * Created by SemonCat on 2014/7/1.
 */
public class SampleImageAdapter extends BaseAdapter {

    private static final String TAG = SampleImageAdapter.class.getName();

    private String[] ImageId = Data.URLS;

    @Override
    public int getCount() {
        return ImageId.length;
    }

    @Override
    public String getItem(int position) {
        return ImageId[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView = new ImageView(parent.getContext());

        Picasso.with(parent.getContext()).setLoggingEnabled(true);
        Picasso.with(parent.getContext()).load(getItem(position)).into(imageView);

        return imageView;
    }
}
