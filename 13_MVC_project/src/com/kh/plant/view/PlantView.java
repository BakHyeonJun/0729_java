package com.kh.plant.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.plant.controller.PlantController;
import com.kh.plant.model.vo.Plant;

// View : 시각적인 부분 즉, 화면의 입/출력 담당.


public class PlantView {

	private Scanner sc = new Scanner(System.in);
	private PlantController pc = new PlantController();
	
	// 프로그램 실행시 보여줄 화면을 출력해주는 기능
	
	public void mainMenu() {
		while(true) {
			System.out.println();
			System.out.println("식물 관리 프로그램");
			
			// CRUD
			// C - Create : 사용자로부터 입력받은 값으로 새로운 식물 데이터를 추가(생성)하는 작업
			// R - Read : 생성된 식물 데이터를 조회하는 작업
			// U - Update : 기존의 식물 데이터를 수정하는 작업
			// D - Delete : 식물 데이터를 삭제하는 작업
			
			System.out.println("1. 식물 추가하기");
			System.out.println("2. 전체 식물 조회하기");
			System.out.println("3. 특정 식물 검색하기");
			System.out.println("4. 특정 식물 삭제하기");
			System.out.println("5. 특정 식물 수정하기");
			System.out.println("6. 식물 목록을 파일로 저장하기");
			System.out.println("0. 프로그램 종료하기");
			System.out.println();
			
			System.out.println("이용하고자 하는 기능을 선택하세요. > ");
			try {
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : createPlant(); break;
			case 2 : readAll(); break;
			case 3 : findByKeyword(); break;
			case 4 : deletePlant(); break;
			case 5 : updatePlant(); break;
			case 6 : pc.outputFile(); break;
			case 0 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
			}
			} catch(InputMismatchException e) {
				System.out.println("숫자만 입력해주세요.");
				sc.nextLine();
			}
			
			
		}

	
	}
	private void createPlant() {
		System.out.println("\n 식물 추가 서비스입니다.");
		System.out.print("식물 명을 입력해주세요. > ");
		String name = sc.nextLine();
		System.out.print("종류룰 입력해주세요. > ");
		String type = sc.nextLine();
		pc.createPlant(name, type);
	}
	// 식물 VO 클래스에 대입할 값 두 개를 입력받았으므로 View 클래스에서는 일단 할 일이 끝난 상태.
	// 사용자가 입력한 식물명과 종류를 갖고 식물 목록에 추가해달라고 요청하려 함.
	
	// 2. 전체 식물 목록을 출력해주는 기능
	private void readAll() {
		System.out.println();
		System.out.println("전체 식물 목록입니다.");
		List<Plant> plants = pc.readAll();
		
		// 경우의 수
		// case 1. 값이 없을 경우
		// case 2. 값이 하나일 경우
		// case 3. 값이 여러 개일경우
		
		if(plants.isEmpty()) {
			System.out.println("식물이 존재하지 않습니다. 새로운 식물을 추가하세요.");
		} else {
			
			for(Plant p : plants) {
				
			}
		}
		
		
	}
	
	// 3. 사용자가 식물에 대한 키워드를 입력할 수 있는 화면을 출력해주는 기능
	
	private void findByKeyword() {
		System.out.println();
		// 1. 사용자가 입력한 키워드가 제목에 포함되어있다면 출력
		// 2. 사용자가 입력한 키워드가 타입에 포함되어있다면 출력
		// 3. 사용자가 입력한 키워드가 제목 또는 타입에 포함되어있다면 출력 - o
		// 4. 사용자가 입력한 키워드가 제목과 타입에 둘 다 포함되어있다면 출력
		
		
		System.out.println("식물 검색 서비스입니다.");
		System.out.println("검색어를 입력해주세요. > ");
		String keyword = sc.nextLine();
		
		
		
		
		List<Plant> searched = pc.findByKeyword(keyword);  // Plant 들의 주소값을 담은 배열을 List로 가지고 있는 주소값을 가져오게 됨.
		
		if(searched.isEmpty()) {
			System.out.println("검색 결과가 존재하지 않습니다.");
		} else {
			System.out.println("조회 결과가 총 " + searched.size() + "건 존재합니다.");
			for(Plant p: searched) {
				System.out.println("========================");
				System.out.println("이름 : " + p.getName() + ", 종류 : " + p.getType());
			}
		}
	}
	

	
	
	
	private void deletePlant() {
		
		System.out.print("식물의 이름을 입력해주세요. > ");
		String name = sc.nextLine();
		System.out.print("식물의 종류를 입력해주세요. > ");
		String type = sc.nextLine();
		
		pc.deletePlant(name, type);
		
		
		int count = pc.deletePlant(name, type);
		
		if(count > 0) {
			System.out.println("삭제 완료");
			System.out.println(name + "을(를) 총 " + count + "개 삭제했습니다.");
		} else {
			System.out.println("삭제할 데이터를 찾지 못했습니다.");
		}
		System.out.println();
	}
	
	
	// 5. 특정 식물의 정보를 수정할 수 있는 화면을 출력해주는 기능
	private void updatePlant() {
		
		System.out.println();
		
		// 1. 이름 받아서 이름 변경
		// 2. 타입 받아서 타입 변경
		// 3. 이름, 타입 받아서 이름 변경
		// 4. 이름, 타입 받아서 타입 변경
		// 5. 이름 받아서 타입 변경
		// 6. 타입 받아서 이름 변경
		// 7. 이름, 타입 받아서 이름, 타입 변경 -> o
		// 등등 다양한 종류가 있을 수 있는데 이 중 어떤 방식을 취할 것인지 결정해야 함.
		
		// 사용자로부터 식물의 이름 및 타입 입력받고 일치하는 식물 찾아서 새로운 식물의 이름 및 타입으로 갱신하는 프로세스
		
		System.out.println("식물 정보 수정 서비스입니다.");
		// 4개의 값을 입력받아야 함. (변경 전 검색을 위한 이름, 타입. 변경을 위한 새로운 이름, 타입)
		System.out.println("식물 이름 검색 > ");
		String name = sc.nextLine();
		System.out.println("식물 타입 검색 > ");
		String type = sc.nextLine();
		System.out.println("새로운 식물 이름 > ");
		String newName = sc.nextLine();
		System.out.println("새로운 식물 타입 > ");
		String newType = sc.nextLine();
		
		// view는 일단 할 일 끝
		boolean result = pc.updatePlant(name, type, newName, newType);
		
		if(result) {
			System.out.println("갱신을 완료했습니다.");
		} else {
			System.out.println("해당 식물 데이터는 존재하지 않습니다.");
			
		}
		
		
	}
	
	}
	
	

