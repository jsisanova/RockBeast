package com.example.android.rockbeast.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.android.rockbeast.R;
import java.util.ArrayList;

// SongAdapter is a custom adapter that takes as it's input a list of Song objects.
public class SongAdapter extends ArrayAdapter<Song> {

    /** @param context  The current context. Used to inflate the layout file.
        @param songs    A List of Song objects to display in a list
     */
    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    /**
     * Provide a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation (in this case GridView)
     * @return The View for the position in the AdapterView.
     */
    @Override
    // Get a list item view that we can use
    public View getView(int position, View convertView, ViewGroup parent) {

//      Use ViewHolder to optimize the GridView
//        MainActivity.ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
//            holder = new MainActivity.ViewHolder();
//            holder.songImageView = (ImageView) convertView.findViewById(R.id.list_item_song_image_text_view);
//            holder.songName = (TextView) convertView.findViewById(R.id.list_item_song_name_text_view);
//            holder.songInterpreter = (TextView) convertView.findViewById(R.id.list_item_interpreter_name_text_view);
//            holder.albumName = (TextView) convertView.findViewById(R.id.list_item_album_name_text_view);
//            convertView.setTag(holder);
        }
//        else {
//            holder = (MainActivity.ViewHolder) convertView.getTag();
//        }

        //Get the {@link Word} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView and ImageView in the list_item.xml layout
        ImageView songImageView = (ImageView) convertView.findViewById(R.id.list_item_song_image_text_view);
        TextView songName = (TextView) convertView.findViewById(R.id.list_item_song_name_text_view);
        TextView songInterpreter = (TextView) convertView.findViewById(R.id.list_item_interpreter_name_text_view);
        TextView albumName = (TextView) convertView.findViewById(R.id.list_item_album_name_text_view);

        // Populate the data into the template view using the data object
        songImageView.setImageResource(currentSong.getImageResourceId());
        songName.setText(currentSong.getSongName());
        songInterpreter.setText(currentSong.getSongInterpreter());
        albumName.setText(currentSong.getAlbumName());

//        holder.songImageView.setImageResource(currentSong.getImageResourceId());
//        holder.songName.setText(currentSong.getSongName());
//        holder.songInterpreter.setText(currentSong.getSongInterpreter());
//        holder.albumName.setText(currentSong.getAlbumName());

        // Return the whole list item layout from the Song object so that it can be shown in the GridView on screen
        return convertView;
    }
}