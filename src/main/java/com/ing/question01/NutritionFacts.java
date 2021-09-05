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
public final class NutritionFacts {

    private final int servingSize ; // must
    private final int servings ; // must
    private final int calories ; // optional
    private final int fat ;  // optional
    private final int sodium ; // optional
    private final int carbohydrate ; // optional

    public NutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat,
                          int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }


    public NutritionFacts(int servingSize, int servings, int calories, int fat,
                          int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
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

        NutritionFacts nutritionFacts = new NutritionFacts(20,34,230);
        System.out.println(nutritionFacts);

    }

}
