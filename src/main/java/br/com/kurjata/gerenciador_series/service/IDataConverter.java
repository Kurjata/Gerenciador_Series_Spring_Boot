package br.com.kurjata.gerenciador_series.service;

public interface IDataConverter {
    <T> T getData(String json, Class<T> classed);
}
