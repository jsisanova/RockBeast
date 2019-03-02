package com.example.android.rockbeast.activity;

/**
 * {@link Song} represents a song that contains song image, song name, interpreter name and album name
 */
public class Song {

    /** Song name */
    private String mSongName;

    /** Song interpreter name */
    private String mSongInterpreter;

    /** Album name */
    private String mAlbumName;

    /** Song image */
    private int mImageResourceId;

    /**
     * Create a new Song object.
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