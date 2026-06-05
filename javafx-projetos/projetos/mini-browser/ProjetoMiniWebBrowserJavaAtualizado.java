import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

// Importações que eu fiz
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.layout.Priority;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class ProjetoMiniWebBrowserJavaAtualizado extends Application {
	
	@Override
	public void start(Stage palco) {

		TextField campoUrl = new TextField();
		campoUrl.setPromptText("Digite uma URL:"); // Texto que aparece antes do usuário digitar

		WebView navegador = new WebView();
		WebEngine motor = navegador.getEngine();

		// Botão pesquisar
		Button botao = new Button("Pesquisar");
		botao.setPrefWidth(150); // Largura do botão
		botao.setPrefHeight(40); // Altura do botão

		// Ao clicar no botão Pesquisar
		botao.setOnAction(evento -> {
			motor.load(formataUrl(campoUrl.getText()));
		});

		// Campo e botão na mesma linha
		HBox barraPesquisa = new HBox(10);
		barraPesquisa.setAlignment(Pos.CENTER); // Centralizar a barra de pesquisa
		barraPesquisa.getChildren().addAll(campoUrl, botao); // Exibir o texto e o botão

		// Faz o campo crescer 
		HBox.setHgrow(campoUrl, Priority.ALWAYS);

		// Espaço nas laterais
		barraPesquisa.setPadding(new Insets(15, 30, 15, 30)); // Margem: cima, direita, baixo, esquerda

		VBox vbox = new VBox();
		vbox.getChildren().addAll(barraPesquisa, navegador);
		vbox.setSpacing(10);

		Scene cena = new Scene(vbox, 1000, 700); // Aqui determina o tamanho do programa

		cena.getStylesheets().add("ProjetoMiniWebBrowserJavaAtualizado.css"); // Linkagem com o arquivo css

		palco.setTitle("Meu Browser Java"); // Nome do programa
		palco.setScene(cena);
		palco.show();
	}

	public static void main(String[] args) {
		launch(args);
	} 

	// Método para inserir http se o usuário não digitar
	public String formataUrl (String url) {
		if (!url.startsWith("http://") && !url.startsWith("https://")) { // Se o usuário não usar "http" ou "https", ele preenche automaticamente
			url = "http://" + url;
		}
		return url; 
	}
}