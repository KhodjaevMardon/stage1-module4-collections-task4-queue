package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> resultList = new ArrayList<>(),
                helperList = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            helperList.add(i);
        }
        int index = everyDishNumberToEat - 1;
        while(!helperList.isEmpty()) {
            if (index >= helperList.size()) {
                index = index % helperList.size();
            }
            resultList.add(helperList.get(index));
            helperList.remove(index);
            index--;
            index += everyDishNumberToEat;
        }

        return resultList;
    }
}
