package com.javaex.basic;

//변수선언
public class VarEx {
	public static void main(String [] args) {
//		변수 식별자
//		문자, 숫자, $, _의조합
//		다만 숫자로 시작하면 안됨 
//		
//		변수명 
//		변수명은 소문자로 작성
//		단어의 조합일 경우 두번째 단어는 대문자로 시작
		//선언
		int myAge; //myAge라는 이름의 int(4byte) 변수 공간을 만든다
		//초기화
		myAge = 29; 
		
		int myAge2 = 29; //선언과 초기화를 동시에할수잇다
		
		//변수의 경우 선언시 데이터 타입 이외의 데이터는 넣을 수 없다.
		//myAge = 12345678901234567890; //Error
		
		//조회와 변경
		System.out.println("myAge의 내용 : " + myAge);
		myAge = myAge + 1;
		System.out.println("변경된 myAge의 내용: " + myAge);
	}
}
