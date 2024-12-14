/*

Create a Static Application to perform operation on Students 
1. Create new student data
2. Read all student data
3. Read student data by id
4. Update student by id
5. Delete Student by id 

You have to create a class of student and save data inside collection framework while performing above
operations. 

*/

package projectcodes;

import java.util.HashMap;
import java.util.Map;

class student {
	
	int id;
	String name;
	float marks;
	
	public student(int id, String name, float marks) {
		
		this.id = id;
		this.name = name;
		this.marks = marks;
		
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}

public class javatest {

	public static void main(String[] args) {
		
		//1. Create new student data
		
		student s1 = new student(101, "Harry", 89f);
		student s2 = new student(102, "Tom", 75.45f);
		student s3 = new student(103, "Ron", 85.80f);
		
		Map<Integer, student> students = new HashMap<Integer, student>();
		
		students.put(s1.id, s1);
		students.put(s2.id, s2);
		students.put(s3.id, s3);
		
		//2. Read all student data
		
		System.out.println(students);
		
		System.out.println();
		
		//3. Read student data by id
		
		System.out.println(students.get(s1.id));
		
		System.out.println();
		
		//4. Update student by id
	
		students.replace(s1.id = 104 , s1);
		
		System.out.println(students);
		
		System.out.println();
		
		//5. Delete Student by id 
		
		students.remove(s2.id = 102);
		
		System.out.println(students);
		
		System.out.println();
		
	}

}
