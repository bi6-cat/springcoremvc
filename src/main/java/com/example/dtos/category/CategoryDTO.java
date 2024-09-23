package com.example.dtos.category;

import org.hibernate.validator.constraints.*;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO {

    private int id;

    @NotEmpty(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;
    
    @Length(max = 255, message = "Description must be less than 255 characters")
    private String description;

}
