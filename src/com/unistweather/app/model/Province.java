package com.unistweather.app.model;   //创建好的3个表都应该对应一个实体类，这样方便我们后续的开发工作

public class Province {
	private int id;
	private String provinceName;
	private String provinceCode;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	
	public String getProvinceCode() {
		return provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}


}
