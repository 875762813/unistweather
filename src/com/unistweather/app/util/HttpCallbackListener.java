package com.unistweather.app.util;       //HttpUtil ����ʹ�õ��� HttpCallbackListener �ӿ����ص����񷵻صĽ����������ǻ���Ҫ�� util �����������ӿڣ�
/**
 * �����������ӿڼ���
 *
 */
public interface HttpCallbackListener {
	
	/**
	 *�������
	 * @param response
	 */
	void onFinish(String response);
	
	/**
	 * ����ʧ��
	 * @param e
	 */
	void onError(Exception e);
	
}
