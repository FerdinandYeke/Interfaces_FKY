//********************************************************************
//  RationalTester.java       Java Foundations
//
//  Driver to exercise the use of multiple Rational objects.
//********************************************************************

public class RationalTester2_Applicaton
{
    //-----------------------------------------------------------------
    //  Creates some rational number objects and performs various
    //  operations on them.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        RationalNumber r1 = new RationalNumber(6, 8);
        RationalNumber r2 = new RationalNumber(1, 3);
        RationalNumber r3, r4, r5, r6, r7;

        System.out.println("First rational number: " + r1);
        System.out.println("Second rational number: " + r2);

        if (r1.isLike(r2))
            System.out.println("r1 and r2 are equal.");
        else
            System.out.println("r1 and r2 are NOT equal.");

        r3 = r1.reciprocal();
        System.out.println("The reciprocal of r1 is: " + r3);

        r4 = r1.add(r2);
        r5 = r1.subtract(r2);
        r6 = r1.multiply(r2);
        r7 = r1.divide(r2);

        System.out.println("r1 + r2: " + r4);
        System.out.println("r1 - r2: " + r5);
        System.out.println("r1 * r2: " + r6);
        System.out.println("r1 / r2: " + r7);
        
        System.out.println(r1.compareTo(r2));
        System.out.println("R1 to R2: "+r1.compareTo(r2));
        System.out.println("R1 to R3: "+r1.compareTo(r3));
        System.out.println("R1 to R4: "+r1.compareTo(r4));
        System.out.println("R1 to R5: "+r1.compareTo(r5));
        System.out.println("R1 to R6: "+r1.compareTo(r6));
        System.out.println("R3 to R7: "+r3.compareTo(r7));
        
        //Task and Process starts here
        
        //Task starts here
        Task Task1 = new Task("Tasker",9);
        Task Task2 = new Task ("Tag_Task", 2);
		Task1.setStat1();
		Task2.setStat3();
        System.out.println(Task1);
        System.out.println(Task2);
        
        
        if(Task1.compareTo(Task2) == -1)
        {
        	System.out.println("Task 1 and Task 2 does not have the same"
        			+ " \nPriority Level, and Task 1 is lower than Task 2.");
        	System.out.println(Task1.compareTo(Task2));
        }
        
        else if(Task1.compareTo(Task2) == 0)
        {
        	System.out.println("Task 1 and Task 2 have the same"
        			+ " \nPriority Level.");
        	System.out.println(Task1.compareTo(Task2));
        }
        //Task ends here
        
        //Process starts here
        Process process1 = new Process("Tasker_Background",2);
        Process process2 = new Process("Tag_Task_Background",2);
        
        System.out.println(process1);
        System.out.println(process2);
        
        if(process1.compareTo(process2) == 0)
        {
        	System.out.println("Process 1 and Process 2 have the same"
        			+" \nPriority Level.");
        	System.out.println(process1.compareTo(process2));
        }
        
        else if(process1.compareTo(process2)==-1)
        {
        	System.out.println("Process 1 and Process 2 does not have the same"
        			+" \nPriority Level.");
        	System.out.println(process1.compareTo(process2));
        }
        //Process ends here
    }//Main method ends here
}//Class ends here
