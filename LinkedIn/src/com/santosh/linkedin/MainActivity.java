package com.santosh.linkedin;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	EditText usernameedittext,passwordedittext;
	Button signupbutton;
	String username="user";
	String password="1234";
	String entusername,entpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameedittext=(EditText) findViewById(R.id.usernameedittext);
        passwordedittext=(EditText) findViewById(R.id.passwordedittext);
        signupbutton=(Button) findViewById(R.id.signupbutton);
        
        signupbutton.setOnClickListener(new OnClickListener() {
			
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
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}
    
}
