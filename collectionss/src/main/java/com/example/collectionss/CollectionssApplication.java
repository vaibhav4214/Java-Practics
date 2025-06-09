package com.example.collectionss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.Vector;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CollectionssApplication {

	public static void main(String[] args) {
		
		//create collection two type 
		// 1) type safe collection (define which type value store like int,string)
		//	2) unsafe type (dont define type)

		//safe type arraylist collection 
		ArrayList<String> names=new ArrayList<>(); 
		names.add("vaibhav");
		names.add("yadav");
		names.add("yadav");		//duplicate are allowed
		System.out.println(names);
		System.out.println(names.get(1)); //get value
		names.remove(0);			//remove value of index 0
		System.out.println(names);
		names.set(1,"mota");		// add value mota at index 1 and remove previous value
		System.out.println(names);
		names.add("vy");					//add value vy at end of arraylist
		System.out.println(names);		
		names.add(0,"Rj");		//add value rj at index 0 but not remove previous value
		System.out.println(names);
		System.out.println(names.size());	// return the size of list 4
		System.out.println(names.contains("Rj"));		//check value present or not in arraylist if present then return true else false case sensitive eg.rj==Rj=>False
		System.out.println(names.isEmpty());		//check list empty or not	
	//	names.clear();	remove all elements from list
		System.out.println(names);


		//untype safe array list collections dont give type of value
		LinkedList values=new LinkedList<>();	

		values.add(1);
		values.add("v");
		System.out.println(values);


		//creating vector
		Vector<String> v=new Vector<>();
		v.addAll(names);
		System.out.println(v);

		System.out.println("-----------------set---------------------");
				
				HashSet<Integer> hs=new HashSet<>();
				hs.add(2);
				hs.add(1);
				hs.add(5);		
				hs.add(55);
				hs.add(1);	// duplicate not allow
				System.out.println(hs);


				System.out.println("-------------------------------Treeset-------------------------------------");
				//automatic sort element in accending order
				TreeSet<String> ts=new TreeSet<>();
				ts.addAll(names);
				System.out.println(ts);







				System.out.println("------------------------------Travers-------------------------------------");

					//for each loop
					for(String str:names)
					{
						System.out.println(str+"\t");
						StringBuffer rs=new StringBuffer(str);
						System.out.println(rs.reverse()); // reverse elements Vy=yV
					}

					//forward travesring using iterator
					Iterator<String> itr=names.iterator();
					while (itr.hasNext()) {
						String elem =  itr.next();
						System.out.println(elem);			
					}
						System.out.println("=================forward travesring using iterator======================");
						//forward travesring using iterator

							ListIterator<String> itrpre=names.listIterator(names.size());
					while (itrpre.hasPrevious()) {
						String pre =  itrpre.previous();
						System.out.println(pre);			
					}

					System.out.println("===============================for each Method===============");

					names.forEach(e->{
						System.out.println(e);
					});


					System.out.println("======================sorting element============================");

					TreeSet<String> set=new TreeSet<>();
					set.addAll(names);
					set.forEach(e->{
						System.out.println(e);
					});
				

					//array to collection================================
					 // array input
					 System.out.println("=======================array to collection=====================");
        String arr[]= { "Virat", "Sachin", "Rohit", "Bumrah" };
      
        // printing input elements for comparison
        System.out.println("Array input: "
                           + Arrays.toString(arr));
      
        // converting array into Collection
        // with asList() function
        List playersList = Arrays.asList(arr);
      
        // print converted elements
        System.out.println("Converted elements: "
                           + playersList);

					

						   System.out.println("=============================collection to array====================");
				List<Integer> list1 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        Object[] array = list1.toArray();

        System.out.print("The Array contains : ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
				
						}
			}