package com.kh.member.model;

import java.util.ArrayList;
import java.util.Date;

public interface MemberInterface {
	
	public boolean login(); // 로그인
	public boolean signUp(); // 회원가입
	public Member viewProfile(); // 프로필 보기
	public Member updateProfile(); // 프로필 수정
 	public boolean deleteProfile(); // 프로필 삭제
 	public String nick(); // 닉네임
 	public int phone(); // 번호
 	public String firntemail(); 
 	public Date viewSignUpDate(); //가입 시간
 	public String rank();
 	public ArrayList<Member> printAll(); //멤버 전체 출력
 	public String searthem(); //  이메일로 검색
 	public String searnick(); // 닉네임으로 검색
 	public String ranksort(); // 등급별 정렬
 	
 	
}
