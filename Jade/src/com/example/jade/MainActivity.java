package com.example.jade;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	
	private EditText command;
	private TextView feedback;
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		command = (EditText)findViewById(R.id.command);
		button1 = (Button)findViewById(R.id.button1);
		button1.setOnClickListener(this);
		button2 = (Button)findViewById(R.id.button2);
		button2.setOnClickListener(this);
		button3 = (Button)findViewById(R.id.button3);
		button3.setOnClickListener(this);
		button4 = (Button)findViewById(R.id.button4);
		button4.setOnClickListener(this);
		feedback = (TextView)findViewById(R.id.feedback);
		feedback.setText("Command...");
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
			case R.id.button1:
					feedback.setText(new Record(command.getText().toString()).recording());
				break;
			case R.id.button2:
					feedback.setText(new Functions().function1());
				break;
			case R.id.button3:
				feedback.setText(new Functions().function2());
				break;
			case R.id.button4:
				feedback.setText(new Functions().function3());
				break;
		}
		
	}

}
