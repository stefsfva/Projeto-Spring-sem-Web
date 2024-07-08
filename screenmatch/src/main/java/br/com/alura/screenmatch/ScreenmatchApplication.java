package br.com.alura.screenmatch;

import br.com.alura.screenmatch.Model.DadosSerie;
import br.com.alura.screenmatch.Services.ConsumoAPI;
import br.com.alura.screenmatch.Services.ConverterDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
		var consumoAPI = new ConsumoAPI();
		var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=The+Big+Bang+Theory&plot=full&apikey=6c7629bf");

		//json = consumoAPI.obterDados("https://coffee.alexflipnote.dev/random.json");//

		System.out.println(json);
		ConverterDados conversor = new ConverterDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);

	}

	public class MyCommandLineRunner implements CommandLineRunner {
		@Override
		public void run(String... args) throws Exception {
			// Coloque o código que você deseja executar aqui
		}
	}
}

