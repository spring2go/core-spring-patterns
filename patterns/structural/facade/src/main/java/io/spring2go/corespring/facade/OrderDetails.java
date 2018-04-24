package io.spring2go.corespring.facade;

import java.util.Random;

public class OrderDetails {
	// region 私有成员
	private int productNo;
	private String productName;
	private String productDescription;
	private float price;
	private float discountPercent;
	private String addressLine1;
	private String addressLine2;
	private int pinCode;
	private String cardNo;
	// endregion
	
	public OrderDetails(String productName, String prodDescription, float price,
			float discount, String addressLine1, String addressLine2,
			int pinCode, String cardNo) {
		this.productNo = new Random(1).nextInt(100);
		this.productName = productName;
		this.productDescription = prodDescription;
		this.price = price;
		this.discountPercent = discount;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.pinCode = pinCode;
		this.cardNo = cardNo;
	}


	// region getters
	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(float discountPercent) {
		this.discountPercent = discountPercent;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	// endregion
}
