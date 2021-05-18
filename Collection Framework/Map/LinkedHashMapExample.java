import java.util.LinkedHashMap;
import java.util.Map;

class Book{
    int id;
    String name, author;

    Book(int id, String name, String author){
        this.id = id;
        this.name = name;
        this.author = author;
    }
}

public class LinkedHashMapExample{
   
    
    public static void main(String[] args) {
        LinkedHashMap<Integer,Book> lmap = new LinkedHashMap<Integer,Book>();

        Book b1 = new Book(100,"Harry Potter", "J K Rowling");
        Book b2 = new Book(300,"Sherlock Holmes", "Conan Doyle");
        Book b3 = new Book(400,"A Preface to Man", "Subash Chandran");

        //put
        lmap.put(2,b1);
        lmap.put(7,b2);
        lmap.put(3,b3);

        for(Map.Entry<Integer, Book> entry : lmap.entrySet()){
            Book b = entry.getValue();
            System.out.println("key : "+entry.getKey()+" & id : "+b.id+" , name : "+b.name+" , author : "+b.author);
        }
            

    }
}