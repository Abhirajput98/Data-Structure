package LEC_53;
import java.util.*;

public class BinaryTree {
    /* Pre order ::>> Root >> Left >> right
    *
    * */

    public class Node {
        public int data;
        public Node left;
        public Node right;

    }

    private Node root;

    public BinaryTree() {
        root = createtree();
    }

    Scanner sc = new Scanner(System.in);

    private Node createtree() {

        int item = sc.nextInt();
        Node nn = new Node();
        nn.data = item;
        boolean hlc = sc.nextBoolean();
        if (hlc == true) {
            nn.left = createtree();
        }
        boolean hrc = sc.nextBoolean();
        {
            if (hrc == true) {
                nn.right = createtree();
            }
        }
        return nn;

    }
    public void Display(){
        Display(root);
    }
    public  void Display(Node nn){
        if(nn==null){
            return;
        }
        String s ="";
        s = "<--"+nn.data+"-->";
        if(nn.left!=null){
            s= nn.left.data+s;


        }
        else{
            s=s+".";
        }
        System.out.println(s);
        Display(nn.left);
        Display(nn.right);
    }
    public  int max()
    {
        return  max(root);
    }
    public  int max(Node nn){
        if(nn==null){
            return Integer.MIN_VALUE;
        }
        int left = max(nn.left);
        int right = max(nn.right);
        return Math.max(nn.data,Math.max(left,right));

    }
    public boolean find(int item){
        return find(root,item);
    }
    public boolean find(Node nn,int item){
        if(nn==null){
            return false;
        }
        if(nn.data==item){
            return true;
        }
        boolean left = find(nn.left,item);
        boolean right = find(nn.right,item);
        return left || right;

    }
    public int height(){
        return height(root);
    }
    public  int height(Node nn){
        if(nn==null){
            return -1; // o return krne se 1 return hoga.... isliye hum -1 kerneg jisse 0 return ho <<< -1+1 =0
        }
        int lh=height(nn.left);
        int rh=height(nn.right);
        return Math.max(lh,rh)+1;

    }
    public  void  preorder(){
        preorder(root);
        System.out.println();

    }
    public void preorder(Node nn){
        if(nn==null){
            return;
        }
        System.out.println(nn.data+" ");
        preorder(nn.left);
        preorder(nn.right);

    }
    public  void  postorder(){
        postorder(root);
        System.out.println();

    }
    public void postorder(Node nn){
        // left << right<< node  ke data konrpint  krengdege
        if(nn==null){
            return;
        }
        preorder(nn.left);
        preorder(nn.right);
        System.out.println(nn.data+" ");

    }
    public  void  Inorder(){
        Inorder(root);
        System.out.println();

    }
    public void Inorder(Node nn){
        List<Integer> ll = new ArrayList<>();
        // left << node<< right >>>
        if(nn==null){
            return;
        }
        preorder(nn.left);
        System.out.println(nn.data+" ");
        preorder(nn.right);


    }
    public void levelorder(){Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node rv=q.remove(); // remove fieerst q.poll();
            System.out.println(rv.data+" ");
            if(rv.left!=null){
                q.add(rv.left);
            }
            if(rv.right!=null){
                q.add(rv.right);
            }
        }
        System.out.println();
    }


}
