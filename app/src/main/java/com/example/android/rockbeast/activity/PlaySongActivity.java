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




//        ImageView songPictureTextView = (ImageView) findViewById(R.id.song_picture_text_view);
//        songPictureTextView.setImageResource(R.id.);
        Intent mIntent = getIntent();
        String stringValue = mIntent.getStringExtra("stringVariableName");

    }
}
