package net.ruslan.CS_1_3_1.capitalsAndCountries.model;

public class CapitalResponseDto {
    private String countryName;

    private String capitalName;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    @Override
    public String toString() {
        return "CapitalResponseDto{" +
                "countryName='" + countryName + '\'' +
                ", capitalName='" + capitalName + '\'' +
                '}';
    }
}
