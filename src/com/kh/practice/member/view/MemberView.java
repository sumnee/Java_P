package com.kh.practice.member.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.member.model.vo.Member;

public class MemberView {
		/*
		  ======= ȸ������ ���α׷� =======
		1. ȸ������ ��ü��ȸ
		2. ȸ�� ���̵�� ��ȸ
		3. ȸ�� �̸����� ��ȸ
		4. ȸ������
		5. ȸ������ ����
		6. ȸ��Ż��
		0. ���α׷� ����
		�޴� ���� :
		 */
	
	Scanner sc = new Scanner(System.in);
	
	public int mainMenu() {
		
		System.out.println("======= ȸ������ ���α׷� =======");
		System.out.println("1. ȸ������ ��ü��ȸ");
		System.out.println("2. ȸ�� ���̵�� ��ȸ");
		System.out.println("3. ȸ�� �̸����� ��ȸ");
		System.out.println("4. ȸ������");
		System.out.println("5. ȸ������ ����");
		System.out.println("6. ȸ��Ż��");
		System.out.println("0. ���α׷� ����");
		System.out.print("   �޴� ���� >>>  ");
		int input = sc.nextInt();
		return input;
	}
	
	public void showAllMember(List<Member> mList) {
		System.out.println("=== === ȸ������ ��ü��ȸ === ===");
		for(Member mOne : mList) {
			System.out.println("ȸ�� ���̵� : " + mOne.getMemberId());
			System.out.println("ȸ�� �̸� : " + mOne.getMemberName());
			System.out.println("ȸ�� ���� : " + mOne.getMemberGender());
			System.out.println("ȸ�� ���� : " + mOne.getMemberAge());
			System.out.println("ȸ�� �̸��� : " + mOne.getMemberEmail());
			System.out.println("ȸ�� ����ȣ : " + mOne.getMemberPhone());
			System.out.println("ȸ�� �ּ� : " + mOne.getMemberAddress());
			System.out.println("ȸ�� ��� : " + mOne.getMemberHobby());
			System.out.println("=== === === === === === === === === ===");
	
		}
	}
	
	public void showOneMember(Member mOne) {
		System.out.println("=== === === ȸ������ ����ȸ === === ===");
		System.out.println("ȸ�� ���̵� : " + mOne.getMemberId());
		System.out.println("ȸ�� �̸� : " + mOne.getMemberName());
		System.out.println("ȸ�� ���� : " + mOne.getMemberGender());
		System.out.println("ȸ�� ���� : " + mOne.getMemberAge());
		System.out.println("ȸ�� �̸��� : " + mOne.getMemberEmail());
		System.out.println("ȸ�� ����ȣ : " + mOne.getMemberPhone());
		System.out.println("ȸ�� �ּ� : " + mOne.getMemberAddress());
		System.out.println("ȸ�� ��� : " + mOne.getMemberHobby());
		System.out.println("=== === === === === === === === === ===");
	}

	public Member modifyMember() {
		System.out.println("���̵� : ");
		String memberId = sc.next();
		System.out.println("��й�ȣ : ");
		String memberPwd = sc.next();
		System.out.println("�̸��� : ");
		String memberEmail = sc.next();
		System.out.println("��ȭ��ȣ : ");
		String memberPhone = sc.next();
		System.out.println("�ּ� : ");
		sc.nextLine();
		String memberAddress = sc.nextLine();
		System.out.println("��� : ");
		String memberHobby = sc.next();
		
		Member member = new Member();	
		member.setMemberId(memberId);
		member.setMemberPwd(memberPwd);
		member.setMemberEmail(memberEmail);
		member.setMemberPhone(memberPhone);
		member.setMemberAddress(memberAddress);
		member.setMemberHobby(memberHobby);
		return member;
		
	}
	
	public Member inputMember() {	
		System.out.println("���̵� : ");	//�Է�
		String memberId = sc.next();
		System.out.println("��й�ȣ : ");
		String memberPwd = sc.next();
		System.out.println("�̸� : ");
		String memberName = sc.next();
		System.out.println("���� : ");
		int memberAge = sc.nextInt();
		System.out.println("���� : ");
		String memberGender = sc.next();
		System.out.println("�̸��� : ");
		String memberEmail = sc.next();
		System.out.println("��ȭ��ȣ : ");
		String memberPhone = sc.next();
		System.out.println("�ּ� : ");
		sc.nextLine();
		String memberAddress = sc.nextLine();
		System.out.println("��� : ");
		String memberHobby = sc.next();
		
		Member member = new Member();		//����
		member.setMemberId(memberId);
		member.setMemberPwd(memberPwd);
		member.setMemberName(memberName);
		member.setMemberGender(memberGender);
		member.setMemberEmail(memberEmail);
		member.setMemberPhone(memberPhone);
		member.setMemberAddress(memberAddress);
		member.setMemberHobby(memberHobby);
		return member;		//return���� member�� Ÿ���� Member�� ��ȯ��
	}

	public String inputMemberId(String category) {
		System.out.println(category + "�� ���̵� �Է� : ");
		String memberId = sc.next();
		return memberId;
	}
	

	public String inputMemberName(String category) {
		System.out.println(category + "�� �̸� �Է� : ");
		String memberName = sc.next();
		return memberName;		
	}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
	public void displaySuccess(String message) {
		System.out.println("[ó�����] : " + message);
	}

	public void displayError(String message) {
		System.out.println("[�����߻�] : " + message);
	}
	
	
}
