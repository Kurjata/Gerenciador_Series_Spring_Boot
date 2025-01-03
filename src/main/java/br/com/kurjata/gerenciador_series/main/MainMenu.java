package br.com.kurjata.gerenciador_series.main;

import br.com.kurjata.gerenciador_series.model.EpisodeData;
import br.com.kurjata.gerenciador_series.model.SeasonData;
import br.com.kurjata.gerenciador_series.model.SeriesData;
import br.com.kurjata.gerenciador_series.service.ApiConsumer;
import br.com.kurjata.gerenciador_series.service.DataConverter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainMenu {

    private Scanner scanner = new Scanner(System.in);
    private ApiConsumer apiConsumer = new ApiConsumer();
    private DataConverter dataConverter = new DataConverter();
    private final String URL = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=9c920167";

    public void menu(){

        System.out.println("Digite o nome da série para buscar");
        var serieName = scanner.nextLine();
        var json = apiConsumer.getData(URL + serieName.replace(" ", "+") + API_KEY);
        var seriesData = dataConverter.getData(json, SeriesData.class);
        System.out.println(seriesData);

        List<SeasonData> seasons = new ArrayList<>();
        for (int i = 1; i <= seriesData.totalSeasons(); i++) {
            json = apiConsumer.getData(URL + serieName.replace(" ", "+") + "&Season=" + i + API_KEY);

            SeasonData seasonData = dataConverter.getData(json, SeasonData.class);
            seasons.add(seasonData);
        }
        seasons.forEach(System.out::println);

        seasons.stream()
                .flatMap(s -> s.episodes().stream())
                .forEach(e -> System.out.println(e.title()));

    List<EpisodeData> episodeData = seasons.stream()
        .flatMap(s -> s.episodes().stream())
        .collect(Collectors.toList());


        System.out.println("\nTop 5 episódios com maior avaliação:");
        episodeData.stream()
            .sorted(Comparator.comparing(EpisodeData::imdbRating))
            .limit(5)
            .forEach(System.out::println);
    }
}
