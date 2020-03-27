package examples;

import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;

import examples.InventoryController;
import examples.Inventory;

public class JsonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateJson();

	}

	private static void CreateJson() {
		try {

			JSONObject json = new JSONObject();

			InventoryController invCont = new InventoryController();
			List<Inventory> list = invCont.TotalProduct();

			JSONArray jArray = new JSONArray();

			for (int i=0; i<=list.size()-1; i++){
				json = WriteJson(list,i);
				jArray.put(json);

			} 

			FileWriter file = new FileWriter("\\JSON\\examples\\inventory.json");
			System.out.println("\n" + jArray.toString());
			file.write(jArray.toString());
			file.flush();
			file.close();
			System.out.println("\nThe Json file was generate in the root:CIT360\\JsonJava with the name: inventory.json");


		} catch (UnsupportedEncodingException ex1) {
			System.err.println("Error UnsupportedEncodingException: "+ex1.getMessage());
		} catch (IOException ex2) {
			System.err.println("Error IOException: "+ex2.getMessage());
		} catch (Exception ex3){
			System.err.println("Exepction: "+ex3.getMessage());
		}
	}

	private static JSONObject WriteJson(List<Inventory> List,int i) {
		JSONObject innerObj = new JSONObject(); 


		try {
			innerObj.put("name",List.get(i).getName());
			innerObj.put("description",List.get(i).getDescription());
			innerObj.put("location",List.get(i).getLocation());
			innerObj.put("price",List.get(i).getPrice());
			innerObj.put("stock",List.get(i).getStock());
			innerObj.put("weight",List.get(i).getWeight());
			innerObj.put("size",List.get(i).getSize());


		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return innerObj;

	}
}	