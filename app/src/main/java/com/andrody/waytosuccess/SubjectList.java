package com.andrody.waytosuccess;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ListView;

import java.util.ArrayList;

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

public class SubjectList extends AppCompatActivity {

    ListView listView ;
    ArrayList<Data> arraylist = new ArrayList<>();
    ListAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout);

        listView = (ListView) findViewById(R.id.listviewid);

        String[] AndRody_Subject = {getString(R.string.TEXT1),getString(R.string.TEXT2),getString(R.string.TEXT3)};
        Integer[] AndRody_Part = {R.string.TEXT11,R.string.TEXT22,R.string.TEXT33};
        Integer[] AndRody_Text = {R.string.TEXT111,R.string.TEXT222,R.string.TEXT333};

        for (int i = 0; i < AndRody_Subject.length; i++) {
            Data abboudi = new Data(AndRody_Subject[i], AndRody_Part[i], AndRody_Text[i]);
            arraylist.add(abboudi);
        }
        adapter = new ListAdapter(this, arraylist);

        listView.setAdapter(adapter);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the options menu from XML
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_serch, menu);
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();

        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));

        SearchView.OnQueryTextListener textChangeListener = new SearchView.OnQueryTextListener()
        {
            @Override
            public boolean onQueryTextChange(String newText)
            {
                adapter.filter(newText);

                return true;
            }
            @Override
            public boolean onQueryTextSubmit(String query)
            {
                adapter.filter(query);

                return true;
            }
        };
        searchView.setOnQueryTextListener(textChangeListener);

        return super.onCreateOptionsMenu(menu);
    }
}
