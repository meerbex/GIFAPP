package GIF;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.layout.VBox;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.File;

public class FIGController {
    public static void main(String[] args) {

    }
    @FXML
    private ListView<Screen> listView;

    @FXML
    private ImageView imageID;

    @FXML
    private VBox firstColoumn1;

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
    public void changeScreen(String [] array){
        firstColoumn1.getChildren().removeAll(firstColoumn1.getChildren());
        for (String  face: array) {
            Button button = new Button(face);
            button.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    final Clipboard clipboard = Clipboard.getSystemClipboard();
                    final ClipboardContent content = new ClipboardContent();
                    content.putString(face);
                    clipboard.setContent(content);
                }
            });
            firstColoumn1.getChildren().add(button);

        }

    }
    public void initialize(){


        String[][][] faceTypes = new String[][][]{
//                Радость
                {{"Joy"},{"(^ω^) "," (´∀｀)"," (-‿‿-)"," ☆:.｡.o(≧▽≦)o.｡.:☆ ","(o^▽^o)"," (⌒▽⌒)☆"," <(￣︶￣)> "," 。.:☆:･(⌒―⌒*)))"," ヽ(・∀・)ﾉ (´｡• ω •｡`)"," (￣ω￣)"," ｀;:゛;｀;･(゜ε゜ )"," (o･ω･o)"," (＠＾－＾)"," ヽ(*・ω・)ﾉ"," (o_ _)ﾉ彡☆"," (^人^)"," (o´▽`o)"," (´▽`)"," ｡ﾟ( ﾟ^∀^ﾟ)ﾟ｡"," (´ω｀)"," (☆▽☆)"," (≧◡≦)"," (o´∀｀o)"," (´• ω •`)"," (＾▽＾)"," (⌒ω⌒)"," ∑d(ﾟ∀ﾟd)"," ╰(▔∀▔)╯"," (─‿‿─)"}},
//                Любовь
                {{"Love"},{"(ﾉ´з｀)ノ"," (♡μ_μ)"," (^^)♡"," ☆⌒ヽ(-､^)chu"," (♡-_-♡)"," (￣ε￣＠)"," ヽ(♡‿♡)ノ"," ( ´∀｀)ノ～ ♡"," (─‿‿─)♡"," (´｡• ᵕ •｡`)"," (｡・//ε//・｡)"," (´ω｀♡)"," ( ◡‿◡ ♡)"," (◕‿◕)♡"," (/▽＼*)｡o○♡"," (ღ˘⌣˘ღ)"," (♡ﾟ▽ﾟ♡)"," ♡(。-ω-)"," ♡ ～('▽^人)"," (´• ω •`)"," ♡ (´ε｀ )♡"," (´｡• ω •｡`) ♡"," ( ´ ▽ ` ).｡ｏ♡"," ╰(´︶`)╯♡"," (˘︶˘).｡.:*♡"," (♡˙︶˙♡)"," ♡＼(￣▽￣)／♡"," (≧◡≦) ♡"," (⌒▽⌒)♡"," (¯ ³¯)♡"," (っ˘з(˘⌣˘ ) ♡"," ♡ (˘▽˘>ԅ( ˘⌣˘)"," ( ˘⌣˘)♡(˘⌣˘ )"," (/^-^(^ ^*)/ ♡"}},
        } ;
        int index = 0;
        for (String[][]  faces: faceTypes) {

//            This is title
            System.out.println(faces[0]);
            screens.add(new Screen(faces[0][0], faces[1],""));
            listView.setItems(screens);
//
//            Image image = new Image(url);
//            if (image.isError()) {
//                System.out.println("Error loading image from "+url);
//                // if you need more details
//                // image.getException().printStackTrace();
//            } else {
//                ImageView imageView = new ImageView(image);
//                imageView.setFitWidth(200);
//                imageView.setPreserveRatio(true);
//
//                firstColoumn1.getChildren().add(imageView);
//            }

            index++;
        }
//        imageID.setImage(new Image("gifss/UCA-Logo-TextRightOneLine.png"));


        listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Screen>() {
            @Override
            public void changed(ObservableValue<? extends Screen> observable, Screen oldValue, Screen newValue) {
                System.out.println(newValue.getTitle());
                changeScreen(newValue.getFaces());
            }
        });

    }

}
