package com.example.admin.pronostiquesentreamis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Salim on 02/03/2017.
 */


public class UserProfilActivity extends AppCompatActivity {

    private Button deconnexion = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile);

        /*
        deconnexion = (Button) findViewById(R.id.button);

        deconnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //UserProfilActivity.this.finish();
            }
        });
*/
    }
}
