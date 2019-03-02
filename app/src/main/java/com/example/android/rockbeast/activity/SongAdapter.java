package com.example.android.rockbeast.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.rockbeast.R;

import java.util.ArrayList;

// WordAdapter is a custom adapter that takes as it's input a list of Word objects
// So when the list of item views is requested, it will find the view at the correct position and then
// create or reuse a list item layout. SO the views will be updated based on the information in the Words object
// and then the list item view is returned to ListView.
public class SongAdapter extends ArrayAdapter<Song> {

    /** @param context  The current context. Used to inflate the layout file.
        @param songs    A List of Word objects to display in a list
     */
    public SongAdapter(Context context, ArrayList<Song> songs) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument (because we are inflating layout in getView method), so it can be any value. Here, we used 0.
        super(context, 0, songs);
        // we are calling ArrayAdaptor's (superclass') constructor here
    }

    /**
     * Provide a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation (in this case ListView)
     * @return The View for the position in the AdapterView.
     */
    @Override
    // Get a list item view that we can use
    public View getView(int position, View convertView, ViewGroup parent) {

        // EITHER by reusing - get the list item = {@link Word} object located at this position in the list
        View listItemView = convertView;
        // OR inflate (= create) new list item view from list_item.xml
//        false is there, because we don't want to attach list item to parent ListView yet
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //Get the {@link Word} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView and ImageView in the list_item.xml layout
        ImageView songImageView = (ImageView) listItemView.findViewById(R.id.song_image_text_view);
        TextView songName = (TextView) listItemView.findViewById(R.id.song_name_text_view);
        TextView songInterpreter = (TextView) listItemView.findViewById(R.id.interpreter_name_text_view);
        TextView albumName = (TextView) listItemView.findViewById(R.id.album_name_text_view);
        // Populate the data into the template view using the data object
        songImageView.setImageResource(currentSong.getImageResourceId());
        songName.setText(currentSong.getSongName());
        songInterpreter.setText(currentSong.getSongInterpreter());
        albumName.setText(currentSong.getAlbumName());
        // Return the whole list item layout (containing 2 TextViews) from the word object
        // so that it can be shown in the ListView on screen
        return listItemView;
    }

}

