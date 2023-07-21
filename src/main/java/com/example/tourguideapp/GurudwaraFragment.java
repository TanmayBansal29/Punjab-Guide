package com.example.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class GurudwaraFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container,false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Harmandir Sahib Gurudwara","It is known as the holiest Sikh Gurudwara in the world and its upper floor is covered with gold. The golden temple history in Punjabi culture is one that makes the place even more popular. Guru Ram Das, the fourth Sikh Guru founded the Gurudwara in 1574.","Golden Temple Rd, Atta Mandi, Katra Ahluwalia, Amritsar, Punjab ","Open 24 Hours",R.drawable.icon));
        places.add(new Place("Akal Takht","The Akal Takht is one of the five takhts or seats of power of the Sikh religion. It was built by the sixth Sikh Guru, Guru Hargobind and is located within the complex of Harmandir Sahib Gurdwara. It was built as a place of justice and consideration of temporal issues. The present structure is a five-storey building with marble inlay and a gold-leafed dome."," Golden Temple Rd, Atta Mandi, Katra Ahluwalia, Amritsar, Amritsar Cantt., Punjab","Monday-Sunday: 2:30AM to 10PM",R.drawable.icon));
        places.add(new Place("Gurdwara Manji Sahib"," Guru Gobin Singh, the tenth Guru of the Sikhs is said to have shot an arrow into the ground on reaching Alamgir where a spring appeared, now known as Tirsar. He is also said to have been presented a horse by a devoted follower here.","Alamgir Rd, Ludhiana, Punjab","Monday-Sunday: 12:30AM to 9PM",R.drawable.icon));
        places.add(new Place("Gurdwara Fatehgarh Sahib","A Sikh Gurdwara or place of worship in the city of Fatehgarh Sahib has situated the Gurdwara Fatehgarh Sahib which was constructed in 1710 by the Sikhs under the leadership of Banda Bahadur. In the main complex of the gurdwara, many other gurdwaras are present such as Bhora Sahib, Burj Mata Gujri, Shahid Ganj and a big hall named Todar Mal Jain Hall along with a sacred pool or Sarovar","Ropar Railway Crossing, to, Bhatti Rd - Fly Over Bypass, Bank colony, Sirhind, Punjab","Monday-Sunday:3AM to 11PM",R.drawable.icon));
        places.add(new Place("Gurdwara Sri Tarn Taran Sahib","ITC Maurya, Sardar Patel Marg, Akhaura Block, Diplomatic Enclave, Chanakyapuri","12:30 - 2:45 PM & 7:00 PM - 11:45 PM","https://res.cloudinary.com/purnesh/image/upload/w_1000,f_auto,q_auto:eco,c_limit/bukhara1574317623090.jpg",R.drawable.icon));



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
