package com.luv2code.springdemo.model;

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Customer {
    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1)
    private String lastName;
}
