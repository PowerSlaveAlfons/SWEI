package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class Controller extends AbstractController {
    public TextField searchField;
    public Label labelBild;
    private MainWindowPresentationModel _mainWPM = new MainWindowPresentationModel();

    @Override
    public void initialize(URL url, ResourceBundle resources)
    {
        super.initialize(url, resources);
        searchField.textProperty().bindBidirectional(_mainWPM.getSearch().searchTextProperty());
        labelBild.textProperty().bind(_mainWPM.getSearch().searchTextProperty());
    }

    public void onSearch(ActionEvent actionEvent)
    {
        SearchPresentationModel search = _mainWPM.getSearch();
        String aux = search.getSearchText();
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, aux);
        Optional<ButtonType> result = alert.showAndWait();
        search.setSearchText("This is a different text.");

    }
}
