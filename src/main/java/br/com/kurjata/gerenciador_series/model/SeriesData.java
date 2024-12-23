package br.com.kurjata.gerenciador_series.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SeriesData(@JsonAlias("Title") String title, @JsonAlias("totalSeasons") Integer totalSeasons, @JsonAlias("imdbRating") String imdbRating) {

}
