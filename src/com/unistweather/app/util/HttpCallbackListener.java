package com.unistweather.app.util;       //HttpUtil 类中使用到了 HttpCallbackListener 接口来回调服务返回的结果，因此我们还需要在 util 包下添加这个接口，
/**
 * 网络请求结果接口监听
 *
 */
public interface HttpCallbackListener {
	
	/**
	 *请求完成
	 * @param response
	 */
	void onFinish(String response);
	
	/**
	 * 请求失败
	 * @param e
	 */
	void onError(Exception e);
	
}
