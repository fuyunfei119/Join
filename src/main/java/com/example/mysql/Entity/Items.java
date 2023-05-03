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
public class Items {

  private long id;
  private String productName;
  private long quantity;
  private double price;

}
