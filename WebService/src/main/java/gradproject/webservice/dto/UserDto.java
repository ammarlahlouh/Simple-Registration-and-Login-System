package gradproject.webservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @NotEmpty(message = "Email should not be empty")
    @Email
    private String email;

    @NotEmpty(message = "Password should not be empty")
    private String password;

    public @NotEmpty String getFirstName() {
        return firstName;
    }

    public @NotEmpty String getLastName() {
        return lastName;
    }

    public @NotEmpty(message = "Email should not be empty") @Email String getEmail() {
        return email;
    }

    public @NotEmpty(message = "Password should not be empty") String getPassword() {
        return password;
    }

    public void setFirstName(@NotEmpty String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(@NotEmpty String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(@NotEmpty(message = "Email should not be empty") @Email String email) {
        this.email = email;
    }

    public void setPassword(@NotEmpty(message = "Password should not be empty") String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User First Name: " + firstName + "\nLast Name: " + lastName + "\nEmail: " + email;
    }
}
