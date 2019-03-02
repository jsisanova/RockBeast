package com.example.android.rockbeast.activity;

/**
 * {@link Song} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Song {

    /** Default translation for the word */
    private String mSongName;

    /** Miwok translation for the word */
    private String mSongInterpreter;

    /** Default translation for the word */
    private String mAlbumName;

    // Drawable resource ID
    private int mImageResourceId;

    /**
     * Create a new Word object.
     *
     * @param imageResourceId is drawable reference ID that corresponds to the Android version
     * @param songName is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param songInterpreter is the word in the Miwok language
     * @param  albumName is the name of album where the song is
     */
    public Song(int imageResourceId, String songName, String songInterpreter, String albumName) {
        mImageResourceId = imageResourceId;
        mSongName = songName;
        mSongInterpreter = songInterpreter;
        mAlbumName = albumName;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getSongInterpreter() {
        return mSongInterpreter;
    }

    /**
     * Get the default translation of the word.
     */
    public String getAlbumName() {
        return mAlbumName;
    }
}