package com.kh.practice.member.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.member.model.vo.Member;

public class MemberController {
	
	List<Member>mList;
	
	public MemberController () {
		mList = new ArrayList<Member>(); //�����ڿ��� ��ü �ʱ�ȭ
	}

	public void resisterMember (Member member) {
		mList.add(member);
	}
	
	public List<Member> printAllMember() {
		return mList;	//mList�� List Ÿ���̴ϱ� ����Ÿ�� List<Member>
	}
	
	public int findMemberId(String memberId) {
		for(int i=0;i<mList.size();i++) {
			Member mOne = mList.get(i);
			if(memberId.equals(mOne.getMemberId())) {
				return i;	//ã�� ��ġ �˷���
			}
		} 
		return -1; //��ã�Ҵٰ� �˷��ִ�  ��
	}
	
	public Member printOneByIndex(int index) {
		Member member = mList.get(index);	//���ϵ� �ε������� �̿��� ������ ã��
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
