package jp.numa08.zestinglemon;

import jp.numa08.zestinglemon.abs.AbsBaseActivity;
import jp.numa08.zestinglemon.tool.OnToolSelectedListener;
import jp.numa08.zestinglemon.tool.Tool;
import android.os.Bundle;
import android.view.Menu;

public class ZestingLemon extends AbsBaseActivity implements
		OnToolSelectedListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_zesting_lemon);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.zesting_lemon, menu);
		return true;
	}

	@Override
	public void onToolSelected(Tool tool) {}
}
