package org.work1.eventmanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AccountDTO {
    private String username;
    private String email;
    private String password;
    // For organizer
    private String phoneNumber;
    private String address;
    private String companyName;

}
