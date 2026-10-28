package sidharthsircorejava;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
/*
 * consumer have void return type
 */
public class Ex6 {

	public static void main(String[] args) {
	/*	Consumer<Integer> consumer=(num)->System.out.println(num*num);
		consumer.accept(10);
        Consumer<String> consumerString=(str)->System.out.println(str.toUpperCase());
        consumerString.accept("Hello");*/
        //take input from user and print table in bellow format
        //2x1=2.................2x10=20
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        Consumer<Integer> con = (n) -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + "x" + i + "=" + (n * i));
            }
        };
        con.accept(num);
        sc.close();*/
        //consumer+predicate task
        //pass the list of number into consumer
        //filter and print the even numbers only from list
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        Predicate<Integer> check = (num2) -> num2 % 2 == 0;
        Consumer<Integer> consumer1 = (num2) -> {
            if (check.test(num2)) {
                System.out.println(num2);
            }
        };
        numbers.forEach(consumer1);
        //input Welcome to Cyber Success 
        //output Success Cyber To Welcome 
        //with out using Inbuilt reverse and slit method
        Consumer<String> reverseString=(str)->{
        	int start=0;
        	int end =str.length()-1;
        	
        	for(int i=str.length()-1;i>=0;i--) {
        		if(str.charAt(i)==' '||i==0) {
        			start=i;
        			for(int j=start;j<end;j++) {
        				System.out.print(str.charAt( j));
        			}
        			end=start;
        		}
        	}
        };
        reverseString.accept("Welcome to Cyber Success");
       /* Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        if (sc1.hasNextLine()) {
            String str = sc1.nextLine();
            String word = "";
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch != ' ') {
                    word = word + ch;
                } else if (!word.isEmpty()) {
                    result = word + " " + result;
                    word = "";
                }
            }
            if (!word.isEmpty()) {
                result = word + " " + result;
            }
            System.out.println(result.trim());
        }
        sc1.close();*/
	}
}
