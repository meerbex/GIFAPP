package GIF;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.layout.VBox;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class FIGController {

    @FXML
    private ListView<Screen> listView;

    @FXML
    private VBox firstColoumn;

    @FXML
    private Button face1;

    @FXML
    void onFace1Clicked(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        final Clipboard clipboard = Clipboard.getSystemClipboard();
        final ClipboardContent content = new ClipboardContent();
        content.putString("༼つ◕_◕༽つ");
        clipboard.setContent(content);
    }

    private final ObservableList<Screen> screens = FXCollections.observableArrayList();

    public void initialize(){

        screens.add(new Screen("Text Faces","https://avatars.slack-edge.com/2017-02-13/139868781600_2e42bf3227df8e3ce121_512.png",1));
        screens.add(new Screen("GIFs","https://avatars.slack-edge.com/2017-02-13/139868781600_2e42bf3227df8e3ce121_512.png",2));
        listView.setItems(screens);
        listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Screen>() {
            @Override
            public void changed(ObservableValue<? extends Screen> observable, Screen oldValue, Screen newValue) {
                System.out.println(newValue.getType());
            }
        });

    }

}
