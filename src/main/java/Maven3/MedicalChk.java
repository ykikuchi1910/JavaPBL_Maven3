package Maven3;

class MedicalChk {
    //double rightEye;
    //double leftEye;

    public boolean eyeCheck(double d1, double d2){
        if ((d1 >= 0.2) && (d2 >= 0.2)) return true;
        else return false;
    }
}
