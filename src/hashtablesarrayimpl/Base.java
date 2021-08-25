package hashtablesarrayimpl;


/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 6/29/21 - 7:01 AM
 */
public class Base {
    public static void main(String[] args) {
        Employee shyam = new Employee("Shyam", "Khan", 1);
        Employee sanjeev = new Employee("Sanjeev", "Singh", 2);
        Employee ram = new Employee("Ram", "Kumar", 3);
        Employee sita = new Employee("Sita", "Dev", 4);
        Employee hari = new Employee("Hari", "Chandra", 5);

        SimpleHashTable ht = new SimpleHashTable();
        ht.put("Khan", shyam);
        ht.put("Singh", sanjeev);
        ht.put("Chandra", hari);
        ht.put("Dev", sita);
        ht.put("Kumar", ram);

//        ht.printHashTable();

        System.out.println("Retrive key Chandra: " + ht.get("Chandra"));
    }
}
