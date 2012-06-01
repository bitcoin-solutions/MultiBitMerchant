package org.multibit.mbm.db.dto;

/**
 *  <p>Builder to provide the following to {@link Customer}:</p>
 *  <ul>
 *  <li>Provide a fluent interface to facilitate building the entity</li>
 *  </ul>
 *
 * @since 0.0.1
 *         
 */
public class CustomerBuilder {

  private boolean isBuilt= false;

  /**
   * @return A new instance of the builder
   */
  public static CustomerBuilder getInstance() {
    return new CustomerBuilder();
  }

  /**
   * Handles the building process. No further configuration is possible after this.
   */
  public Customer build() {
    validateState();
    
    // Customer is a DTO and so requires a default constructor
    Customer customer = new Customer();

    customer.setCart(new Cart());

    isBuilt = true;
    
    return customer;
  }

  private void validateState() {
    if (isBuilt) {
      throw new IllegalStateException("The entity has been built");
    }
  }

}