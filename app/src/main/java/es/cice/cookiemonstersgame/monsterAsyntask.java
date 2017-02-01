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
        int numGalletas = rnd.nextInt(tarroG.getContadorGalletas());
        if (tarroG.getContadorGalletas()>=numGalletas) {
            tarroG.comeGalleta(numGalletas);
            int tiempo=rnd.nextInt(5);
            try {
                Thread.sleep(tiempo*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        return null;
    }
}
