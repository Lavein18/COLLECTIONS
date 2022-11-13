package customArrayList; 
public class Student 
{ 
 String name; 
   float cgpa; 
   int rollNo; 
   Student(String name, float cgpa, int rollNo)
   { 
     this.name = name; 
     this.rollNo = rollNo; 
     this.cgpa = cgpa; 
   } 
}
package customArrayList; 
import java.util.ArrayList; 
public class AddingData 
{ 
ArrayList<Student> studentData()
   { 
class Student and pass arguments to the constructor. 
    Student s1 = new Student("aaa", 1234, 70); 
    Student s2 = new Student("bbb", 4321, 80); 
    Student s3 = new Student("ccc", 1212, 90); 
ArrayList<Student> studentlist = new ArrayList<Student>(); 
studentlist.add(s1); 
     studentlist.add(s2); 
     studentlist.add(s3); 
return studentlist; 
   } 
}
package customArrayList; 
import java.util.ArrayList; 
public class RetriveStudents 
{ 
public static void main(String[] args) 
{ 
AddingData data = new AddingData(); 
ArrayList<Student> listst = data.studentData(); 
for(Student st:listst)
   { 
     System.out.println("Student's name: " +st.name);
     System.out.println("Roll number: " +st.rollNo);
     System.out.println("Student cgpa: " +st.cgpa);
    } 
  } 
}
 class sorting implements Comparator<Student> 
 { 
    public int compare(Student s1,Student s2, Student s3) 
     { 
         return Double.compare(s2.cgpa, s1.cgpa, s3.cgpa); 
     } 
 }
