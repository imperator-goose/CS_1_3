package net.ruslan.CS_1_3_1.capitalsAndCountries.model;

public class CapitalRequestDto {
    private String countryName;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "CapitalRequestDto{" +
                "countryName='" + countryName + '\'' +
                '}';
    }
}
