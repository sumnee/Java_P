package com.kh.practice.music.model.vo;

public class Music {

	//��� ������
	//��,�� ���� �ϰ�
	
	private String title;
	private String singer;
	
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	

}
