package edu.virginia.cs2110.ghostbusters;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity {
	
	private SupportMapFragment mapFrag;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("ghost", "" + GooglePlayServicesUtil.isGooglePlayServicesAvailable(getApplicationContext()));
		setContentView(R.layout.activity_main);
	}
	
	/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);

        // Get a handle to the Map Fragment
        GoogleMap map = ((MapFragment) getFragmentManager()
                .findFragmentById(R.id.map)).getMap();

        LatLng sydney = new LatLng(-33.867, 151.206);

        map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 13));

        map.addMarker(new MarkerOptions()
                .title("Sydney")
                .snippet("The most populous city in Australia.")
                .position(sydney));
    }
    */
    
	/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	*/

}
