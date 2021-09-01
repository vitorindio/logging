package com.vitorindio;

import java.io.IOException;

public class CarSelector {
    public static void main(String[] args)  {
     /*for (String argument : args) {
            new CarService().process(argument);
        }*/
//otherwise...
    /*  CarService carService = new CarService();
            for(String argument : args){
               try {
                   carService.process(argument);
               }catch( RuntimeException e ){
                   System.out.println(e.getMessage());
               }
            }*/
      CarService carService = new CarService();
        for (String argument : args) {
            if(isValid(argument)){
                carService.process(argument);
            } else{
                System.err.println("ignoring invalid argument:" + argument);
            }
        }

    }

    private static boolean isValid(String argument) {
      try {
          CarState.valueOf(argument);
          System.out.println("valid argument:" + argument);
      } catch(RuntimeException e){
          //  e.printStackTrace();
          System.out.println("hello ..." + e.getMessage() );
          }
      finally{
          System.out.println("finally block");
      }
      return true;
    }

}
