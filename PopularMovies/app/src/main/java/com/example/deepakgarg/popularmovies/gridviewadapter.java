package com.example.deepakgarg.popularmovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Deepak Garg on 06-05-2016.
 */
public class gridviewadapter extends BaseAdapter {
    Context myContext;
    String name [];
    int thumbnail[];

    public gridviewadapter(Context context,String name [], int thumbnail[])
    {
        this.myContext=context;
        this.name= name;
        this.thumbnail=thumbnail;
    }
    @Override
    public int getCount() {
        return thumbnail.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View grid;
        LayoutInflater inflater= (LayoutInflater)myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            grid = new View(myContext);
            grid = inflater.inflate(R.layout.gridadapter, null);
            TextView textView=(TextView)grid.findViewById(R.id.moviename);
            ImageView imageView= (ImageView)grid.findViewById(R.id.imageView);
            imageView.setImageResource(thumbnail[position]);
            textView.setText(name[position]);
        }
        else {
            grid = (View) convertView;
        }

        return grid;
    }
}
