package jp.numa08.zestinglemon;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ZestingLemon extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_zesting_lemon);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.zesting_lemon, menu);
		return true;
	}

}
