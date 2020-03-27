package main;

import java.util.HashMap;

import main.handlers.*;

public class ApplicationController {

	private HashMap<String, Handler> commands;

	public ApplicationController() {
		commands = new HashMap<String, Handler>();
		commands.put("addEmployee", new addEmployeeHandler());
		commands.put("displayEmployees", new displayEmployeeHandler());
		commands.put("displayMenu", new displayMenuHandler());
	}

	public Object doCommand(String commandKey, HashMap<String, Object> commandData) throws Exception {
		Handler command = commands.getOrDefault(commandKey, null);
		if (command == null) {
			throw new Exception("There is no command with the key word '" + commandKey + "'.");
		}

		return command.handleIt(commandData);
	}

}