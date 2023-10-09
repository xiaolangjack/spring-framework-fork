package com.jack.model;

/**
 * Created By: Jacky<workinglang@163.com>
 * Created At: 2023/9/24 0:36
 * <p></p>
 */
public class Address {
	private String province;

	private String city;

	private String detail;


	public Address() {
	}

	public Address(String province, String city, String detail) {
		this.province = province;
		this.city = city;
		this.detail = detail;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "Address{" +
				"province='" + province + '\'' +
				", city='" + city + '\'' +
				", detail='" + detail + '\'' +
				'}';
	}
}
