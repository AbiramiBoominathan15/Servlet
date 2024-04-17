package overriding;
class SpecializedHospital extends Hospital {
@Override
void treatPatient() {
   System.out.println("Treating patient in specialized ward.");
}
}

