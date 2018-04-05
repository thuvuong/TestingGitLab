package edu.tacoma.uw.css.thuv.testinggitlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class TestingActivity extends AppCompatActivity {

    private static final String TAG = "TestingActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);

        Log.e(TAG, "onCreate");
        
    }
}
