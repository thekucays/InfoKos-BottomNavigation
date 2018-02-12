/*
 * Copyright (c) 2018. Truiton (http://www.truiton.com/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 * Mohit Gupt (https://github.com/mohitgupt)
 *
 */

package com.infokos.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.infokos.adapter.SearchKosAdapter;
import com.infokos.objects.SearchKosObject;
import com.truiton.bottomnavigation.R;

import java.util.ArrayList;

public class SearchResultKosActivity extends AppCompatActivity {

    private ListView listSearchKos;
    ArrayList<SearchKosObject> dataModels;
    private static SearchKosAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_kos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        listSearchKos = (ListView) findViewById(R.id.listSearchKos);

        // create dummy arraylist.. TODO replace with real data (refer to https://www.raywenderlich.com/124438/android-listview-tutorial)
        dataModels = new ArrayList<>();
        dataModels.add(new SearchKosObject(1, "judul1", "deskripsi1", "Rp 10.000"));
        dataModels.add(new SearchKosObject(2, "judul2", "deskripsi2", "Rp 20.000"));

        adapter = new SearchKosAdapter(dataModels, getApplicationContext());
        listSearchKos.setAdapter(adapter);

    }

}
