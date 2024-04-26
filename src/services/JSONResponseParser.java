package services;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import model.APIResponse;
import model.Currency;

public class JSONResponseParser {
    public Currency parseJSONResponse(String jsonResponse) {
        try {
            Gson gson = new Gson();
            APIResponse apiResponse = gson.fromJson(jsonResponse, APIResponse.class);

            if (apiResponse.base_code() == null || apiResponse.conversion_rates() == null) {
                throw new IllegalArgumentException("Dados da API inválidos");
            }

            Currency currency = new Currency(apiResponse);

            if (currency.getExchangeRate() == null) {
                throw new IllegalArgumentException("Falha ao carregar o cambio");
            }

            return currency;
        } catch (JsonSyntaxException | JsonIOException e) {
            throw new RuntimeException("Erro ao receber dados JSON", e);
        }

    }

}
