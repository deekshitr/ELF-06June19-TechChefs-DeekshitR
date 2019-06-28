package com.techchefs.assessment.five;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import com.techchefs.assessment.two.Student;

public class ProductTest {
	static Logger log = Logger.getLogger("ProductTest");
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setId(1);
		p1.setName("Hyndai");
		p1.setType("Car");
		p1.setPrice(2000);
		
		Product p2 = new Product();
		p2.setId(1);
		p2.setName("BMW");
		p2.setType("Car");
		p2.setPrice(2000);
		
		Product p3 = new Product();
		p3.setId(1);
		p3.setName("Honda");
		p3.setType("Bike");
		p3.setPrice(2000);
		
		Product p4 = new Product();
		p4.setId(1);
		p4.setName("Hero");
		p4.setType("Bike");
		p4.setPrice(2000);
		
		ArrayList<Product> al = new ArrayList<Product>();
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		
		Function<String, ArrayList> f = (String type) -> {
			return (ArrayList) al.stream().filter(i->i.getType() == type).collect(Collectors.toList());
		};
		
		ArrayList<Product> products = f.apply("Bike");
		
		for(int i=0;i<products.size();i++) {
			Product pro = products.get(i);
			log.info("prodcut name "+pro.getName()+ " with price "+pro.getPrice());
		}
	}

}
