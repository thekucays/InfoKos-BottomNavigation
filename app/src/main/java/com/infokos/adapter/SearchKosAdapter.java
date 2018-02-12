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

package com.infokos.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.os.Bundle;
import android.widget.TextView;

import com.infokos.activity.DetailKosActivity;
import com.infokos.activity.SearchResultKosActivity;
import com.infokos.objects.SearchKosObject;
import com.truiton.bottomnavigation.R;

import java.util.ArrayList;

/**
 * Created by Luki R on 2/11/2018.
 * https://www.journaldev.com/10416/android-listview-with-custom-adapter-example-tutorial
 */

public class SearchKosAdapter extends ArrayAdapter<SearchKosObject> implements View.OnClickListener{

    private ArrayList<SearchKosObject> dataSet;
    Context mContext;

    // view lookup cache
    private static class ViewHolder{
        TextView textJudul;
        TextView textDeskripsi;
        TextView textHarga;
    }

    public SearchKosAdapter(ArrayList<SearchKosObject> data, Context context) {
        super(context, R.layout.row_searchkos, data);
        this.dataSet = data;
        this.mContext = context;
    }

    @Override
    public void onClick(View v) {
        int position=(Integer) v.getTag();
        Object object= getItem(position);

        SearchKosObject dataModel=(SearchKosObject) object;
        switch (v.getId()) {
            case R.id.textJudul:
                Intent intent = new Intent(getContext(), DetailKosActivity.class);
                intent.putExtra("idKos", dataModel.getIdKos());
                mContext.startActivity(intent);
                break;
        }
    }

    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SearchKosObject dataModel = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag


        final View result;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_searchkos, parent, false);

            viewHolder.textJudul = (TextView)  convertView.findViewById(R.id.textJudul);
            viewHolder.textDeskripsi = (TextView)  convertView.findViewById(R.id.textDeskripsi);
            viewHolder.textHarga = (TextView)  convertView.findViewById(R.id.textHarga);

            result=convertView;
        } else{
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }

        lastPosition = position;
//        viewHolder.textJudul.setText(dataModel.getJudul());
//        viewHolder.textDeskripsi.setText(dataModel.getDeskripsi());
//        viewHolder.textHarga.setText(dataModel.getHarga());

        return convertView;
    }
}
