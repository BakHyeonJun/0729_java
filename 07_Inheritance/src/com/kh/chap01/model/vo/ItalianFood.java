package com.kh.chap01.model.vo;

public class ItalianFood {

	private String foodName;
	private String ingredients;
	private int cookTime;
	private int greasy;
	
	public ItalianFood() {}
	public ItalianFood(String foodName, String ingredients, int cookTime, int greasy) {
		this.foodName = foodName;
		this.ingredients = ingredients;
		this.cookTime = cookTime;
		this.greasy = greasy;
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
	public int getGreasy() {
		return greasy;
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
	public void setGreasy(int greasy) {
		this.greasy = greasy;
	}
	
	public String information() {
		return "음식정보 [ 음식명 : " + foodName + "재료 : " + ingredients + "조리시간 : " + cookTime + "기름기 : " + greasy + "]";
	}
	
}
