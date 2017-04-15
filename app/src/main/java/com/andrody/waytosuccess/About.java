package com.andrody.waytosuccess;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Abboudi_Aliwi on 15.04.2017.
 * Website : http://andrody.com/
 * our channel on YouTube : https://www.youtube.com/c/Andrody2015
 * our page on Facebook : https://www.facebook.com/andrody2015/
 * our group on Facebook : https://www.facebook.com/groups/Programming.Android.apps/
 * our group on Whatsapp : https://chat.whatsapp.com/56JaImwTTMnCbQL6raHh7A
 * our group on Telegram : https://t.me/joinchat/AAAAAAm387zgezDhwkbuOA
 * Playlist to build this application : https://www.youtube.com/playlist?list=PLNivoV2e4nZWDf3CsL4go0_7sTHqhgmWA
 * Preview the app from Google play : https://play.google.com/store/apps/details?id=com.andrody.waytosuccess
 */

public class About extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        //TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

    }

    public void onClick1(View v){
        switch (v.getId()){

            case R.id.but1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:"+getString(R.string.developer_email)+"?subjrct="+getString(R.string.app_name))));
                break;
            case R.id.but2:
                String developerName = getString(R.string.developer_name);
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q="+developerName)));
                } catch (android.content.ActivityNotFoundException anfe) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/search?q="+developerName)));
                }
                break;
            case R.id.but3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.website))));
                break;
        }
    }
}
