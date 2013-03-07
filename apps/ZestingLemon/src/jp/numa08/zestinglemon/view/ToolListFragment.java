package jp.numa08.zestinglemon.view;

import java.util.List;

import jp.numa08.zestinglemon.ZestingLemon;
import jp.numa08.zestinglemon.tool.OnToolSelectedListener;
import jp.numa08.zestinglemon.tool.Tool;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class ToolListFragment extends ListFragment implements
		OnItemClickListener {
	private OnToolSelectedListener mToolSelectListener;

	@SuppressWarnings("unchecked")
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		final Bundle args = getArguments();
		List<Tool> toolList = (List<Tool>) args
				.getSerializable(ZestingLemon.EXTRA_TOOL_LIST);
		mToolSelectListener = (OnToolSelectedListener) args
				.getSerializable(ZestingLemon.EXTRA_TOOL_SELECT_LISTENER);

		final ToolListAdapter adapter = new ToolListAdapter(getActivity());
		adapter.addAll(toolList);
		setListAdapter(adapter);
		getListView().setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		Tool tool = (Tool) parent.getItemAtPosition(position);
		mToolSelectListener.onToolSelected(tool);
	}
}
