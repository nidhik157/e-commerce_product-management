package com.ecom.product;

import java.util.List;

public interface InventoryService {
    List<Inventory> getAllInventory();
    List<Inventory> getInventoryByCategory(String category);
}
