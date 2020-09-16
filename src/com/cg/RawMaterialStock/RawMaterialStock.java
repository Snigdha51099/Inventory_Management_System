package com.cg.RawMaterialStock;


public class RawMaterialStock 
{
	private String orderid;
	private String name;
	private double price_per_unit;
	private double quantityValue;
	private double quantityUnit;
	private double price;
	private String warehouseID;
	private String deliveryDate;
	private String manufacturingDate;
	private String expiryDate;
	private String qualityCheck;
	private String processDate;
	
	public RawMaterialStock(String orderid, String name, double price_per_unit, double quantityValue,
			double quantityUnit, double price, String warehouseID, String deliveryDate, String manufacturingDate,
			String expiryDate, String qualityCheck, String processDate) {
		super();
		this.orderid = orderid;
		this.name = name;
		this.price_per_unit = price_per_unit;
		this.quantityValue = quantityValue;
		this.quantityUnit = quantityUnit;
		this.price = price;
		this.warehouseID = warehouseID;
		this.deliveryDate = deliveryDate;
		this.manufacturingDate = manufacturingDate;
		this.expiryDate = expiryDate;
		this.qualityCheck = qualityCheck;
		this.processDate = processDate;
	}
	
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice_per_unit() {
		return price_per_unit;
	}
	public void setPrice_per_unit(double price_per_unit) {
		this.price_per_unit = price_per_unit;
	}
	public double getQuantityValue() {
		return quantityValue;
	}
	public void setQuantityValue(double quantityValue) {
		this.quantityValue = quantityValue;
	}
	public double getQuantityUnit() {
		return quantityUnit;
	}
	public void setQuantityUnit(double quantityUnit) {
		this.quantityUnit = quantityUnit;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getWarehouseID() {
		return warehouseID;
	}
	public void setWarehouseID(String warehouseID) {
		this.warehouseID = warehouseID;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(String manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getQualityCheck() {
		return qualityCheck;
	}
	public void setQualityCheck(String qualityCheck) {
		this.qualityCheck = qualityCheck;
	}
	public String getProcessDate() {
		return processDate;
	}
	public void setProcessDate(String processDate) {
		this.processDate = processDate;
	}

	@Override
	public String toString() {
		return "RawMaterialStock [orderid=" + orderid + ", name=" + name + ", price_per_unit=" + price_per_unit
				+ ", quantityValue=" + quantityValue + ", quantityUnit=" + quantityUnit + ", price=" + price
				+ ", warehouseID=" + warehouseID + ", deliveryDate=" + deliveryDate + ", manufacturingDate="
				+ manufacturingDate + ", expiryDate=" + expiryDate + ", qualityCheck=" + qualityCheck + ", processDate="
				+ processDate + "]";
	}
}
