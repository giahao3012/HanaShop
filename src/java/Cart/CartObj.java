/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cart;

import dto.CartDTO;
import java.util.HashMap;

/**
 *
 * @author Admin
 */
public class CartObj {
    private String customerName;
    private HashMap<String, CartDTO> cart;

    public CartObj(String customerName) {
        this.customerName = customerName;
        this.cart = new HashMap<>();
    }

    public void addToCart(CartDTO dto) throws Exception {
        if (this.cart.containsKey(dto.getId())) {
            int quantity = this.cart.get(dto.getId()).getQuantityCart() + dto.getQuantityCart();
            dto.setQuantityCart(quantity);
        }
        this.cart.put(dto.getId(), dto);
    }

     public void removeCart(String id) throws Exception{
        if (this.cart.containsKey(id)){
            this.cart.remove(id);
        }
    }
    

      public void updateCart(String id, int quantity) throws Exception {
        if (this.cart.containsKey(id)) {
            this.cart.get(id).setQuantityCart(quantity);
        }
    }

    public double getTotal() throws Exception {
        double result = 0;
        for (CartDTO dto : this.cart.values()) {
            result += (dto.getPrice() * dto.getQuantityCart());
        }
        return result;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public HashMap<String, CartDTO> getCart() {
        return cart;
    }

    public void setCart(HashMap<String, CartDTO> cart) {
        this.cart = cart;
    }

}
