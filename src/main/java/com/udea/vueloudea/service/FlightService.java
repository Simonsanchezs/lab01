package com.udea.vueloudea.service;

import com.udea.vueloudea.model.Flight;
import com.udea.vueloudea.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> findFlights(LocalDate startDate,
                                    LocalDate endDate,
                                    String origin,
                                    String destination,
                                    String baggageType,
                                    String classType,
                                    Integer maxPassengers,
                                    Double maxPrice) {
        // Generar una clave de combinación de parámetros para usar en el switch
        String key = (origin != null ? "1" : "0") +
                (destination != null ? "1" : "0") +
                (baggageType != null ? "1" : "0") +
                (classType != null ? "1" : "0") +
                (maxPassengers != null ? "1" : "0") +
                (maxPrice != null ? "1" : "0");

        switch (key) {
            case "111111":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
                        startDate, endDate, origin, destination, baggageType, classType, maxPassengers, maxPrice);

            case "111110":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
                        startDate, endDate, origin, destination, baggageType, classType, maxPassengers);

            case "111101":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndPriceLessThanEqual(
                        startDate, endDate, origin, destination, baggageType, classType, maxPrice);

            case "111100":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCase(
                        startDate, endDate, origin, destination, baggageType, classType);

            case "111011":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
                        startDate, endDate, origin, destination, baggageType, maxPassengers, maxPrice);

            case "111010":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
                        startDate, endDate, origin, destination, baggageType, maxPassengers);

            case "111001":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndPriceLessThanEqual(
                        startDate, endDate, origin, destination, baggageType, maxPrice);

            case "111000":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCase(
                        startDate, endDate, origin, destination, baggageType);

            case "110111":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
                        startDate, endDate, origin, destination, classType, maxPassengers, maxPrice);

            case "110110":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
                        startDate, endDate, origin, destination, classType, maxPassengers);

            case "110101":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndPriceLessThanEqual(
                        startDate, endDate, origin, destination, classType, maxPrice);

            case "110100":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCase(
                        startDate, endDate, origin, destination, classType);

            case "110011":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
                        startDate, endDate, origin, destination, maxPassengers, maxPrice);

            case "110010":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
                        startDate, endDate, origin, destination, maxPassengers);

            case "110001":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndPriceLessThanEqual(
                        startDate, endDate, origin, destination, maxPrice);

            case "110000":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCase(
                        startDate, endDate, origin, destination);

            case "101111":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
                        startDate, endDate, origin, baggageType, classType, maxPassengers, maxPrice);

            case "101110":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
                        startDate, endDate, origin, baggageType, classType, maxPassengers);

            case "101101":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndPriceLessThanEqual(
                        startDate, endDate, origin, baggageType, classType, maxPrice);

            case "101100":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCase(
                        startDate, endDate, origin, baggageType, classType);

            case "101011":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
                        startDate, endDate, origin, baggageType, maxPassengers, maxPrice);

            case "101010":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
                        startDate, endDate, origin, baggageType, maxPassengers);

            case "101001":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndPriceLessThanEqual(
                        startDate, endDate, origin, baggageType, maxPrice);

            case "101000":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndBaggageTypeContainingIgnoreCase(
                        startDate, endDate, origin, baggageType);

            case "100111":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
                        startDate, endDate, origin, classType, maxPassengers, maxPrice);

            case "100110":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
                        startDate, endDate, origin, classType, maxPassengers);

            case "100101":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndPriceLessThanEqual(
                        startDate, endDate, origin, classType, maxPrice);

            case "100100":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndClassTypeContainingIgnoreCase(
                        startDate, endDate, origin, classType);

            case "100011":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
                        startDate, endDate, origin, maxPassengers, maxPrice);

            case "100010":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
                        startDate, endDate, origin, maxPassengers);

            case "100001":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCaseAndPriceLessThanEqual(
                        startDate, endDate, origin, maxPrice);

            case "100000":
                return flightRepository.findByDateBetweenAndOriginContainingIgnoreCase(
                        startDate, endDate, origin);

            case "011111":
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
                        startDate, endDate, destination, baggageType, classType, maxPassengers, maxPrice);

            case "011110":
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
                        startDate, endDate, destination, baggageType, classType, maxPassengers);

            case "011101":
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndPriceLessThanEqual(
                        startDate, endDate, destination, baggageType, classType, maxPrice);

            case "011100":
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCase(
                        startDate, endDate, destination, baggageType, classType);

            case "011011":
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
                        startDate, endDate, destination, baggageType, maxPassengers, maxPrice);

            case "011010":
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
                        startDate, endDate, destination, baggageType, maxPassengers);

            case "011001":
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndPriceLessThanEqual(
                        startDate, endDate, destination, baggageType, maxPrice);

            case "011000":
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCase(
                        startDate, endDate, destination, baggageType);

            case "010111":
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
                        startDate, endDate, destination, classType, maxPassengers, maxPrice);

            case "010110":
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
                        startDate, endDate, destination, classType, maxPassengers);

            case "010101":
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndPriceLessThanEqual(
                        startDate, endDate, destination, classType, maxPrice);

            case "010100":
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCase(
                        startDate, endDate, destination, classType);

            case "010011":
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
                        startDate, endDate, destination, maxPassengers, maxPrice);

            case "010010":
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
                        startDate, endDate, destination, maxPassengers);

            case "010001":
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCaseAndPriceLessThanEqual(
                        startDate, endDate, destination, maxPrice);

            case "010000":
                return flightRepository.findByDateBetweenAndDestinationContainingIgnoreCase(
                        startDate, endDate, destination);

            case "001111":
                return flightRepository.findByDateBetweenAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
                        startDate, endDate, baggageType, classType, maxPassengers, maxPrice);

            case "001110":
                return flightRepository.findByDateBetweenAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
                        startDate, endDate, baggageType, classType, maxPassengers);

            case "001101":
                return flightRepository.findByDateBetweenAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndPriceLessThanEqual(
                        startDate, endDate, baggageType, classType, maxPrice);

            case "001100":
                return flightRepository.findByDateBetweenAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCase(
                        startDate, endDate, baggageType, classType);

            case "001011":
                return flightRepository.findByDateBetweenAndBaggageTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
                        startDate, endDate, baggageType, maxPassengers, maxPrice);

            case "001010":
                return flightRepository.findByDateBetweenAndBaggageTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
                        startDate, endDate, baggageType, maxPassengers);

            case "001001":
                return flightRepository.findByDateBetweenAndBaggageTypeContainingIgnoreCaseAndPriceLessThanEqual(
                        startDate, endDate, baggageType, maxPrice);

            case "001000":
                return flightRepository.findByDateBetweenAndBaggageTypeContainingIgnoreCase(
                        startDate, endDate, baggageType);

            case "000111":
                return flightRepository.findByDateBetweenAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
                        startDate, endDate, classType, maxPassengers, maxPrice);

            case "000110":
                return flightRepository.findByDateBetweenAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
                        startDate, endDate, classType, maxPassengers);

            case "000101":
                return flightRepository.findByDateBetweenAndClassTypeContainingIgnoreCaseAndPriceLessThanEqual(
                        startDate, endDate, classType, maxPrice);

            case "000100":
                return flightRepository.findByDateBetweenAndClassTypeContainingIgnoreCase(
                        startDate, endDate, classType);

            case "000011":
                return flightRepository.findByDateBetweenAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
                        startDate, endDate, maxPassengers, maxPrice);

            case "000010":
                return flightRepository.findByDateBetweenAndAvailableSeatsGreaterThanEqual(
                        startDate, endDate, maxPassengers);

            case "000001":
                return flightRepository.findByDateBetweenAndPriceLessThanEqual(
                        startDate, endDate, maxPrice);

            case "000000":
            default:
                return flightRepository.findByDateBetween(startDate, endDate);
        }
    }
}

