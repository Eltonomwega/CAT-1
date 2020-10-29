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
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

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
    GridPane gridPane, gridpane2, gridpane3;
    TextField emailPhoneField;
    Text emailPhone, pass, connect;
    Button signUp;
    try {
      logoimage = new Image("facebooklogo.png");

      logo = new ImageView(logoimage);
      logo.setX(0);
      logo.setY(920);
      // setting the fit height and width of the image view
      logo.setFitHeight(60);
      logo.setFitWidth(100);
      logo.setPreserveRatio(true);

      emailPhone = new Text("Email or Phone");
      pass = new Text("Password");
      connect = new Text("Connect with friends and the world around you on Facebook.");
      emailPhoneField = new TextField();
      signUp = new Button("Create Account");
      signUp.setStyle("-fx-background-color: green; -fx-text-fill: white;");
      PasswordField passField = new PasswordField();
      toolBar
          .setBackground(new Background(new BackgroundFill(Color.rgb(61, 92, 154), CornerRadii.EMPTY, Insets.EMPTY)));
      gridPane = new GridPane();
      gridPane.setAlignment(Pos.CENTER);
      gridPane.setVgap(3);
      gridPane.setHgap(5);
      gridPane.add(emailPhone, 0, 0);
      gridPane.setMargin(emailPhone, new Insets(0, 4, 0, 20));
      gridPane.add(emailPhoneField, 0, 1);
      gridPane.add(pass, 1, 0);
      gridPane.add(passField, 1, 1);

      toolBar.getItems().add(logo);
      toolBar.getItems().add(gridPane);
      toolBar.setMinHeight(100);
      VBox vBox = new VBox();
      vBox.setBackground(new Background(new BackgroundFill(Color.rgb(237, 240, 249), CornerRadii.EMPTY, Insets.EMPTY)));
      connect.setStyle("-fx-font:normal bold 20px 'serif' ");

      EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {

        @Override
        public void handle(MouseEvent e) {
          vBox.setBackground(
              new Background(new BackgroundFill(Color.rgb(32, 56, 100), CornerRadii.EMPTY, Insets.EMPTY)));
          connect.setText("Thank you for registering to facebook Application");
        }
      };
      signUp.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
      gridpane2 = new GridPane();
      gridpane2.setAlignment(Pos.CENTER);
      gridpane2.setMinSize(25, 40);
      gridpane2.setVgap(3);
      gridpane2.setHgap(5);
      gridpane2.add(connect, 0, 0);
      gridpane2.add(signUp, 0, 1);
      // vBox.getChildren().add(toolBar)

      vBox.getChildren().add(toolBar);
      vBox.getChildren().add(gridpane2);

      Scene scene = new Scene(vBox, 600, 500);
      stage.setTitle("My First");

      // left of toolbar

      stage.setScene(scene);

      stage.show();
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println(e);
      LOGGER.log(Level.SEVERE, "Exception occur", e);

    }

  }

}