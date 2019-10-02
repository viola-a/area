package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//TODO DECLARE VARIABLES
int base;
int height;
int area;
String answer;
Scanner lighthouse;
//TODO INITIALIZE VARIABLES
lighthouse=new Scanner(System.in);
//TODO PROMOTE THE USER
System.out.println("welcome to the area caculator");
System.out.println("do you want to find the are of a \"square\" or \"rectangle\"?");
//TODO BUILD VARIABLES FOR EQUATION
answer = lighthouse.nextLine();

if(answer.equals("sqaure")) {
    System.out.println("what is the lenth of onr side?");
    base=lighthouse.nextInt();
    area = base * base;
}

else{
    System.out.println("what is the lenth of the base ");
    base=lighthouse.nextInt();
    System.out.println("what is the height of the base ");
    height=lighthouse.nextInt();
    area=base*height;

}


//TODO CACULATE

//TODO PRINT RESULTS
System.out.println("the area of the"+ answer + " is "+area);













    }
}
