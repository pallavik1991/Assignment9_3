package com.example.vaio.assignment9_3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import android.widget.ArrayAdapter;


/**
 * Created by Vaio on 24-02-2018.
 */

public class CustomList extends ArrayAdapter {

    private final Activity context;
    private final String[] name;
    private final String[] phone;
    public CustomList(Activity context,
                      String[] name, String[] phone) {
        super(context, R.layout.custom_list, phone);
        this.context = context;
        this.name = name;
        this.phone = phone;
    }

        @Override
        public View getView(int position, View view, ViewGroup parent) {
            LayoutInflater inflater = context.getLayoutInflater();
            View rowView= inflater.inflate(R.layout.custom_list, null, true);
            TextView txtname = (TextView) rowView.findViewById(R.id.name);

            TextView txtphone = (TextView) rowView.findViewById(R.id.phone);
            txtname.setText(name[position]);
            txtphone.setText(phone[position]);

            return rowView;
        }
    }
