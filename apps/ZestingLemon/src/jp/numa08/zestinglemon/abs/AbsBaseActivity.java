package jp.numa08.zestinglemon.abs;

import jp.numa08.zestinglemon.tool.Tool;
import android.app.Activity;
import android.content.Intent;

public abstract class AbsBaseActivity extends Activity {

	public void startTool(final Tool tool) {
		if (tool.isNotifTool()) {
			// notifity
		} else {
			final Intent intent = tool.createIntent(this);
			startActivity(intent);
		}
	}
}
