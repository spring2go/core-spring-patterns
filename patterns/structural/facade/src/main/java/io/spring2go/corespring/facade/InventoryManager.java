package io.spring2go.corespring.facade;

// 库存实现
public class InventoryManager implements IInventory {

	@Override
	public void update(int productId) {
		String msg = "Product# " + productId + 
				" is subtracted from store's inventory";
		System.out.println(msg);
	}

}
