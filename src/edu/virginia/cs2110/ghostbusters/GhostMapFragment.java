package edu.virginia.cs2110.ghostbusters;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

/**
 * The Google Maps Fragment, extended for functionality in this project
 * @author Jay Sebastian jgs3cd
 */
public class GhostMapFragment extends SupportMapFragment {

	private LocationManager locationManager;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		locationManager = (LocationManager)getActivity().getSystemService(Context.LOCATION_SERVICE);
	}
	
	/**
	 * Zooms into the current location, given a zoom factor
	 * @param zoomFactor A zoom factor; keep it somewhere between 13.0f and 15.0f
	 */
	public void zoomToCurrentLocation(float zoomFactor) {
		getMap().setMyLocationEnabled(true);
		
		Location loc = this.getMyLocation();
		if (loc != null) {
			LatLng latlng = new LatLng(loc.getLatitude(), loc.getLongitude());
			getMap().animateCamera(CameraUpdateFactory.newLatLngZoom(latlng, zoomFactor));	
		}
	}
	
	/**
	 * Returns the current location
	 * @return current location
	 */
	public Location getMyLocation() {
		Location myLocation = null;
		if (locationManager != null) {
		    // Get location from GPS if it's available
		    myLocation = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
		    // Location wasn't found, check the next most accurate place for the current location
		    if (myLocation == null) {
		        Criteria criteria = new Criteria();
		        criteria.setAccuracy(Criteria.ACCURACY_COARSE);
		        // Finds a provider that matches the criteria
		        String provider = locationManager.getBestProvider(criteria, true);
		        // Use the provider to get the last known location
		        myLocation = locationManager.getLastKnownLocation(provider);
		    }
		}
		else
			Log.e("ghost", "Did not initialize LocationManager!");
		return myLocation;
	}
}
