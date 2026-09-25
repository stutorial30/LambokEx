package lambokEx;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class ProdMain {
public static void main(String args[]) {
	List<Prod> list=new ArrayList<Prod>();
	Prod s1=new Prod(1,"amit",701);
	Prod s2=new Prod(2,"vaibhi",500);
	Prod s3=new Prod(3,"nishant",900);
	Prod s4=new Prod(4,"aneha",70.5);
	list.add(s1);
	list.add(s2);
	list.add(s3);
	list.add(s4);
	Collections.sort(list);
	list.forEach(x->System.out.println(x));
}
}
