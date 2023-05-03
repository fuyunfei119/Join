package com.example.mysql.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.experimental.FieldNameConstants;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldNameConstants(asEnum = true)
@Accessors
public class Customers {

  private long id;
  private String name;
  private String email;

}
