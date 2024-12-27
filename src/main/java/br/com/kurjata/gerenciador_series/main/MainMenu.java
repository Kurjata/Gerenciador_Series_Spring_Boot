package br.com.kurjata.gerenciador_series.main;

import br.com.kurjata.gerenciador_series.model.SeriesData;
import br.com.kurjata.gerenciador_series.service.ApiConsumer;
import br.com.kurjata.gerenciador_series.service.DataConverter;

import java.util.Scanner;

public class MainMenu {

    private Scanner scanner = new Scanner(System.in);
    private ApiConsumer apiConsumer = new ApiConsumer();
    private DataConverter dataConverter = new DataConverter();

    private final String URL = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=9c920167";

    public void menu(){

        System.out.println("1 - Digite o nome da série para buscar");
        var serieName = scanner.nextLine();
        var json = apiConsumer.getData(URL + serieName.replace(" ", "+") + API_KEY);
        var seriesData = dataConverter.getData(json, SeriesData.class);
        System.out.println(seriesData);

        //"https://www.omdbapi.com/?t=breaking+bad&apikey=9c920167"
    }
}
