/*******************************************************************************
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 ******************************************************************************/
package com.hybris.mobile.app.commerce.activity;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;

import com.hybris.mobile.app.commerce.R;
import com.hybris.mobile.app.commerce.utils.HockeyAppUtils;


/**
 * Landing page after Successful authenticate
 */
public class DashboardActivity extends MainActivity {
private  ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_dashboard);
        super.onCreate(savedInstanceState);
        img = (ImageView) findViewById(R.id.hc);

        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, CatalogActivity.class);
                startActivity(intent);
            }
        });
        // Check for updates on HockeyApp
        HockeyAppUtils.checkForUpdates(this);

        // Open the main menu by default
        setOpenMainMenuByDefault(true);



     //=====================================================================
      //  WebView webview = (WebView) findViewById(R.id.webView1);
        String content = "<html>"
                + "  <head>"
                + "    <script type=\"text/javascript\" src=\"jsapi.js\"></script>"
                + "    <script type=\"text/javascript\">"
                + "      google.load(\"visualization\", \"1\", {packages:[\"corechart\"]});"
                + "      google.setOnLoadCallback(drawChart);"
                + "      function drawChart() {"
                + "        var data = google.visualization.arrayToDataTable(["
                + "          ['Year', 'Sales', 'Expenses'],"
                + "          ['2010',  1000,      400],"
                + "          ['2011',  1170,      460],"
                + "          ['2012',  660,       1120],"
                + "          ['2013',  1030,      540]"
                + "        ]);"
                + "        var options = {"
                + "          title: 'Truiton Performance',"
                + "          hAxis: {title: 'Year', titleTextStyle: {color: 'red'}}"
                + "        };"
                + "        var chart = new google.visualization.ColumnChart(document.getElementById('chart_div'));"
                + "        chart.draw(data, options);"
                + "      }"
                + "    </script>"
                + "  </head>"
                + "  <body>"
                + "    <div id=\"chart_div\" style=\"width: 1000px; height: 500px;\"></div>"
                + "    <img style=\"padding: 0; margin: 0 0 0 330px; display: block;\" src=\"truiton.png\"/>"
                + "  </body>" + "</html>";
        String url =  "http://chart.apis.google.com/chart?cht=p3&chs=600x300&chd=e:TNTNTNGa&chts=000000,\n" +
                "16&chtt=ORDER+PER+DAY&chl=17FEB|18FEB|19FEB|23FEB&chco=FF5533,237745,9011D3,335423&chdl=17FEB|18FEB|19FEB|23FEB";
       // WebSettings webSettings = webview.getSettings();
        //webSettings.setJavaScriptEnabled(true);
        //webview.requestFocusFromTouch();
       // webview.loadDataWithBaseURL( "file:///android_asset/", content, "text/html", "utf-8", null );
       // webview.loadUrl(url); // Can be used in this way too.
    }

        //==================================================================================================================



    @Override
    protected void onResume() {
        super.onResume();

        // Disable the main menu opening in case of resuming
        setOpenMainMenuByDefault(false);
    }
}
