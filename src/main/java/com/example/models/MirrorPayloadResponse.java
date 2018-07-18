package com.example.models;

public class MirrorPayloadResponse {
	
	private int status;
	private boolean success;
	private MirrorPayloadRequest data;
	
	public MirrorPayloadResponse() {
		this.status = 200;
		this.success = true;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public MirrorPayloadRequest getData() {
		return data;
	}
	public void setData(MirrorPayloadRequest data) {
		this.data = data;
	}

}
