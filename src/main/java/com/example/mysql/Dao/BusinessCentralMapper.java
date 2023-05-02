package com.example.mysql.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.LinkedHashMap;
import java.util.List;

@Mapper
public interface BusinessCentralMapper {

    final String FindSet =
            "select "+
                "customers.name,items.product_name,orders.order_date"+
            " FROM " +
                    "customers "+
                    "JOIN orders on customers.id = orders.customer_id "+
                    "JOIN items  on orders.item_id = items.id";

    @Select(FindSet)
    List<LinkedHashMap<String,Object>> FindSet();
}
