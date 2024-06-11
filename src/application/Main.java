package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

   @Override
   public void start(Stage primaryStage) {
       primaryStage.setTitle("Selección de Fecha y Color");

       // DatePicker
       DatePicker datePicker = new DatePicker();
       datePicker.setPrefWidth(200); // Ancho del DatePicker

       // ColorPicker
       ColorPicker colorPicker = new ColorPicker();
       colorPicker.setPrefWidth(200); // Ancho del ColorPicker

       // Botón para confirmar selección
       Button confirmarButton = new Button("Confirmar");
       confirmarButton.setOnAction(event -> {
           // Obtener la fecha y el color seleccionados
           String fechaSeleccionada = datePicker.getValue().toString();
           Color colorSeleccionado = colorPicker.getValue();

           // Mostrar la fecha y el color en la consola
           System.out.println("Fecha seleccionada: " + fechaSeleccionada);
           System.out.println("Color seleccionado: " + colorSeleccionado);
       });

       // Etiquetas
       Label fechaLabel = new Label("Selecciona una fecha:");
       Label colorLabel = new Label("Selecciona un color:");

       // Layout
       VBox layout = new VBox(10);
       layout.setPadding(new Insets(10));
       layout.setAlignment(Pos.CENTER); // Centrar el VBox
       layout.getChildren().addAll(fechaLabel, datePicker, colorLabel, colorPicker, confirmarButton);

       // Escena y stage
       Scene scene = new Scene(layout, 300, 250); // Ancho y alto de la escena
       primaryStage.setScene(scene);
       primaryStage.show();
   }

   public static void main(String[] args) {
       launch(args);
   }
}