package datastructures.trees;

class Node{
    Node _left, _right;
    int _value;

    public Node(int value) {
        _value = value;
    }

    public void insert(int value) {
        if(value < _value) {
            if(_left == null) {
                _left = new Node(value);
            } else {
                _left.insert(value);
            }
        } else {
            if(_right == null) {
                _right = new Node(value);
            } else {
                _right.insert(value);
            }
        }
    }

    public void traverse() {


        if(_left != null) {
            _left.traverse();
        }

        System.out.println(_value);

        if(_right != null) {
            _right.traverse();
        }

    }

    public boolean checkBST(int value) {
        return checkLeft(value, _left) && checkRight(value, _right);
    }

    private boolean checkLeft(int value, Node left) {
        System.out.println("Inside checkLeft()");
        if(left == null) {
            return true;
        }

        System.out.println("Comparing: " + value + " to " + left._value);

        if(left._value < value) {
            return checkLeft(left._value, left._left);
        } else {
            return false;
        }
    }

    public boolean checkRight(int value, Node right) {
        System.out.println("Inside checkRight()");
        if(right == null) {
            return true;
        }

        System.out.println("Comparing: " + value + " to " + right._value);

        if(right._value > value) {
            return checkRight(right._value, right._right);
        } else {
            return false;
        }
    }
}
public class BinarySearchTrees {
    public static void main(String[] args) {
        Node root = new Node(5);

        root.insert(1);
        root.insert(7);
        root.insert(2);
        root.insert(4);
        root.insert(6);
        root.insert(3);

        root.traverse();

        System.out.println("Value is: " + root.checkBST(2));
    }
}
