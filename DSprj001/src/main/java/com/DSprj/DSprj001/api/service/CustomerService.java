package com.DSprj.DSprj001.api.service;

import java.util.List;

import com.DSprj.DSprj001.api.dto.Customer;

public interface CustomerService {

  /**
   * Register a new customer information.
   *
   * @param customer customer object which we want to register
   * @return customer object registered
   */
  Customer register(Customer customer);

  /**
   * Retrieve all customer infomation.
   *
   * @return all customer infomation
   */
  List<Customer> retrieve();

  /**
   * Retrieve the customer infomation having the same id as provided.
   *
   * @param id identity of customer infomation
   * @return customer infomation having the same id as provieded
   */
  Customer retrieve(String id);

  /**
   * Update customer infomation
   *
   * @param customer customer object which we want to update
   * @return customer object updated
   */
  Customer update(Customer customer);

  /**
   * Dlete customer infomation.
   *
   * @param id identity of customer infomation
   * @return identity of deleted customer
   */
  String delete(String id);
}
