/****************************************************************************
 * My assingment 1b
 * Created by: Gavin Zhou 
 * Created on: Feb 2018
 *
 ****************************************************************************/

import java.util.Scanner;

 public class A1 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String input = null, outputString = "";

    while (true){
            System.out.println("Input string: ");
            input = scanner.nextLine();

        if (input.length()!=0){

            for (int num=0; num<input.length();num++) {
                String firstChar = String.valueOf(input.charAt(num));

                try{
                    Integer numNumber = Integer.parseInt(firstChar);
                    if(num == input.length()-1){

                    }else{
                        String secondChar = String.valueOf(input.charAt(num+1));
                                            
                        for (int number=0;number<numNumber; number++) {
                            outputString = outputString+secondChar;
                            
                        }
                    }
                }catch(NumberFormatException stringinput){
                    outputString = outputString+firstChar;
                }
            }
            System.out.println("the answer is:"+outputString);
        }
    }
}
}

