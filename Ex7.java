package sidharthsircorejava;

import java.util.List;
import java.util.function.Supplier;

public class Ex7 {

	public static void main(String[] args) {
		Supplier<String> s=()->"hello world";
			System.out.println(s.get());
			Supplier<List<Integer>> list=()->List.of(1,2,3);
			System.out.println(list.get());
			Supplier<EmpEx> emp = () -> new EmpEx(102,"Rahul", 25000, 3.5);
			System.out.println(emp.get().getName());
			Supplier<Integer> otp=()->{
				int pass=(int)(Math.random()*10000+1);
				return pass;
			};
            System.out.println(otp.get());
	}

}
