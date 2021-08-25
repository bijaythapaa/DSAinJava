package hashtablesarrayimpl;

/**
 * @Author Bijay Thapa
 * @Project DSAinJava
 * @created 6/29/21 - 7:04 AM
 */
public class SimpleHashTable {

    private Employee[] hashtable;

    public SimpleHashTable() {
        hashtable = new Employee[10];
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null)
            System.out.println("Sorry there's already an employee at position " + hashedKey);
        else
            hashtable[hashedKey] = employee;
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }

    public void printHashTable() {
//        for (int i = 0; i < hashtable.length; i++) {
//            System.out.println(hashtable[i]);
//        }

//        Enhanced For loop.
        for (Employee employee : hashtable) {
            System.out.println(employee);
        }
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }
}
