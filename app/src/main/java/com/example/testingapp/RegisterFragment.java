package com.example.testingapp;


        import android.support.v4.app.Fragment; import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;

/**
 * Created by tutlane on 09-01-2018.
 */

public class RegisterFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState){
        return inflater.inflate(R.layout.registerlayout, viewGroup, false);
    }
}
