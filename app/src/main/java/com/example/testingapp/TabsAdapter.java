package com.example.testingapp;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabsAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter(FragmentManager fm, int NoofTabs){
        super(fm);
        this.mNumOfTabs = NoofTabs;
    }
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                WelcomeFragment welcomeFragment = new WelcomeFragment ();
                return welcomeFragment;
            case 1:
                RegisterFragment registerFragment = new RegisterFragment();
                return registerFragment;
            case 2:
                LoginFragment loginFragment = new LoginFragment();
                return loginFragment;
            default:
                return null;
        }
    }
}
