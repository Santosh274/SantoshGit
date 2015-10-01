package com.santosh.facebook;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
            
	  EditText usernameedittext,passwordedittext;
	  Button loginbutton;
	  String username="user";
	  String password="1234";
	  String entusername;
	  String entpassword;
	  CheckBox rememberpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameedittext=(EditText) findViewById(R.id.usernameedittext);
        passwordedittext=(EditText) findViewById(R.id.passwordedittext);
        loginbutton=(Button) findViewById(R.id.loginbutton);
        rememberpassword=(CheckBox) findViewById(R.id.rememberpassword);
        loginbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				entusername=usernameedittext.getText().toString();
		        entpassword=passwordedittext.getText().toString();
				if(username.equalsIgnoreCase(entusername)&& password.equalsIgnoreCase(entpassword))
				{
					Log.d("[DEBUG]","login successfull");
					Toast.makeText(MainActivity.this,"login successful", Toast.LENGTH_SHORT).show();
				}
				else
				{
					Log.d("[DEBUG]","login failed");
					Toast.makeText(MainActivity.this,"login failed", Toast.LENGTH_SHORT).show();
				}
				
			}
		});
        rememberpassword.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
				if(entusername.length()>0 && entpassword.length()>0 && arg1==true)
				{
					usernameedittext.setText(entusername.toString());
					passwordedittext.setText(entpassword.toString());
				}
				else if(arg1==false)
				{
				
					//Toast.makeText(MainActivity.this,, duration)
				}
			}
		});
    }


    

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}
    
}
