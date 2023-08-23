package com.acorn;


public class Study01 {
    public static void main(String[] args) {
        for(int i = 0; i<3; i++){
            System.out.println("Java" + (i+1));
        }

        int[] iCountArr = {3, 4, 5, 6, 7};
        for(int i = 0; i<iCountArr.length; i++){
            System.out.println(iCountArr[i]);
        }
        char[] cInfoArr = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        for(int i = 0; i < iCountArr.length ; i++){
            for(int j = 0 ; j < iCountArr[i] ; j++){
                System.out.print(cInfoArr[j]);
            }
            System.out.println();
        }

        char[] cInfoArr1 = {
                'a','b','c','d','e','f','g',
                'f','e','d','c','b','a','b',
                'a','b','c','d','e','f','g',
                'g','f','e','d','c','b','a',
                'g','f','e','d','c','b','a'
        };
        int[] iCountArr2 = {3, 4, 5, 4, 5, 6, 7};
        int iStartIndex = 0;
        for(int i = 0; i<iCountArr2.length;i++){
            for(int j = iStartIndex; j < (iCountArr2[i] + iStartIndex); j++){
                System.out.print(cInfoArr1[j]);
            }
            System.out.println();

            iStartIndex = iStartIndex + iCountArr2[i];
        }
    }
}
