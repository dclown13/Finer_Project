package com.kh.member.model;

import java.sql.Date;

public class Member {
	
	private String name;
	private String id;
	private String passward;
	private String nick;
	private String Introduction;
	private String Rank;
	private String address;
	private Date singupDate;
	private int age;
	private char gender;
	public Member() {}
	public Member(String name, String id, String passward, String nick, String introduction, String rank,
			String address, Date singupDate, int age, char gender) {
		this.name = name;
		this.id = id;
		this.passward = passward;
		this.nick = nick;
		Introduction = introduction;
		Rank = rank;
		this.address = address;
		this.singupDate = singupDate;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getIntroduction() {
		return Introduction;
	}
	public void setIntroduction(String introduction) {
		Introduction = introduction;
	}
	public String getRank() {
		return Rank;
	}
	public void setRank(String rank) {
		Rank = rank;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getSingupDate() {
		return singupDate;
	}
	public void setSingupDate(Date singupDate) {
		this.singupDate = singupDate;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", passward=" + passward + ", nick=" + nick + ", Introduction="
				+ Introduction + ", Rank=" + Rank + ", address=" + address + ", singupDate=" + singupDate + ", age="
				+ age + ", gender=" + gender + "]";
	}
	
}
