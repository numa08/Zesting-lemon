package jp.numa08.zestinglemon;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jp.numa08.dpicalculator.DpiCalcTool;
import jp.numa08.zestinglemon.abs.AbsBaseActivity;
import jp.numa08.zestinglemon.tool.OnToolSelectedListener;
import jp.numa08.zestinglemon.tool.Tool;
import jp.numa08.zestinglemon.view.ToolListFragment;
import android.os.Bundle;
import android.view.Menu;

public class ZestingLemon extends AbsBaseActivity implements
		OnToolSelectedListener {
	private static final long serialVersionUID = -5199009618836505104L;

	public static final String EXTRA_TOOL_LIST = "jp.numa08.zestinglemon.extras.TOOL_LIST";
	public static final String EXTRA_TOOL_SELECT_LISTENER = "jp.numa08.zestinglemon.extras_TOOL_SELECT_LISTENER";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_zesting_lemon);

		final List<Tool> toolList = createToolList();

		final Bundle arguments = new Bundle();
		arguments.putSerializable(ZestingLemon.EXTRA_TOOL_LIST,
				(Serializable) toolList);
		arguments
				.putSerializable(ZestingLemon.EXTRA_TOOL_SELECT_LISTENER, this);

		ToolListFragment fragment = new ToolListFragment();
		fragment.setArguments(arguments);
		getFragmentManager().beginTransaction()
				.add(R.id.fragment_tool_list, fragment).commit();
	}

	private List<Tool> createToolList() {
		List<Tool> toolList = new ArrayList<Tool>();
		// TOOLを追加するときはここに記述します
		toolList.add(new DpiCalcTool());
		return toolList;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.zesting_lemon, menu);
		return true;
	}

	@Override
	public void onToolSelected(Tool tool) {
		startTool(tool);
	}
}
