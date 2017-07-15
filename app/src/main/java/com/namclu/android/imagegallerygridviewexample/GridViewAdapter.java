package com.namclu.android.imagegallerygridviewexample;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by namlu on 7/14/2017.
 */

public class GridViewAdapter extends ArrayAdapter<GridItem> {

    private Context mContext;
    private int mLayoutResourceId;
    private ArrayList<GridItem> mGridData = new ArrayList<>();

    public GridViewAdapter(Context context, int layoutResourceId, ArrayList<GridItem> gridData) {
        super(context, layoutResourceId, gridData);
        mContext = context;
        mLayoutResourceId = layoutResourceId;
        mGridData = gridData;
    }

    /*
    * Updates grid data and refresh grid items
    * @param mGridData
    * */
    public void setGridData(ArrayList<GridItem> gridData) {
        mGridData = gridData;
        notifyDataSetChanged();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            //LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            //convertView = inflater.inflate(mLayoutResourceId, parent, false);
            convertView = LayoutInflater.from(parent.getContext())
                    .inflate(mLayoutResourceId, parent, false);
            holder = new ViewHolder();
            holder.titleTextView = (TextView) convertView.findViewById(R.id.grid_item_title);
            holder.imageView = (ImageView) convertView.findViewById(R.id.grid_item_image);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        GridItem currentGridItem = mGridData.get(position);
        holder.titleTextView.setText(Html.fromHtml(currentGridItem.getTitle()));
        Picasso.with(mContext).load(currentGridItem.getImage()).into(holder.imageView);

        return convertView;
    }

    static class ViewHolder {
        TextView titleTextView;
        ImageView imageView;
    }
}
