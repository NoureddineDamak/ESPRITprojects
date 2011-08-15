package com.formation.bonjour;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class BonjourActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
   Button button;
   EditText editText;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        button=((Button)this.findViewById(R.id.button1));
        editText=((EditText)this.findViewById(R.id.editText1));
        button.setOnClickListener(this);
        if(this.getIntent().getExtras()!=null){
        	String s =this.getIntent().getExtras().getString("madonner");
        	editText.setText(s);
        }
        
        Log.i("onCreate", "onCreate");
        this.setResult(2000);
    }
	
	public void onStart(){
		Log.i("onstart","onstart");
		super.onStart();
	}
	
	@Override
	protected void onResume() {
		Log.i("onresume","onresume");
		super.onResume();
	}
	
	
	@Override
	protected void onPause() {
		Log.i("onPause","onPause");
		super.onPause();
	}
	
	@Override
	protected void onStop() {
		Log.i("onStop","onStop");
		super.onStop();
	}
	
	public void onDestroy() {
		Log.i("ondestroy","ondestroy");
		super.onDestroy();
	}

	public void onClick(View v) {
		Intent intent =new Intent(this,Main2.class);
		intent.putExtra("madonner","ahla nounou");
		this.startActivityForResult(intent, 1000);
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if(requestCode==1000)
			Log.i("",""+resultCode);
		super.onActivityResult(requestCode, resultCode, data);
	}
}