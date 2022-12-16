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
	
	public void updateMember(Member member) {
		for(int i = 0; i <mList.size();i++) {
			String memberId = member.getMemberId();	//�ԷµȰ�
			Member storedMember = mList.get(i);
			String storedId = mList.get(i).getMemberId();	//����Ȱ�
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
		return mList;	//mList�� List Ÿ���̴ϱ� ����Ÿ�� List<Member>
	}
	
	// ���� ���� ���� �� �ε����� ����
	public int findMemberIndex(String memberId) {
			for(int i = 0; i < mList.size(); i++) {
				// memberId�� ���� �����Ͱ�
				// mList�� �ִ��� ã�ƺ���!
				Member mOne = mList.get(i);
				// �Ѱܹ��� memberId�� mOne�� �ִ��� Ȯ��
				if(memberId.equals(mOne.getMemberId())) {
					return i;
				}
			}
			return -1;
		}
		
	// ���� ���� ���� �� �ش� ��ü�� ����	
	public Member findMemberId(String memberId) {
		for(int i=0;i<mList.size();i++) {
			Member mOne = mList.get(i);
			if(memberId.equals(mOne.getMemberId())) {
				return mOne;	//ã�� ��ġ �˷���
			}
		} 
		return null; //��ã�Ҵٰ� �˷��ִ�  ��
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
