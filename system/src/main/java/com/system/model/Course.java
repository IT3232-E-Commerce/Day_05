package com.system.model;

public class Course {

	private String cid;
	private String cname;
	private int credit;

	public Course(String cid, String cname, int credit) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.credit = credit;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}
}
