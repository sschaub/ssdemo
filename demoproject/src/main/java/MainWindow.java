import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;

// The main window.
// Comment everywhere
public class MainWindow {

    @FXML
    void onGreetClicked(ActionEvent event) {
        var alert = new Alert(AlertType.INFORMATION, "Hello, there!");
        alert.setHeaderText(null);
        alert.show();

    }
}
