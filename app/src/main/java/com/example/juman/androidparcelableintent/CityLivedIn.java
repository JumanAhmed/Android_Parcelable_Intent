package com.example.juman.androidparcelableintent;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by Juman on 7/19/2017.
 */

public class CityLivedIn implements Parcelable{

    private String cityName;
    private Date date;

    public CityLivedIn() {
    }

    public CityLivedIn(Parcel parcel) {
        this.cityName = parcel.readString();
        this.date = new Date(parcel.readLong());
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
         parcel.writeString(this.cityName);
         parcel.writeLong(this.date.getTime());
    }

    public static final Creator<CityLivedIn> CREATOR = new Creator<CityLivedIn>() {
        @Override
        public CityLivedIn createFromParcel(Parcel parcel) {
            return new CityLivedIn(parcel);
        }

        @Override
        public CityLivedIn[] newArray(int i) {
            return new CityLivedIn[i];
        }
    };
}
