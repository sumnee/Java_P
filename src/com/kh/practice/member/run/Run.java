package com.kh.practice.member.run;

import java.util.List;

import com.kh.practice.member.controller.MemberController;
import com.kh.practice.member.model.vo.Member;
import com.kh.practice.member.view.MemberView;

public class Run {
	public static void main(String[] args) {
		
		MemberView view = new MemberView();
		MemberController mc = new MemberController();
		
		EXIT :
		while(true) {
			int choice = view.mainMenu();
			switch(choice) {
			case 1 : 
				List<Member> mList = mc.printAllMember();
				view.showAllMember(mList);
				break;
				
			case 2 : 
				String memberId = view.inputMemberId("�˻�");
				Member mOne = mc.findMemberId(memberId);
				if(mOne == null) {
					// �����ϴ� �޽��� ���
				}
//				int index = mCon.findMemberId(memberId);
//				if(index == -1) {
//					view.displayError("�ش� ���̵��� ȸ���� �����ϴ�.");
//				}
//				Member mOne = mCon.printOneByIndex(index);
				view.showOneMember(mOne);
				break;
				
			case 3 : 
				String memberName = view.inputMemberName("�˻�");
				Member memOne = mc.findMemberName(memberName);
				view.showOneMember(memOne);
				break;
				
			case 4 : 
				Member member = view.inputMember();
				mc.resisterMember(member);
				view.displaySuccess("������ �Ϸ�Ǿ����ϴ�.");
				break;
				
			case 5 :
				member = view.modifyMember();
				mc.updateMember(member);
				view.displaySuccess("������ �Ϸ�Ǿ����ϴ�.");
				break;
			
			case 6 : 
				memberId = view.inputMemberId("����");
				int index = mc.findMemberIndex(memberId);
				mc.removeMember(index);
				view.displaySuccess("������ �����Ǿ����ϴ�.");
				break;
				
			case 0 : break EXIT;
			default : break;
			}
		}

	}

}
