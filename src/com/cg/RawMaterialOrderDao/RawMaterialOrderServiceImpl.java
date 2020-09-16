package com.cg.RawMaterialOrderDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.RawMaterialStock.RawMaterialStock;
import com.cg.database.databaseConnection;

public class RawMaterialOrderServiceImpl implements RawMaterialOrderService {

	@Override
	public void trackRawMAterialOrder(RawMaterialStock rawMaterialStock) {
		// TODO Auto-generated method stub
		rawMaterialStock.toString();
	}

	@Override
	public boolean doesRawMaterialOrderExist(String id) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = databaseConnection.myConnection();
		PreparedStatement prepared = connection.prepareStatement("Select orderId from RawMatrialOrder where orderId = ?");
		prepared.setString(1, id);
		ResultSet resultset= prepared.executeQuery();
		if(  resultset != null){
			return true;
		}
		
		return false;
	}

	@Override
	public void processDateCheck(RawMaterialStock rawMaterialStock) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProcessDeteinStock(RawMaterialStock rawMaterialStock) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRawMaterialStock(RawMaterialStock rawMaterialStock) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayRawMaterialOrders(RawMaterialStock rawMaterialStock) {
		// TODO Auto-generated method stub
		rawMaterialStock.toString();
	}

	@Override
	public void doesRawMaterialOrderExistInStock(String orderId) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = databaseConnection.myConnection();
		PreparedStatement prepared = connection.prepareStatement("Select orderId from RawMatrialStock where orderId = ?");
		prepared.setString(1, orderId);
		ResultSet resultset= prepared.executeQuery();
		
		if(  resultset != null){
			
		    System.out.println(" Order exist in Stock");
		}
		else
			System.out.println(" Order does not exist in Stock");
	}

	@Override
	public void updateStatusRawMaterialOrder(String id, String status) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void placeRawMaterialOrder(RawMaterialStock rawMaterialStock) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fetchWarehouseIds() throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = databaseConnection.myConnection();
		PreparedStatement prepared = connection.prepareStatement("Select distinct warehouseId from RawMaterialOrder");
		ResultSet resultset= prepared.executeQuery();
		while( resultset.next()){
			System.out.println(resultset.getString(0));
		}
		
	}

	@Override
	public void fetchSupplierIds() throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = databaseConnection.myConnection();
		PreparedStatement prepared = connection.prepareStatement("Select distinct supplierId from RawMaterialOrder");
		ResultSet resultset= prepared.executeQuery();
		while( resultset.next()){
			System.out.println(resultset.getString(0));
		}
	}

}
