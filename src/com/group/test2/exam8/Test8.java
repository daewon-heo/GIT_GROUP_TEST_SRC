package com.group.test2.exam8;

import java.util.Scanner;

public class Test8 {
	
	public void test(){
		Scanner sc = new Scanner(System.in);
		Car car = new Car(0);
		
		System.out.println("출발대기...");
		
		do{
			System.out.print("속도 입력 : ");
		}while(car.controlSpeed(sc.nextInt()));
	}
}

class Car{
	private int speed;
	
	public Car(int speed){
		this.speed = speed;
	}
	
	public boolean controlSpeed(int speed){
		boolean result = true;
		this.speed += speed;
		
		if(this.speed < 0 ) this.speed = 0;
		
		printSpeed(this.speed);
		
		if(this.speed >= 100){
			System.out.println("과속입니다. 속도를 줄이세요");
			result = true;
		}else if(this.speed <= 0){
			System.out.println("정지합니다");
			result = false;
		}
		
		return result;
	}
	
	public void printSpeed(int speed){
		System.out.println(speed + "km/h의 속도로 주행합니다.");
	}
}
