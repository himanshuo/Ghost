package edu.virginia.cs2110.ghostbusters;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;

public class MainActivity extends FragmentActivity {
	
	private GhostMapFragment mapFrag;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("ghost", Boolean.toString(GooglePlayServicesUtil.isGooglePlayServicesAvailable(getApplicationContext()) == ConnectionResult.SUCCESS));
		setContentView(R.layout.activity_main);
		mapFrag = (GhostMapFragment)(this.getSupportFragmentManager().findFragmentById(R.id.testMap));
		mapFrag.zoomToCurrentLocation(14.0f);
	}
    
	/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	*/

}
