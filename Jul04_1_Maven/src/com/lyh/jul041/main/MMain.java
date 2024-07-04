package com.lyh.jul041.main;

import com.lyh.http.client.LyhHttpClient;

// Java 전 세계적으로 많이 사용
//		개발자들이 본인이 만들어 놓은 것들을 공유 !
//		소스 자체를 공유 X, .jar파일 만들어서 공유하는 문화 O
//		.jar파일을 자동으로 관리해주는 시스템 : Maven
//		Maven 중앙 저장소 : https://mvnrepository.com/

// Maven을 활용하면
//		Maven 중앙 저장소에 저장이 되어있는 .jar파일을
//		컴퓨터의 Maven로컬 저장소 : C:\Users\sdedu\.m2\repository 

// Maven 중앙저장소에 없는 것들 : 로컬저장소를 활용하면 됨!
//		우리가 만든 보물들... dbm, hc, ...
//////////////////////////////////////////////////////////////////////////
// Maven 새로고침
// Window - show view - other - 'maven' 검색
//	Maven Repositories - Local Repositories - Local Repository 우클릭
//		=> rebuild index
//////////////////////////////////////////////////////////////////////////
// Maven 사설저장소 등록하는 법
// 프로젝트 우클릭 - import - 'maven'검색
//		- install or deploy ~~~ 클릭
// Browse -> 등록할 라이브러리 넣기 => Group Id, Artifact Id 설정
//		=> 버전은 마음대로 => Packaging은 jar파일
// pom.xml => Dependencies 클릭 => Add => Artifact Id로 검색 => 선택 
//////////////////////////////////////////////////////////////////////////
// Maven Error
//	=> 이클립스 종료 => 로컬저장소 지우기(repository폴더) => 이클립스 재시동 
//		=> 다운받을거 다시 받기
// 로컬저장소 위치 : C:\Users\sdedu\.m2\repository
// 오늘부터 이클립스 재시동할 때 꼭 해야하는것
// (이클립스 켜기 전)
//	Spring workspace가 있는 곳으로 가서
//		.metadata
//			.plugins
//				org.eclipse.datatools.sqltools.result 폴더 삭제



public class MMain {
	public static void main(String[] args) {
		LyhHttpClient lhc;
	}
}
