import java.util.Random;

public class CoffeeRoom {
    public static void main(String[] args ) {

        double personPerDay;
        double hundredPercentPeople;
        double onePercentPeople;
        int workDay = 12; // Hours
        int minPersonForHours = 0;
        int maxPersonForHours = 60;
        int diff = maxPersonForHours - minPersonForHours;
        Random random = new Random();
        int personForHours = random.nextInt(diff + 1) + minPersonForHours;//random amount person per hours


        int coffeeBeansPriceForKg = 200;// variable !!!
        int weightBeansForCup = 7;// 7gm - weight one ground coffee cup
        double amountCupPerKg = 1000 / weightBeansForCup;
        double groundCoffeePriceForCup;
        double milkPriceLiter = 17;//UAH for Liter // variable !!!
        double milkVolume = 0.9;//buttle volume at liter // variable !!!
        double cappuchinoCupsMilk; // how many cups can do by milkVolume
        double milkForCappuchino;
        double milkPricePerCup;
        double milkForLate;
        double lateCupsMilk;
        double pricePaperCups = 25; //UAH per Box // variable !!!
        double amountPaperCups = 100;// in box // variable !!!
        double pricePerPaperCup = pricePaperCups / amountPaperCups;
        int cleanWater = 55;//price in UAH for 19L , variable !!!
        double bottleLiter = 19;
        double waterForEspresso = 0.025; // need water from liter //variable !!!
        double amountCupWaterForEspresso; // how many espresso can make from one bottle water
        double priceForWaterPerCup;
        int staff = 40000;//UAH for barista and cashier per month//variable !!!
        int salaryPerDay;
        int salaryPerMonth;
        int numberTimesBroke = 1;//coffee machine was broke for month
        int serviceCoffeeMachine = 1000;//UAH
        int spendingForServiceMachine;
        int rentCoffeeMachine = 1000;//UAH cost per month
        int espresso;
        int americano;
        int cappuchino;
        int late;
        int maffin = 20;//UAH price per // variable !!!
        int sugar;// variable !!!
        double espressoPrice; // net cost of coffee ingredients
        double espressoNetProfit;
        double americanoPrice;
        double americanoNetProfit;
        double cappuchinoPrice;
        double cappuchinoNetProfit;
        double latePrice;
        double lateNetProfit;
        int percentProfit = 900;// variable !!!
        int roomRentPerMonth = 20000;// variable !!!
        int internet = 150;// variable !!!
        int anotherSpending ;
        int allProfitPerDay;
        int allNetProfitPerDay;
        int allNetProfitPerMonth;

        int minSalesForDay = 0;
        int maxSalesForDay = 40;
        int diff1 = maxSalesForDay - minSalesForDay;
        Random random1 = new Random();
        int maffinPerDay = random1.nextInt(diff1 + 1) + minSalesForDay;
        System.out.println("Amount sold maffins = " + maffinPerDay);
        int profitForAllMaffins = maffinPerDay * maffin;

        amountCupWaterForEspresso = bottleLiter / waterForEspresso;
        priceForWaterPerCup = cleanWater / amountCupWaterForEspresso;
        System.out.println("price of water for cup = " + priceForWaterPerCup);

        groundCoffeePriceForCup = coffeeBeansPriceForKg / amountCupPerKg;
        System.out.println("price of dry coffee for cup = " + groundCoffeePriceForCup);

        espressoPrice = priceForWaterPerCup + groundCoffeePriceForCup + pricePerPaperCup;
        System.out.println("Espresso net cost = " + espressoPrice + " UAH");
        espressoNetProfit = espressoPrice * percentProfit / 100;
        System.out.println("Espresso Net Profit = " + espressoNetProfit + " UAH");
        espresso = (int) (espressoPrice + espressoNetProfit);
        System.out.println("Price on the menu for Espresso = " + espresso + " UAH");

        americanoPrice = espressoPrice + (priceForWaterPerCup * 3);
        System.out.println("Americano net cost = " + americanoPrice + " UAH");
        americanoNetProfit = americanoPrice * percentProfit / 100;
        System.out.println("Americano Net Profit = " + americanoNetProfit + " UAH");
        americano = (int) (americanoPrice + americanoNetProfit);
        System.out.println("Price on the menu for Americano = " + americano + " UAH");

        milkForCappuchino = waterForEspresso * 2.33;
        cappuchinoCupsMilk = milkVolume / milkForCappuchino;
        milkPricePerCup = milkPriceLiter / cappuchinoCupsMilk;
        cappuchinoPrice = espressoPrice + milkPricePerCup; //UAH per cup
        System.out.println("Cappuchino net cost = " + cappuchinoPrice + " UAH");
        cappuchinoNetProfit = cappuchinoPrice * percentProfit / 100;
        System.out.println("Cappuchino Net Profit = " + cappuchinoNetProfit + " UAH");
        cappuchino = (int) (cappuchinoPrice + cappuchinoNetProfit);
        System.out.println("Price on the menu for Cappuchino = " + cappuchino + " UAH");

        milkForLate =waterForEspresso*3;
        lateCupsMilk =milkVolume/milkForLate;
        milkPricePerCup =milkPriceLiter/lateCupsMilk;
        latePrice = espressoPrice + milkPricePerCup;//UAH per cuplatePrice
        System.out.println("Late net cost = " + latePrice + " UAH");
        lateNetProfit = latePrice * percentProfit / 100;
        System.out.println("Late Net Profit = " + lateNetProfit + " UAH");
        late = (int) (latePrice + lateNetProfit);
        System.out.println("Price on the menu for Late = " + late + " UAH");

        if (numberTimesBroke <= 1){
            System.out.println("Spending for service of coffee machine = " + serviceCoffeeMachine + " UAH");
        }
        else {
            spendingForServiceMachine = serviceCoffeeMachine * numberTimesBroke;
            System.out.println("Spending for service of coffee machine = " + spendingForServiceMachine + " UAH");
        }

        personPerDay = personForHours * workDay;
        System.out.println("Person per work day = " + personPerDay);
        hundredPercentPeople = personPerDay;

        if(personPerDay <= 50){
            onePercentPeople = hundredPercentPeople / 100;
            allProfitPerDay = (int) ((onePercentPeople * 20 * espresso) + (onePercentPeople * 20 * americano) + (onePercentPeople * 30 * cappuchino) + (onePercentPeople * 30 * late) + profitForAllMaffins);
            System.out.println("All profit for one work day = " + allProfitPerDay + "UAH");
        }
        else if(personPerDay > 50 && personPerDay <= 250){
            onePercentPeople = hundredPercentPeople / 100;
            allProfitPerDay = (int) ((onePercentPeople * 10 * espresso) + (onePercentPeople * 20 * americano) + (onePercentPeople * 40 * cappuchino) + (onePercentPeople * 30 * late) + profitForAllMaffins);
            System.out.println("All profit for one work day = " + allProfitPerDay + "UAH");
        }
        else if(personPerDay >250 && personPerDay <500){
            onePercentPeople = hundredPercentPeople / 100;
            allProfitPerDay = (int) ((onePercentPeople * 10 * espresso) + (onePercentPeople * 10 * americano) + (onePercentPeople * 45 * cappuchino) + (onePercentPeople * 35 * late) + profitForAllMaffins);
            System.out.println("All profit for one work day = " + allProfitPerDay + "UAH");
        }
        else {
            onePercentPeople = hundredPercentPeople / 100;
            allProfitPerDay = (int) ((onePercentPeople * 8 * espresso) + (onePercentPeople * 12 * americano) + (onePercentPeople * 45 * cappuchino) + (onePercentPeople * 35 * late) + profitForAllMaffins);
            System.out.println("All profit for one work day = " + allProfitPerDay + "UAH");
        }
    }
}
