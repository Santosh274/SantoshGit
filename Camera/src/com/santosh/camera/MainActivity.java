package com.santosh.camera;

import android.os.Bundle;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
  Button camerabutton;
  ImageView imageview1;
  final static int Camera=1313;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        camerabutton=(Button) findViewById(R.id.camerabutton);
        imageview1=(ImageView) findViewById(R.id.imageview1);
        camerabutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
				startActivityForResult(intent, Camera);
				
			}
		});
        
    }
    @Override
    	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    		super.onActivityResult(requestCode, resultCode, data);
    		if(requestCode==Camera)
    		{
    			if(resultCode==RESULT_OK)
    			{
    				Bitmap bm=(Bitmap) data.getExtras().get("data");
    				imageview1.setImageBitmap(bm);
    			}
    			else
    			{
    				Toast.makeText(MainActivity.this,"Image Cannot be Displayed",Toast.LENGTH_SHORT).show();
    			}
    		}
    	}
}
