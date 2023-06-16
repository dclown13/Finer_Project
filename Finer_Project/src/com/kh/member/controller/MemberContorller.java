package com.kh.member.controller;


import java.util.ArrayList;
import java.util.Date;

import com.kh.member.model.Member;
import com.kh.member.model.MemberInterface;

public class MemberContorller implements MemberInterface{
	private ArrayList<Member> list = new ArrayList<Member>();

	@Override
	public boolean login() { //로그인
		return false;
	}

	@Override
	public boolean signUp() { // 회원 가입
		return false;
	}

	@Override
	public Member viewProfile() { // 멤버 프로필 확인
		return null;
	}

	@Override
	public Member updateProfile() { // 멤버 프로필 수정
		return null;
	}

	@Override
	public boolean deleteProfile() { // 멤버 프로필 삭제
		return false;
	}

	@Override
	public String nick() { // 닉네임
		return null;
	}

	@Override
	public int phone() { // 핸드폰번호
		return 0;
	}

	@Override
	public String firntemail() { //이메일 출력
		return null;
	}

	@Override
	public Date viewSignUpDate() { // 가입시간 확인
		return null;
	}

	@Override
	public String rank() { // 멤버 등급
		return null;
	}

	@Override
	public ArrayList<Member> printAll() { // 전체출력
		return list;
	}

	@Override
	public String searthem() { //이메일로 찾기
		return null;
	}

	@Override
	public String searnick() { //닉네임으로 찾기
		return null;
	}

	@Override
	public String ranksort() { //등급별 정렬
		return null;
	}
	

}
