package com.example.android.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Instantiate some dummy data
        List<String> dummyForecasts = new ArrayList<>();
        dummyForecasts.add("Today - Overcast - 19/11");
        dummyForecasts.add("Tomorrow - Overcast - 18/10");
        dummyForecasts.add("Wednesday - Rain - 16/9");
        dummyForecasts.add("Thursday - Overcast - 20/10");
        dummyForecasts.add("Friday - Partly Cloudy - 21/11");
        dummyForecasts.add("Saturday - Partly Cloudy - 21/11");
        dummyForecasts.add("Sunday - Partly Cloudy - 21/11");
        dummyForecasts.add("Monday - Partly Cloudy - 21/11");
        dummyForecasts.add("Tuesday - Partly Cloudy - 21/11");
        dummyForecasts.add("Wednesday - Partly Cloudy - 21/11");
        dummyForecasts.add("Thursday - Partly Cloudy - 21/11");

        // Create an adapter to populate the data
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                dummyForecasts
        );

        // Retrieve our view
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        // Find the list view which will hold the data
        ListView forecastListView = (ListView) rootView.findViewById(R.id.listview_forecast);
        forecastListView.setAdapter(adapter);

        return rootView;
    }
}
