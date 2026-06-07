import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ProjetoCalculadoraIMCAtualizado extends Application {

    @Override
    public void start(Stage palco) {
        // Etiquetas para os campos de entrada
        Label etiquetaPeso = new Label("Peso");
        Label etiquetaAltura = new Label("Altura");

        // Campos de texto para entrada de dados
        TextField campoPeso = new TextField();
        campoPeso.setPromptText("Peso em kg");
        TextField campoAltura = new TextField();
        campoAltura.setPromptText("Altura em metros");

        // Label para mostrar o resultado do IMC
        Label etiquetaResultado = new Label();

        // Botão para calcular o IMC
        Button botaoCalcular = new Button("Calcular IMC");
        botaoCalcular.setOnAction(e -> {
            try{    
                double peso = Double.parseDouble(campoPeso.getText().replace(',', '.'));
                double altura = Double.parseDouble(campoAltura.getText().replace(',', '.'));

                double imc = peso / (altura * altura);

                String classificacao;

                if (imc < 18.5) {
                    classificacao = "Abaixo do peso";
                } else if (imc < 25) {
                    classificacao = "Peso normal";
                } else if (imc < 30) {
                    classificacao = "Sobrepeso";
                } else if (imc < 35) {
                    classificacao = "Obesidade Grau I";
                } else if (imc < 40) {
                    classificacao = "Obesidade Grau II";
                } else {
                    classificacao = "Obesidade Grau III (mórbido)";
                }
        
                etiquetaResultado.setText(String.format("Seu IMC é: %.2f\nClassificação: %s", imc, classificacao));
            } catch (NumberFormatException ex) {
                etiquetaResultado.setText("Por favor, insira números válidos para peso e altura.");
            }
        });

        // Imagem
        Image imagem = new Image("file:imagem-logo.png");
        ImageView imageView = new ImageView(imagem);

        // Configuração para ajustar o tamanho da imagem
        imageView.setFitHeight(150);
        imageView.setPreserveRatio(true);

        // Layout vertical
        VBox layout = new VBox(
            10,
            imageView,
            etiquetaPeso,
            campoPeso,
            etiquetaAltura,
            campoAltura,
            botaoCalcular,
            etiquetaResultado
        );

        layout.setPadding(new Insets(10));
        layout.setAlignment(Pos.CENTER);

        // Cena e palco
        Scene cena = new Scene(layout, 350, 450);
        palco.setTitle("Calculadora de IMC");
        palco.setScene(cena);
        palco.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

/* Observações de melhorias
Tratamento de Exception
            try {
                // Peso
                // Altura
                // Cálculo IMC
                // Resultado
            } catch (NumberFormatException ex) {
                etiquetaResultado.setText("Por favor, insira números válidos para peso e altura.");
            }

Conversão para separação de casa decimais com vírgula:

//double peso = Double.parseDouble(campoPeso.getText().replace(',', '.'));
//double altura = Double.parseDouble(campoAltura.getText().replace(',', '.'));
 */