package com.example.rustam.beatbox;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.IOException;

/**
 * Created by Rustam on 04.07.2016.
 */
public class BeatBox {
    private static final String TAG = "BeatBox";

    private static final String SOUNDS_FOLDER = "sample_souds";

    private AssetManager mAssets;

    public BeatBox(Context context)
    {
        mAssets = context.getAssets();
    }

    private void loadSounds()
    {
        String[] soundNames;
        try
        {
            soundNames = mAssets.list(SOUNDS_FOLDER);
            Log.i(TAG, "Found " + soundNames.length + " sounds");
        } catch (IOException ioe) {
            Log.e(TAG, "Could not list assets", ioe);
            return;
        }
    }
}
