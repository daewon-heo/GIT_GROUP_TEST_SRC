package com.group.test4.exam5;

public class Test5 {
	public void test() {
		String[] fileArr = { "video.mp4", "music.mp3", "text.txt", "bandi.zip", "image.jpg" };
		
		for (int i = 0; i < fileArr.length; i++) {
			String[] str = fileArr[i].split("\\.");
			String exName = "";
			
			switch (str[1]) {
			case "mp4":
				exName = "영상";
				break;
			case "mp3":
				exName = "소리";
				break;
			case "txt":
				exName = "텍스트";
				break;
			case "zip":
				exName = "압축";
				break;
			case "jpg":
				exName = "그림";
				break;
			}
			
			System.out.println(exName + " 파일 이름 : " + str[0]);
		}
	}
}
