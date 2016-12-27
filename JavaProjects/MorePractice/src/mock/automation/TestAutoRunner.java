package mock.automation;

/**
 * Created by Tunde on 21/12/2016.
 */
public class TestAutoRunner {

    public static void main(String[] args){
        Government gov = new Government();

        GovernmentCrownCourt court = new GovernmentCrownCourt(gov);

        court.resumeWorkForLawyers();
    }
}
