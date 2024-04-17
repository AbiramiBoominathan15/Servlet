package overriding;
public class Doctor {
	 public static void main(String[] args) {
	     Hospital hospital = new Hospital(); // Creating a Hospital object
	     SpecializedHospital specializedHospital = new SpecializedHospital(); // Creating a SpecializedHospital object

	     hospital.treatPatient(); // Calls the method from Hospital class
	     specializedHospital.treatPatient(); // Calls the overridden method from SpecializedHospital class
	 }
	}
