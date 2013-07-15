package com.example.disastersos;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Man_Made extends Activity {

  @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_man__made);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_man__made, menu);
		return true;
	}
	
	public boolean Disaster_sos(View v) 
    {
         
  
		switch (v.getId())
        {
       
 
        case R.id.button1:
        	Intent i13=new Intent(this,HAZARDOUS_MATERIALS_INCIDENTS.class);
    		startActivity(i13);
            return true;
 
        case R.id.button2:
        	Intent i14=new Intent(this,BLACKOUT.class);
    		startActivity(i14);
            return true;
        case R.id.button3:
        	Intent i15=new Intent(this,HOUSEHOLD_CHEMICAL_EMERGENCIES.class);
    		startActivity(i15);
            return true;
 
        case R.id.button4:
        	Intent i16=new Intent(this,BIOLOGICAL_THREATS.class);
    		startActivity(i16);
            return true;
        case R.id.button5:
        	Intent i17=new Intent(this,CHEMICAL_THREATS.class);
    		startActivity(i17);
            return true;
 
        case R.id.button6:
        	Intent i18=new Intent(this,EXPLOSIONS.class);
    		startActivity(i18);
            return true;
        case R.id.button7:
        	Intent i19=new Intent(this,NUCLEAR_BLAST.class);
    		startActivity(i19);
            return true;
 
        case R.id.button8:
        	Intent i20=new Intent(this,RADIOLOGICAL_DISPERSION_DEVICE.class);
    		startActivity(i20);
            return true;
   
        }
		return false;
		
    


    }


}
