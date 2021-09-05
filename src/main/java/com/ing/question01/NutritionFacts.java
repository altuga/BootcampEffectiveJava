package com.ing.question01;

/**
 * Altug Bilgin Altintas
 * <p>
 * Effective Java Workshop
 */

/*
TODO: 
 1 - Initialize (create) the class according to the fields below
 2 - Instructor will show the solutions
 3 - Refactor and ask questions
 */
public class NutritionFacts {

    private int servingSize; // must
    private int servings; // must
    private int calories; // optional
    private int fat;  // optional
    private int sodium; // optional
    private int carbohydrate; // optional

    // Setters
    public void setServingSize(int val) {
        servingSize = val;
    }

    public void setServings(int val) {
        servings = val;
    }

    public void setCalories(int val) {
        calories = val;
    }

    public void setFat(int val) {
        fat = val;
    }

    public void setSodium(int val) {
        sodium = val;
    }

    public void setCarbohydrate(int val) {
        carbohydrate = val;
    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts();
        nutritionFacts.setFat(20);
        nutritionFacts.setServingSize(100);
        System.out.println(nutritionFacts);

        //...

        nutritionFacts.setServingSize(150);
        System.out.println(nutritionFacts);

    }

}
