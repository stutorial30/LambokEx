package lambokEx;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class StudMain {
public static void main(String args[]) {
	List<Stud> list=new ArrayList<Stud>();
	Stud s1=new Stud(1,"amit","me",7.1);
	Stud s2=new Stud(2,"vaibhi","me",7.5);
	Stud s3=new Stud(3,"nishant","me",7.9);
	Stud s4=new Stud(4,"aneha","me",7.5);
	list.add(s1);
	list.add(s2);
	list.add(s3);
	list.add(s4);
	Collections.sort(list);
	list.forEach(x->System.out.println(x));
}
}
