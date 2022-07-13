package streams.MapFilterReduceAlg;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

class Sale {
    private String product;
    private LocalDate date;
    private int amount;

    public Sale(String product, LocalDate date, int amount) {
        this.product = product;
        this.date = date;
        this.amount = amount;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "product='" + product + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                '}';
    }
}

public class MapFilterReduce {
    public static void main(String[] args) {
        List<Sale> sales = List.of(new Sale("MacBookPro", LocalDate.now(), 220000),
                new Sale("MacBookAir", LocalDate.now(), 120000),
                new Sale("Dell", LocalDate.now(), 107000));
        int amountSoldInJuly = 0;
        for (Sale sale : sales) {
             /*filtering*/
            if (sale.getDate().getMonth() == Month.JULY) {
                /*reduction*/ amountSoldInJuly += /*mapping*/ sale.getAmount();
            }
        }
        System.out.println("Amount sold in July is: " + amountSoldInJuly);
    }
}
