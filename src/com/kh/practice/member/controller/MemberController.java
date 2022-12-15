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
	
	public List<Member> printAllMember() {
		return mList;	//mList는 List 타입이니까 리턴타입 List<Member>
	}
	
	public int findMemberId(String memberId) {
		for(int i=0;i<mList.size();i++) {
			Member mOne = mList.get(i);
			if(memberId.equals(mOne.getMemberId())) {
				return i;	//찾은 위치 알려줌
			}
		} 
		return -1; //못찾았다고 알려주는  것
	}
	
	public Member printOneByIndex(int index) {
		Member member = mList.get(index);	//리턴된 인덱스값을 이용해 데이터 찾기
		return member;	
	}
	
	public int findMemberName(String memberName) {
		for(int i=0;i<mList.size();i++) {
			Member mOne2 = mList.get(i);
			if(memberName.equals(mOne2.getMemberName())) {
				return i;
			}
		}
		return -1;
	}
	
	public Member printOneByName(int index2) {
		Member member = mList.get(index2);
		return member;
	}
	
	
	
	
	
	
}
