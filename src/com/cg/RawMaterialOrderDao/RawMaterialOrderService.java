package com.cg.RawMaterialOrderDao;

import java.sql.SQLException;

import com.cg.RawMaterialStock.RawMaterialStock;

public interface RawMaterialOrderService {

	public void trackRawMAterialOrder(RawMaterialStock rawMaterialStock);
	public boolean doesRawMaterialOrderExist(String id) throws SQLException;
	public void processDateCheck(RawMaterialStock rawMaterialStock);
	public void updateProcessDeteinStock(RawMaterialStock rawMaterialStock);
	public void updateRawMaterialStock(RawMaterialStock rawMaterialStock);
	public void displayRawMaterialOrders(RawMaterialStock rawMaterialStock);
	public void doesRawMaterialOrderExistInStock(String orderId) throws SQLException;
	public void updateStatusRawMaterialOrder(String id,String status);
	public void placeRawMaterialOrder(RawMaterialStock rawMaterialStock);
	public void fetchWarehouseIds() throws SQLException;
	public void fetchSupplierIds() throws SQLException ;
	//public void fetchSupplierDetail(Supplier supplierDetails);
}
