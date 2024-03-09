package exeption;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class BookNotFoundExeption extends ResponseStatusException {

    public BookNotFoundExeption(String message) {
        super(HttpStatus.NOT_FOUND,message);
    }

}
