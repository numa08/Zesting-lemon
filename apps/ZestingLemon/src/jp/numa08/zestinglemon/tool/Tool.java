package jp.numa08.zestinglemon.tool;

import java.io.Serializable;

import android.content.Context;
import android.content.Intent;

/**
 * 一つひとつのToolを表すクラスです。<br>
 * この中で作られたActivity（もしかしたらServiceも？）<br>
 * をリストから起動するイメージです。
 * 
 * @author numa08
 * 
 */
public interface Tool extends Serializable {
	/**
	 * 通知バーに表示するタイプのアプリかどうかを判断します。<br>
	 * 通知バーに表示されたアプリは、直ちに起動をするのではなく、<br>
	 * 通知バーから選ばれたときに起動をします。
	 * 
	 * @return
	 */
	public boolean isNotifTool();

	/**
	 * 起動をするためのIntentを作ります。<br>
	 * 
	 * @param context
	 * @return
	 */
	public Intent createIntent(final Context context);

	/**
	 * タイトル
	 * 
	 * @return
	 */
	public String title();

	/**
	 * 説明
	 * 
	 * @return
	 */
	public String description();

	/**
	 * 画像
	 * 
	 * @return
	 */
	public int imageId();
}
