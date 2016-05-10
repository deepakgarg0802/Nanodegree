package com.example.deepakgarg.popularmovies;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by Deepak Garg on 06-05-2016.
 */
public class gridviewadapter extends BaseAdapter {
    Context myContext;
    String name [];
    String image_url[];
    public gridviewadapter(Context context,String name [],String[] image_url)
    {
        this.myContext=context;
        this.name= name;
        this.image_url=image_url;
    }
    @Override
    public int getCount() {
        return name.length;
    }

    public void updateAdapter(Context context,String name[],String[] image_url)
    {
        this.myContext=context;
        this.name=name;
        this.image_url=image_url;
        notifyDataSetChanged();
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
            if(image_url!=null && name!=null)
            {
                Picasso.with(myContext).load("http://image.tmdb.org/t/p/w185/"+image_url[position])
                        .error(R.drawable.download)
                        .into(imageView);
                textView.setText(name[position]);

            }
            else {
                imageView.setImageResource(R.drawable.download);
                textView.setText("Refresh to see");
            }
        }
        else {
            grid = (View) convertView;
        }

        return grid;
    }
}
