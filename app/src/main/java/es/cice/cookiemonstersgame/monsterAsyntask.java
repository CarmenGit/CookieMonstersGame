package es.cice.cookiemonstersgame;

import android.os.AsyncTask;

/**
 * Created by cice on 31/1/17.
 */

public class monsterAsyntask extends AsyncTask<Void,Integer, Void > {

    private tarroGalletas tarroG;
    @Override
    protected Void doInBackground(Void... params) {

        tarroG.comeGalleta();
        return null;
    }
}
