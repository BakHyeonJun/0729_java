package com.kh.chap01.model.vo;

public class JapaneseFood {
	
	private String foodName;
	private String ingredients;
	private int cookTime;
	private int freshness;
	
	public JapaneseFood() {}
	public JapaneseFood(String foodName, String ingredients, int cookTime, int freshness) {
		this.foodName = foodName;
		this.ingredients = ingredients;
		this.cookTime = cookTime;
		this.freshness = freshness;
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
	public int getfreshness() {
		return freshness;
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
	public void setfreshness(int freshness) {
		this.freshness = freshness;
	}
	
	public String information() {
		return "음식정보 [ 음식명 : " + foodName + "재료 : " + ingredients + "조리시간 : " + cookTime + "신선도 : " + freshness + "]";
	}

}
