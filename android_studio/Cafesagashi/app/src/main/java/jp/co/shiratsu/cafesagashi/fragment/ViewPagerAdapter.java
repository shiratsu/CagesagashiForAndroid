package jp.co.shiratsu.cafesagashi.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by shiratsu on 15/02/05.
 */
public class ViewPagerAdapter  extends FragmentPagerAdapter {

    final int PAGE_COUNT = 2;
    // Tab Titles
    private String tabtitles[] = new String[] { "Tab1", "Tab2"};
    Context context;


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        switch (position) {

            // Open FragmentTab1.java
            case 0:
                //CafeMapFragment fragmenttab1 = CafeMapFragment.newInstance();
                CafeMapFragment fragmenttab1 = new CafeMapFragment();
                return fragmenttab1;

            // Open FragmentTab2.java
            case 1:
                SecondTab fragmenttab2 = new SecondTab();
                return fragmenttab2;


        }
        return null;
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
