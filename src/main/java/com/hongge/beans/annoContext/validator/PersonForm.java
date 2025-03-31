package com.hongge.beans.annoContext.validator;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class PersonForm {

    @NotNull
    @Size(max = 5)
    private String name;

    @Min(0)
    private int age;
}
