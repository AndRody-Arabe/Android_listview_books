package com.andrody.waytosuccess;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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

public class ListAdapter extends BaseAdapter {

    LayoutInflater inflater;
    private List<Data> Datalist = null;
    private ArrayList<Data> arraylist;
    Context context;

    public ListAdapter(Activity context, List<Data> openSite) {
        this.context=context;
        this.Datalist = openSite;
        inflater = LayoutInflater.from(context);
        this.arraylist = new ArrayList<>();
        this.arraylist.addAll(openSite);

    }

    @Override
    public int getCount() {
        return Datalist.size();
    }

    @Override
    public Object getItem(int position) {
        return Datalist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, View view, ViewGroup parent) {
        View Item =inflater.inflate(R.layout.listview_item, null,true);

        TextView txtTitle = (TextView) Item.findViewById(R.id.titleid);
        TextView txtPart = (TextView) Item.findViewById(R.id.partid);

        txtTitle.setText(Datalist.get(position).getSubject1());
        txtPart.setText(Datalist.get(position).getPart1());

        Item.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(context,Singleitem.class);
                i.putExtra("subjectt",Datalist.get(position).getSubject1());
                i.putExtra("textt",Datalist.get(position).getText1());
                context.startActivity(i);
            }
        });

        return Item;



    };

    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        Datalist.clear();
        if (charText.length() == 0) {
            Datalist.addAll(arraylist);
        }
        else
        {
            for (Data wp : arraylist)
            {
                if (wp.getSubject1().toLowerCase(Locale.getDefault()).contains(charText))
                {
                    Datalist.add(wp);
                }
            }
        }
        notifyDataSetChanged();
    }
}
