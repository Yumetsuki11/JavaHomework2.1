public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int price = 24_597;
        int miles = service.calculate(price);
        System.out.println(miles);

        /* первоначальный вариант программы
        int fee = 24597;
        int feeDenominator = 20;

        System.out.println("Начислено " + (fee / feeDenominator) + " миль");
        */
    }
}
