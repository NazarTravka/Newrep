package gen.points;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainCont extends Application {
	
	
	private Stage primaryStage;
	private AnchorPane ap;

	@Override
	public void start(Stage primaryStage) throws NumberFormatException, IOException {
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("PointEx");
        initRootLayout();
 // showPointEx();
   	

	}
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainCont.class.getResource("view/PointEx.fxml"));
            ap = (AnchorPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(ap);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	

	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
