/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.soapclientbare;

import com.ws.document.Movie;
import com.ws.document.MovieCategories;
import com.ws.document.ObjectFactory;
import com.ws.document.SoapDocumentBare;
import com.ws.document.SoapDocumentBareService;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Rodrigo
 */
public class Main {
    public static void main(String[] args) {
        SoapDocumentBareService service = new SoapDocumentBareService();
        SoapDocumentBare port = service.getSoapDocumentBarePort();
        
        Movie movie = new ObjectFactory().createMovie();
        movie.setName("new Movie");
        movie.setRate((short)7);
        movie.setCategory(MovieCategories.SCIFI);
        
        XMLGregorianCalendar release;
        GregorianCalendar today = new GregorianCalendar();
        
        try {
            release = DatatypeFactory.newInstance().newXMLGregorianCalendar(today);
            movie.setReleaseDate(release);
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        movie = port.addMovie(movie);
        System.out.println("Result ID = "+movie.getId());
        System.out.println("Result releaseDate = "+movie.getReleaseDate());
        
    }
}
