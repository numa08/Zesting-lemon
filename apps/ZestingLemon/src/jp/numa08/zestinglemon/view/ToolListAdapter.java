package jp.numa08.zestinglemon.view;

import jp.numa08.zestinglemon.R;
import jp.numa08.zestinglemon.tool.Tool;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ToolListAdapter extends ArrayAdapter<Tool> {
	private final LayoutInflater mInflater;

	public ToolListAdapter(Context context) {
		super(context, R.layout.row_tool_list);
		mInflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			convertView = mInflater.inflate(R.layout.row_tool_list, null);
		}
		final Tool tool = getItem(position);

		((TextView) convertView.findViewById(R.id.tool_title)).setText(tool
				.title());
		((TextView) convertView.findViewById(R.id.tool_description))
				.setText(tool.description());
		((ImageView) convertView.findViewById(R.id.tool_image))
				.setImageResource(tool.imageId());

		return convertView;
	}
}
