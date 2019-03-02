package com.example.android.rockbeast.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.rockbeast.R;

import java.util.ArrayList;

public class PlaySongActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song);

//      Find the view that shows the Main Activity
        Button buttonToMainActivity = (Button) findViewById(R.id.button_to_main_activity);
//       Set a clickListener on that view
        buttonToMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivityIntent = new Intent(PlaySongActivity.this, MainActivity.class);
                startActivity(mainActivityIntent);
            }
        });

//      Change play icon control to pause icon when clicked
        final ImageButton playIcon = (ImageButton)findViewById(R.id.play_icon);
        playIcon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                playIcon.setImageResource(R.drawable.pause_icon);
            }
        });

//       Get the extras that are put into the intent
        ImageView songImageView = (ImageView) findViewById(R.id.song_image_text_view);
        int songImageValue = getIntent().getIntExtra("songImage", 0);
        songImageView.setImageResource(songImageValue);

        TextView songNameTextView = (TextView) findViewById(R.id.song_name_text_view);
        String songNameStringValue = getIntent().getStringExtra("songName");
        songNameTextView.setText(songNameStringValue);

        TextView interpreterNameTextView = (TextView) findViewById(R.id.interpreter_name_text_view);
        String interpreterNameStringValue = getIntent().getStringExtra("interpreterName");
        interpreterNameTextView.setText(interpreterNameStringValue);

        TextView albumNameTextView = (TextView) findViewById(R.id.album_name_text_view);
        String albumNameStringValue = getIntent().getStringExtra("albumName");
        albumNameTextView.setText(albumNameStringValue);
    }
}