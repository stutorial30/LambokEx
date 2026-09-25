package lambokEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentMain {
	public static void  main(String args[]) {
		List<Student> list=new ArrayList<Student>();
		Student s=new Student(1," sushant ","java",67.89); 
		Student s2=new Student(2," suhas ","python",10.00); 
		Student s3=new Student(3," sanjana ","java",6.50); 
		Student s4=new Student(4," priti ","dsa",7.0); 
		Student s5=new Student(5,"manisha","cs",9.0); 
		//System.out.println(s);
		//System.out.println("Student ID: " + s.getId());
        //System.out.println("Student Name: " + s.getNm());
        list.add(s);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        System.out.println("------1.Simple for--------");
        for(int i=0;i<list.size();i++) {
        	System.out.println("Student ID: " + list.get(i));
        }
        System.out.println("------2.Enhanced for--------");
        for(Student p1:list) {
        	System.out.println(p1);
        }
        System.out.println("------3.Using iterator--------");
       Iterator<Student> itr=list.iterator();
       while(itr.hasNext()) {
    	   System.out.println(itr.next());
       }
       System.out.println("------4.Using listIterator forward--------");
       ListIterator<Student> litr = list.listIterator();
       while(litr.hasNext()) {
    	   System.out.println(litr.next());
       }
       System.out.println("------5. Using ListIterator backward--------");
       while (litr.hasPrevious()) {
           System.out.println(litr.previous());
       }
       System.out.println("------6.Collection.Enumaration--------");
       Enumeration<Student> enumeration = Collections.enumeration(list);
       while (enumeration.hasMoreElements()) {
           System.out.println(enumeration.nextElement());
       }
       System.out.println("------7. Using forEach--------");
       list.forEach(ss -> System.out.println(ss));
       System.out.println("------8. Using Stream--------");
       list.stream().forEach(ss -> System.out.println(ss));
       System.out.println("------9. Using Method Reference--------");
       list.forEach(System.out::println);
}
}
