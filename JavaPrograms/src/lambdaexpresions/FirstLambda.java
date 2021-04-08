package lambdaexpresions;

import java.util.function.Function;

public class FirstLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sq4=squareInt(4);
		System.out.println(sq4);
		Function<Integer,Integer> f = n -> n*n;
		System.out.println(f.apply(4));
		//Function<Integer,Integer> a=()->System.out.println("hello");
        //(a,b)-> a+b;  
		//Function<Integer,Integer> g= (a,b) -> a+b;
		//System.out.println(g.apply(3));
	}
	public static int squareInt(int n)
	{
		return n*n;
	}
	public static void m1() {
		System.out.println("hello");
		
	}
	public static int add(int a,int b)
	{
		return a+b;
	}

}


	
