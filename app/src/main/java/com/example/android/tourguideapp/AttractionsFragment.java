/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(R.drawable.acropolis, R.string.attractions_acropolis_name, R.string.attractions_acropolis_location));
        locations.add(new Location(R.drawable.nam, R.string.attractions_nam_name, R.string.attractions_nam_location));
        locations.add(new Location(R.drawable.byzantinemuseum, R.string.attractions_byz_name, R.string.attractions_byz_location));
        locations.add(new Location(R.drawable.ancientagora, R.string.attractions_agora_name, R.string.attractions_agora_location));
        locations.add(new Location(R.drawable.holyapostles, R.string.attractions_apostles_name, R.string.attractions_apostles_location));
        locations.add(new Location(R.drawable.panagiakapnikarea, R.string.attractions_kapnikarea_name, R.string.attractions_kapnikarea_location));
        locations.add(new Location(R.drawable.zeus, R.string.attractions_zeus_name, R.string.attractions_zeus_location));
        locations.add(new Location(R.drawable.panathinaikostadio, R.string.attractions_panathenaic_name, R.string.attractions_panathenaic_location));
        locations.add(new Location(R.drawable.anafiotikaplaka, R.string.attractions_plaka_name, R.string.attractions_plaka_location));
        locations.add(new Location(R.drawable.changingguard, R.string.attractions_syntagma_name, R.string.attractions_syntagma_location));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
