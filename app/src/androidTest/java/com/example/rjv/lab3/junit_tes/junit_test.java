package com.example.rjv.lab3.junit_tes;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.rjv.lab3.MainActivity;
import com.example.rjv.lab3.R;

/**
 * Created by RJV on 4/19/16.
 */
public class junit_test extends ActivityInstrumentationTestCase2<MainActivity> {
   MainActivity mainActivity;
    public junit_test(){
        super(MainActivity.class);

    }

    public void test_first()
    {
        mainActivity=getActivity();
        TextView textView=(TextView) mainActivity.findViewById(R.id.result);
        String tester=textView.getText().toString();
        assertEquals("246.0",tester);
    }
}

