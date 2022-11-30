package com.airportinfo.util.filewriter;

import com.airportinfo.RawAirport;

import java.io.IOException;

/**
 * A writer class to write json files.
 *
 * @author JumoKookbob
 */
public class JSONWriter extends AirportWriter {

    /**
     * constructor method
     *
     * @param fPath file path
     * @throws IOException If an I/O error occurs
     */
    public JSONWriter(String fPath) throws IOException {
        super(fPath);
    }

    @Override
    public void write(RawAirport airport) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void write(RawAirport[] airports) throws IOException {
        throw new UnsupportedOperationException();
    }
}
