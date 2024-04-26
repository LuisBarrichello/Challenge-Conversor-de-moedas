package model;

import java.util.Map;

public class Currency {
    private final String code;
    private final Map<String, Double> exchangeRate;


    public Currency(APIResponse apiResponse) {
        this.code = apiResponse.base_code();
        this.exchangeRate = apiResponse.conversion_rates();
    }

    public String getCode() {
        return code;
    }

    public Map<String, Double> getExchangeRate() {
        return exchangeRate;
    }

    @Override
    public String toString() {
        return this.code + ": " + this.exchangeRate ;
    }
}
