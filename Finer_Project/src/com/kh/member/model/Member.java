package com.kh.member.model;

import java.sql.Date;

public class Member {
	
	private String name; //이름
	private String id; // 아이디
	private String pw; // 비밀번호
	private String nick; // 닉네임
	private String Introduction; // 자기소개
	private String Rank; // 등급
	private String address; // 주소
	private Date singupDate; // 가입 시간
	private int age; // 나이
	private char gender; // 성별 
	public Member() {}
	public Member(String name, String id, String passward, String nick, String introduction, String rank,
			String address, Date singupDate, int age, char gender) {
		this.name = name;
		this.id = id;
		this.pw = passward;
		this.nick = nick;
		this.Introduction = introduction;
		this.Rank = rank;
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
		return pw;
	}
	public void setPassward(String passward) {
		this.pw = passward;
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
		return "Member [name=" + name + ", id=" + id + ", passward=" + pw + ", nick=" + nick + ", Introduction="
				+ Introduction + ", Rank=" + Rank + ", address=" + address + ", singupDate=" + singupDate + ", age="
				+ age + ", gender=" + gender + "]";
	}
	
}
