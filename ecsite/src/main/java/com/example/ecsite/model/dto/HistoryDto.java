package com.example.ecsite.model.dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import com.example.ecsite.model.entity.Purchase;

public class HistoryDto {
	
	private long id;
	private long userId;
	private long goodsId;
	private String goodsName;
	private long itemCount;
	private long total;
	private String createdAt;
	
	public HistoryDto() {}
	
	public HistoryDto(Purchase entity) {
		this.id = entity.getId();
		this.userId = entity.getUserId();
		this.goodsId = entity.getGoodsId();
		this.goodsName = entity.getGoodsName();
		this.itemCount = entity.getItemCount();
		this.total = entity.getItemCount();
		
		Timestamp d = entity.getCreatedAt();
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		this.createdAt = f.format(d);
	}

	public long getId() {
		return this.id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getUserId() {
		return this.userId;
	}
	
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	public long getGoodsId() {
		return this.goodsId;
	}
	
	public void setGoodsId(long goodsId) {
		this.goodsId = goodsId;
	}
	
	public String getGoodsName() {
		return this.goodsName;
	}
	
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public long getItemCount() {
		return this.itemCount;
	}
	
	public void setItemCount(long itemCount) {
		this.itemCount = itemCount;
	}
	
	public long getTotal() {
		return this.total;
	}
	
	public void setTotal(long total) {
		this.total = total;
	}
	
	public String getCreatedAt() {
		return this.createdAt;
	}
	
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	

}
