
package com.ws.document;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebService(name = "SoapDocumentBare", targetNamespace = "http://document.ws.com/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SoapDocumentBare {


    /**
     * 
     * @param getMovie
     * @return
     *     returns com.ws.document.Movie
     */
    @WebMethod
    @WebResult(name = "getMovieResponse", targetNamespace = "http://document.ws.com/", partName = "getMovieResponse")
    public Movie getMovie(
        @WebParam(name = "getMovie", targetNamespace = "http://document.ws.com/", partName = "getMovie")
        int getMovie);

    /**
     * 
     * @param movie
     * @return
     *     returns com.ws.document.Movie
     */
    @WebMethod
    @WebResult(name = "movieResponse", targetNamespace = "http://document.ws.com/", partName = "movieResponse")
    public Movie addMovie(
        @WebParam(name = "movie", targetNamespace = "http://document.ws.com/", partName = "movie")
        Movie movie);

}
