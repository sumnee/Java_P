package com.kh.practice.music.run;

import java.util.List;

import com.kh.practice.music.controller.MusicController;
import com.kh.practice.music.model.vo.Music;
import com.kh.practice.music.view.MusicView;

public class Run {

	public static void main(String[] args) {
		MusicView view = new MusicView();
		MusicController mCon = new MusicController();
		int select =0;
		int index =0;
		String title = "";
		Music music = null;
		do {
			select = view.musicMenu();
			switch(select) {
			case 1: 
				music = view.inputMusicInfo("마지막");
				mCon.addAtLast(music);
				break;
			case 2: 
				music = view.inputMusicInfo("첫");
				mCon.addAtZero(music);
				break;
			case 3: 
				List<Music> allList = mCon.printMusicList();
				break;
			case 4: 
				title = view.inputMusicName("검색");
				index = mCon.searchOneByName(title);
				music = mCon.selectOneByIndex(index);
				view.showOneMusic(music);
				break;
			case 5:
				title = view.inputMusicName("삭제");
				index = mCon.searchOneByName(title);
				mCon.removeMusic(index);
				break;
			case 6: 
				title = view.inputMusicName("수정");	//이름받기
				index = mCon.searchOneByName(title);	//이름으로 인덱스 검색
				music = view.modiftMusicInfo();	//가져온 데이터 수정
				mCon.updateMusic(index, music);			//저장소에 수정하기
				break;
			case 7: break;
			case 8: break;
			case 9: break;
			case 10: break;
			}
		} while(select != 0);

	}

}
