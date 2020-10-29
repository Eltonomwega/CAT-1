import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import java.util.logging.Logger;
import javafx.scene.control.ToolBar;
import javafx.geometry.Insets;
import javafx.scene.layout.CornerRadii;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.geometry.Pos;
import javafx.scene.layout.BackgroundFill;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import java.util.logging.Level;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Background;

public class facebook extends Application {
  private static final Logger LOGGER = Logger.getLogger(facebook.class.getName());

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) {

    // creating toolbar
    ToolBar toolBar = new ToolBar();
    // create image
    Image logoimage;
    ImageView logo;
    try {
      logoimage = new Image("facebooklogo.png");

      logo = new ImageView(logoimage);
      logo.setX(0);
      logo.setY(920);
      // setting the fit height and width of the image view
      logo.setFitHeight(50);
      logo.setFitWidth(100);
      logo.setPreserveRatio(true);

      Text emailPhone = new Text("Email or Phone");
      Text pass = new Text("Password");

      TextField emailPhoneField = new TextField();
      PasswordField passField = new PasswordField();
      toolBar.setMinHeight(60);

      toolBar
          .setBackground(new Background(new BackgroundFill(Color.rgb(61, 92, 154), CornerRadii.EMPTY, Insets.EMPTY)));
      toolBar.getItems().add(logo);
      VBox vBox = new VBox(toolBar);
      Scene scene = new Scene(vBox, 500, 500);
      // toolBar.setFill("#3d5c9a");
      stage.setTitle("My First JavaFX GUI");

      stage.setScene(scene);

      stage.show();
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println(e);
      LOGGER.log(Level.SEVERE, "Exception occur", e);

    }

  }

}