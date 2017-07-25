package com.example.juman.androidparcelableintent.slider;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Juman on 7/26/2017.
 */

public class SliderDataModel implements Parcelable {

    private int image;

    public  SliderDataModel(){

    }

    public SliderDataModel(Parcel in) {
        image = in.readInt();
    }

    public static final Creator<SliderDataModel> CREATOR = new Creator<SliderDataModel>() {
        @Override
        public SliderDataModel createFromParcel(Parcel in) {
            return new SliderDataModel(in);
        }

        @Override
        public SliderDataModel[] newArray(int size) {
            return new SliderDataModel[size];
        }
    };

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(image);
    }
}
