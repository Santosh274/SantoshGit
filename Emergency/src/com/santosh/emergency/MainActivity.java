package com.santosh.emergency;

import java.text.ParseException;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
 ListView listview1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		listview1=(ListView) findViewById(R.id.listview1);
		String[] contacts={"Police","Fire","Ambulance","Family","Friend"};
		String[] list={"100","101","108","9704917006","8184983217"};
		final Bundle bund=new Bundle();
		bund.putStringArray("key",list);
		
		
		
		ArrayAdapter<String> adp=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line, contacts);
		listview1.setAdapter(adp);
		
		
		listview1.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos,
					long arg3) {
				switch (pos) {
				case 0:
					emergency(pos);
					break;
				case 1:
					emergency(pos);
					break;
				case 2:
					emergency(pos);
					break;
				case 3:
					emergency(pos);
					break;
				case 4:
					emergency(pos);
					break;
				}
			
	}
	public void emergency(int pos)
	{
		
		String[] s=bund.getStringArray("key");
		Intent itn=new Intent(Intent.ACTION_DIAL);
		itn.setData(Uri.parse("tel:"+s[pos]));
		startActivity(itn);
	}
		});
}
}
