package com.example.Practics;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Practics.comparableandcomparator.Emp;
import com.example.Practics.comparableandcomparator.IdComparator;
import com.example.Practics.comparableandcomparator.StringComparator;

@SpringBootApplication
public class PracticsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticsApplication.class, args);

			ArrayList<Emp> emps=new ArrayList<>();
			emps.add(new Emp("Radha",1, "1"));
			emps.add(new Emp("vaibhv", 50, "M"));
			emps.add(new Emp("Ankit", 19, "M"));
			System.out.println(emps);
			Collections.sort(emps);		//sort using comparable
			System.out.println("sort using comparable"+emps);


			emps.add(new Emp("rahul", 9, "M"));
			Collections.sort(emps,new IdComparator());
			System.out.println("sort using comparator"+emps);

			Collections.sort(emps,new StringComparator());
			System.out.println(emps);


	}

}
