package com.example.merosaaman;

public class foundSomethingData {
    String foundid;
    String fmain_category;
    String fsub_category;
    String fitem_color;
    int day,month,year;
    String flatititude,flongnitude;
    String fquestion;
    String username,useremail,userphone,useraddress;
    Double dlat,dlong;

    public foundSomethingData(){}

    public foundSomethingData(String foundid, String fmain_category, String fsub_category, String fitem_color, int day, int month, int year, String flatititude, String flongnitude, String fquestion, String username, String useremail, String userphone, String useraddress, Double dlat, Double dlong) {
        this.foundid = foundid;
        this.fmain_category = fmain_category;
        this.fsub_category = fsub_category;
        this.fitem_color = fitem_color;
        this.day = day;
        this.month = month;
        this.year = year;
        this.flatititude = flatititude;
        this.flongnitude = flongnitude;
        this.fquestion = fquestion;
        this.username = username;
        this.useremail = useremail;
        this.userphone = userphone;
        this.useraddress = useraddress;
        this.dlat = dlat;
        this.dlong = dlong;
    }

    public String getFoundid() {
        return foundid;
    }

    public String getFmain_category() {
        return fmain_category;
    }

    public String getFsub_category() {
        return fsub_category;
    }

    public String getFitem_color() {
        return fitem_color;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getFlatititude() {
        return flatititude;
    }

    public String getFlongnitude() {
        return flongnitude;
    }

    public String getFquestion() {
        return fquestion;
    }

    public String getUsername() {
        return username;
    }

    public String getUseremail() {
        return useremail;
    }

    public String getUserphone() {
        return userphone;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public Double getDlat() {
        return dlat;
    }

    public Double getDlong() {
        return dlong;
    }
}
