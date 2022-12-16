package com.kh.practice.member.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.member.model.vo.Member;

public class MemberController {
	
	List<Member>mList;
	
	public MemberController () {
		mList = new ArrayList<Member>(); //생성자에서 객체 초기화
	}

	public void resisterMember (Member member) {
		mList.add(member);
	}
	
	public void updateMember(Member member) {
		for(int i = 0; i <mList.size();i++) {
			String memberId = member.getMemberId();	//입력된것
			Member storedMember = mList.get(i);
			String storedId = mList.get(i).getMemberId();	//저장된것
			if(storedId.equals(memberId)) {
				storedMember.setMemberPwd(member.getMemberPwd());
				storedMember.setMemberEmail(member.getMemberEmail());
				storedMember.setMemberPhone(member.getMemberPhone());
				storedMember.setMemberAddress(member.getMemberAddress());
				storedMember.setMemberHobby(member.getMemberHobby());
			}
		}
	}
	
	public void removeMember (int index) {
		mList.remove(index);
		
	}
	public List<Member> printAllMember() {
		return mList;	//mList는 List 타입이니까 리턴타입 List<Member>
	}
	
	// 같은 값이 있을 때 인덱스를 리턴
	public int findMemberIndex(String memberId) {
			for(int i = 0; i < mList.size(); i++) {
				// memberId와 같은 데이터가
				// mList에 있는지 찾아보기!
				Member mOne = mList.get(i);
				// 넘겨받은 memberId가 mOne에 있는지 확인
				if(memberId.equals(mOne.getMemberId())) {
					return i;
				}
			}
			return -1;
		}
		
	// 같은 값이 있을 때 해당 객체를 리턴	
	public Member findMemberId(String memberId) {
		for(int i=0;i<mList.size();i++) {
			Member mOne = mList.get(i);
			if(memberId.equals(mOne.getMemberId())) {
				return mOne;	//찾은 위치 알려줌
			}
		} 
		return null; //못찾았다고 알려주는  것
	}

	
	public Member findMemberName(String memberName) {
		for(int i=0;i<mList.size();i++) {
			Member mOne = mList.get(i);
			if(memberName.equals(mOne.getMemberName())) {
				return mOne;
			}
		}
		return null;

	}
}
