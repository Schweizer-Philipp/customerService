package customer_service.exception;

import customer_service.model.CustomerServiceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CustomerAlreadyExistException.class)
    protected final ResponseEntity<CustomerServiceException> handleException(CustomerAlreadyExistException ex) {
        return new ResponseEntity<>(new CustomerServiceException(List.of(ex.getMessage())), HttpStatus.BAD_REQUEST);
    }
}
