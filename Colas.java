public class Colas<E>{

private Node<E> delante;
private Node<E> detras;
private int size;

public Colas(){
    delante = null; //Primer elemento de la cola
    detras = null;  //Ultimo elemento de la cola
    size= 0 ;       //tamaño de la cola
}
//constructores
public class Node<E> {
    private E data; // Datos almacenados en el nodo
    private Node<E> next; // Referencia al siguiente nodo

    public Node(E data) {
        this.data = data;
        next = null;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}

//Metodos
//Metodo auxiliar isEmpty
public boolean isEmpty() {
    return delante == null;  //Si el ultimo valor es null isEmpty es verdadero
}
//Metodo add
public boolean add(E data){
    Node<E> newNode = new Node<>(data);
    if (isEmpty()){             //Si no hay elementos en la cola
        delante =  newNode;     //el elemento E es el de delante y atras a la vez
        detras = newNode;
        return true;
    }else{
        detras.setNext(newNode); // Si es que existen elementos se añade un elemento
        detras=newNode;         //y se reemplaza al ultimo de la cola
        return true;
    }
}

//Metodo element
public E element(){
    return delante.getData(); //Obtiene los datos del elemento de adelante
}
//Metodo offer              //EN la documentacion de java dice que regresa un valor bool?error
public boolean offer (E data){
   add(data);               //Añade un elemento al final de la cola
   return true;
}
//metodo peek
public E peek(){
    if (isEmpty()){             //Si es que esta vacio retorna null
        return null;
    }
    return delante.getData(); //Obtiene los datos del elemento de adelante
}
//Metodo poll
public E poll(){
    if(isEmpty()){
        System.out.println("no hay elementos");
        return null;        //Si no es posible retorna null
    }
    return remove();        //Remueve el elemento de delante
}
//metodo Remove
public E remove(){
    if(isEmpty()){
    System.out.println("no hay elementos"); //No hay elementos en la cola
    }
    E data = delante.getData();     //Se asigna a data el valor del elemento de delante
    delante= delante.getNext();     //Se recorre el elemento de delante
    return data;                    //Regresa el elemento
}
}