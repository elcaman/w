public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 80;
        double height = 1.8;
        int bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}