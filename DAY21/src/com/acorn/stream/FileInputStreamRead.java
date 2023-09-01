package com.acorn.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamRead {
	private final static String FILEDIRBASE = "C:/eclipse-java-2020-12-R-win32-x86_64/"
			+ "eclipse/workspace/day23/src/com/acorn/stream/";
	
	public static void main(String[] args) {
		String sInFileName = FILEDIRBASE + "testdata.txt";
		String sOutFileName = FILEDIRBASE + "testdataout.txt";
		
		// 파일시스템 관리자에게 iNode 요청해서
		// 파일시스템과 하드디스크 사이에 연결된 채널(스트림)정보 얻어옴
		File objInFile = new File(sInFileName); 
		File objOutFile = new File(sOutFileName); 
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(objInFile);
			
			int iBiteStreamCnt = fis.available();
			int[] iFileDataArray = new int[iBiteStreamCnt];
			int idx = 0;
			int iReadVal = 0;
			while(iBiteStreamCnt > 0) {
				iReadVal = fis.read();
				System.out.print((char)iReadVal);
				iFileDataArray[idx] = iReadVal;
				iBiteStreamCnt = fis.available();
				idx++;
			}
			
			fos = new FileOutputStream(objOutFile);
			for(int i = 0; i < iFileDataArray.length; i++) {
				fos.write(iFileDataArray[i]);
			}
			
			// 파일 복사
			// fis.read(): 정수배열에 저장, 문자로 출력
			// FileOutputStream 객체 만드시고: 파일이름(testdataout.txt) 정하고, 객체 생성
			// testdataout.txt 쓰기
			
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일이 존재하지 않습니다.");
//			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("입출력 에러");
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
