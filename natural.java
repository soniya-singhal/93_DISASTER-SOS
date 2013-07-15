package com.example.disastersos;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Natural extends Activity {

  @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_natural);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_natural, menu);
		return true;
	}
	public boolean Disaster_sos(View v) 
    {
         
  
		switch (v.getId())
        {
       
 
        case R.id.button1:
        	Intent i5=new Intent(this,EARTHQUAKE.class);
    		startActivity(i5);
            return true;
 
        case R.id.button2:
        	Intent i6=new Intent(this,DROUGHT.class);
    		startActivity(i6);
            return true;
        case R.id.button3:
        	Intent i7=new Intent(this,FLOODS.class);
    		startActivity(i7);
            return true;
 
        case R.id.button4:
        	Intent i8=new Intent(this,LANDSLIDES.class);
    		startActivity(i8);
            return true;
        case R.id.button5:
        	Intent i9=new Intent(this,HURRICANES.class);
    		startActivity(i9);
            return true;
 
        case R.id.button6:
        	Intent i10=new Intent(this,TSUNAMIS.class);
    		startActivity(i10);
            return true;
        case R.id.button7:
        	Intent i11=new Intent(this,TORNADOES.class);
    		startActivity(i11);
            return true;
 
        case R.id.button8:
        	Intent i12=new Intent(this,FIRE.class);
    		startActivity(i12);
            return true;
   
        }
		return false;
		
    


    }


}
