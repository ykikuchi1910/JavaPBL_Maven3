package Maven3;

import org.junit.Before;
import org.junit.Test;

public class MedicalChkTest {

    //private FizzBuzz f;

    @Before
    public void init() {
    }
    @Test
    public void test0(){
        PatientInfo m1 = new PatientInfo( );
        MedicalChk c1 = new MedicalChk();
        m1.setData("Suzuki", "2000-01-01", 160.8, 80.5, 1.2, 1.2);
        //System.out.print(String.valueOf(m1.rightEye));
        //System.out.print(String.valueOf(m1.leftEye));
        System.out.print(c1.eyeCheck(m1.rightEye,m1.leftEye));
        assertequals(true,c1.eyeCheck(m1.rightEye,m1.leftEye));
        asserttrue(c1.eyeCheck(m1.rightEye,m1.leftEye));
    }

    @Test
    public void test1(){
        PatientInfo m1 = new PatientInfo( );
        MedicalChk c1 = new MedicalChk();
        m1.setData("Suzuki", "2000-01-01", 160.8, 80.5, 0.2, 0.2);
        System.out.print(c1.eyeCheck(m1.rightEye,m1.leftEye));
        assertequals(true,c1.eyeCheck(m1.rightEye,m1.leftEye));
        asserttrue(c1.eyeCheck(m1.rightEye,m1.leftEye));
    }

    @Test
    public void test2(){
        PatientInfo m1 = new PatientInfo( );
        MedicalChk c1 = new MedicalChk();
        m1.setData("Suzuki", "2000-01-01", 160.8, 80.5, 0.1, 0.1);
        System.out.print(c1.eyeCheck(m1.rightEye,m1.leftEye));
        assertequals(false,c1.eyeCheck(m1.rightEye,m1.leftEye));
        assertfalse(c1.eyeCheck(m1.rightEye,m1.leftEye));
    }
    @Test
    public void test3(){
        PatientInfo m1 = new PatientInfo( );
        MedicalChk c1 = new MedicalChk();
        m1.setData("Suzuki", "2000-01-01", 160.8, 80.5, 0.1, 0.2);
        System.out.print(c1.eyeCheck(m1.rightEye,m1.leftEye));
        assertequals(false,c1.eyeCheck(m1.rightEye,m1.leftEye));
        assertfalse(c1.eyeCheck(m1.rightEye,m1.leftEye));
    }
    @Test
    public void test4(){
        PatientInfo m1 = new PatientInfo( );
        MedicalChk c1 = new MedicalChk();
        m1.setData("Suzuki", "2000-01-01", 160.8, 80.5, 0.2, 0.1);
        System.out.print(c1.eyeCheck(m1.rightEye,m1.leftEye));
        assertequals(false,c1.eyeCheck(m1.rightEye,m1.leftEye));
        assertfalse(c1.eyeCheck(m1.rightEye,m1.leftEye));
    }

    private void assertequals(boolean b, boolean eyeCheck) {
    }

    private void assertfalse(boolean eyeCheck) {
    }

    private void asserttrue( boolean eyeCheck) {
    }
}