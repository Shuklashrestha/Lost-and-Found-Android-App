package com.example.merosaaman;

public class lostSomethingData {
    String lostid;
    String lmain_category;
    String lsub_category;
    String litem_color;
    int day,month,year;
    String llatititude,llongnitude;
    String lreward_point;
    String username,useremail,userphone,useraddress;
    Double dlat,dlong;

    public lostSomethingData(){}

    public lostSomethingData(String lostid, String lmain_category, String lsub_category, String litem_color, int day, int month, int year, String llatititude, String llongnitude, String lreward_point, String username, String useremail, String userphone, String useraddress, Double dlat, Double dlong) {
        this.lostid = lostid;
        this.lmain_category = lmain_category;
        this.lsub_category = lsub_category;
        this.litem_color = litem_color;
        this.day = day;
        this.month = month;
        this.year = year;
        this.llatititude = llatititude;
        this.llongnitude = llongnitude;
        this.lreward_point = lreward_point;
        this.username = username;
        this.useremail = useremail;
        this.userphone = userphone;
        this.useraddress = useraddress;
        this.dlat = dlat;
        this.dlong = dlong;
    }

    public String getLostid() {
        return lostid;
    }

    public String getLmain_category() {
        return lmain_category;
    }

    public String getLsub_category() {
        return lsub_category;
    }

    public String getLitem_color() {
        return litem_color;
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

    public String getLlatititude() {
        return llatititude;
    }

    public String getLlongnitude() {
        return llongnitude;
    }

    public String getLreward_point() {
        return lreward_point;
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
