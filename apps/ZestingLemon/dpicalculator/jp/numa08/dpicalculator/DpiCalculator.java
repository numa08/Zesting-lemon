package jp.numa08.dpicalculator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DpiCalculator extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		final TextView tv = new TextView(this);
		tv.setText("TODO");
		setContentView(tv);
	}

}
