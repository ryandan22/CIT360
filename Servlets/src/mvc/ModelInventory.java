package mvc;

import java.util.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

public class ModelInventory {

	private  DataSource myPool;

	public ModelInventory(DataSource myPool) {

		this.myPool = myPool;

	} 

	public List<Inventory> getInventory(String product) throws Exception{

		List<Inventory> inventory= new ArrayList<>();

		//Declare connection variables

		Connection myConnection=null;

		Statement myStatement=null;

		ResultSet myResultset=null;

		//Establish the connection

		myConnection=myPool.getConnection();

		//Create SQL sentence

		String mySql="SELECT * FROM INVENTORY WHERE invName ='" + product +"'";

		myStatement=myConnection.createStatement();

		//Execute SQL sentence

		myResultset=myStatement.executeQuery(mySql);

		while(myResultset.next()) {
			String id=myResultset.getString("invId");
			String name=myResultset.getString("invName");
			String description=myResultset.getString("invDescription");
			String location=myResultset.getString("invLocation");
			double price=myResultset.getDouble("invPrice");
			double stock=myResultset.getDouble("invStock");
			int weight=myResultset.getInt("invWeight");
			int size=myResultset.getInt("invSize");

			Inventory tempInv = new Inventory(id,name,description,location,price,stock,weight,size); 

			inventory.add(tempInv);
		}


		return inventory;
	}	

	public  List<Inventory> getName() throws Exception{

		List<Inventory> inventory= new ArrayList<>();

		//Declare connection variables

		Connection myConnection=null;

		Statement myStatement=null;

		ResultSet myResultset=null;

		//Establish the connection

		myConnection=myPool.getConnection();

		//Create SQL sentence

		String mySql="SELECT invName FROM INVENTORY";

		myStatement=myConnection.createStatement();

		//Execute SQL sentence

		myResultset=myStatement.executeQuery(mySql);

		while(myResultset.next()) {
			/*String id=myResultset.getString("invId");*/
			String name=myResultset.getString("invName");
			/*String description=myResultset.getString("invDescription");
			String location=myResultset.getString("invLocation");
			double price=myResultset.getDouble("invPrice");
			double stock=myResultset.getDouble("invStock");
			int weight=myResultset.getInt("invWeight");
			int size=myResultset.getInt("invSize");*/

			Inventory tempInv = new Inventory(name); 

			inventory.add(tempInv);


		}




		return inventory;
	}

}