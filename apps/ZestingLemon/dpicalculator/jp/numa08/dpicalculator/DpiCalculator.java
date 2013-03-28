package jp.numa08.dpicalculator;

import java.util.Arrays;
import java.util.List;

import jp.numa08.zestinglemon.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class DpiCalculator extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dpi_calculator);

		List<Integer> digitButtons = Arrays.asList( R.id.digit_0, R.id.digit_1,R.id.digit_2,
													R.id.digit_3, R.id.digit_4, R.id.digit_5,
													R.id.digit_6, R.id.digit_7, R.id.digit_8,
													R.id.digit_9,R.id.digit_clear, R.id.digit_digimal);
		for(int id : digitButtons){
			findViewById(id).setOnClickListener(this);
		}
	}

	@Override
	public void onClick(View v) {}

}
