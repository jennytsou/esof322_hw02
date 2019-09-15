package hw02;

import java.util.*;

public class Store implements DataBase {
	private String dbType;
	
	String conn = " Name=Smith;Address=main street;";
	Database nos = NosDB.getDatabase(conn);
	public Store() {}
	
	public void setStoreStrategy(String db) {
		
		switch (db) {
		case "R":
	
		case "N":
			
		case "G":
			GraphDB<String> graphDB = new GraphDB<>();
		}
		
	}
	

}


