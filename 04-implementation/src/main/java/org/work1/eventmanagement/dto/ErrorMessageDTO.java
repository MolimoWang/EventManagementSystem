package org.work1.eventmanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.work1.eventmanagement.controller.ErrorType;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ErrorMessageDTO {
    private ErrorType type;
    private String message = "";
}
