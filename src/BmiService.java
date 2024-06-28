public class BmiService {
    int weight;
    double height;

    int calculate(int weight, double height) {
        return (int) (weight / (height * height));
    }
}
