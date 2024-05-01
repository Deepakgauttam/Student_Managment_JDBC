import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.student.manage.Student;
import com.student.manage.StudentDao;

import java.io.IOException;

public class Start {

	public static void main(String[] args) throws IOException {
		
     System.out.println("Hello");
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

     while(true) {
    	 System.out.println("PRESS 1 TO ADD STUDENT");
    	 System.out.println("PRESS 2 TO DELETE STUDENT");
    	 System.out.println("PRESS 3 TO DISPLAY STUDENT");
    	 System.out.println("PRESS 4 TO EXIT STUDENT");
    	 int c=Integer.parseInt(br.readLine());
    	 
    	 if(c==1) {
    		 //add student
    		 System.out.println("Enter user name : ");
    		 String name = br.readLine();
    		 System.out.println("Enter user phone : ");
    		 String phone = br.readLine();
    		 System.out.println("Enter user city : ");
    		 String city = br.readLine();
    		 
    		 //create student object to store student
    		 Student st = new Student(name, phone, city);
    		 boolean answer=StudentDao.insterStudentToDB(st);
    		 if(answer) {
    			 System.out.println("Student is addeded successfully");
    		 }
    		 else {
    			 System.out.println("Something went wrong... try again");
    		 }
    		 System.out.println(st);
    	 }
    	 else if(c==2) {
    		 //DELETE student
    		 System.out.println("Enter student id to delete");
    		 int userId=Integer.parseInt(br.readLine());
    		 boolean f=StudentDao.deleteStudent(userId);
    		 if(f) {
    			 System.out.println("Deleted.....");
    		 }
    		 else {
    			 System.out.println("Something went wrong... try again");
    		 }
    	 }
    	 else if(c==3) {
    		 //DISPLAY student
    		 StudentDao.showAllAtudent();
    	 }
    	 else if(c==4) {
    		 //EXIT student
    		 break;
    	 }
    	 else {
    		 
    	 }
     }
     System.out.println("Thank you using my Application...");
     System.out.println("See you soon...bye bye");
	}

}
