package customer_service.model;

import java.util.List;
import java.util.Map;

public record CustomerServiceException(Map<String, String> errors) {}
