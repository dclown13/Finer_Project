package com.kh.finer_project;

public class PostingController extends Posting {

	public String post;
	public String change;
	public String list;
	public boolean delete;
	public String calldibs;
	
	
	
	public PostingController() {
		super();
		
		System.out.println("게시물 작성 : ");
		System.out.println("게시물 수정 : ");
		System.out.println("게시글 목록 : ");
		System.out.println("게시글 삭제 : ");
		System.out.println("게시글 찜하기 : ");
		
}	
	public PostingController(String post, String change, String list, boolean delete, String calldibs) {
		super();
		this.post = post;
		this.change = change;
		this.list = list;
		this.delete = delete;
		this.calldibs = calldibs;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getChange() {
		return change;
	}
	public void setChange(String change) {
		this.change = change;
	}
	public String getList() {
		return list;
	}
	public void setList(String list) {
		this.list = list;
	}
	public boolean getDelete() {
		return delete;
	}
	public void setDelete(boolean delete) {
		this.delete = delete;
	}
	public String getCalldibs() {
		return calldibs;
	}
	public void setCalldibs(String calldibs) {
		this.calldibs = calldibs;
	}
	@Override
	public String toString() {
		return "PostingController [post=" + post + ", change=" + change + ", list=" + list + ", delete=" + delete
				+ ", calldibs=" + calldibs + "]";
	}
	
	
	
}
