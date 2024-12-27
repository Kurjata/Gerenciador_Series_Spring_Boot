package br.com.kurjata.gerenciador_series;

import br.com.kurjata.gerenciador_series.model.EpisodeData;
import br.com.kurjata.gerenciador_series.model.SeasonData;
import br.com.kurjata.gerenciador_series.model.SeriesData;
import br.com.kurjata.gerenciador_series.service.ApiConsumer;
import br.com.kurjata.gerenciador_series.service.DataConverter;
import br.com.kurjata.gerenciador_series.main.MainMenu;
import com.sun.tools.javac.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class GerenciadorSeriesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorSeriesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		MainMenu mainMenu = new MainMenu();
		mainMenu.menu();

//		List<SeasonData> seasons = new ArrayList<>();
//		for (int i = 1; i <= seriesData.totalSeasons(); i++) {
//			json = apiConsumer.getData("https://www.omdbapi.com/?t=breaking+bad&Season=" + i + "&apikey=9c920167");
//
//			SeasonData seasonData = dataConverter.getData(json, SeasonData.class);
//			seasons.add(seasonData);
//		}
//		seasons.forEach(System.out::println);
	}
}

