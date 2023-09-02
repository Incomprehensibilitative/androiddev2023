package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class WeatherAndForecastAdapter extends FragmentStateAdapter {

    private static final String[] CITY = {"HANOI, VIETNAM", "PARIS, FRANCE", "TOULOUSE, FRANCE"};

    public WeatherAndForecastAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = new WeatherAndForecastFragment();
        Bundle args = new Bundle();
        args.putString(WeatherAndForecastFragment.CITY, CITY[position]);
        fragment.setArguments(args);
        return fragment;

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
