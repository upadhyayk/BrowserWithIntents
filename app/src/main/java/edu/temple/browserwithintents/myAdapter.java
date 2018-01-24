package edu.temple.browserwithintents;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by krati on 11/15/17.
 */


public class myAdapter extends FragmentStatePagerAdapter {

    ArrayList<String> fragments = new ArrayList<String>();
    BrowserFragment browserFragment;

    public myAdapter(FragmentManager fragmentManager){
        super(fragmentManager);

    }

    @Override
    public Fragment getItem(int position) {
        browserFragment = BrowserFragment.newInstance(fragments.get(position).toString());
        return browserFragment;
    }

    //returns total number of items
    @Override
    public int getCount() {
        return fragments.size();
    }

    public int getPosition(Object object){
        return POSITION_UNCHANGED;
    }

    public void addUrl (String url){
        fragments.add(url);
    }
}
