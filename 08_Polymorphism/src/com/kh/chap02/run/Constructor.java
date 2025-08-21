package com.kh.chap02.run;

import com.kh.chap02.model.vo.BeerDrinker;
import com.kh.chap02.model.vo.Drinker;
import com.kh.chap02.model.vo.MakgeolliDrinker;
import com.kh.chap02.model.vo.SojuDrinker;

public class Constructor {

	public static void main(String[] args) {

		SojuDrinker s1 = new SojuDrinker(4);
		SojuDrinker s2 = new SojuDrinker(5);
		BeerDrinker b1 = new BeerDrinker(false);
		BeerDrinker b2 = new BeerDrinker(true);
		MakgeolliDrinker m1 = new MakgeolliDrinker(40);
		MakgeolliDrinker m2 = new MakgeolliDrinker(60);
		
		System.out.println("====================");
		SojuDrinker[] sojuArr = new SojuDrinker[2];
		BeerDrinker[] beerArr = new BeerDrinker[2];
		MakgeolliDrinker[] makArr = new MakgeolliDrinker[2];
		
		sojuArr[0] = s1;
		sojuArr[1] = s2;
		beerArr[0] = b1;
		beerArr[1] = b2;
		makArr[0] = m1;
		makArr[1] = m2;
		
		for(int i = 0; i < sojuArr.length; i++) {
			sojuArr[i].drink();
			sojuArr[i].eat();
		}
		for(int i = 0; i < beerArr.length; i++) {
			beerArr[i].drink();
			beerArr[i].eat();
		}
		for(int i = 0; i < makArr.length; i++) {
			makArr[i].drink();
			makArr[i].eat();
		}
		// 객체 배열을 통해서 변수 생성 개수를 줄인 방법이기는 하나 더 줄일 수 있다.
		
		System.out.println("====================");
		
		Drinker[] drinkArr = new Drinker[6];
		drinkArr[0] = s1;
		drinkArr[1] = s2;
		drinkArr[2] = b1;
		drinkArr[3] = b2;
		drinkArr[4] = m1;
		drinkArr[5] = m2;
		
		for (int i = 0; i < drinkArr.length; i++) {
			drinkArr[i].drink();
			drinkArr[i].eat();
		}
		// 이것이 바로 상속과 다형성(타입 숨기기의 의미가 있음) 개념을 통한 간략화.
	}

}
