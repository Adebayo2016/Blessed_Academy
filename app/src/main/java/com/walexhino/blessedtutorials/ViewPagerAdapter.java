package com.walexhino.blessedtutorials;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentList=new ArrayList<>();
    private final List<String>FragmentListTiles= new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return fragmentList.get(i);

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return FragmentListTiles.get(position);

    }

    @Override
    public int getCount() {
        return FragmentListTiles.size();

    }

    public void addFragments(Fragment fragment, String Title){
        fragmentList.add(fragment);
        FragmentListTiles.add(Title);


    }
}
