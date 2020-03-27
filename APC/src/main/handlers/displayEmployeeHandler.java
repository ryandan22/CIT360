package main.handlers;
import java.util.HashMap;
import main.model.Group;

public class displayEmployeeHandler implements Handler{
	
	@Override
	public Object handleIt(HashMap<String, Object> data) {
		Group group = (Group) data.get("group");

		String s = group.toString();
		System.out.println(s);
		return null;
	}

}