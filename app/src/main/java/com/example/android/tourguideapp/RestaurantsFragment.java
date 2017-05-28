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

public class RestaurantsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(R.drawable.hytra, R.string.restaurants_hytra_name, R.string.restaurants_hytra_location));
        locations.add(new Location(R.drawable.cookoovaya, R.string.restaurants_cookoovaya_name, R.string.restaurants_cookoovaya_location));
        locations.add(new Location(R.drawable.vezene, R.string.restaurants_vezene_name, R.string.restaurants_vezene_location));
        locations.add(new Location(R.drawable.spondi, R.string.restaurants_spondi_name, R.string.restaurants_spondi_location));
        locations.add(new Location(R.drawable.stinkingbishop, R.string.restaurants_bishop_name, R.string.restaurants_bishop_location));
        locations.add(new Location(R.drawable.aleria, R.string.restaurants_aleria_name, R.string.restaurants_aleria_location));
        locations.add(new Location(R.drawable.fuga, R.string.restaurants_fuga_name, R.string.restaurants_fuga_location));
        locations.add(new Location(R.drawable.urbangarden, R.string.restaurants_urban_name, R.string.restaurants_urban_location));
        locations.add(new Location(R.drawable.scalavinoteca, R.string.restaurants_scala_name, R.string.restaurants_scala_location));
        locations.add(new Location(R.drawable.ctc, R.string.restaurants_ctc_name, R.string.restaurants_ctc_location));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
