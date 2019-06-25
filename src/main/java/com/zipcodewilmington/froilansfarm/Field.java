package com.zipcodewilmington.froilansfarm;


import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Animal.Pilot;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Shelter.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Shelter.Stable;
import com.zipcodewilmington.froilansfarm.Vehicles.FarmVehicle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public  class Field {

    private List<CropRow> cropRows;


    public Field() {
        cropRows = new LinkedList<>();
    }


    public Field(List<CropRow> cropRows){//, Map<Chicken, ChickenCoop> chickenChickenCoopMap, Map<Horse, Stable> horseStableMap, List<FarmVehicle> farmVehicles, List<Aircraft> aircraft, Pilot pilot) {
        this.cropRows = cropRows;

    }


    private CropRow cropRow;
    List<CropRow> field = new ArrayList<>();


    public Boolean isEmpty() {

        return field.isEmpty();
    }


    public void add(CropRow cropRow) {
        field.add(cropRow);
    }

    public Integer itemCount() {

        return field.size();
    }

    public void remove() {

        field.remove(cropRow);
    }

}

