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
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        final ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song(R.drawable.pink_floyd, "Another Brick in the Wall", "Pink Floyd", "The Wall"));
        songs.add(new Song(R.drawable.ac_dc, "Highway to Hell", "AC/DC", "Highway to Hell"));
        songs.add(new Song(R.drawable.led_zeppelin, "Stairway to Heaven", "Led Zeppelin", "Led Zeppelin IV"));
        songs.add(new Song(R.drawable.deep_purple, "Smoke on the Water", "Deep Purple", "Machine Head"));
        songs.add(new Song(R.drawable.nirvana, "Smells Like Teen Spirit ", "Nirvana", "Nevermind"));
        songs.add(new Song(R.drawable.guns_n_roses, "Sweet Child O' Mine", "Guns N' Roses", "Appetite for Destruction"));
        songs.add(new Song(R.drawable.iron_maiden, "The Trooper", "Iron Maiden", "Peace of Mind"));
        songs.add(new Song(R.drawable.kiss, "Black Diamond", "Kiss", "Kiss"));
        songs.add(new Song(R.drawable.aerosmith, "Dream On", "Aerosmith", "Aerosmith"));
        songs.add(new Song(R.drawable.metallica, "The Unforgiven II", "Metallica", "Reload"));
        songs.add(new Song(R.drawable.rolling_stones, "Paint It Black", "Rolling Stones", "Aftermath"));
        songs.add(new Song(R.drawable.queen, "Bohemian Rhapsody", "Queen", "A Night at the Opera"));

        // Create a {@link SongAdapter}, whose data source is a list of {@link Song}s.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link GridView} with the view ID called list, which is declared in the song_list file.
        final GridView gridView = (GridView) findViewById(R.id.list);

        // Make the {@link GridView} use the {@link SongAdapter} we created above, so that the
        // {@link GridView} will display list items for each {@link Song} in the list.
        gridView.setAdapter(adapter);

//        Find the view that shows the FeedbackActivity
        Button buttonToPlaySongActivity = (Button) findViewById(R.id.button_to_feedback_activity);
//      Set a clickListener on that view
        buttonToPlaySongActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivityIntent = new Intent(MainActivity.this, FeedbackActivity.class);
                startActivity(mainActivityIntent);
            }
        });

//      When user clicks on an item, fetch the right intent data of that clicked item from the songs array and pass them into PlaySongActivity
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent myIntent = new Intent(MainActivity.this, PlaySongActivity.class);
                myIntent.putExtra("songImage", songs.get(position).getImageResourceId());
                myIntent.putExtra("songName", songs.get(position).getSongName());
                myIntent.putExtra("interpreterName", songs.get(position).getSongInterpreter());
                myIntent.putExtra("albumName", songs.get(position).getAlbumName());
                startActivity(myIntent);
            }
        });
    }
}