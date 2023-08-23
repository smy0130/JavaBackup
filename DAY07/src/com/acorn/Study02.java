package com.acorn;

import java.util.Scanner;

public class Study02 {

	public static void main(String[] args) {
		boolean matchFlag = false;
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("생성하고자하는 비밀번호입력>>> ");
		String iPassInputValue = sc.nextLine();		

		if( ((iPassInputValue.charAt(0)) < 48) || ((iPassInputValue.charAt(0)) > 57) )
		{
			System.out.println("비밀번호 첫자리가 1~10사의 값이 아닙니다.");
		} 
		else
		{
			if(iPassInputValue.length() == 4)
			{				
				for(int i = 1; i < iPassInputValue.length(); i++)
				{
					for(int j = i-1; j >= 0; j--)
					{
						if( iPassInputValue.charAt(i) == iPassInputValue.charAt(j) ) {	
							matchFlag = true;
							break;
						}		
					}
					if(matchFlag) { System.out.println("일치하는 값이 있습니다."); break; }
				}
			} else
			{
				System.out.println("비밀번호가 정해진 자리수(4)에 부합하지 않습니다.");
			}
		}

		
		sc.close();
		

	}

}
