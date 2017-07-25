package com.example.juman.androidparcelableintent.slider;

import com.example.juman.androidparcelableintent.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Juman on 7/26/2017.
 */

public class DataHotels {
    public static List<HotelDataModel> getAllHotelData(){

        List<HotelDataModel>  hotelItems = new ArrayList<>();


        String[] name ={"Rose View Hotel","Hotel Star Pacific","Nirvana Inn","Hotel Supreme","Hotel Garden Inn",
                "Richmond Hotel & Apartments","Hotel Holy Gate","Holy Complex","Hotel Noorjahan Grand",
                "La Rose Hotel"};

        String[] location={"yes","yes","yes","yes","yes","yes","yes","yes","yes","yes"};

        String[] address ={"Shahjalal Uposhohor, Sylhet","East Dorga Gate, Sylhet","Mirzajangal, Sylhet",
                "East Mirabazar, Sylhet","Garden Tower, Shahjalal Bridge Link Road, Sylhet",
                "10th Floor, Al Hamra Shopping City, Zindabazar, Sylhet","East Dargah Gate, Sylhet",
                "Waves 1, Ritz Tower, Dargah Gate, Sylhet","16 Ornob, West Dorga Gate, Mirer Moidan Point, Sylhet",
                "B-95 Waves, Shahjalal Road, Ambarkhana Sylhet"};

        String[] contact = {"+880821-721835","+880821-727945","+880821-727640","+880821-710897","+880821-727284",
                "+880821-719076","+8801972-552233","+8801930-111666","+8801966-616661","+880821-711013"};

        int[] imageLogo={R.drawable.rose_view,R.drawable.star_pacific,R.drawable.nirvana_inn_hotel,
                R.drawable.hotel_supreme,R.drawable.hotel_garden_inn,R.drawable.richmond_hotel,
                R.drawable.hotel_holy_gate,R.drawable.hotel_noorjahan_grand,R.drawable.la_rose_hotel,
                R.drawable.britania_hotel};

        String[] email={"yes","yes","yes","yes","yes","yes","yes","yes","yes","yes"};

        int[] slideImage1 = {R.drawable.panthumai_01,R.drawable.bholagonj_01,R.drawable.bisanakandi_01,
                R.drawable.bisanakandi_01,R.drawable.bisanakandi_01,R.drawable.panthumai_01,
                R.drawable.bisanakandi_01,R.drawable.bisanakandi_01,R.drawable.panthumai_01,
                R.drawable.bisanakandi_01};
        int[] slideImage2 = {R.drawable.panthumai_01,R.drawable.bholagonj_01,R.drawable.bisanakandi_01,
                R.drawable.bisanakandi_01,R.drawable.bisanakandi_01,R.drawable.panthumai_01,
                R.drawable.bisanakandi_01,R.drawable.bisanakandi_01,R.drawable.panthumai_01,
                R.drawable.bisanakandi_01};
        int[] slideImage3 = {R.drawable.panthumai_01,R.drawable.bholagonj_01,R.drawable.bisanakandi_01,
                R.drawable.bisanakandi_01,R.drawable.bisanakandi_01,R.drawable.panthumai_01,
                R.drawable.bisanakandi_01,R.drawable.bisanakandi_01,R.drawable.panthumai_01,
                R.drawable.bisanakandi_01};



        for (int i =0; i<name.length; i++){
            HotelDataModel item = new HotelDataModel();

            item.setName(name[i]);
            item.setLocation(location[i]);
            item.setAddress(address[i]);
            item.setContact(contact[i]);
            item.setImageLogo(imageLogo[i]);
            item.setEmail(email[i]);

            List<SliderDataModel> sliders = new ArrayList<>();
            for (int j=i; j<i+1; j++){
                SliderDataModel sliderItem = new SliderDataModel();

                sliderItem.setImage(slideImage1[j]);
                sliderItem.setImage(slideImage2[j]);
                sliderItem.setImage(slideImage3[j]);

                sliders.add(sliderItem);
            }
            item.setSliderImages(sliders);

            hotelItems.add(item);

        }


        return  hotelItems;
    }
}
