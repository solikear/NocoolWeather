package com.deer404.nocoolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Deer404 on 2018/12/28
 */
public class Basic {
    @SerializedName("cid")
    public String weatherid;
    @SerializedName("location")
    public  String location;
}
