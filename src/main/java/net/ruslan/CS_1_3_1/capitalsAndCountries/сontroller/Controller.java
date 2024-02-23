package net.ruslan.CS_1_3_1.capitalsAndCountries.сontroller;

import net.ruslan.CS_1_3_1.capitalsAndCountries.model.CapitalRequestDto;
import net.ruslan.CS_1_3_1.capitalsAndCountries.model.CapitalResponseDto;

import java.util.Map;

public class Controller {


        Map<String, String> stringMap = Map.of(
                "Russia", "Moscow",
                "Britain", "London",
                "France", "Paris"
        );

        public CapitalResponseDto getCapital(CapitalRequestDto request) {
            String countryName = request.getCountryName();
            String capital = stringMap.get(countryName);

            CapitalResponseDto response = new CapitalResponseDto();
            response.setCountryName(capital);

            return response;
        }
    }
