package com.udea.vueloudea.repository;

import com.udea.vueloudea.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

    // Métodos para cada combinación de filtros
    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String destination, String baggageType, String classType, Integer maxPassengers, Double maxPrice);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String destination, String baggageType, String classType, Integer maxPassengers);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String destination, String baggageType, String classType, Double maxPrice);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String origin, String destination, String baggageType, String classType);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String destination, String baggageType, Integer maxPassengers, Double maxPrice);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String destination, String baggageType, Integer maxPassengers);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String destination, String baggageType, Double maxPrice);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String origin, String destination, String baggageType);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String classType, Integer maxPassengers, Double maxPrice);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String classType, Integer maxPassengers);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String classType, Double maxPrice);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndClassTypeContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String origin, String classType);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, Integer maxPassengers, Double maxPrice);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, Integer maxPassengers);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, Double maxPrice);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String origin);

    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String destination, String baggageType, String classType, Integer maxPassengers, Double maxPrice);

    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
            LocalDate startDate, LocalDate endDate, String destination, String baggageType, String classType, Integer maxPassengers);

    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String destination, String baggageType, String classType, Double maxPrice);

    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String destination, String baggageType, String classType);

    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String destination, String baggageType, Integer maxPassengers, Double maxPrice);

    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
            LocalDate startDate, LocalDate endDate, String destination, String baggageType, Integer maxPassengers);

    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String destination, String baggageType, Double maxPrice);

    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndBaggageTypeContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String destination, String baggageType);

    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String destination, String classType, Integer maxPassengers, Double maxPrice);

    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
            LocalDate startDate, LocalDate endDate, String destination, String classType, Integer maxPassengers);

    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String destination, String classType, Double maxPrice);

    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String destination, String classType);

    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String destination, Integer maxPassengers, Double maxPrice);

    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
            LocalDate startDate, LocalDate endDate, String destination, Integer maxPassengers);

    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCaseAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String destination, Double maxPrice);

    List<Flight> findByDateBetweenAndDestinationContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String destination);

    List<Flight> findByDateBetweenAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String baggageType, String classType, Integer maxPassengers, Double maxPrice);

    List<Flight> findByDateBetweenAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
            LocalDate startDate, LocalDate endDate, String baggageType, String classType, Integer maxPassengers);

    List<Flight> findByDateBetweenAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String baggageType, String classType, Double maxPrice);

    List<Flight> findByDateBetweenAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String baggageType, String classType);

    List<Flight> findByDateBetweenAndBaggageTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String baggageType, Integer maxPassengers, Double maxPrice);

    List<Flight> findByDateBetweenAndBaggageTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
            LocalDate startDate, LocalDate endDate, String baggageType, Integer maxPassengers);

    List<Flight> findByDateBetweenAndBaggageTypeContainingIgnoreCaseAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String baggageType, Double maxPrice);

    List<Flight> findByDateBetweenAndBaggageTypeContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String baggageType);

    List<Flight> findByDateBetweenAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String classType, Integer maxPassengers, Double maxPrice);

    List<Flight> findByDateBetweenAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
            LocalDate startDate, LocalDate endDate, String classType, Integer maxPassengers);

    List<Flight> findByDateBetweenAndClassTypeContainingIgnoreCaseAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String classType, Double maxPrice);

    List<Flight> findByDateBetweenAndClassTypeContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String classType);

    List<Flight> findByDateBetweenAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, Integer maxPassengers, Double maxPrice);

    List<Flight> findByDateBetweenAndAvailableSeatsGreaterThanEqual(
            LocalDate startDate, LocalDate endDate, Integer maxPassengers);

    List<Flight> findByDateBetweenAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, Double maxPrice);

    List<Flight> findByDateBetween(
            LocalDate startDate, LocalDate endDate);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String destination, String classType, Integer maxPassengers, Double maxPrice);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String destination, String classType, Integer maxPassengers);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String destination, String classType, Double maxPrice);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndClassTypeContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String origin, String destination, String classType);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String destination, Integer maxPassengers, Double maxPrice);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String destination, Integer maxPassengers);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCaseAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String destination, Double maxPrice);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndDestinationContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String origin, String destination);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String baggageType, String classType, Integer maxPassengers, Double maxPrice);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String baggageType, String classType, Integer maxPassengers);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCaseAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String baggageType, String classType, Double maxPrice);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndClassTypeContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String origin, String baggageType, String classType);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqualAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String baggageType, Integer maxPassengers, Double maxPrice);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndAvailableSeatsGreaterThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String baggageType, Integer maxPassengers);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndBaggageTypeContainingIgnoreCaseAndPriceLessThanEqual(
            LocalDate startDate, LocalDate endDate, String origin, String baggageType, Double maxPrice);

    List<Flight> findByDateBetweenAndOriginContainingIgnoreCaseAndBaggageTypeContainingIgnoreCase(
            LocalDate startDate, LocalDate endDate, String origin, String baggageType);
}
