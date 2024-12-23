package br.com.kurjata.gerenciador_series.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataConverter implements IDataConverter {
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T getData(String json, Class<T> classed) {
        try {
            return mapper.readValue(json, classed);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }


}
