package com.example.ecsite.model.form;

import java.io.Serializable;

public class Cart implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String goodsName;
	private long price;
	private long count;
	
	public long getId() {
		return this.id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getGoodsName() {
		return this.goodsName;
	}
	
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public long getPrice() {
		return this.price;
	}
	
	public void setPrice(long price) {
		this.price = price;
	}
	
	public long getCount() {
		return this.count;
	}
	
	public void setCount(long count) {
		this.count = count;
	}
}
