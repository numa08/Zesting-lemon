package jp.numa08.dpicalculator;

import jp.numa08.zestinglemon.R;
import jp.numa08.zestinglemon.tool.Tool;
import android.content.Context;
import android.content.Intent;

public class DpiCalcTool implements Tool {

	private static final long serialVersionUID = 3764591766369304119L;

	@Override
	public boolean isNotifTool() {
		return false;
	}

	@Override
	public Intent createIntent(Context context) {
		final Intent intent = new Intent(context, DpiCalculator.class);
		return intent;
	}

	@Override
	public String title() {
		return "DPIの計算";
	}

	@Override
	public String description() {
		return "DPIからピクセルに、ピクセルからDPIへの計算を行います。\nもちろん、様々な大きさ、解像度、画面密度のディスプレイに対応していますよ。";
	}

	@Override
	public int imageId() {
		return R.drawable.ic_launcher;
	}

}
