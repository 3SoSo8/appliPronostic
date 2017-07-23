package com.example.admin.pronostiquesentreamis;

import android.view.View.OnClickListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RelativeLayout layout = null;
    TextView text = null;
    private Button valider = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String applicationName = getResources().getString(R.string.app_name);
        // Au lieu d'afficher "My Application" on va afficher "My way !"
        applicationName = applicationName.replace("Pronostiques entre amis", "Bienvenue dans la future application de pronostiques !");

        layout = (RelativeLayout) RelativeLayout.inflate(this, R.layout.activity_main, null);

        text = (TextView) layout.findViewById(R.id.text);
        setContentView(layout);
        valider = (Button) findViewById(R.id.button);

        final EditText login = (EditText) findViewById(R.id.login);
        valider.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                final String loginTxt = login.getText().toString();
                Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
                Matcher m = p.matcher(loginTxt);
                if (!m.matches()) {
                    // Toast est une classe fournie par le SDK Android
                    // pour afficher les messages (indications) à l'intention de
                    // l'utilisateur. Ces messages ne possédent pas d'interaction avec l'utilisateur
                    // Le premier argument représente le contexte, puis
                    // le message et à la fin la durée d'affichage du Toast (constante
                    // LENGTH_SHORT ou LENGTH_LONG). Sans oublier d'appeler la méthode
                    //show pour afficher le Toast
                    Toast.makeText(MainActivity.this, R.string.email_format_error,
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent intent = new Intent(MainActivity.this, UserProfilActivity.class);
                startActivity(intent);
            }
        });
    }
}