import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 * Joonista Ellipse, mille ringjoone paksust saab kasutaja slideriga muuta.
 */
public class JavaFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Ellips");

        Ellipse a = new Ellipse(100,60);
        Slider slider = new Slider();
        a.setStroke(Color.RED);
        a.setStrokeWidth(3);
        a.setFill(Color.WHITE);

        slider.setMin(1);
        slider.setMax(20);
        slider.setValue(3);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(4);

        slider.valueProperty().addListener((observable, vanaVaartus, uusVaartus) -> {
            //System.out.println("Uus väärtus on: " + uusVaartus.intValue());
            a.setStrokeWidth(uusVaartus.doubleValue());
        });

        VBox window = new VBox();
        window.setAlignment(Pos.CENTER);
        window.setSpacing(10);

        window.getChildren().add(a);
        window.getChildren().add(slider);

        Scene scene = new Scene(window,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
