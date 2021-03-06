package com.unistweather.app.util;      //全国所有省市县的数据都是从服务器端获取到的，因此这里和服务器的交互是必不可少的


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



/**
 *  
 * 网络请求工具包
 *
 */

public class HttpUtil {
	
/**
 *  发送一个请求
 *  @param address
 *  @param listener
 */
	public static void sendHttpRequest(final String address, final HttpCallbackListener listener){
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				HttpURLConnection connection = null;
				try {
					URL url = new URL(address);
					connection = (HttpURLConnection) url.openConnection();
					connection.setRequestMethod("GET");
					connection.setConnectTimeout(8*1000);
					connection.setReadTimeout(8*1000);
					InputStream in = connection.getInputStream();
					
					BufferedReader reader = new BufferedReader(new InputStreamReader(in));
					StringBuilder response = new StringBuilder();
					String line;
					while( (line=reader.readLine())!=null ){
						response.append(line);
					}
					if ( listener!=null ){
						//回调onFinish()方法
						listener.onFinish(response.toString());
					}
				} catch (Exception e) {
					if( listener!=null ){
						//回调onError()方法
						listener.onError(e);
					}
				} finally {
					if( connection!=null ){
						connection.disconnect();//关闭连接，否则容易造成内存溢出
					}
				}
			}
		}).start();
	}
	
}
