package es.cice.cookiemonstersgame;

import android.os.AsyncTask;

import java.util.Random;

/**
 * Created by cice on 31/1/17.
 */

public class monsterAsyntask extends AsyncTask<Void,Integer, Void > {

    private tarroGalletas tarroG;
    @Override
    protected Void doInBackground(Void... params) {
        tarroG=tarroGalletas.getInstance();

        //tiempo aleatorio menor que 5 seg
        Random rnd = new Random();

        tarroG.comeGalleta();
        return null;
    }
}
