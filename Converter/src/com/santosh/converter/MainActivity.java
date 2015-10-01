package com.santosh.converter;

import android.os.Bundle;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	EditText edittext1,edittext2;
	Button submitbutton;
	Spinner spinner1;
	TextView textview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext1=(EditText) findViewById(R.id.edittext1);
        edittext2=(EditText) findViewById(R.id.edittext2);
        submitbutton=(Button) findViewById(R.id.submitbutton);
        spinner1=(Spinner) findViewById(R.id.spinner1);
        textview1=(TextView) findViewById(R.id.textview1);
        final String[] option={"Temperature","Length","Currency"};
        ArrayAdapter<String> adp=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,option);
    	spinner1.setAdapter(adp);
    	spinner1.setOnItemSelectedListener(new OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int pos, long arg3) {
				textview1.setText(option[pos]);
				
				switch (pos) {
				case 0:
					edittext1.setText("");
					edittext2.setText("");
					edittext1.setHint("Centigrade");
					edittext2.setHint("Fahrenheit");
					submitbutton.setOnClickListener(new OnClickListener() {
						@Override
						public void onClick(View v) {
							int pos1;
							if(edittext1.length()>0 && edittext2.length()==0)
							{
										edittext2.setText("");
										edittext2.setHint("Fahrenheit");
							 pos1=1;
							}
							else if(edittext2.length()>0 && edittext1.length()==0)
							{
										edittext1.setText("");
										edittext1.setHint("Centigrade");
								pos1=2;
							}
							
							else
							{
								pos1=3;
							}
							
							switch(pos1)
							{
							case 1:
								double centi=Double.parseDouble(edittext1.getText().toString());
								double d1=(centi*1.8)+32;
								textview1.setText(String.valueOf("Fahrenheit " +d1));
								break;
							case 2:
							 double fari=Double.parseDouble(edittext2.getText().toString());
							 double d2=(fari-32)/1.8;
							 edittext1.setHint("Centigrade");
								textview1.setText(String.valueOf("Centigrade " +d2));
								break;
							
							case 3 :
								Toast.makeText(MainActivity.this,"Enter only one value",Toast.LENGTH_SHORT).show();
							break;
							}
						}
					});					

					break;
				case 1:
					edittext1.setText("");
					edittext2.setText("");
					edittext1.setHint("Centimeters");
					edittext2.setHint("Meters");
					submitbutton.setOnClickListener(new OnClickListener() {
						@Override
						public void onClick(View v) {
							int pos1;
							if(edittext1.length()>0 && edittext2.length()==0)
							{
										edittext2.setText("");
										edittext2.setHint("Meters");
							 pos1=1;
							}
							else if(edittext2.length()>0 && edittext1.length()==0)
							{
										edittext1.setText("");
										edittext1.setHint("Centimeters");
								pos1=2;
							}
							else
							{
								pos1=3;
							}
							switch(pos1)
							{
							case 1:
								double centi=Double.parseDouble(edittext1.getText().toString());
								double d1=(centi)/100;
								textview1.setText(String.valueOf("Meters " +d1));
								break;
							case 2:
							 double fari=Double.parseDouble(edittext2.getText().toString());
							 double d2=(fari)*100;
							 edittext1.setHint("Centimeters");
								textview1.setText(String.valueOf("Centimeters " +d2));
								break;
							case 3 :
								Toast.makeText(MainActivity.this,"Enter only one value",Toast.LENGTH_SHORT).show();
							break;
							}
						}
					});
					
					break;
				case 2:
					edittext1.setText("");
					edittext2.setText("");
					edittext1.setHint("Dollars");
					edittext2.setHint("Rupees");
					submitbutton.setOnClickListener(new OnClickListener() {
						@Override
						public void onClick(View v) {
							int pos1;
							if(edittext1.length()>0 && edittext2.length()==0)
							{
										edittext2.setText("");
										edittext2.setHint("Rupees");
							 pos1=1;
							}
							else if(edittext2.length()>0 && edittext1.length()==0)
							{
										edittext1.setText("");
										edittext1.setHint("Dollars");
								pos1=2;
							}
							else
							{
								pos1=3;
							}
							switch(pos1)
							{
							case 1:
								double centi=Double.parseDouble(edittext1.getText().toString());
								double d1=(centi)*66.16;
								textview1.setText(String.valueOf("Rupees " +d1));
								break;
							case 2:
							 double fari=Double.parseDouble(edittext2.getText().toString());
							 double d2=(fari)/66.16;
							 edittext1.setHint("Dollars");
								textview1.setText(String.valueOf("Dollars " +d2));
								break;
							case 3 :
								Toast.makeText(MainActivity.this,"Enter only one value",Toast.LENGTH_SHORT).show();
							break;
							}
						}
					});
				default:
					break;
				}
			}
			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			}
    	});
    }
@Override
public void onClick(View v) {
}
}
