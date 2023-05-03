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
public class Orders {

  private long id;
  private long customerId;
  private long itemId;
  private java.sql.Date orderDate;

}
