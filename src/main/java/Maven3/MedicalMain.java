package Maven3;

public class MedicalMain {
    public static void main(String args[])   {
        boolean bool;
        //#1 Patient Information
        PatientInfo m1 = new PatientInfo( );

        //setData  & print information
        m1.setData("Suzuki", "2000-01-01", 160.8, 80.5, 1.2, 1.2);
        m1.printInfo();

        //#2
        //Medical check

        MedicalChk c1 = new MedicalChk();
        bool = c1.eyeCheck(m1.rightEye,m1.leftEye);

        //#3
        //bool print & judgement
        System.out.println(bool);

        if (bool){
            System.out.println("合格");
        }else{
            System.out.println("不合格");
        }
    }
}
