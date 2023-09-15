package com.acorn.driver;

import java.util.ArrayList;

public class FileClient {

	public static void main(String[] args) {
		String fName = "C:/eclipse-java-2020-12-R-win32-x86_64/"
				+ "eclipse/workspace/day31/src/com/acorn/driver/"
				+ "데이터정보저장.txt";
		
		String searchWord = "경기";
		
		FileDriver fdr = new FileDriverImpl();
		ArrayList<String> aStrList = fdr.flieOpen(fName);
		String sRet = fdr.searchContents(aStrList, searchWord);
		System.out.println(sRet);
		
	}

}
