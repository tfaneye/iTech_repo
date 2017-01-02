package collections.concepts.twoDimArrays;

/**
 * Created by Tunde on 21/11/2016.
 */
public class ExampleArrayThreeTwo_Dim {

    private String[][] userCredentials;
    String[][] fullName;

    public ExampleArrayThreeTwo_Dim(){
        userCredentials = new String[2][3];  // row = 2, column = 3
        userCredentials[0][0] = "ejohnson";
        userCredentials[0][1] = "ekate";
        userCredentials[0][2] = "ebsmith";
        userCredentials[1][0] = "P123";
        userCredentials[1][1] = "k@223";
        userCredentials[1][2] = "p$6787";

    }

    public String[][] getUserCredentials() {
        return userCredentials;
    }

    //More Example of MultiDimensional Array
    public String[][] moreTwoDimArrays(){
        fullName = new String[][]{
                {"Mr. ", "Mrs. ", "Ms. "},
                {"James: ", "Joan: "},
                {"1, James Street", "2 Joan Road"}
        };
        System.out.println(fullName[0][0] + fullName[1][0] + fullName[2][0]);
        System.out.println(fullName[0][1] + fullName[1][1]);
        return fullName;
    }


}
