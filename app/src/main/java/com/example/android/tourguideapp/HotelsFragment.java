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

public class HotelsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(R.drawable.amalia, R.string.hotels_amalia_name, R.string.hotels_amalia_location));
        locations.add(new Location(R.drawable.plakahotel, R.string.hotels_plaka_name, R.string.hotels_plaka_location));
        locations.add(new Location(R.drawable.airotel, R.string.hotels_airotel_name, R.string.hotels_airotel_location));
        locations.add(new Location(R.drawable.attalos, R.string.hotels_attalos_name, R.string.hotels_attalos_location));
        locations.add(new Location(R.drawable.herodion, R.string.hotels_herodion_name, R.string.hotels_herodion_location));
        locations.add(new Location(R.drawable.melia, R.string.hotels_melia_name, R.string.hotels_melia_location));
        locations.add(new Location(R.drawable.electra, R.string.hotels_electra_name, R.string.hotels_electra_location));
        locations.add(new Location(R.drawable.theathensgatehotel, R.string.hotels_gate_name, R.string.hotels_gate_location));
        locations.add(new Location(R.drawable.presidenthotel, R.string.hotels_president_name, R.string.hotels_president_location));
        locations.add(new Location(R.drawable.royal, R.string.hotels_royal_name, R.string.hotels_royal_location));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
