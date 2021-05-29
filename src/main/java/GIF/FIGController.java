package GIF;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.util.Duration;

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
        firstColoumn1.setSpacing(5);
        Label label = new Label("Copied!");
        label.setStyle(" -fx-background-color: white;");
        label.setPadding(new Insets(5));
        // create a popup
        Popup popup = new Popup();
        popup.getContent().add(label);


        for (String  face: array) {
            Button button = new Button(face);
            button.setStyle("-fx-background-color: #ffffff; ");
            button.setPadding(new Insets(5));
            button.setOnAction(new EventHandler() {
                @Override
                public void handle(Event event) {
                    final Clipboard clipboard = Clipboard.getSystemClipboard();
                    final ClipboardContent content = new ClipboardContent();
                    content.putString(face);
                    clipboard.setContent(content);
                    Node node = (Node) event.getSource();
                    Stage thisStage = (Stage) node.getScene().getWindow();
                    popup.show(thisStage);
                    PauseTransition wait = new PauseTransition(Duration.seconds(2));
                    wait.setOnFinished((e) -> {
                        /*YOUR METHOD*/
//                        System.out.println("Hi");
                        popup.hide();
                    });
                    wait.play();
                }
            });
            firstColoumn1.getChildren().add(button);

        }

    }
    public void initialize(){

        changeScreen(new String[]{"(^ω^) ", " (´∀｀)", " (-‿‿-)", " ☆:.｡.o(≧▽≦)o.｡.:☆ ", "(o^▽^o)", " (⌒▽⌒)☆", " <(￣︶￣)> ", " 。.:☆:･(⌒―⌒*)))", " ヽ(・∀・)ﾉ (´｡• ω •｡`)", " (￣ω￣)", " ｀;:゛;｀;･(゜ε゜ )", " (o･ω･o)", " (＠＾－＾)", " ヽ(*・ω・)ﾉ", " (o_ _)ﾉ彡☆", " (^人^)", " (o´▽`o)", " (´▽`)", " ｡ﾟ( ﾟ^∀^ﾟ)ﾟ｡", " (´ω｀)", " (☆▽☆)", " (≧◡≦)", " (o´∀｀o)", " (´• ω •`)", " (＾▽＾)", " (⌒ω⌒)", " ∑d(ﾟ∀ﾟd)", " ╰(▔∀▔)╯", " (─‿‿─)"});
        String[][][] faceTypes = new String[][][]{
//                Радость
                {{"Joy"},{"(^ω^) "," (´∀｀)"," (-‿‿-)"," ☆:.｡.o(≧▽≦)o.｡.:☆ ","(o^▽^o)"," (⌒▽⌒)☆"," <(￣︶￣)> "," 。.:☆:･(⌒―⌒*)))"," ヽ(・∀・)ﾉ (´｡• ω •｡`)"," (￣ω￣)"," ｀;:゛;｀;･(゜ε゜ )"," (o･ω･o)"," (＠＾－＾)"," ヽ(*・ω・)ﾉ"," (o_ _)ﾉ彡☆"," (^人^)"," (o´▽`o)"," (´▽`)"," ｡ﾟ( ﾟ^∀^ﾟ)ﾟ｡"," (´ω｀)"," (☆▽☆)"," (≧◡≦)"," (o´∀｀o)"," (´• ω •`)"," (＾▽＾)"," (⌒ω⌒)"," ∑d(ﾟ∀ﾟd)"," ╰(▔∀▔)╯"," (─‿‿─)"}},
//                Любовь
                {{"Love"},{"(ﾉ´з｀)ノ"," (♡μ_μ)"," (^^)♡"," ☆⌒ヽ(-､^)chu"," (♡-_-♡)"," (￣ε￣＠)"," ヽ(♡‿♡)ノ"," ( ´∀｀)ノ～ ♡"," (─‿‿─)♡"," (´｡• ᵕ •｡`)"," (｡・//ε//・｡)"," (´ω｀♡)"," ( ◡‿◡ ♡)"," (◕‿◕)♡"," (/▽＼*)｡o○♡"," (ღ˘⌣˘ღ)"," (♡ﾟ▽ﾟ♡)"," ♡(。-ω-)"," ♡ ～('▽^人)"," (´• ω •`)"," ♡ (´ε｀ )♡"," (´｡• ω •｡`) ♡"," ( ´ ▽ ` ).｡ｏ♡"," ╰(´︶`)╯♡"," (˘︶˘).｡.:*♡"," (♡˙︶˙♡)"," ♡＼(￣▽￣)／♡"," (≧◡≦) ♡"," (⌒▽⌒)♡"," (¯ ³¯)♡"," (っ˘з(˘⌣˘ ) ♡"," ♡ (˘▽˘>ԅ( ˘⌣˘)"," ( ˘⌣˘)♡(˘⌣˘ )"," (/^-^(^ ^*)/ ♡"}},
//                Сочувствие
                {{"Sympathy"},{"(ノ_<。)","ヾ(´▽｀)"," ｡･ﾟ･(ﾉД`)","ヽ(￣ω￣ )"," ρ(-ω-、)","ヾ(￣ω￣; )"," ヽ(￣ω￣(。。 )ゝ"," (*´I｀)ﾉﾟ(ﾉД｀ﾟ)ﾟ｡"," ヽ(_(・_・ )ゝ"," (ﾉ＿；)","ヾ(´∀｀)"," (；ω； )","ヾ(´∀｀* )"," (*´ー)ﾉ","(ノд`)"," (´-ω-`( _ _ )"," (っ´ω｀)ﾉ(╥ω╥)"," (ｏ・・)ノ”(ノ<、)"}},
//                Недовольство
                {{"Dissatisfaction"},{"(＃＞＜)"," (；⌣̀_⌣́)"," ☆ｏ(＞＜；)○"," (￣ ￣|||)"," (；￣Д￣)"," (￣□￣」)"," (＃￣0￣)"," (＃￣ω￣)"," (￢_￢;)"," (＞ｍ＜)"," (」゜ロ゜)」"," (〃＞＿＜;〃)"," (＾＾＃)"," (︶︹︺)"," (￣ヘ￣)"," <(￣ ﹌ ￣)>"," (￣︿￣)"," (＞﹏＜)"," (--_--)"," 凸(￣ヘ￣)"," ヾ( ￣O￣)ツ"," (⇀‸↼‶)"," o(>< )o"}},
//                Злость
                {{"Anger"},{"(＃`Д´)"," (｀皿´＃)"," (｀ω´) ","ヽ( `д´*)ノ"," (・｀ω´・)"," (｀ー´)"," ヽ(｀⌒´メ)ノ"," 凸(｀△´＃)"," (｀ε´)"," ψ(｀∇´)ψ"," ヾ(｀ヘ´)ﾉﾞ"," ヽ(‵﹏′)ノ"," (ﾒ｀ﾛ´)"," (╬｀益´)"," ┌∩┐(◣_◢)┌∩┐"," 凸(｀ﾛ´)凸"," Σ(▼□▼メ)"," (°ㅂ°╬)"," ψ(▼へ▼メ)～→"," (ノ°益°)ノ"," (҂ `з´ ) ","(‡▼益▼)"," (҂｀ﾛ´)凸"," ((╬◣﹏◢))"," ٩(╬ʘ益ʘ╬)۶"," (╬ Ò﹏Ó)"," ＼＼٩(๑`^´๑)۶／／"}},
//                Печаль
                {{"Sadness"},{"(ノ<。)"," (*--)"," (´-ω-｀)"," .･ﾟﾟ･(／ω＼)･ﾟﾟ･."," (μ_μ)"," (ﾉД`)"," (-ω-、)"," 。゜゜(´Ｏ｀)°゜。"," o(TヘTo)"," (；ω；)"," (｡╯3╰｡)"," ｡･ﾟﾟ(>д<)ﾟﾟ･｡"," ( ﾟ，ゝ｀)"," (个个)"," (╯︵╰,)"," ｡･ﾟ(ﾟ><ﾟ)ﾟ･｡"," ( ╥ω╥ )"," (╯╰)"," (╥╥)"," .｡･ﾟﾟ･(＞_＜)･ﾟﾟ･｡."," (／ˍ・、)"," (ノ_<、)"," (╥﹏╥)"," ｡ﾟ(｡ﾉωヽ｡)ﾟ｡"," (つω`*)"," (｡T ω T｡)"," (ﾉω･､)"," ･ﾟ･(｡>ω<｡)･ﾟ･"," (T_T)"," (>_<)"," (Ｔ▽Ｔ)"," ｡ﾟ･ (>﹏<) ･ﾟ｡"," o(〒﹏〒)o"}},
//                Сомнение
                {{"Doubt"},{"(￢￢) ","(→→) ","(￢ ￢)"," (￢‿￢ )","(¬¬ )"," (←←) ","(¬ ¬ ) ","(¬‿¬ )","(↼↼) ","(⇀⇀)"}},
//                Удивление
                {{"Surprise"},{"w(ﾟｏﾟ)w ","ヽ(ﾟ〇ﾟ)ﾉ Σ(O_O) Σ(ﾟロﾟ)","(⊙_⊙) ","(o_O)"," (O_O;)"," (O.O)","(ﾟロﾟ) !"," (o_O) ! ","(□□) Σ(□□)","∑(O_O;)"}},
//                Приветствие
                {{"Приветствие"},{"(・ω・)ﾉ"," (￣▽￣)ノ ","(ﾟ▽ﾟ)/ (´∀｀)ﾉ ","(^-^*)/ ","(＠´ー`)ﾉﾞ ","(´• ω •`)ﾉ (ﾟ∀ﾟ)ﾉﾞ","ヾ('▽') ＼(⌒▽⌒) ","ヾ(☆▽☆) ( ´ ▽ ` )ﾉ","(^０^)ノ ~ヾ(・ω・)"," (・∀・)ノ ヾ(^ω^*)","(*ﾟｰﾟ)ﾉ"," (・_・)ノ ","(o´ω`o)ﾉ"," ヾ(☆'∀'☆)","(￣ω￣)/ (´ω｀)ノﾞ ","(⌒ω⌒)ﾉ (o^ ^o)/"," ","(≧▽≦)/ (✧∀✧)/"," (o´▽`o)ﾉ ","(￣▽￣)/"}},
//                Подмигивание
                {{"Wink"},{"(^~) ( ﾟｏ⌒) ","(^-)≡☆ (^ω~)","(>ω^) (~人^) ","(^-) ( -・)","(^_<)〜☆"," (^人<)〜☆ ☆⌒(≧▽° ) ","☆⌒(ゝ。∂)","(^<) (^−)☆ (･ω<)☆"}},
//                Извинение
                {{"Apology"},{"m(_ )m ","(シ )シ ","m(. .)m ","<( _)>","人(_ ) ( )人 m( ;m) (m; _)m","(シ. .)シ"}},
//                Письмо
                {{"Letter"},{"_φ(．．)"," ( ￣ー￣)φ_ _φ(。。) _φ(．．;)","ヾ( `ー´)シφ_ _","〆(￣ー￣ ) ....φ","(・∀・*) _〆(・∀・)","( ^▽^)ψ_ ....φ(︶▽︶)φ.... ( . .)φ_ __φ(◎◎ヘ)"}},
//                Кошка
                {{"Music"},{"  人__人","≧(◕ ‿‿ ◕)≦","(=^･ω･^=) (=^･ｪ･^=) ","(=①ω①=) ","( =ω=)..nyaa","(=；ｪ；=) ","(=｀ω´=) ","(=^‥^=) ","( =ノωヽ=)","(=⌒‿‿⌒=) ","(=^ ◡ ^=)"," (=^-ω-^=) ","ヾ(=｀ω´=)ノ”","(＾• ω •＾)"," (/ =ω=)/"}},
//                Музыка
                {{"Love"},{"ヾ(´〇｀)ﾉ","♪♪♪ ヘ(￣ω￣ヘ) ","(〜￣△￣)〜 〜(￣▽￣〜)","ヽ(o´∀`)ﾉ♪","♬ (ﾉ≧∀≦)ﾉ"," ♪ヽ(^^ヽ)♪ ","♪(/_ _ )/♪","","♪♬((d⌒ω⌒b))♬♪ ","└(￣-￣└)) ((┘￣ω￣)┘ √(￣‥￣√)","└(＾＾)┐ ┌(＾＾)┘"," ＼(￣▽￣)＼ ／(￣▽￣)／","(￣▽￣)/♫•¨•.¸¸♪ (^_^♪)"}},
//                Оружие
                {{"Weapon"},{"( ・∀・)・・・--------☆ (/-_・)/D・・・・・------ → (^ω^)ノﾞ(((((((((●～*","( -ω-)／占~~~ (/・・)ノ","(( く ((へ ―⊂|=0ヘ(^^ )","○∞∞∞∞ヽ(^ー^ ) (; ・・)――――C ( ・・)ノ　ζ|||ζ","(*＾＾)/~~~~◎ ￢o(￣-￣ﾒ) ―(T_T)→","((( ￣□)_／ (ﾒ｀ﾛ´)︻デ═一 ( ´-ω･)︻┻┳══━一","(ﾒ￣▽￣)︻┳═一 Q(｀⌒´Q)"}},
//                Другие
                {{"Others"},{"(・ω・)メ(・ω・)ノ ","ヽ(∀゜ )人( ゜∀)ノ"," ヽ( ⌒o⌒)人(⌒-⌒ )ﾉ ","(^ω^)八(⌒▽⌒)八(-‿‿- )ヽ"," ＼(＾∀＾)メ(＾∀＾)ノ ","ヾ(￣ー￣(≧ω≦)ゝ ","ヽ( ⌒ω⌒)人(=^‥^= )ﾉ"," ヽ(≧◡≦)八(o^ ^o)ノ ","(・∀・)爻(・∀・)","｡*:☆(・ω・人・ω・)｡:゜☆","｡ o(^^o)(o^^o)(o^^o)(o^^)o ","(((￣(￣(￣▽￣)￣)￣))) ","(ﾟ(ﾟω(ﾟωﾟ(☆ω☆)ﾟωﾟ)ωﾟ)ﾟ) ","ヾ(・ω・｀)ノヾ(´・ω・)ノ゛ Ψ( ｀∀)(∀´ )Ψ ","(っ˘▽˘)(˘▽˘)˘▽˘ς) (((°▽°)八(°▽°))) ☆","ヾ(´・∀・)ﾉヾ(・∀・`)ﾉ☆ ","ヽ( ･∀･)ﾉθ彡","☆Σ(ノ `Д´)ノ ","(*´∇｀)┌θ☆","(ﾉ><)ﾉ ","( ￣ω￣)ノﾞ","⌒☆ﾐ(o _ _)o ","(*｀0´)θ☆(メ゜皿゜)ﾉ ","(o¬‿¬o )...☆ﾐ(*x_x) ","(╬￣皿￣)=○＃(￣#)３￣) ","(; --)――――――C<―-) ＜( ￣︿￣)","︵θ︵θ︵","☆(＞口＜－)"," (￣ε(#￣)☆","╰╮o(￣▽￣///)","ヽ(><ヽ) ―⊂|=0","ヘ(^‿^ ) ヘ(><ヘ)"," ￢o(￣‿￣ﾒ) ","((( ￣□)／ ＼(○￣ )))","(҂｀ﾛ´)︻デ═一 ＼(º □ º l|l)/ ","(╯°Д°)╯︵ ","/(.□ . ＼) ","(¬_¬'')ԅ(￣ε￣ԅ)","/( .□.)＼"," ︵╰(°益°)╯︵ ","/(.□. /) (ﾉ-.-)ﾉ….((((((((((((●~* ( ><) !!(ﾒ￣ ￣)θ☆ﾟ0ﾟ)/","(｀⌒*)O-(｀⌒´Q","","(´ー´)旦 旦(￣ω￣)"," (´з｀)口ﾟ｡ﾟ口(・∀・ ) ","( o^ ^o)且 且(´ω｀)","( ￣▽￣)[] [](≧▽≦ ) ","( ^^)o∀∀o(^^* ) ","( ^^)旦~~　 ~~U(^^ )","(￣▽￣)旦 且(´∀｀)","٩(ˊ〇ˋ*)و","(￣^￣)ゞ ","(－‸ლ) ","(╯°益°)╯彡┻━┻ ","(╮°-°)╮┳━━┳ ( ╯°□°)╯ ┻━━ ","┬─┬ノ( º _ ºノ) ","(oT-T)尸 ","( ͡° ͜ʖ ͡°) ","(ಠ_ಠ) ","◯０o。(ー。ー)y~~ ","(￣﹃￣) ","( ˘▽˘)っ♨ ","(っ˘ڡ˘ς) ","(x(x_(x_x(O_o)x_x)_x)x) ","(；･ω･)ア ","(　￣.)o-【　TV　】 ","｀、ヽ｀ヽ｀、ヽ(ノ＞＜)ノ ｀、ヽ｀☂ヽ｀、ヽ ","(*￣ii￣)"}},

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
//                System.out.println(newValue.getTitle());
                changeScreen(newValue.getFaces());
            }
        });

    }

}
