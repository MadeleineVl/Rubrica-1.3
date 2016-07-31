package com.facci.restaurantemv;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivityMV extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_mv);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void clickuno(View M) {
        Toast.makeText(MainActivityMV.this, "bandeja de mariscos", Toast.LENGTH_LONG).show();
    }

    public void clickdos(View M) {
        Toast.makeText(MainActivityMV.this, "Caldo de Gallina", Toast.LENGTH_LONG).show();
    }

    public void clicktres(View M) {
        Toast.makeText(MainActivityMV.this, "Ceviche de Camaròn", Toast.LENGTH_LONG).show();
    }

    public void clickcuatro(View M) {
        Toast.makeText(MainActivityMV.this, "Corviche", Toast.LENGTH_LONG).show();
    }

    public void clickcinco(View M) {
        Toast.makeText(MainActivityMV.this, "Pescado frito", Toast.LENGTH_LONG).show();
    }

    public void clickseis(View M) {
        Toast.makeText(MainActivityMV.this, "Salprieta", Toast.LENGTH_LONG).show();
    }

    public void clicksiete(View M) {
        Toast.makeText(MainActivityMV.this, "arroz con mariscos", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "MainActivityMV Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.facci.restaurantemv/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "MainActivityMV Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.facci.restaurantemv/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
