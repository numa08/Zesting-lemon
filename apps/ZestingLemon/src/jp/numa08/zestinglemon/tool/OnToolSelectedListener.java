package jp.numa08.zestinglemon.tool;

import java.io.Serializable;

/**
 * @author numa08 {@link Tool} が選択されたときに呼び出されます。
 */
public interface OnToolSelectedListener extends Serializable {
	public void onToolSelected(final Tool tool);
}
