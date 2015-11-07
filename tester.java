//8/19/15
//for testing little things
import java.io.Console;
import java.util.ArrayList;
import java.util.*;
//blah diddy blah

public class tester extends Thread {
	StringBuffer str;
	public tester(StringBuffer s){
		str = s;
	}
	public void run(){
//		synchronized(str){
			for (int i = 0; i < 100; i++){
				System.out.print(str);
			}
			str.replace(0,1,(""+(char)((int)(str.charAt(0))+1)));
			System.out.println("str NOW " + str);
//		}
		System.out.println("current Thread exiting; str now " + str);
	}

	public static void main(String args[])
	{
/*		StringBuffer x = new StringBuffer("A");
		tester one = new tester(x);
		one.start();
		tester two = new tester(x);
		tester three = new tester(x);
		two.start();
		three.start();
*/
		List<String> friends = new ArrayList<String>();
		friends.add("Neil");
		friends.add("Uffo");
		friends.add("Ibn");
		friends.add("Gizmo");
		friends.add("Latte");
		
		friends.forEach((name) -> System.out.println(name));

		friends.forEach(System.out::println);
		
	}
	
}
