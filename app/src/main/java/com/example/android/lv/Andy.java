package com.example.android.lv;

public class Andy
{
    private String Name;
    private String Version;

    public Andy(String name,String version){
        this.Name=name;
        this.Version=version;
    }

    public String getName(){
        return Name;
    }

    public String getVersion() {
        return Version;
    }
}
