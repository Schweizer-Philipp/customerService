package customer_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    private String taxId;
    private String firstName;
    private String lastName;
    private String infos;

    public Customer(String taxId, String firstName, String lastName, String infos) {
        this.taxId = taxId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.infos = infos;
    }

    public Customer() {
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInfos() {
        return infos;
    }

    public void setInfos(String infos) {
        this.infos = infos;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "taxId='" + taxId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", infos='" + infos + '\'' +
                '}';
    }
}
