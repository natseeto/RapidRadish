package rapidRadish;

import java.util.*;
import javafx.application.*;
import java.sql.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.*;
import static javafx.application.Application.launch;

public class RapidRadish extends Application {
	
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("RRhome.fxml"));
		Scene scene = new Scene(root);
		
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		launch(args);
		/*
		 * boolean booScary = true;
		 * 
		 * do { Scanner scanner = new Scanner(System.in); String lmao =
		 * scanner.nextLine(); if (!lmao.equals("stop")) { System.out.println(lmao +
		 * " is a stupid thing to say"); } else { System.out.println("aight bruh");
		 * scanner.close(); booScary = false; }
		 * 
		 * } while (booScary);
		 */
	}
	
	private void loadDatabase() throws Exception {
		
	}
}
