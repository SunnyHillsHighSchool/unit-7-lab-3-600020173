//(c) A+ Computer Science
//www.apluscompsci.com
//Name Jonathan Hsing

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
 public static ArrayList<Integer> getListOfFactors(int number)
 {
  ArrayList a = new ArrayList();
  //Create array list for outputs
  for(int x = number - 1; x > 1; x--)
  {
	//For loop with int x is equal to the number - 1, x greater than 1, x --
    if(number % x == 0){
	//If number modulus x is equal to 0
      a.add(0, x);
		//And x to the array list
    }
	//End if statement
  }
  //End for loop
  return a;
  //Return array list
 }
 
 public static void keepOnlyCompositeNumbers( List<Integer> nums )
 {
   ArrayList c = new ArrayList();
    //create array list for nums size
   for(int y = nums.size() - 1; y >= 0; y--){
	//Create for loop with int y = last element index of nums, y greater than or equal to 0, y--
    c = getListOfFactors(nums.get(y));
    //set variable equal to getlistoffactors
    if(c.size() == 0){
		//If getListOfFactors has an array size equal to 0
      nums.remove(y);
			//remove the value in the output
    }
		//Close if statement
   }
	//Close for each loop
  

 }
}