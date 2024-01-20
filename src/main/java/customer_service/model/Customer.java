package customer_service.model;

import customer_service.constraint.TaxIdConstraint;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
public class Customer {
    @Id
    @TaxIdConstraint
    private String taxId;

    @NotEmpty(message = "Das Feld Vorname darf nicht leer sein.")
    private String firstName;

    @NotEmpty(message = "Das Feld Nachname darf nicht leer sein.")
    private String lastName;
    @Size(max = 100, message = "Das Feld Freitext-Informationen darf maximal 100 zeichen haben.")
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
