import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.web.WebView;

public class ExemploVideoStreaming extends Application {

	@Override
	public void start(Stage palco) {
		WebView webView = new WebView();

		String urlVideo; // url do vídeo
		urlVideo = "https://youtu.be/TMw9UNXVDG0?si=AItVr-VF5gzDvyS0"; 

		webView.getEngine().load(urlVideo);
		Scene cena = new Scene(webView, 800, 600);

		palco.setTitle("Exemplo de Vídeo de Streaming"); // headline da aplicação
		palco.setScene(cena);
		palco.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}