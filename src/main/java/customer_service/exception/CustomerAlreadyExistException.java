package customer_service.exception;

public class CustomerAlreadyExistException extends RuntimeException {

    public CustomerAlreadyExistException(String taxId) {
        super(String.format("Der Kunde mit der Umsatzsteuer-ID: %s, existiert bereits in der Datenbank", taxId));
    }
}
