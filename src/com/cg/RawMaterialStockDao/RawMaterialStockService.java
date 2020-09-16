package com.cg.RawMaterialStockDao;

import java.sql.SQLException;

public interface RawMaterialStockService 
{
	public String trackRawMaterialOrder(String orderid) throws SQLException;
	public boolean doesRawMaterialExist(String orderid);
	public boolean processDateCheck(String processDate) throws SQLException;
	public String updateProcessDateinStock(String processDate) throws SQLException;
	public boolean validateManufacturingDate(String manufacturingDate) throws SQLException;
	public boolean validateExpiryDate(String expiryDate) throws SQLException;
	public String updateRawmaterialStock();
	public boolean doesRawMaterialOrderExistinStock();
}
