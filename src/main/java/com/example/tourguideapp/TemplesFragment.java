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

public class TemplesFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container,false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Jayanti Devi Temple","It is dedicated to Jayanti Devi, the Goddess of victory. It is situated on a hillock on the Shivalik ranges. To reach the main premises of the temple, devotees have to climb a hundred easy steps from the huge gate at the base. ","Jayanti Majri village hillock, 15kms from Chandigarh","Monday-Sunday 5AM to 9PM", R.drawable.jayanti_devi_temple));
        places.add(new Place("Mata Mansa Devi Temple","The temple is spread across the foothills of the Shivalik range and is dedicated to Goddess Mansa Devi, another form of Shakti. This temple is known as one of the major Shakti temples of Northern India which widely attracts lakhs of devotees during the nine days of Navaratri.","Shivalik foothills in village Bilaspur, Tehsil and District Panchkula,","Summer:Monday-Sunday 4AM to 10PM\nWinter:Monday-Sunday 5AM to 9 PM",R.drawable.mansa_devi_temple));
        places.add(new Place("Durgiana Temple"," its architecture resembles the famous Golden temple. It is dedicated to Goddess Durga who is also the presiding deity along with Goddess Lakshmi and Vishnu. The original temple was constructed in the 16th century and rebuilt in 1921"," Hathi Gate, Goal Bagh, Amritsar, Punjab ","Monday-Sunday 6AM to 10PM",R.drawable.durgiana_temple));
        places.add(new Place("Mukteshwar Mahadev Temple","It is a Shiva temple which is a popular temple of the man-made cave complex. The temple is situated on the banks of the Ravi River. So its beauty and conversation is incredible. The idols of Ganesha, Brahma, Vishnu, Hanuman and Mata Parvati are enshrined in this temple. Mukteshwar Mahadev Temple is considered to be one of the most sacred places around Pathankot. This temple is a cave temple and these caves are about 5500 years old, built by the Pandavas.","Village Doongh, Dhar Kalan, Jugial, Shahpur Kandi, Pathankot Punjab","24 Hours Open",R.drawable.mukteshwar_mahadev_temple));
        places.add(new Place("Shri Kali Devi Temple"," It was built by the Maharaja of Patiala in 1936.[1] The Maharaja was inspired to build the temple and bring the six-foot-tall statues of Maa Kali and Paawan Jyot from Bengal to Patiala. Today, the temple is situated opposite the Baradari Gardens."," Manjit Nagar, Sidhu Colony, Patiala","Monday-Sunday 5AM to 9PM",R.drawable.kali_mata_madir));
        places.add(new Place("Shri Neelkanth Mahadev Mandir","It is believed to be the sacred place where Lord Shiva consumed the poison that came out during the Samudra Mathan, making his throat blue in the process. Today, Lord Shiva is also known as Neelakanth which means The Blue Throated One. It is one of the most historic temples in Ludhiana.","Aane Wali Street, Durgapuri, Ludhiana,Punjab","Monday-Sunday 7AM to 8:30PM",R.drawable.shiv_temple_no_photo));
        places.add(new Place("Sai Dham","Hambran Road, Partap Singhwala, Ludhiana, Punjab","Monday-Wednesday: 8:30AM to 12:30PM | 4:30PM to 8:30PM\nThrusday: 8:30AM - 8:30PM\nFriday: 8:30AM to 12:30PM | 4:30PM to 8:30PM\nSaturday-Sunday: 8:30AM - 8:30PM",R.drawable.sai_dham));
        places.add(new Place("Sankat Mochan Mahabali Hanuman Temple","This Hanuman Temple at Phillaur, Ludhiana in Punjab houses the tallest statue of Hanuman in the entirety of Asia (nearly 80ft tall). The basement of the same temple houses glass work of good quality done on the walls of the meditation room","Abad Pura, Phillaur, Punjab","Monday-Sunday: 6:30AM to 9PM",R.drawable.hanuman_mandir));
        places.add(new Place("Devi Talab Mandir","The temple is devoted to Goddess Durga and is visited by thousands of pilgrims every year. It is regarded as one of the 51 Shakti Pithas in India","Tanda Rd, Shiv Nagar, Industrial Area, Jalandhar, Punjab","Monday-Sunday: 5AM to 10PM",R.drawable.devi_talab_mandir));
        places.add(new Place("Mandir Shri Siddh Baba Sodal","Sodal Mandir was built in the memory of Baba Sodal. It is believed that Baba Sodal's mother accompanied him to a nearby pond, where he mischievously started throwing clay balls at her. She got irritated and cursed him. Thereafter, he not only made his mother repeat the curse but also jumped into the pond to obey her, and never returned.","Shiv Nagar, Industrial Area, Jalandhar, Punjab","Monday-Sunday 9AM to 9:30PM",R.drawable.sodal_temple));

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
