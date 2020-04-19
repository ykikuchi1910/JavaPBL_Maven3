package Maven3;

class PatientInfo {
    String name;
    String birth;
    double height;
    double weight;
    double rightEye;
    double leftEye;

    public void setData(String n0,String b0,double h0,double w0,double re,double le){
        name = n0;
        birth = b0;
        height = h0;
        weight = w0;
        rightEye = re;
        leftEye =le;
    }

    public void printInfo(){
        System.out.println(" 名前: "+ name +  " 右: " + rightEye + " 左: " + leftEye);
        System.out.println(" 生年月日: " + birth + " 身長: " + height + " 体重: " + weight);
    }

}
