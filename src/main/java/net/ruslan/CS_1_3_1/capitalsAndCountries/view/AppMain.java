package net.ruslan.CS_1_3_1.capitalsAndCountries.view;

import net.ruslan.CS_1_3_1.capitalsAndCountries.model.CapitalRequestDto;
import net.ruslan.CS_1_3_1.capitalsAndCountries.model.CapitalResponseDto;
import net.ruslan.CS_1_3_1.capitalsAndCountries.сontroller.Controller;

import java.util.Scanner;

public class AppMain {
    private Controller controller;

    public AppMain() {
        this.controller = new Controller();
    }

    public void start() {
        System.out.println("Enter the name of the country");
        Scanner scanner = new Scanner(System.in);
        String countryName = scanner.nextLine();

        CapitalRequestDto request = new CapitalRequestDto();
        request.setCountryName(countryName);

        CapitalResponseDto response = controller.getCapital(request);

        System.out.println("Capital of country " + countryName + "-" + response.getCountryName());
    }
}
