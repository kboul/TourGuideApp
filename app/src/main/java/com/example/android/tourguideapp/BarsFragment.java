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

/**
 * Fragment that displays "Monday".
 */
public class BarsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(
                R.drawable.galaxybar,
                R.string.bars_galaxy_name,
                R.string.bars_galaxy_location)
        );
        locations.add(new Location(R.drawable.babaauraum, R.string.bars_baba_name, R.string.bars_baba_location));
        locations.add(new Location(R.drawable.jingoint, R.string.bars_jingoint_name, R.string.bars_jingoint_location));
        locations.add(new Location(R.drawable.fortytwobar, R.string.bars_42bar_name, R.string.bars_42bar_location));
        locations.add(new Location(R.drawable.jazzinjazz, R.string.bars_jazzinjazz_name, R.string.bars_jazzinjazz_location));
        locations.add(new Location(R.drawable.lowprofile, R.string.bars_lowprofile_name, R.string.bars_lowprofile_location));
        locations.add(new Location(R.drawable.ippopotamos, R.string.bars_ippopotamos_name, R.string.bars_ippopotamos_location));
        locations.add(new Location(R.drawable.noel, R.string.bars_noel_name, R.string.bars_noel_location));
        locations.add(new Location(R.drawable.theunderdog, R.string.bars_theunderdog_name, R.string.bars_theunderdog_location));
        locations.add(new Location(R.drawable.rockandballs, R.string.bars_rockandballs_name, R.string.bars_rockandballs_location));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
