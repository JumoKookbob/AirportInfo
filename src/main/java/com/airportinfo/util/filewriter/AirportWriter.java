package com.airportinfo.util.filewriter;

import com.airportinfo.RawAirport;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * An abstract writer class to write files.
 *
 * @author JumoKookbob
 */
public abstract class AirportWriter implements AutoCloseable {
    protected BufferedWriter writer;
    protected String fPath;

    /**
     * A constructor method
     *
     * @param path File path
     * @throws IOException If an I/O error occurs
     */
    public AirportWriter(String path) throws IOException {
        fPath = path;
        writer = new BufferedWriter(new FileWriter(fPath));
    }

    /**
     * @return array of header
     */
    protected String[] getHeader() {
        return new String[]{"EnglishName", "KoreanName", "IATA", "ICAO", "Region",
                "EnglishCountryName", "KoreanCountryName", "EnglishCityName"};
    }

    /**
     * An abstract method to make file with Airport
     */
    public abstract void write(RawAirport airport) throws IOException;

    /**
     * An abstract method to make file with Airport array
     */
    public abstract void write(RawAirport[] airports) throws IOException;

    @Override
    public void close() throws Exception {
        writer.close();
    }
}
