package com.example.android.rockbeast.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.rockbeast.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of words
        final ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song(R.drawable.pink_floyd, "Wish You Were HereWish You Were HerWish You Were HerWish You Were Her", "Pink Floyd", "Wish You Were Here"));
        songs.add(new Song(R.drawable.ac_dc, "Wish You Were Here", "AC/DC", "Wish You Were Here"));
        songs.add(new Song(R.drawable.led_zeppelin, "Wish You Were Here", "Led Zeppelin", "Wish You Were Here"));
        songs.add(new Song(R.drawable.deep_purple, "Wish You Were Here", "Deep Purple", "Wish You Were Here"));
        songs.add(new Song(R.drawable.nirvana, "Wish You Were Here", "Nirvana", "Wish You Were Here"));
        songs.add(new Song(R.drawable.guns_n_roses, "Wish You Were Here", "Guns N' Roses", "Wish You Were Here"));
        songs.add(new Song(R.drawable.iron_maiden, "Wish You Were Here", "Iron Maiden", "Wish You Were Here"));
        songs.add(new Song(R.drawable.kiss, "Wish You Were Here", "Kiss", "Wish You Were Here"));
        songs.add(new Song(R.drawable.aerosmith, "Wish You Were Here", "Aerosmith", "Wish You Were Here"));
        songs.add(new Song(R.drawable.metallica, "Wish You Were Here", "Metallica", "Wish You Were Here"));
        songs.add(new Song(R.drawable.rolling_stones, "Wish You Were Here", "Rolling Stones", "Wish You Were Here"));
        songs.add(new Song(R.drawable.queen, "Wish You Were Here", "Queen", "Wish You Were Here"));

        // Create a {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);


        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list file.
        final GridView gridView = (GridView) findViewById(R.id.list);


        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        gridView.setAdapter(adapter);


//        Find the view that shows the PlaySongActivity
        Button buttonToPlaySongActivity = (Button) findViewById(R.id.button_to_play_song_activity);
//      Set a clickListener on that view
        buttonToPlaySongActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivityIntent = new Intent(MainActivity.this, PlaySongActivity.class);
                startActivity(mainActivityIntent);
            }
        });




//

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent myIntent = new Intent(view.getContext(), PlaySongActivity.class);
                startActivityForResult(myIntent, 0);

//                Intent myIntent = new Intent(MainActivity.this, PlaySongActivity.class);
//                myIntent.putStringArrayListExtra("arrayListVariableName", );
//                startActivity(myIntent);
            }
        });


    }
}