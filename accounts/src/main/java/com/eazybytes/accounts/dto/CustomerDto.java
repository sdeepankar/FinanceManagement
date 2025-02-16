package com.eazybytes.accounts.dto;



import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
@Schema(name = "Customer", description = "Schema for Customer and Account details")
public class CustomerDto {
    @Schema(description = "Name of the customer", example = "Name")
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 1, max=30, message = "Name should be between 1 and 30 characters")
    private String name;

    @Schema(description = "Email of the customer", example = "email@domain.com")
    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Invalid email address")
    private String email;

    @Schema(description = "Mobile number of the customer", example = "1234567890")
    @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(description = "Account details of the customer")
    private AccountsDto accountsDto;
}
