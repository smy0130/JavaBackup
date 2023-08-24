package com.acorn;

public class Main {
	public static void main(String[] args) {
		int iHeath = 100; int iEffect = 0; int iCheckSound = 0;  // iCheckSound: 플레이어에 의해 설정된 게임 설정값
		
		 boolean bRet = makeHealthFull(iHeath); // startPlay에 대해 include
		 if(bRet) {
			 startPlay();
			 smashCar(1); // 단순관계
			 if(smashCar(1) == 1) { playCrashAudio(); } // include
			 playCrashAudio();  // 단순 관계
			 if(smashCar(1) == 1) {
				 if(iCheckSound == 1) { playCrashAudio(); } else { playSlientCrashAudio(); }  // extend
			 }
		 }
	}

	private static void playSlientCrashAudio() { System.out.println("침묵"); }

	private static void playCrashAudio() { System.out.println("사운드재생"); }

	private static int smashCar(int iType) { showCrashEffect(iType); return 1; }

	private static int showCrashEffect(int iEffect) {
		if(iEffect == 0) { return 0; } else { return 1; }
	}

	private static void startPlay() { }

	private static boolean makeHealthFull(int iHealth) {
		if(iHealth == 100) { return true; } else return false;		
	}
}
