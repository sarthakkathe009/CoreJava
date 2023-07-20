package com.tns.lamdaExp;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Display{
	static void show(String s) {
		System.out.println("------"+s+"-------");
	}
}

public class UsingFI {

	public static void main(String[] args) {
		Consumer<String> con=(str)->System.out.println("Hello "+str);
		con.accept("Sarvesh");
		//Consumer Interface represents a function which takes in one argument and produces a result.
		con=System.out::println; //method reference
		con.accept("Sonali");
		
		con=Display::show;  //method reference
		con.accept("WE CAN DO IT");
		
		//It represents a function which does not take in any argument but produces a value of type T.
		Supplier<String> sup=()->"Hey there, I am using JAVA!";
		System.out.println(sup.get());
		
		//+ve & -ve number Test
		System.out.println("---Testing Number---");
		Predicate<Integer> pre= num -> num >0;
		System.out.println(pre.test(24));
		System.out.println(pre.test(-24));
		System.out.println("---END---");
		
		//BiFunction can be used as an assignment target for a lambda expression or method reference.
		// Max Test
		BiFunction<Integer,Integer,Integer> maxf=(x,y)-> x > y ? x : y;
		System.out.println(maxf.apply(87,69));
		//The apply() method performs the operation on the given arguments and returns the function result.
		
		BiFunction<String,Integer,String> printf=(name,num)->name+num;
		System.out.println(printf.apply("Sunny Day",3));
	}

}
