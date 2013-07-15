package com.example.disastersos;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Types_of_Disaster extends Activity {

  @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_types_of__disaster);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_types_of__disaster, menu);
		return true;
	}
	
	public boolean Disaster_sos(View v) 
    {
         
  
		switch (v.getId())
        {
       
 
        case R.id.button1:
        	Intent i3=new Intent(this,Natural.class);
    		startActivity(i3);
            return true;
 
        case R.id.button2:
        	Intent i4=new Intent(this,Man_Made.class);
    		startActivity(i4);
            return true;
 
       
        }
		return false;
		
    


    }



}
