
package business.util.food;

import java.util.HashMap;


public class Food {

    // Food Name and quantity(in pounds) per serving
    public static HashMap foodMap;

    public static void initializeFood() {
        foodMap = new HashMap();
        foodMap.put("Milk", 1d);
        foodMap.put("Butter", 0.75d);
        foodMap.put("Cheese", 2d);
        foodMap.put("Curd", 3d);
        foodMap.put("Eggs", 1d);
        foodMap.put("Paneer", 0.5d);
    }

    public static HashMap getFoodMap() {
        return foodMap;
    }

    public static double getFoodQuantityPerServing(String name) {
        return (double) foodMap.get(name);
    }

}
