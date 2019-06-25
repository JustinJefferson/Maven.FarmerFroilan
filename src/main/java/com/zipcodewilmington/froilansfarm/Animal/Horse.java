package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Vehicles.Rideable;
import java.util.ArrayList;
import java.util.List;


public class Horse implements Animal, Rideable {

        boolean isMounted;
        List<Edible> foodEaten = new ArrayList<Edible>();

        public Horse(){
        }

        public void eatEdible(Edible food) {
            foodEaten.add(food);
        }

        public List<Edible> getFoodEaten() {
            return foodEaten;
        }

        public String makeNoise() {
            return "Neigh! Neigh!";
        }

        public boolean isMounted() {
            return isMounted;
        }

        public void setMounted(boolean mounted) {
            isMounted = mounted;
        }

    public void ride() {

    }

}
