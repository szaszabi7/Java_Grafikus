package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    @FXML
    private ListView<Ember> emberLista;
    @FXML
    private Spinner<Integer> eletkorBevitel;
    @FXML
    private TextField nevBeviteliMezo;
    @FXML
    private Label eletkorLabel;
    @FXML
    public void felvetelClick() {
        String nev = nevBeviteliMezo.getText();
        int eletKor = eletkorBevitel.getValue();
        Ember ember = new Ember(nev, eletKor);
        emberLista.getItems().add(ember);
    }

    @FXML
    public void helloClick() {
        String nev = nevBeviteliMezo.getText();
        Alert felugroAblak = new Alert(Alert.AlertType.NONE);
        felugroAblak.setContentText("Hello " + nev);
        felugroAblak.getButtonTypes().add(ButtonType.OK);
        felugroAblak.showAndWait();
        eletkorLabel.setText(nevBeviteliMezo.getText());
    }
}
