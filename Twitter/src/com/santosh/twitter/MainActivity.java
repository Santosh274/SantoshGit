package com.santosh.twitter;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	EditText usernameedittext,passwordedittext;
	Button loginbutton;
	String username="user";
	String password="1234";
	String entusername,entpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameedittext=(EditText) findViewById(R.id.usernameedittext);
        passwordedittext=(EditText) findViewById(R.id.passwordedittext);
        loginbutton=(Button) findViewById(R.id.loginbutton);
        
        loginbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				entusername=usernameedittext.getText().toString();
		        entpassword=passwordedittext.getText().toString();
				if(username.equalsIgnoreCase(entusername)&&password.equalsIgnoreCase(entpassword))
		        {
		        	Log.d("[Debug]","login successfull");
		        	Toast.makeText(MainActivity.this, "login successfull",Toast.LENGTH_SHORT).show();
		        }
				else
				{
					Log.d("[Debug]","login failed");
				}
		    }

				
			
		});
        
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}
    
}
