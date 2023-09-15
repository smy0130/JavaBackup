package com.acorn.driver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileDriverImpl implements FileDriver {

	@Override
	public ArrayList<String> flieOpen(String path)  {
		// 파일객체 생성 - 파일스트림 완성
		File file = new File(path);
		FileReader fr = null;
		BufferedReader br = null;
		ArrayList<String> sArrList = new ArrayList<>();
		// 파일조작 객체 생성
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			// 파일 읽거나 쓰기
			String oneLine = null;
			while((oneLine = br.readLine()) != null) {
				sArrList.add(oneLine);
			}
			// 파일 종료
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return sArrList;
	}

	@Override
	public String searchContents(ArrayList<String> sArrList, 
			String searchword) {
		String sRet = null;
		for(String str : sArrList) {
			if(str.contains(searchword)) {
				sRet = str;
				break;
			}
		}
		return sRet;
	}
}
