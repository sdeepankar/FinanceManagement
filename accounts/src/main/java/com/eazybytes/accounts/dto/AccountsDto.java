package com.eazybytes.accounts.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "Accounts", description = "Schema for Account details")
public class AccountsDto {

    @Schema(description = "Account number of the customer")
    @NotEmpty(message = "Account number should not be empty")
    @Pattern(regexp="(^$|[0-9]{10})",message = "Account number must be 10 digits")
    private Long accountNumber;

    @Schema(description = "Account type of the customer", example = "Savings")
    @NotEmpty(message = "Account type should not be empty")
    private String accountType;

    @Schema(description = "Branch address of the customer", example = "Branch address")
    @NotEmpty(message = "Branch address should not be empty")
    private String branchAddress;
}
