package com.example.mysql.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.LinkedHashMap;
import java.util.List;

@Mapper
public interface BusinessCentralMapper {

    final String FindSet =
            "select "+
                "Customers.name,Items.product_name,Orders.order_date"+
            " FROM " +
                    "Customers "+
                    "JOIN Orders on Customers.id = Orders.customer_id "+
                    "JOIN Items  on Orders.item_id = Items.id";

    @Select(FindSet)
    List<LinkedHashMap<String,Object>> FindSet();
}
