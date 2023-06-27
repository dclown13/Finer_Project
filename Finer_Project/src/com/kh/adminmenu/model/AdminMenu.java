package com.kh.adminmenu.model; // 06-16 강원구 작성

import java.util.Objects;

public class AdminMenu {
	
	private String AdmId; // 관리자 아이디
	private String AdmPw; // 관리자 비밀번호
	private int memlevel; // 회원 레벨, 등급
	
	public AdminMenu() {}
	public AdminMenu(String admId, String admPw, int memlevel) {
		this.AdmId = admId;
		this.AdmPw = admPw;
		this.memlevel = memlevel;
	}
	public String getAdmId() {
		return AdmId;
	}
	public void setAdmId(String admId) {
		AdmId = admId;
	}
	public String getAdmPw() {
		return AdmPw;
	}
	public void setAdmPw(String admPw) {
		AdmPw = admPw;
	}
	public int getMemlevel() {
		return memlevel;
	}
	public void setMemlevel(int memlevel) {
		this.memlevel = memlevel;
	}
	@Override
	public String toString() {
		return "AdminMenu [AdmId=" + AdmId + ", AdmPw=" + AdmPw + ", memlevel=" + memlevel + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(AdmId, AdmPw, memlevel);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdminMenu other = (AdminMenu) obj;
		return Objects.equals(AdmId, other.AdmId) && Objects.equals(AdmPw, other.AdmPw) && memlevel == other.memlevel;
	}

}
