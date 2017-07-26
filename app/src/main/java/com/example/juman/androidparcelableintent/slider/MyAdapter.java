package com.example.juman.androidparcelableintent.slider;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.juman.androidparcelableintent.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Juman on 7/27/2017.
 */

public class MyAdapter extends PagerAdapter {
    private List<SliderDataModel> images;
    private LayoutInflater inflater;
    private Context context;

    public MyAdapter(Context context, List<SliderDataModel> images) {
        this.context = context;
        this.images=images;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return images.size();
    }

    @Override
    public Object instantiateItem(ViewGroup view, int position) {
        View myImageLayout = inflater.inflate(R.layout.slide, view, false);
        ImageView myImage = (ImageView) myImageLayout
                .findViewById(R.id.imageslide);

        final SliderDataModel hotelItem = (SliderDataModel) images.get(position);
        myImage.setImageResource(hotelItem.getImage());
        view.addView(myImageLayout, 0);
        return myImageLayout;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }
}
