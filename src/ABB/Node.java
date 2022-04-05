package ABB;
public class Node <T>{

    //DATA 
    private T data;
    //NODO IZQUIERDO
    private Node <T> leftChild;
    //NODO DERECHO
    private Node <T> rightChild;
//Se crea el nodo 
    public Node( T data ) {
        //todo los datos del nodo son nulos
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }
// Llama al constructur de arriba 
    public Node() {
        this(null);
    }
    //Imprime el nodo
    public void displayNode(){
        System.out.print('('); 
        System.out.print(data); 
        System.out.print(")");
    }
    //Obtiene data
    public T getData(){
        return this.data;
    }

    //setea data
    public void setData(T data){
        this.data = data;
    }

    public Node <T> getLeftChild(){
        return this.leftChild;
    }

    public Node <T> getRightChild(){
        return this.rightChild;
    }

    public void setLeftChild(Node <T> left){
        this.leftChild = left;
    }

    public void setRightChild(Node <T> right){
        this.rightChild = right;
    }
}