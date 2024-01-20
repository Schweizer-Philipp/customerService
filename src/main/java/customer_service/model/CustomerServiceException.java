package customer_service.model;

import java.util.List;

public record CustomerServiceException(List<String> errors) {
}
