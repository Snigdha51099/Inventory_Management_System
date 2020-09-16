package com.cg.RawMaterialStockDao;

import java.sql.*;

import com.cg.database.databaseConnection;

public class RawMaterialStockServiceImpl implements RawMaterialStockService 
{
	
	//Connection connection;
	@Override
	public String trackRawMaterialOrder(String orderid) throws SQLException  {
		// TODO Auto-generated method stub
		Connection connection=databaseConnection.myConnection();
		PreparedStatement stmt = connection.prepareStatement("select orderid, name, price_per_unit, quantityValue, quantityUnit, price, warehouseID, deliveryDate, manufacturingDate, expiryDate, qualityCheck, processDate from RawMaterialStock where orderid=?");
		stmt.setString(1, orderid);
		ResultSet rs=stmt.executeQuery();
		
		if(rs!=null)
		{
			
			while(rs.next())
			{
				System.out.println(rs.getString("orderid")+" "+rs.getString("name")+" "+rs.getString("price_per_unit")+" "+rs.getString("quantityValue")+" "+rs.getString("quantityUnit")+" "+rs.getString("price")+" "+rs.getString("warehouseID")+" "+rs.getString("deliveryDate")+" "+rs.getString("manufacturingDate")+" "+rs.getString("expiryDate")+" "+rs.getString("qualityCheck")+" "+rs.getString("processDate"));
			}
		}
		else
		{
			System.out.println("result set is null");
		}
		return null;
	}

	@Override
	public boolean doesRawMaterialExist(String orderid) {
		// TODO Auto-generated method stub
		try
		{
			Connection connection=databaseConnection.myConnection();
			PreparedStatement stmt = connection.prepareStatement("select orderid from RawMaterialStock where orderid=?");
			stmt.setString(1, orderid);
			ResultSet rs=stmt.executeQuery();
			
			if(rs!=null)
			{
				System.out.println("exist");
			}
			else
			{
				System.out.println("not exist");
			}
		}
		catch (SQLException ex)
		{
			System.out.println(ex);
		}
		return false;
	}

	@Override
	public boolean processDateCheck(String processDate) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection=databaseConnection.myConnection();
		PreparedStatement stmt = connection.prepareStatement("select processDate from RawMaterialStock where processDate=?");
		stmt.setString(1, processDate);
		ResultSet rs=stmt.executeQuery();
		if(rs.getString("processDate")==processDate)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	@Override
	public String updateProcessDateinStock(String processDate) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection=databaseConnection.myConnection();
		PreparedStatement stmt = connection.prepareStatement("update RawMaterialStock set processDate=?");
		stmt.setString(1, processDate);
		ResultSet rs=stmt.executeQuery();
		connection.commit();
		//String newProcessDate=rs.getString("processDate");
		return rs.getString("processDate");
	}

	@Override
	public boolean validateManufacturingDate(String manufacturingDate) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection=databaseConnection.myConnection();
		PreparedStatement stmt = connection.prepareStatement("select processDate from RawMaterialStock where manufacturingDate=?");
		stmt.setString(1, manufacturingDate);
		ResultSet rs=stmt.executeQuery();
		if(rs.getString("manufacturingDate")==manufacturingDate)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public boolean validateExpiryDate(String expiryDate) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection=databaseConnection.myConnection();
		PreparedStatement stmt = connection.prepareStatement("select processDate from RawMaterialStock where expiryDate=?");
		stmt.setString(1, expiryDate);
		ResultSet rs=stmt.executeQuery();
		if(rs.getString("expiryDate")==expiryDate)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public String updateRawmaterialStock() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean doesRawMaterialOrderExistinStock() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

	
}
