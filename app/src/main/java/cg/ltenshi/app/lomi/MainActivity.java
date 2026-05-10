package cg.ltenshi.app.lomi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import cg.ltenshi.app.lomi.activities.Activity_Brumy;


public class MainActivity extends Activity {
	
	private EditText searchZone;
	private LinearLayout searchNav, notePadNav, brumyModeNav;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_home);
		
		initViews();
	}
	
	private void initViews(){
		searchZone = findViewById(R.id.home_search_input);
		
		searchNav = findViewById(R.id.nav_search);
		notePadNav = findViewById(R.id.nav_notepad);
		brumyModeNav = findViewById(R.id.nav_brumy);
		
		
		searchNav.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View view) {
				// Coming soon...
			}
		});
		
		notePadNav.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View view) {
				// Coming soon...
			}
		});
		
		brumyModeNav.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(MainActivity.this, Activity_Brumy.class);
				startActivity(intent);
			}
		});
	}
}