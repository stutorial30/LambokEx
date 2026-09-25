package lambokEx;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class ProductMain {
	public static void  main(String args[]) {
		List<Product> list=new CopyOnWriteArrayList<Product>();
		Product p=new Product(1," pen ",67.89); 
		Product p2=new Product(2," pencile ",12); 
		Product p3=new Product(3," book ",150); 
		Product p4=new Product(4," eraser ",10); 
		Product p5=new Product(5,"mouse",950); 
        list.add(p);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        System.out.println("------1.Simple for--------");
        for(int i=0;i<list.size();i++) {
        	System.out.println("Product ID: " + list.get(i));
        }
        System.out.println("------2.Enhanced for--------");
        for(Product p1:list) {
        	System.out.println(p1);
        }
        System.out.println("------3.Using iterator--------");
       Iterator<Product> itr=list.iterator();
       while(itr.hasNext()) {
    	   System.out.println(itr.next());
       }
       System.out.println("------4.Using listIterator forward--------");
       ListIterator<Product> litr = list.listIterator();
       while(litr.hasNext()) {
    	   System.out.println(litr.next());
       }
       System.out.println("------5. Using ListIterator backward--------");
       while (litr.hasPrevious()) {
           System.out.println(litr.previous());
       }
       System.out.println("------6.Collection.Enumaration--------");
       Enumeration<Product> enumeration = Collections.enumeration(list);
       while (enumeration.hasMoreElements()) {
           System.out.println(enumeration.nextElement());
       }
       System.out.println("------7. Using forEach--------");
       list.forEach(pp -> System.out.println(pp));
       System.out.println("------8. Using Stream--------");
       list.stream().forEach(pp -> System.out.println(pp));
       System.out.println("------9. Using Method Reference--------");
       list.forEach(System.out::println);
         //find avg of price
    	double total_price=0.0;
   	    for(Product s:list) {
   		  total_price=s.getPrice()+total_price;
   }    System.out.println("Avg"+total_price/list.size());
   //display the name of product whose price is greater then 100
   for(Product p0:list) {
	   if(p0.getPrice()>100) {
		   System.out.println(""+p0.getNm());  
	   }
   }
   for(Product p9:list) {
	   double t=p9.getPrice()+p9.getPrice()*(0.10);
	   p9.setPrice(t);
	   System.out.println("With Updated price"+p9); 
   }
   //Discount
   for(Product p8:list) {
	   double t=p8.getPrice()-p8.getPrice()*(0.10);
	   p8.setPrice(t);
	   System.out.println("With Updated price"+p8); 
   }
  //if price of product is greater than 500 then remove that product from the list
  for(Product p7:list) {
	   if(p7.getPrice()==500) {
		   list.remove(p7);
	   }}
	   /* 	   list.iterator();
	   Iterator<Product> iterator=list.iterator();
	   while(iterator.hasNext()) {
		   Product product=iterator.next();
		   if(product.getPrice()>500) {
			   iterator.remove();
		   }
		   System.out.println("------------------------");
	   }list.forEach(x->System.out.println(x));
	what is fail fast iterator and fail safe iterator*/ 
}}