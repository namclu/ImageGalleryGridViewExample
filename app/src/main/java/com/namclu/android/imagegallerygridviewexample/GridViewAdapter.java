package com.namclu.android.imagegallerygridviewexample;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by namlu on 7/14/2017.
 */

public class GridViewAdapter extends ArrayAdapter<GridItem> {

    private Context mContext;
    private int mLayoutResourceId;
    private ArrayList<GridItem> mGridItems = new ArrayList<>();

    public GridViewAdapter(Context context, int layoutResourceId, ArrayList<GridItem> gridItems) {
        super(context, layoutResourceId, gridItems);
        mContext = context;
        mLayoutResourceId = layoutResourceId;
        mGridItems = gridItems;
    }
}
