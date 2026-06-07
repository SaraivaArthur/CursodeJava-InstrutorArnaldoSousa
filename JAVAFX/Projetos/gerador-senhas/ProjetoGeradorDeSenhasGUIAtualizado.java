import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Pos;

public class ProjetoGeradorDeSenhasGUIAtualizado extends Application {
	
	@Override
	public void start(Stage palco) {

		palco.setTitle("Gerador de Senhas");

		Label labelTamanhoSenha = new Label("Tamanho da senha:");
		TextField campoTamanhoSenha = new TextField();
		campoTamanhoSenha.setText("8"); // Definir qual o tamanho da senha
		campoTamanhoSenha.setMaxWidth(300);

		Label labelSenhaGerada = new Label("Senha gerada:");
		TextField campoSenhaGerada = new TextField();
		campoSenhaGerada.setEditable(false); // Aqui determina que o usuário não possa alterar após a geração da senha
		campoSenhaGerada.setStyle("-fx-text-fill: cyan; -fx-background-color: black;");
		campoSenhaGerada.setMaxWidth(300);

		Button botaoGerar = new Button("Gerar senha");
		botaoGerar.setStyle("-fx-text-fill: white; -fx-background-color: green; -fx-pref-height: 30px; -fx-background-radius: 7px;");
		//botaoGerar.setPrefSize(80, 50);
		botaoGerar.setOnAction(e -> {
			int tamanhoSenha = Integer.parseInt(campoTamanhoSenha.getText()); // Pego o tamanho desejado
			String senha = ProjetoGeradorDeSenhas.gerarSenha(tamanhoSenha); // Gerar a senha
			campoSenhaGerada.setText(senha); // Mostrar a senha gerada para o usuário
		});

		// Imagem da logo
		Image imagem = new Image("file:logo-gerador-senhas.png");
		ImageView imageView = new ImageView(imagem);

		// Tamanho da imagem
		imageView.setFitHeight(250);
		imageView.setPreserveRatio(true);

		VBox vBox = new VBox(0, imageView, labelTamanhoSenha, campoTamanhoSenha, botaoGerar, labelSenhaGerada, campoSenhaGerada);
		vBox.setSpacing(10); // Espaço entre os componentes
		vBox.setPadding(new Insets(10)); // Adiciona um espaçamento de 10 pixels em todas as bordas
		vBox.setAlignment(Pos.CENTER); // Centraliza tudo 

		Scene cena = new Scene(vBox, 500, 500);
		palco.setScene(cena);
		palco.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
