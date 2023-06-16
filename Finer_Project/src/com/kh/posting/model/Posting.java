package com.kh.posting.model;

import java.util.Scanner;

public class Posting {

	private String post;
	private String change;
	private String list;
	private boolean delete;
	private String calldibs;

	public Posting() {
		super();
		
	}

	public Posting(String post, String change, String list, boolean delete, String calldibs) {
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

	public boolean isDelete() {
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
		return "Posting [post=" + post + ", change=" + change + ", list=" + list + ", delete=" + delete + ", calldibs="
				+ calldibs + "]";
	}

}
