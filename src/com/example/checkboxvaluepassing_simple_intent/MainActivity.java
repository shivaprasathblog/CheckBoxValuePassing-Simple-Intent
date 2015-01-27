package com.example.checkboxvaluepassing_simple_intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends Activity 
{
	CheckBox cb;
	Button b;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		cb=(CheckBox)findViewById(R.id.checkBox1);
		b=(Button)findViewById(R.id.button1);
		
		b.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View arg0) 
			{
				// TODO Auto-generated method stub
				
				Intent i =new Intent(MainActivity.this,Activity2.class);
				
				String cbvalue=cb.getText().toString();
				
				i.putExtra("key_checkbox", cbvalue);
				
				startActivity(i);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
