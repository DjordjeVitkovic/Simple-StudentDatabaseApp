
package studentdatabaseapplication;

import java.util.Scanner;


public class StudentDatabaseApplication {

 
    public static void main(String[] args) {
        
        int numStudents;
        Scanner sc = new Scanner(System.in);

        //Ask how many new students we want to add
        System.out.println("Enter numbers of new students to enroll: ");
        try{
            
            

        numStudents = sc.nextInt();
        while(numStudents < 0){
            System.out.println("UYou enter negative number! \nEnter again:");
            numStudents = sc.nextInt();
        
        }
        Student[] students = new Student[numStudents];
        
        
        //Create n number of new students
        for(int i =0; i < students.length; i++){
            
        System.out.println((i+1) + " student:");    
        students[i] = new Student();
        students[i].enroll();
        students[i].payTuition();
 
        }
            for (int i = 0; i < students.length; i++) {
                System.out.println(students[i].toString());
            }
        
        }catch(Exception e){
            System.out.println("You enter text, required number!");

        }
                
        
    }
    
}
