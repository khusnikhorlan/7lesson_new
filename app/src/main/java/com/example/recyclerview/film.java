package com.example.recyclerview;

public class film {
    String photo;
    String name;
    String year;


    public film(String photo,String name, String year ){
        this.photo = photo;
        this.name = name;
        this.year = year;

    }
    public String getPhoto(){
        return photo;
    }

    public String getName(){
        return name;
    }

    public String getYear(){
        return year;
    }




}
