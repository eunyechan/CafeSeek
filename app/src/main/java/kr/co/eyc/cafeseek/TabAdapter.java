package kr.co.eyc.cafeseek;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class TabAdapter extends FragmentStatePagerAdapter {

    int tabCount;

    public TabAdapter(@NonNull FragmentManager fm, int tabCount) {
        super(fm);

        this.tabCount= tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                cafefragment cafefragment= new cafefragment();
                return cafefragment;
            case 1 :
                userfragment2 userfragment2= new userfragment2();
                return userfragment2;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
