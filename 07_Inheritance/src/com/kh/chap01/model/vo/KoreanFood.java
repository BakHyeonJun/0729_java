package com.kh.chap01.model.vo;

public class KoreanFood {

	private String foodName;
	private String ingredients;
	private int cookTime;
	private int spicy;
	
	
	public KoreanFood() {}
	public KoreanFood(String foodName, String ingredients, int cookTime, int spicy) {
		this.foodName = foodName;
		this.ingredients = ingredients;
		this.cookTime = cookTime;
		this.spicy = spicy;
	}
	public String getFoodName() {
		return foodName;
	}
	public String getIngredients() {
		return ingredients;
	}
	public int getCookTime() {
		return cookTime;
	}
	public int getSpicy() {
		return spicy;
	}
	
	
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public void setCookTime(int cookTime) {
		this.cookTime = cookTime;
	}
	public void setSpicy(int spicy) {
		this.spicy = spicy;
	}
	
	public String information() {
		return "음식정보 [ 음식명 : " + foodName + "재료 : " + ingredients + "조리시간 : " + cookTime + "맵기 : " + spicy + "]";
	}
}
