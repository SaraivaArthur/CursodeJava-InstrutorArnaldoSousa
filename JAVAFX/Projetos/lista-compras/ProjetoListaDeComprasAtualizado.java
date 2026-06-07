import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

// Importações que eu fiz
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;

public class ProjetoListaDeComprasAtualizado extends Application {
	
	private ArrayList<String> listaDeCompras = new ArrayList<>();
	private ListView<String> listaVisualizavel = new ListView<>(); // Para exibir os itens da lista de compras.

	@Override
	public void start(Stage palco) {
		palco.setTitle("Aplicativo de Lista de Compras");

		TextField textFieldDescricaoItem = new TextField();
		Button botaoAdicionar = new Button("Adicionar");
		Button botaoExportar = new Button("Exportar Lista");
		Button botaoRemover = new Button("Remover Item");

		Label labelAdicionar = new Label("Digite o item que deseja adicionar:");
		Label labelListaDeCompras = new Label("Lista de Compras:");

		// Criação do objeto ObservableList a partir da ListaDeCompras.
		ObservableList<String> observableListaDeCompras = FXCollections.observableArrayList(listaDeCompras);
		listaVisualizavel.setItems(observableListaDeCompras);

		// Imagem
		Image imagem = new Image("file:logo-lista-compras.png");
		ImageView imageView = new ImageView(imagem);

		// Tamanho da imagem
		imageView.setFitHeight(250);
		imageView.setPreserveRatio(true);

		HBox hBox = new HBox(imageView);
		hBox.setAlignment(Pos.CENTER);

		VBox vBox = new VBox();
		vBox.getChildren().addAll(imageView, labelAdicionar, textFieldDescricaoItem, botaoAdicionar);
		vBox.getChildren().addAll(labelListaDeCompras, listaVisualizavel, botaoRemover, botaoExportar);
		vBox.setSpacing(10); // Espaçamento vertical entre os componentes.
		vBox.setPadding(new Insets(10)); // Margens internas (espaçamento) para o VBox.
		//vBox.setAlignment(Pos.CENTER); // Centraliza todos os elementos.

		botaoAdicionar.setOnAction(e -> {
			String item = textFieldDescricaoItem.getText(); // Obtém o texto digitado e armazena na variável item.
			if (!item.isEmpty()) { // Entra no 'if' se o texto não está vazio (ou seja, se o usuário digitou algo).
				listaDeCompras.add(item); // O texto digitado é adicionado à listaDeCompras.
				listaVisualizavel.getItems().add(item); // Adicionamos o texto à listaVisualizavel.
				textFieldDescricaoItem.clear(); // O campo de texto é limpo, removendo o texto digitado.
			}
		});

		botaoExportar.setOnAction(e -> {
			try {
				File arquivo = new File("listaDeCompras.txt");
				PrintWriter writer = new PrintWriter(arquivo); // O printWriter é usado para gravar os itens da lista no arquivo.
				for (String item : listaDeCompras) { // Escrevemos cada item da lista no arquivo, adiciona uma nova linha para cada item.
					writer.println(item); // Escrevemos cada item da lista no arquivo, adiciona uma nova linha para cada item.
				}
				writer.close();
			} catch (Exception ex) {
				System.out.println("Erro Ocorrido: " + ex.getMessage());
			}
		});

		botaoRemover.setOnAction(e -> {
			String itemSelecionado = listaVisualizavel.getSelectionModel().getSelectedItem();

			if (itemSelecionado != null) {
				listaDeCompras.remove(itemSelecionado);
				listaVisualizavel.getItems().remove(itemSelecionado);
			}
		});

		Scene scene = new Scene(vBox, 500, 700);

		scene.getStylesheets().add("ProjetoListaDeComprasAtualizado.css");

		palco.setScene(scene);

		palco.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}