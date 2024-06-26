package DesignPatterns.FactoryPatternEx2;

public class FactoryClass {

    public  static  Food orderFood(String foodType){


        if(foodType.trim().equalsIgnoreCase("VEG")){

            return  new VegFood();

        }else if (foodType.trim().equalsIgnoreCase("NONVEG")){
            return  new NonVegFood();
        }else  {
            return  null;
        }
    }
}
