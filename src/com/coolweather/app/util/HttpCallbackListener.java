/**
 * 
 */
package com.coolweather.app.util;

/**
 * @author baixiu0813
 *
 */
public interface HttpCallbackListener {

	void onFinish(String response);
	void onError(Exception e);
}
