package com.mobileshop;

public class MobilePurchase {
	String mobileColor;
	String mobileModle;
	int rate;
	String mobileName;
	private String mobileModel;
	public MobilePurchase(Object object, Object object2, int i, Object object3) {
		// TODO Auto-generated constructor stub
	}
	public void setmobileName(String mobileName) {
		if(mobileName.matches("[a-zA-Z]+")) {
			this.mobileName=mobileName;
		}else
		{
			System.out.println("invalidname");
		}
	}
	public void setmobileColor(String mobileColor) {
		if(mobileColor.matches("[a-zA-Z]+")) {
			this.mobileColor=mobileColor;
		}else
		{
			System.out.println("invalidname");
		}
	}
//	public void setmobileName(String mobileName){
//		System.out.println("good mobile high rating score"+mobileName);
//	}

       
  }