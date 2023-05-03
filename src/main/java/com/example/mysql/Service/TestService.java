package com.example.mysql.Service;

import com.example.mysql.Dao.BusinessCentral;
import com.example.mysql.Dao.BusinessCentralMapper;
import com.example.mysql.Dao.BusinessCentralQuery;
import com.example.mysql.Entity.Customers;
import com.example.mysql.Entity.Items;
import com.example.mysql.Entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

@Service
public class TestService {

    @Autowired
    private BusinessCentralMapper businessCentralMapper;
    @Autowired
    private BusinessCentral businessCentral;
    @Autowired
    private BusinessCentralQuery<Customers.Fields> customerQuery;
    @Autowired
    private BusinessCentralQuery<Items.Fields> itemQuery;
    @Autowired
    private BusinessCentralQuery<Orders.Fields> orderQuery;

    public List<LinkedHashMap<String,Object>> FindSet() {

        customerQuery
                .SetDataItem(Customers.Fields.name)
                .SetJoinCondition(Customers.Fields.id)
                .GetDataSet(Customers.class)
                .GetDataItem();

        customerQuery.GetJoinCondition();

        customerQuery.GetJoinCondition();

        itemQuery
                .SetDataItem(Items.Fields.productName)
                .SetJoinCondition(Items.Fields.id)
                .GetDataSet(Items.class)
                .GetDataItem();

        itemQuery.GetJoinCondition();

        itemQuery.GetJoinCondition();

        orderQuery
                .SetDataItem(Orders.Fields.orderDate)
                .SetJoinCondition(Orders.Fields.customerId, Orders.Fields.itemId)
                .GetDataSet(Orders.class)
                .GetDataItem();

        orderQuery.GetJoinCondition();

        orderQuery.GetJoinCondition();

        return businessCentralMapper.FindSet();
    }
}
