/**
 * 每张表在代码中最好能有一个对应的实体类
 */
package com.coolweather.app.model;

/**
 * @author baixiu0813
 *
 */
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
