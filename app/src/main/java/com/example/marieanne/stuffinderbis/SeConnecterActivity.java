package com.example.marieanne.stuffinderbis;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;


public class SeConnecterActivity extends Activity {

    EditText editTextIdentifiant;
    EditText editTextMdp;



    public void retourAccueil ( View view) {
        Intent intentRetour = new Intent ( SeConnecterActivity.this, Accueil.class);
        startActivity(intentRetour);
    }



   public void connexion (View view) {

       RequestParams params = new RequestParams();
       String mdp = editTextIdentifiant.getText().toString();
       String identifiant = editTextIdentifiant.getText().toString();

       if ( identifiant != null && mdp != null ) {

       }


   }




  public void goToHome() {
      Intent intentGoToHome = new Intent( SeConnecterActivity.this, HomeActivity.class);
      startActivity(intentGoToHome);
      }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_se_connecter);

        editTextIdentifiant = (EditText)findViewById(R.id.editTextIdentifiant1);
        editTextMdp = (EditText)findViewById(R.id.editTextMdP1);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_se_connecter, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
