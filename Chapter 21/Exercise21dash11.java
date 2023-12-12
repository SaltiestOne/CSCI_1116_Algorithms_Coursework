package AlgEtc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise21dash11 extends Application {
	
	
	static private HashMap<Integer, HashMap> boyMaps = new HashMap<Integer, HashMap>();
	static private HashMap<Integer, HashMap> girlMaps = new HashMap<Integer, HashMap>();
	private HashMap<String, Integer> activeMap = new HashMap<String, Integer>();
	private Button btFindRanking = new Button("Find Ranking");
	private ComboBox<Integer> cboYear = new ComboBox<>();
	private ComboBox<String> cboGender = new ComboBox<>();
	private TextField tfName = new TextField();
	private Label lblResult = new Label();

	public void start(Stage primaryStage) {
		
		GridPane gridPane = new GridPane();
		gridPane.add(new Label("Select a year:"), 0, 0);
		gridPane.add(new Label("Boy or girl?"), 0, 1);
		gridPane.add(new Label("Enter a name:"), 0, 2);
		gridPane.add(cboYear, 1, 0);
		gridPane.add(cboGender, 1, 1);
		gridPane.add(tfName, 1, 2);
		gridPane.add(btFindRanking, 1, 3);
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(gridPane);
		borderPane.setBottom(lblResult);
		BorderPane.setAlignment(lblResult, Pos.CENTER);
		
		try {
			ListMaker();
		} catch (IOException e) {

			System.out.println(e.getLocalizedMessage());
		}
		// Create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 370, 205);
		primaryStage.setTitle("Exercise21_11"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		for (int year = 2001; year <= 2010; year++) {
			cboYear.getItems().add(year);
		}
		cboYear.setValue(2001);
		cboGender.getItems().addAll("Male", "Female");
		cboGender.setValue("Male");
		tfName.setOnAction(e -> {
			//convenience that enables the enter button to also work
			btFindRanking.fire();
		});
		
		btFindRanking.setOnAction(e -> {
			
			int year = cboYear.getValue();
			String name = tfName.getText();
			String gender = "";
			String rank = "0";
			
			if (cboGender.getValue() == "Male") {
				
				activeMap = boyMaps.get(year);
				gender = "boy";
			} else {
				
				activeMap = girlMaps.get(year);
				gender = "girl";
			}
			
			try {

				rank = (" was ranked #" + (activeMap.get(name)).toString());
			}
			
			catch (NullPointerException n) {
				
				rank = (" was not ranked");
			
			} finally {
				
				lblResult.setText(name + rank + " among\nnames for baby " + 
				gender + "s in " + year + ".");		
			}
		});
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	public static void ListMaker() throws IOException {
		
		for (int y = 2001; y <= 2010; y++) {
			
			HashMap<String, Integer> newBoyMap = new HashMap<String, Integer>();
			HashMap<String, Integer> newGirlMap = new HashMap<String, Integer>();
			
			String url = ("http://liveexample.pearsoncmg.com/data/babynamesranking" + y + ".txt");
			
			Scanner namer = new Scanner((new URL(url)).openStream());
			
			while (namer.hasNext()) {

				int rank = namer.nextInt();
				String boyName = namer.next();
				namer.next();
				String girlName = namer.next();
				namer.next();
				
				newBoyMap.put(boyName, rank);
				newGirlMap.put(girlName, rank);		
			}

			boyMaps.put(y, newBoyMap);
			girlMaps.put(y, newGirlMap);
		}	
	}
}

