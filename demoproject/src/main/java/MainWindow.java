import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;

// The main window.

public class MainWindow {
    
    int count = 1;

    @FXML
    void onGreetClicked(ActionEvent event) {
        var alert = new Alert(AlertType.INFORMATION, "Goodbye, everyone.");
        alert.setHeaderText(null);
        alert.show();

    }
}
