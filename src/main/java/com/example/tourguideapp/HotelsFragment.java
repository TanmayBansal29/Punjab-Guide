package com.example.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container,false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("The Oberoi Sukhvilas Spa Resort, New Chandigarh","Pallanpur P.O, Sialba Majri Rd, New Chandigarh, Punjab","Check-in time: 11:00\nCheck-out time: 16:00",R.drawable.icon));
        places.add(new Place("The Cabbana Resort and Spa","NH-1, Highway, Phagwara, Punjab","Check-in time: 14:00\nCheck-out time: 12:00",R.drawable.icon));
        places.add(new Place("Radisson Jalandhar","Gt Road, BMC Chowk, Sehdev Market, Jalandhar, Punjab","Check-in time: 12:00\n Check-out time: 12:00",R.drawable.icon));
        places.add(new Place("Welcom Hotel By ITC Hotels ","Raja Sansi, Ajnala Rd, Amritsar, Punjab","Check-in time: 15:00\nCheck-out time: 12:00",R.drawable.icon));
        places.add(new Place("Radisson Blu Hotel MBD","Mbd Neopolis, Ferozepur Rd, Near Octroi, Rajguru Nagar Extension, New Sunder Nagar, Ludhiana","Check-in time: 14:00\nCheck-out time: 12:00",R.drawable.icon));
        places.add(new Place("The LaLiT","IT Park Rd, Chandigarh", "Check-in time: 14:00\nCheck-out time: 12:00",R.drawable.icon));
        places.add(new Place("THE KIKAR LODGE","Village – Kangar, Nurpur Bedi, Punjab","Check-in time: 14:00\nCheck-out time: 12:00",R.drawable.icon));
        places.add(new Place("Courtyard by Marriott","52, Mall Rd, Krishna Nagar, Green Avenue, Amritsar, Punjab","Check-in time: 15:00\nCheck-out time: 12:00",R.drawable.icon));
        places.add(new Place("Radisson Blu Hotel","8th Mile Stone, Ajnala Rd, Punjab ","Check-in time: 14:00\nCheck-out time: 12:00",R.drawable.icon));
        places.add(new Place("Park Plaza","Ambala - Chandigarh, National Highway Distt, Zirakpur, Punjab", "Check-in time: 14:00\nCheck-out time: 12:00",R.drawable.icon));
        places.add(new Place("Radisson RED Hotel","Plot No 1, Phase 9, Industrial Area, Sector 66, Mohali, Chandigarh, Punjab","Check-in time: 14:00\nCheck-out time: 12:00",R.drawable.icon));
        places.add(new Place("Hyatt Regency","MBM Farms, Grand Trunk Rd, adjoining Mall Of Amritsar, Amritsar, Punjab","Check-in time: 14:00\nCheck-out time: 12:00",R.drawable.icon));



        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                Place currentPlace = adapter.getItem(position);
//
//                Uri heritagePlaceUri = Uri.parse(currentPlace.getPlaceUrl());
//
//                Intent websiteIntent = new Intent(Intent.ACTION_VIEW, heritagePlaceUri);
//
//                startActivity(websiteIntent);
//            }
//        });

        return rootView;
    }
}
