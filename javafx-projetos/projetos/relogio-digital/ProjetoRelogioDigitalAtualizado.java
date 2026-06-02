import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Importações que eu fiz
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ProjetoRelogioDigitalAtualizado extends Application {

    final DateTimeFormatter FORMATADOR = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Override
    public void start(Stage palco) {
        Label rotuloTempo = new Label();
        rotuloTempo.setStyle("-fx-font-size: 48px; -fx-text-fill: black; -fx-font-weight: bold;");

        // Criação de um KeyFrame
        KeyFrame keyFrameAtualizar = new KeyFrame(Duration.ZERO, e -> {
            rotuloTempo.setText(LocalDateTime.now().format(FORMATADOR));
        });

        // Criação de outro KeyFrame que define o intervalo de atualização
        KeyFrame keyFrameIntervalo = new KeyFrame(Duration.seconds(1));

        // Criação da Timeline e adição dos KeyFrames
        Timeline relogio = new Timeline();
        relogio.getKeyFrames().addAll(keyFrameAtualizar, keyFrameIntervalo);

        // Definimos que a ação de atualizar o rótulo com a hora atual vai acontecer a cada segundo, para sempre
        relogio.setCycleCount(Animation.INDEFINITE);
        relogio.play(); // Inicia a Timeline

        // Imagem da logo
        Image imagem = new Image("file:imagem-logo-relogio.png");
        System.out.println(imagem.isError());
        ImageView imageView = new ImageView(imagem);

        // Configuração para ajustar o tamanho da imagem
        imageView.setFitHeight(250);
        imageView.setPreserveRatio(true);

        VBox vboxLayout = new VBox(0, imageView, rotuloTempo);
        vboxLayout.setAlignment(Pos.CENTER);
        vboxLayout.setStyle("-fx-background-color: white");

        Scene cena = new Scene(vboxLayout, 800, 500);

        palco.setTitle("Relógio Digital");
        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}