import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;

// The main window.

public class MainWindow {
    
    int count = 1;  // Initialize count

    int turkeyWeight = 36;

    @FXML
    void onGreetClicked(ActionEvent event) {
        var alert = new Alert(AlertType.INFORMATION, "Hello, everyone.");
        alert.setHeaderText(null);
        alert.show();

    }
}
