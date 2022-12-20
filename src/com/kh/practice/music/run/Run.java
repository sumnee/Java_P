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
				music = view.inputMusicInfo("������");
				mCon.addAtLast(music);
				view.dispaySuccess("�߰� ����!");
				break;
			case 2: 
				music = view.inputMusicInfo("ù");
				mCon.addAtZero(music);
				view.dispaySuccess("�߰� ����!");
				break;
			case 3: 
				List<Music> allList = mCon.printMusicList();
				break;
			case 4: 
				title = view.inputMusicName("�˻�");
				List<Music> findList = mCon.searchMusicsByName(title);
				view.showAllMusicList(findList);
				view.dispaySuccess("��ȸ ����!");
				break;
			case 5:
				title = view.inputMusicName("����");
				index = mCon.searchOneByName(title);
				if(index ==-1) {
					view.dispayError("�������� �ʽ��ϴ�.");
					break;
				}
				mCon.removeMusic(index);
				break;
			case 6: 
				title = view.inputMusicName("����");	//�̸��ޱ�
				index = mCon.searchOneByName(title);	//�̸����� �ε��� �˻�
				if(index ==-1) {
					view.dispayError("��ȸ ����!");
					break;
				}
				music = view.modiftMusicInfo();	//������ ������ ����
				mCon.updateMusic(index, music);			//����ҿ� �����ϱ�
				view.dispaySuccess("���� ����!");
				break;
			case 7: 
				view.printMessage("��� �������� ����");
				mCon.sortByTitleASC();
				view.printMessage("���� ����! 3���� ���� ����ϼ���.");
				break;
			case 8:
				view.printMessage("��� �������� ����");
				mCon.sortByTitleDESC();
				view.printMessage("���� ����! 3���� ���� ����ϼ���.");
				break;
			case 9: 
				view.printMessage("������ �������� ����");
				mCon.sortBySingerASC();
				view.printMessage("���� ����! 3���� ���� ����ϼ���.");
				break;
			case 10:
				view.printMessage("������ �������� ����");
				mCon.sortBySingerDESC();
				view.printMessage("���� ����! 3���� ���� ����ϼ���.");
				break;
			}
		} while(select != 0);

	}

}
