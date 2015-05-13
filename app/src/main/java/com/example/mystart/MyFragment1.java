package com.example.mystart;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;
import android.content.Context;
import android.os.Build;
import android.view.Gravity;
import android.support.v4.widget.DrawerLayout;
import android.widget.ArrayAdapter;
import android.widget.Toast;


public class MyFragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1,  container, false);
        TextView mytext_01 = (TextView) view.findViewById(R.id.text_01t);
        mytext_01.setText(Html.fromHtml(getString(R.string.text_01)));
        TextView mytext_02 = (TextView) view.findViewById(R.id.text_02t);
        mytext_02.setText(Html.fromHtml(getString(R.string.text_02)));
        TextView mytext_03 = (TextView) view.findViewById(R.id.text_03t);
        mytext_03.setText(Html.fromHtml(getString(R.string.text_03)));
        TextView mytext_04 = (TextView) view.findViewById(R.id.text_04t);
        mytext_04.setText(Html.fromHtml(getString(R.string.text_04)));
        TextView mytext_05 = (TextView) view.findViewById(R.id.text_05t);
        mytext_05.setText(Html.fromHtml(getString(R.string.text_05)));
        TextView mytext_06 = (TextView) view.findViewById(R.id.text_06t);
        mytext_06.setText(Html.fromHtml(getString(R.string.text_06)));
        TextView mytext_07 = (TextView) view.findViewById(R.id.text_07t);
        mytext_07.setText(Html.fromHtml(getString(R.string.text_07)));
        TextView mytext_08 = (TextView) view.findViewById(R.id.text_08t);
        mytext_08.setText(Html.fromHtml(getString(R.string.text_08)));
        ImageView cat = (ImageView) view.findViewById(R.id.imagesearchkvart);
        cat.setImageDrawable(getResources().getDrawable(R.drawable.o_0b8bb2));
        TextView mytext_09 = (TextView) view.findViewById(R.id.text_09t);
        mytext_09.setText(Html.fromHtml(getString(R.string.text_09)));
        return view;
    }
}