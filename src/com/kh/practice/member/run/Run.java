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
				String memberId = view.inputMemberId();
				int index = mc.findMemberId(memberId);
				if(index == -1 ) {
					System.out.println("해당 ID의 회원이 없습니다.");
				}
				Member mOne = mc.printOneByIndex(index);
				view.printOneById(mOne);
				break;
				
			case 3 : 
				String memberName = view.inputMemberName();
				int index2 = mc.findMemberName(memberName);
				if(index2 == -1 ) {
					System.out.println("해당 이름의 회원이 없습니다.");
				}
				Member mOne2 = mc.printOneByName(index2);
				view.printOneByName(mOne2);
				break;
				
			case 4 : 
				Member member = view.inputMember();
				mc.resisterMember(member);
				break;
				
			case 5 : break;
			case 6 : break;
			case 0 : break EXIT;
			default : break;
			}
		}

	}

}
