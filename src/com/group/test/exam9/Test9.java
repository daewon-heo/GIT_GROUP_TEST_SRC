package com.group.test.exam9;

import java.util.Scanner;

public class Test9 {
	/*
	 * 9.
	 *	https://book.naver.com/category/index.nhn?cate_code=280
	 *	해당 주소에서 순위별 책정보 10개를 저장한다(책이름, 순위, 가격, 출판사)
	 *	이후 사용자로부터 입력받은 정보에 대해서 출력해준다.
	 *	*결과 출력시 메소드 public String bookInfoPrint(){} 사용
	 *	
	 *	ex) 사용자 입력 		    => 	결과 출력(책이름, 순위, 가격, 출판사)
	 *	      순위, 3 			=> 	The Game Graphics (쉐이더&이펙트 1), 3, 31500, 비엘북스
	 *	    출판사, 이지퍼블리싱 	=> 	Do it! 점프 투 파이썬,1,16920, 이지스퍼블리싱
	 *	   가격, 20000 		=> 	가격이 2만원인 책정보 출력
	 *			 			없으면 "없는 책"이라고 알려주기.
	 *						해당되는 정보가 여러개면 여러개 출력.
	 */
	
	public void test(){
		// 입력부
		Book[] bookArr = new Book[10];
		bookArr[0] = new Book("직장인을 위한 실무 엑셀",1,18900,"길벗");
		bookArr[1] = new Book("윤성우의 열혈 C 프로그래밍",2,22500,"오렌지미디어");
		bookArr[2] = new Book("Do it! 점프 투 파이썬",3,16920,"이지스퍼블리싱");
		bookArr[3] = new Book("블록체인 무엇인가?",4,13500,"이지스퍼블리싱");
		bookArr[4] = new Book("된다! 김메주의 유튜브 영상 만들기",5,14400,"이지스퍼블리싱");
		bookArr[5] = new Book("모두의 파이썬",6,10800,"길벗");
		bookArr[6] = new Book("핸즈온 머신러닝",7,29700,"한빛미디어");
		bookArr[7] = new Book("밑바닥부터 시작하는 딥러닝",8,21600,"한빛미디어");
		bookArr[8] = new Book("클라우드 네이티브 자바",9,34200,"책만");
		bookArr[9] = new Book("엑셀의 신 회사에서 쓰는 실무엑셀",10,23220,"황금부엉이");
		
		// 출력부
		for (Book book : bookArr) {
			System.out.println(book.bookInfoPrint());
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색할 목록을 입력하세요 (책이름,순위,가격,출판사) : ");
		String category = sc.nextLine();
		
		System.out.print("검색어를 입력하세요 : ");
		String search = sc.nextLine();
		
		// 검색
		for(Book book : bookArr){
			switch (category) {
			case "책이름":
				if(book.getName().equals(search)){
					System.out.println(book.bookInfoPrint());
				}
				break;
			case "순위":
				if(book.getRank() == Integer.parseInt(search)){
					System.out.println(book.bookInfoPrint());
				}
				break;
			case "가격":
				if(book.getPrice() == Integer.parseInt(search)){
					System.out.println(book.bookInfoPrint());
				}
				break;
			case "출판사":
				if(book.getPub().equals(search)){
					System.out.println(book.bookInfoPrint());
				}
				break;
			default:
				System.out.println("error");
				break;
			}
			
		}
	}
}

class Book{
	private String name;
	private int rank;
	private int price;
	private String pub;
	
	public String getName() {
		return name;
	}
	
	public int getRank() {
		return rank;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getPub() {
		return pub;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setPub(String pub) {
		this.pub = pub;
	}
	
	public Book(){ }
	
	public Book(String name, int rank, int price, String pub){
		this.name = name;
		this.rank = rank;
		this.price = price;
		this.pub = pub;
	}
	
	public String bookInfoPrint(){
		return "순위 : " + rank + ", 책이름 : " +name + ", 가격 : " + price + "원, 출판사 : " + pub;
	}
}
