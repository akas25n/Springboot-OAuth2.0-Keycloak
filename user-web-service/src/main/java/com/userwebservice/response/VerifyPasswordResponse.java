package com.userwebservice.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Setter @Getter
public class VerifyPasswordResponse {
    private boolean result;
}
