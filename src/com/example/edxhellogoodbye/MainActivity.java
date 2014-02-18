package com.example.edxhellogoodbye;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.*;


public class MainActivity extends Activity {

	private Button button;
	private TextView message;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        button = (Button)findViewById(R.id.button1);
        message = (TextView) findViewById(R.id.textView1); 
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            		if (message.getText().equals("Hello 21w.789x")) {
            			message.setText("Goodbye 21w.789x");
            		} else {
            			message.setText("Hello 21w.789x");
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
    
}
