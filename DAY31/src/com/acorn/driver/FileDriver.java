package com.acorn.driver;

import java.util.ArrayList;

public interface FileDriver {
	ArrayList<String> flieOpen(String path);
	String searchContents(ArrayList<String> sArrList, String searchword);
}
