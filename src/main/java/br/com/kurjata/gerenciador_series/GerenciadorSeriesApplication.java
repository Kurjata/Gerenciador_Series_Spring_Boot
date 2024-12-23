package br.com.kurjata.gerenciador_series;

import br.com.kurjata.gerenciador_series.model.SeriesData;
import br.com.kurjata.gerenciador_series.service.ApiConsumer;
import br.com.kurjata.gerenciador_series.service.DataConverter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GerenciadorSeriesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorSeriesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var apiConsumer = new ApiConsumer();
		var json = apiConsumer.getData("https://www.omdbapi.com/?t=breaking+bad&apikey=9c920167");
		System.out.println(json);

		DataConverter dataConverter = new DataConverter();
		var seriesData = dataConverter.getData(json, SeriesData.class);
		System.out.println(seriesData);
	}
}
