package com.andrody.waytosuccess;

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

public class Data {
    String subject1;
    private Integer part1,text1;

    public Data(String tt1, Integer tt2, Integer tt3) {
        this.subject1 = tt1;
        this.part1 = tt2;
        this.text1 = tt3;
    }


    public String getSubject1() {
        return this.subject1;
    }

    public Integer getPart1() {
        return this.part1;
    }

    public Integer getText1() {
        return this.text1;
    }
}