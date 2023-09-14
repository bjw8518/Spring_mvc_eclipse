package com.kopo.memo;



public class Memo {
	int idx;
	String content;
	String created;
	
	Memo(){
	}
	
	Memo(int idx, String content, String created){
		this.idx = idx;
		this.content = content;
		this.created = created;
	}
	
	public int getIdx() {
		return this.idx;
	}
	
	public String getcontent() {
		return this.content;
	}
	
	public String getCreated() {
		return this.created;
	}
}
