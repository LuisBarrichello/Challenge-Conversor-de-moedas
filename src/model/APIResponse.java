package model;

import java.util.Map;

public record APIResponse(String base_code, Map<String, Double> conversion_rates) {}
