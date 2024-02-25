package LEC_81;

public class Trie_Client {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Trie t = new Trie();
        t.insert("raj");
        t.insert("raja");
        t.insert("apple");
        t.insert("mango");
        t.insert("man");
        t.insert("ankit");
        t.insert("ankita");
        t.insert("amisha");
        System.out.println(t.search("raja"));
        System.out.println(t.startsWith("appk"));

    }

}
