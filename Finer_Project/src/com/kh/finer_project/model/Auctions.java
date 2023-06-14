package com.kh.finer_project.model;

import java.util.Date;

public class Auctions {
	private String itemName;
	private int price;
	private Date date;
	private String id;
	private String pw;
	private String nick;
	private String address;
	public Auctions() {
	}
	public Auctions(String itemName, int price, Date date, String id, String pw, String nick, String address) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.date = date;
		this.id = id;
		this.pw = pw;
		this.nick = nick;
		this.address = address;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Auctions [itemName=" + itemName + ", price=" + price + ", date=" + date + ", id=" + id + ", pw=" + pw
				+ ", nick=" + nick + ", address=" + address + "]";
	}
	
	
	
	
}
