package com.acorn;

// 메서드 오버로딩
public class MethodMain06Teacher {

	public static void main(String[] args) {
		
		int[] iTargetValArr = {30, 50, 10, 70, 90, 5};

		int iMaxVal = 0;
		
		iMaxVal = getFindMaxVal(iTargetValArr);
		System.out.println("최대값: " + iMaxVal);
	}


	// {30, 50, 10, 70, 90, 30}
	public static int getFindMaxVal(int[] iTargetValArr) {
		int iTempMaxVal = iTargetValArr[0];
		for(int x : iTargetValArr) {
			if(iTempMaxVal < x) {
				iTempMaxVal = x;
			}
		}
		return iTempMaxVal;
	}
	



}