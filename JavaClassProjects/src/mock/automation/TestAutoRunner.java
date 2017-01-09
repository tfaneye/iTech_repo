package mock.automation;

/**
 * Created by Tunde on 09/01/2017.
 */
public class TestAutoRunner {

    public static void main(String[] args){
        Government gov = new Government();

        GovernmentCrownCourt court = new GovernmentCrownCourt(gov);

        court.resumeWorkForLawyers();
    }
}
