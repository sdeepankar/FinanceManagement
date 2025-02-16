package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "Response", description = "Schema for Response Object")
public class ResponseDto {
    @Schema(description = "Status Code")
    private String statusCode;

    @Schema(description = "Status Message")
    private String statusMsg;
}
