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
				view.dispaySuccess("추가 성공!");
				break;
			case 2: 
				music = view.inputMusicInfo("첫");
				mCon.addAtZero(music);
				view.dispaySuccess("추가 성공!");
				break;
			case 3: 
				List<Music> allList = mCon.printMusicList();
				break;
			case 4: 
				title = view.inputMusicName("검색");
				List<Music> findList = mCon.searchMusicsByName(title);
				view.showAllMusicList(findList);
				view.dispaySuccess("조회 성공!");
				break;
			case 5:
				title = view.inputMusicName("삭제");
				index = mCon.searchOneByName(title);
				if(index ==-1) {
					view.dispayError("존재하지 않습니다.");
					break;
				}
				mCon.removeMusic(index);
				break;
			case 6: 
				title = view.inputMusicName("수정");	//이름받기
				index = mCon.searchOneByName(title);	//이름으로 인덱스 검색
				if(index ==-1) {
					view.dispayError("조회 실패!");
					break;
				}
				music = view.modiftMusicInfo();	//가져온 데이터 수정
				mCon.updateMusic(index, music);			//저장소에 수정하기
				view.dispaySuccess("삭제 성공!");
				break;
			case 7: 
				view.printMessage("곡명 오름차순 정렬");
				mCon.sortByTitleASC();
				view.printMessage("정렬 성공! 3번을 눌러 출력하세요.");
				break;
			case 8:
				view.printMessage("곡명 내림차순 정렬");
				mCon.sortByTitleDESC();
				view.printMessage("정렬 성공! 3번을 눌러 출력하세요.");
				break;
			case 9: 
				view.printMessage("가수명 오름차순 정렬");
				mCon.sortBySingerASC();
				view.printMessage("정렬 성공! 3번을 눌러 출력하세요.");
				break;
			case 10:
				view.printMessage("가수명 내림차순 정렬");
				mCon.sortBySingerDESC();
				view.printMessage("정렬 성공! 3번을 눌러 출력하세요.");
				break;
			}
		} while(select != 0);

	}

}
