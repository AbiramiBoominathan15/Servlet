package com.mobileshop;
public class MobileShop {
 String mobileColor;
 String mobileModel;
 int rate;
 String mobileName;
public String getMobileColor() {
	return mobileColor;
}
public void setMobileColor(String mobileColor) {
	this.mobileColor = mobileColor;
}
public String getMobileModel() {
	return mobileModel;
}
public void setMobileModel(String mobileModle) {
	this.mobileModel = mobileModel;
}
public int getRate() {
	return rate;
}
public void setRate(int rate) {
	this.rate = rate;
}
public String getMobileName() {
	return mobileName;
}
public void setMobileName(String mobileName) {
	this.mobileName = mobileName;
}
public MobileShop(String mobileColor, String mobileModle, int rate, String mobileName) {
	super();
	this.mobileColor = mobileColor;
	this.mobileModel = mobileModel;
	this.rate = rate;
	this.mobileName = mobileName;
}
@Override
public String toString() {
	return "MobileShop [mobileColor=" + mobileColor + ", mobileModle=" + mobileModel + ", rate=" + rate
			+ ", mobileName=" + mobileName + ", getMobileColor()=" + getMobileColor() + ", getMobileModel()="
			+ getMobileModel() + ", getRate()=" + getRate() + ", getMobileName()=" + getMobileName() + "]";
}

}
