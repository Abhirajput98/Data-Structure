package LEC_1;

import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.TreeVisitor;
import com.sun.tools.javac.Main;

import java.util.*;
public class Rough2 {
    static Scanner scn = new Scanner(System.in);

    public void main(String[] args) {
        //Main m = new Main();
        BinaryTree bt = new BinaryTree() {
            @Override
            public Kind getKind() {
                return null;
            }

            @Override
            public <R, D> R accept(TreeVisitor<R, D> visitor, D data) {
                return null;
            }

            @Override
            public ExpressionTree getLeftOperand() {
                return null;
            }

            @Override
            public ExpressionTree getRightOperand() {
                return null;
            }
        };
      //1
        //2 3
        //4 5
        //6 7
        //-1 -1
        //-1 -1
        //-1 -1
        //-1 -1  bt.levelOrderZZ();
    }

   }