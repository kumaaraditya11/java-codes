import java.sql.SQLOutput;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;

public class OnlineStoreProductManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> hashMap = new HashMap<>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        //creating the maps

        hashMap.put(101, "Laptop");
        hashMap.put(105, "Keyboard");
        hashMap.put(103, "Mouse");
        hashMap.put(108, "Monitor");
        hashMap.put(102, "Headphones");
        hashMap.put(110, "Webcam");
        hashMap.put(104, "Printer");
        hashMap.put(107, "Speaker");

        linkedHashMap.put(101, "Laptop");
        linkedHashMap.put(105, "Keyboard");
        linkedHashMap.put(103, "Mouse");
        linkedHashMap.put(108, "Monitor");
        linkedHashMap.put(102, "Headphones");
        linkedHashMap.put(110, "Webcam");
        linkedHashMap.put(104, "Printer");
        linkedHashMap.put(107, "Speaker");

        treeMap.put(101, "Laptop");
        treeMap.put(105, "Keyboard");
        treeMap.put(103, "Mouse");
        treeMap.put(108, "Monitor");
        treeMap.put(102, "Headphones");
        treeMap.put(110, "Webcam");
        treeMap.put(104, "Printer");
        treeMap.put(107, "Speaker");

        //Adding new products by asking user
        System.out.println("Write a product Id and a Name: ");
        int Product_Id = sc.nextInt();
        sc.nextLine();
        String Product_name = sc.nextLine();

        if(hashMap.putIfAbsent(Product_Id, Product_name) != null){
            System.out.println("Product already exists in hashmap");
        }
        hashMap.put(Product_Id, Product_name);

        if(linkedHashMap.putIfAbsent(Product_Id, Product_name) != null){
            System.out.println("Product already exists in LinkedHashMap");
        }
        linkedHashMap.put(Product_Id, Product_name);

        if(treeMap.putIfAbsent(Product_Id, Product_name) != null){
            System.out.println("Product already exists in TreeMap");
        }
        treeMap.put(Product_Id, Product_name);

        //searching for product_id

        System.out.println("Write a product Id: ");
        Product_Id = sc.nextInt();

        if(hashMap.containsKey(Product_Id)){
            System.out.println(hashMap.get(Product_Id));
        }

        if(linkedHashMap.containsKey(Product_Id)){
            System.out.println(linkedHashMap.get(Product_Id));
        }

        if(treeMap.containsKey(Product_Id)){
            System.out.println(treeMap.get(Product_Id));
        }

        //searching for product_name
        System.out.println("Write a product Name: ");
        String Product_Name = sc.next();

        if(hashMap.containsValue(Product_Name)){
            System.out.println("Exists in hashmap");
        }
        else {
            System.out.println("Doesn't exist in hashmap");
             }
        if(linkedHashMap.containsValue(Product_Name))
        {
            System.out.println("Exists in LinkedHashMap");
        }
        else
        {
            System.out.println("Doesn't exist in linkedHashMap");
        }
        if(treeMap.containsValue(Product_Name))
        {
            System.out.println("Exists in TreeMap");
        }
        else
        {
            System.out.println("Doesn't exist  in TreeMap");
        }

        //updating a product
        System.out.println("Write a valid product_id and enter new name for it: ");
        Product_Id = sc.nextInt();
        String newproduct_name = sc.next();
        hashMap.replace(Product_Id, newproduct_name);
        System.out.println(hashMap);


    }
}
