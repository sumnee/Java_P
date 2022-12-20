package com.kh.practice.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.music.model.vo.Music;

public class MusicController {

	private List<Music> mList;
	
	public MusicController() {
		mList = new ArrayList<Music>();
	}
	
	/**
	 * ������ ��ġ�� �� �߰�
	 * @param music
	 */
	
	public void addAtLast(Music music) {
		mList.add(music);
	} 
	
	
	/**
	 * ù ��ġ�� �� �߰�
	 * @param music
	 */
	public void addAtZero(Music music) {
		mList.add(0, music);
	}
	
	/**
	 * �� ����
	 * @param music
	 */
	public void removeMusic(int index) {
		mList.remove(index);
	}
	
	/**
	 * �� ����
	 * @param music
	 */
	public void updateMusic(int index, Music music ) {
		mList.set(index, music);
	}
	
	/**
	 * �̸����� ���� ��� �˻�
	 * @param title
	 */
	public List<Music> searchMusicsByName(String title) {
		List<Music> findList = new ArrayList<Music>();
		for(Music mOne : mList) {
			if(mOne.getTitle().equals(title)) {
				findList.add(mOne);
			}
		}
		return findList;
	}
	
	/**
	 * �̸����� �ε��� ��ȸ
	 * @param musicName
	 */
	public int searchOneByName(String musicName) {
		for(int i=0;i<mList.size();i++) {
			Music music = mList.get(i);
			if(musicName.equals(music.getTitle())) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * �ε����� ����Ʈ���� ��ȸ
	 * @return
	 */
	public Music selectOneByIndex(int index) {
		return mList.get(index);
	}
	

	/**
	 * ��ü ������ ��ȸ
	 * @return
	 */
	public List<Music> printMusicList() {
		return mList;
	}
	
	public void sortByTitleASC() {
		int nums[] = { 4, 3, 2, 1 };
		for (int i = 0; i < mList.size(); i++) {	//��������
			for (int e = 0; e < i; e++) {
				Music mOne = (Music) mList.get(i);
				Music mTwo = (Music) mList.get(e);
				if (mOne.getTitle().compareTo(mTwo.getTitle()) < 1) {
					Music temp = mOne;
					mList.set(i, mTwo);
					mList.set(e, temp);
				}
			}
		}
	}

	public void sortByTitleDESC() {
		int nums[] = { 4, 3, 2, 1 };
		for (int i = 0; i < mList.size(); i++) {
			for (int e = 0; e < i; e++) {
				Music mOne = (Music) mList.get(i);
				Music mTwo = (Music) mList.get(e);
				if (mOne.getTitle().compareTo(mTwo.getTitle()) > 1) {
					Music temp = mOne;
					mList.set(i, mTwo);
					mList.set(e, temp);
				}
			}
		}
	}
	
	public void sortBySingerASC() {
		int nums[] = { 4, 3, 2, 1 };
		for (int i = 0; i < mList.size(); i++) {
			for (int e = 0; e < i; e++) {
				Music mOne = (Music) mList.get(i);
				Music mTwo = (Music) mList.get(e);
				if (mOne.getSinger().compareTo(mTwo.getSinger()) < 1) {
					Music temp = mOne;
					mList.set(i, mTwo);
					mList.set(e, temp);
				}
			}
		}
		
		
		
	}
	
	public void sortBySingerDESC() {
		int nums[] = { 4, 3, 2, 1 };
		for (int i = 0; i < mList.size(); i++) {
			for (int e = 0; e < i; e++) {
				Music mOne = (Music) mList.get(i);
				Music mTwo = (Music) mList.get(e);
				if (mOne.getSinger().compareTo(mTwo.getSinger()) > 1) {
					Music temp = mOne;
					mList.set(i, mTwo);
					mList.set(e, temp);
				}
			}
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
