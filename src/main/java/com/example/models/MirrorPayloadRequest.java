package com.example.models;

public class MirrorPayloadRequest {
	String name;
	int id;
	long countValue;
	public MirrorPayloadRequest(String name, int id, long countValue) {
		super();
		this.name = name;
		this.id = id;
		this.countValue = countValue;
	}
	public long getCountValue() {
		return countValue;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setCountValue(long countValue) {
		this.countValue = countValue;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
