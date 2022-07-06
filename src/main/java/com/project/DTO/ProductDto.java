package com.project.DTO;

public class ProductDto {
	
		
		private long pId;
			
			private String pName;

			private String pCategory;
			
			private long pQuantity;

			private long pPrice;

			private static long Gst=10;

			private long totalPrice;

			private static long discount_price=5;

			private long salePrice;

			public long getpId() {
				return pId;
			}

			public void setpId(long pId) {
				this.pId = pId;
			}

			public String getpName() {
				return pName;
			}

			public void setpName(String pName) {
				this.pName = pName;
			}

			public String getpCategory() {
				return pCategory;
			}

			public void setpCategory(String pCategory) {
				this.pCategory = pCategory;
			}

			public long getpQuantity() {
				return pQuantity;
			}

			public void setpQuantity(long pQuantity) {
				this.pQuantity = pQuantity;
			}

			public long getpPrice() {
				return pPrice;
			}

			public void setpPrice(long pPrice) {
				this.pPrice = pPrice;
			}

			public static long getGst() {
				return Gst;
			}

			public static void setGst(long gst) {
				Gst = gst;
			}

			public long getTotalPrice() {
				return totalPrice;
			}

			public void setTotalPrice(long totalPrice) {
				this.totalPrice = totalPrice;
			}

			public static long getDiscount_price() {
				return discount_price;
			}

			public static void setDiscount_price(long discount_price) {
				ProductDto.discount_price = discount_price;
			}

			

			public long getSalePrice() {
				return salePrice;
			}

			public void setSalePrice(long salePrice) {
				this.salePrice = salePrice;
			}

			public ProductDto(long pId, String pName, String pCategory, long pQuantity, long pPrice, long totalPrice,
					 long salePrice) {
				super();
				this.pId = pId;
				this.pName = pName;
				this.pCategory = pCategory;
				this.pQuantity = pQuantity;
				this.pPrice = pPrice;
				this.totalPrice = totalPrice;
				
				this.salePrice = salePrice;
			}

			public ProductDto() {
				
			}
			
			
			
			
			

}
