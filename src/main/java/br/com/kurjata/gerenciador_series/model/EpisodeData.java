package br.com.kurjata.gerenciador_series.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record EpisodeData(@JsonAlias("Title") String title,
                          @JsonAlias("totalSeasons") Integer number,
                          @JsonAlias("imdbRating") String imdbRating,
                          @JsonAlias("Released") String released) {

}
