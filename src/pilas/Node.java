
package pilas;

public class Node<T> {
    private T data;
    private Node<T> nextNode;

    public Node(T d) {
        this.data = d;
        nextNode = null;
    }

    public Node(T d, Node<T> nextNode) {
        this.data = d;
        this.nextNode = nextNode;
    }

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return the nextNode
     */
    public Node getNextNode() {
        return nextNode;
    }

    /**
     * @param nextNode the nextNode to set
     */
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
