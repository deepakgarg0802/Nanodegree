package com.example.deepakgarg.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //TextView textView;
    Button spotify_button,library_button,scores_button,buildbigger_button,reader_button,capstone_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotify_button=(Button)findViewById(R.id.spotify_button);
        spotify_button.setOnClickListener(this);

        scores_button=(Button)findViewById(R.id.scores_button);
        scores_button.setOnClickListener(this);

        library_button=(Button)findViewById(R.id.library_button);
        library_button.setOnClickListener(this);

        buildbigger_button=(Button)findViewById(R.id.buildbigger_button);
        buildbigger_button.setOnClickListener(this);

        reader_button=(Button)findViewById(R.id.reader_button);
        reader_button.setOnClickListener(this);

        capstone_button=(Button)findViewById(R.id.capstone_button);
        capstone_button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case (R.id.spotify_button):
                Toast.makeText(MainActivity.this, "This button will launch my Spotify App", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.library_button):
                Toast.makeText(MainActivity.this, "This button will launch my library App", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.scores_button):
                Toast.makeText(MainActivity.this, "This button will launch my scores App", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.buildbigger_button):
                Toast.makeText(MainActivity.this, "This button will launch my Build bigger App", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.reader_button):
                Toast.makeText(MainActivity.this, "This button will launch my Reader App", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.capstone_button):
                Toast.makeText(MainActivity.this, "This button will launch my Capstone App", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
