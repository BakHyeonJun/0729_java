package com.kh.plant.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.plant.model.dao.PlantDao;
import com.kh.plant.model.vo.Plant;

// Controller : 사용자가 View를 통해 요청했을 때
// 요청을 받아 처리해준 뒤 다시 처리결과를 View로 반환해줌.

public class PlantController {

	
	private List<Plant> plants = new ArrayList();
	private PlantDao pd = new PlantDao();
	
	// 초기화블록
	{
		plants.add(new Plant("안시리움", "분재"));
	}
	
	public void createPlant(String name, String type) {
		
		Plant plant = new Plant(name, type);
		
		// 식물 저장소에 새로운 식물을 추가
		// 필드로 가지고 있는 List의 필드로 가지고 있는 Object[]의 요소로 추가
		
		plants.add(plant);
		
		System.out.println("축하합니다. 새로운 식물이 추가되었습니다.");
		
	}
	
	public List<Plant> readAll() {
		return plants;
	}
	
	public int deletePlant(String name, String type) {
		// 사용자가 입력한 식물이름 + 식물종류와 일치하는 필드값을 가진 Plant 객체를 제거하려 함
		// case 1. 동일한 이름 및 종류를 가진 식물이 존재하지 않을 경우
		// case 2. 동일한 이름 및 종류를 가진 식물이 하나 존재할 경우
		// case 3. 동일한 이름 및 종류를 가진 식물이 여러 개 존재할 경우
		// 성공/실패 여부에 따라서 View에게 반환값을 다르게 돌려주어야 함.
		
		// 식물 데이터 제거 후 제거된 객체를 ~
		
		
		
		// 요소가 삭제될 때마다 정수값을 증가시키고 증가된 정수만 반환토록 함.
		int count = 0;

		for(int i = 0; i < plants.size(); i++) {
			if(name.equals(plants.get(i).getName()) &&
			type.equals(plants.get(i).getType())) {
				
				plants.remove(plants.get(i));
				count++;
			}
		}
		
		return count;
		
		
	}

	// PlantView로부터 식물 검색 요청이 왔을 때 호출되는 메소드
	public List<Plant> findByKeyword(String keyword) {
		
		// 1. Plant[] -> 그러나 검색 결과가 몇 개가 나올지 알 수 없으므로 몇 칸짜리 배열일지를 미리 특정하는 것이 불가
		// 2. List<Plant>
		List<Plant> searched = new ArrayList();
		
		// 식물의 이름 또는 타입에 사용자가 입력한 키워드가 포함되어있을 경우 모두 가져와서 출력하도록 하는 것
		// 조회 -> 사용자가 입력한 키워드가 포함된 Plant 객체의 필드값을 확인
		// plants의 요소를 전부 일일이 확인하면서 체크
		
		// 1. plants의 요소의 개수만큼 반복
		for(int i = 0; i < plants.size(); i++) {
			// 2. 요소를 변수에 대입
			Plant plant = plants.get(i);
			// 2_2. plant 객체의 name 필드 혹은 type 필드에 사용자가 입력한 keyword가 포함되어 있다면
			if(plant.getName().contains(keyword) || 
			plant.getType().contains(keyword)) {
				searched.add(plant);
			}
			
		}
		return searched;
		
	}
	
	public boolean updatePlant(String name, String type, String newName, String newType) { // 일반적으로는 public int로 가서 검색결과와 일치하는 것들의 개수를 파악하고 모두 수정하는 것이 기본적인 접근법이겠으나, 여기서는 boolean 타입으로 접근해봄.
		
		// 요청 처리
		
		
		for(int i = 0; i < plants.size(); i++) {
			Plant p = plants.get(i);
			if(name.equals(p.getName()) &&
			type.equals(p.getType())) {
				// 일치하는 식물이 존재하는 경우, 사용자가 입력한 새 이름 및 새 타입을 갱신
				// plants.set(i, new Plant(newName, newType)); // set은 첫 번째 인자인 인덱스 위치의 요소를 두 번째 인자로 설정하는 메소드. 이 방법도 가능하나
				p.setName(newName);
				p.setType(newType); // 이 방법이 더 수월함
		return true;		 		
			} 
			
			
			
		}
		return false;
				
	}
	
	public void outputFile() {
		pd.outputFile(plants);
	
	}
}
