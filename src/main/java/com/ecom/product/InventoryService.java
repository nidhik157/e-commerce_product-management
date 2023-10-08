package com.ecom.product;

import java.io.IOException;
import java.util.List;

public interface InventoryService {
    List<Inventory> getAllInventory();
    List<Inventory> getInventoryByCategory(String category);



    Inventory addInventory(Inventory newInventory);
}
