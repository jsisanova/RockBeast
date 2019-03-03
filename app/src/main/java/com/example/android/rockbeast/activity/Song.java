package com.example.android.rockbeast.activity;

/**
 * {@link Song} represents a song that contains song image, song name, interpreter name and album name
 */
public class Song {
    /** Song image */
    private int mImageResourceId;

    /** Song name */
    private String mSongName;

    /** Song interpreter name */
    private String mSongInterpreter;

    /** Album name */
    private String mAlbumName;

    /**
     * Create a new Song object.
     *
     * @param imageResourceId is drawable reference ID for song image
     * @param songName is the name of a song
     * @param songInterpreter is the interpreter of the song
     * @param albumName is the name of album
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
     * Get the song name
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the interpreter name
     */
    public String getSongInterpreter() {
        return mSongInterpreter;
    }

    /**
     * Get the album name
     */
    public String getAlbumName() {
        return mAlbumName;
    }
}