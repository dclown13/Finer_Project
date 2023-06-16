package com.kh.auctions.model;

import java.util.Date;

public class Auctions {
	private String itemName; //물건
	private int itemPrice;// 물건 가격
	private int price;//가격
	private Date date;//경매일
	private String id;//아이디
	private String pw;//비밀번호
	private String nick;//닉네임
	private String address;//사용자 주소
	private int Point; // 경매 성공하면 등급별로 포인트 적립
	public Auctions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Auctions(String itemName, int itemPrice, int price, Date date, String id, String pw, String nick,
			String address, int point) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.price = price;
		this.date = date;
		this.id = id;
		this.pw = pw;
		this.nick = nick;
		this.address = address;
		Point = point;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
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
	public int getPoint() {
		return Point;
	}
	public void setPoint(int point) {
		Point = point;
	}
	@Override
	public String toString() {
		return "Auctions [itemName=" + itemName + ", itemPrice=" + itemPrice + ", price=" + price + ", date=" + date
				+ ", id=" + id + ", pw=" + pw + ", nick=" + nick + ", address=" + address + ", Point=" + Point + "]";
	}

	
	
	
}
