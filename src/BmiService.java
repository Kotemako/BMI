public class BmiService {
    public int calculate(int bodyMassIndex) {

        bodyMassIndex = (int) (90 / (1.75 * 1.75));

        return bodyMassIndex;
    }
}