package com.example.deepakgarg.popularmovies;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

/**
 * Created by Deepak Garg on 08-05-2016.
 */
public class DetailMovie extends AppCompatActivity {

    TextView title,plot,rating,releasedate;
    ImageView imageView;
    String name,synopsis,user_rating,release_date,link;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent=getIntent();
        name=intent.getStringExtra("title");
        synopsis=intent.getStringExtra("plot");
        release_date=intent.getStringExtra("date");
        user_rating=intent.getStringExtra("rate");
        link=intent.getStringExtra("imagelink");

        title=(TextView)findViewById(R.id.textView_title);
        plot=(TextView)findViewById(R.id.plot);
        rating=(TextView)findViewById(R.id.rating);
        releasedate=(TextView)findViewById(R.id.date);

        title.setText(name);
        releasedate.setText(release_date);
        plot.setText(synopsis);
        rating.setText(user_rating);

        imageView=(ImageView)findViewById(R.id.movieimage);

        Picasso.with(getApplicationContext()).load("http://image.tmdb.org/t/p/w342/"+link)
                .error(R.drawable.download)
                .into(imageView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.exit :
                Toast.makeText(getApplicationContext(),"Closing app..", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                //System.exit(0);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
