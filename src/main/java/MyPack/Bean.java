package MyPack;

import java.util.*;


public class Bean {
	public static List<User> ExportUsers(){
		List<User> list = new ArrayList<User>();
		
		list.add(new User("Thang", "Student"));
		list.add(new User("java", "web"));
		
		return list;	
	}

}
