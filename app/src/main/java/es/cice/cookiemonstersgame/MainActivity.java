package es.cice.cookiemonstersgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar pBar1;
    private ProgressBar pBar2;
    private ProgressBar pBar3;
    private Button btnStartOven;
    private ovenAsyntask ovenAsyn;
    private monsterAsyntask monster1Asyn;
    private monsterAsyntask monster2Asyn;
    private tarroGalletas tarroG;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ovenAsyn = new ovenAsyntask();
        monster1Asyn=new monsterAsyntask();
        monster2Asyn=new monsterAsyntask();


        tarroG =tarroGalletas.getInstance();

        pBar1 = (ProgressBar) findViewById(R.id.pBar1);
        pBar2 = (ProgressBar) findViewById(R.id.pBar2);
        pBar3 = (ProgressBar) findViewById(R.id.pBar3);

        btnStartOven=(Button) findViewById(R.id.btnStartOven);
        btnStartOven.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                lanzarOven();
                lanzarMonsters();
            }
        });


    }
    public void lanzarOven(){
        ovenAsyn.execute(5000);

    }
    public void lanzarMonsters(){
        monster1Asyn.execute();
        monster2Asyn.execute();
    }
}
