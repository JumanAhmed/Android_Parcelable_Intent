package com.example.juman.androidparcelableintent.slider;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by Juman on 7/26/2017.
 */

public class HotelDataModel implements Parcelable{

    private String name;
    private String location;
    private String address;
    private String contact;
    private int imageLogo;
    private String email;
    private List<SliderDataModel> sliderImages;

    public HotelDataModel(){

    }

    public HotelDataModel(Parcel in) {
        name = in.readString();
        location = in.readString();
        address = in.readString();
        contact = in.readString();
        imageLogo = in.readInt();
        email = in.readString();
        sliderImages = in.createTypedArrayList(SliderDataModel.CREATOR);
    }

    public static final Creator<HotelDataModel> CREATOR = new Creator<HotelDataModel>() {
        @Override
        public HotelDataModel createFromParcel(Parcel in) {
            return new HotelDataModel(in);
        }

        @Override
        public HotelDataModel[] newArray(int size) {
            return new HotelDataModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(location);
        parcel.writeString(address);
        parcel.writeString(contact);
        parcel.writeInt(imageLogo);
        parcel.writeString(email);
        parcel.writeTypedList(sliderImages);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getImageLogo() {
        return imageLogo;
    }

    public void setImageLogo(int imageLogo) {
        this.imageLogo = imageLogo;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<SliderDataModel> getSliderImages() {
        return sliderImages;
    }

    public void setSliderImages(List<SliderDataModel> sliderImages) {
        this.sliderImages = sliderImages;
    }
}
