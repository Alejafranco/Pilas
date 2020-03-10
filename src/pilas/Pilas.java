package pilas;

public class Pilas {

    public static void main(String[] args) {
        LinkedStack<Integer> duracell = new LinkedStack<>();
        duracell.push(99);
        duracell.push(88);
        duracell.push(77);
        duracell.push(66);
        duracell.push(55);
        System.out.println(duracell.peek());
        Validate exp = new Validate();

        System.out.println("\033[031mBalanceado: \033[030m" + exp.checkParanthesisBalanced("{[(5+5)}]"));
        System.out.println("\033[031mBalanceado: \033[030m" + exp.checkParanthesisBalanced("{2[1-(5+5)/5]*4}"));
        System.out.println("");

        ConvertBase data = new ConvertBase();
        try {
            System.out.println(data.toBase("16", 5666));
            System.out.println(data.toBase("8", 3654));
            System.out.println(data.toBase("3", 120));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        LinkedQueue<Object> cola = new LinkedQueue<>();
        System.out.println("");
        System.out.println("\033[031madd: \033[030m" + cola.add(1));
        System.out.println("\033[031madd: \033[030m" + cola.add(2));
        System.out.println("\033[031moffer: \033[030m" + cola.offer(3));
        System.out.println("\033[031moffer: \033[030m" + cola.offer(4));
        System.out.println("");

        try {
            System.out.println("\033[031mremove: \033[030m" + cola.remove());
            System.out.println("\033[031mremove: \033[030m" + cola.remove());
            System.out.println("\033[031mremove: \033[030m" + cola.remove());
            System.out.println("\033[031mremove: \033[030m" + cola.remove());
            System.out.println("\033[031mremove: \033[030m" + cola.remove());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        cola.add(1);
        cola.add(2);
        cola.add(3);
        cola.add(4);

        System.out.println("");
        System.out.println("\033[031mpoll: \033[030m" + cola.poll());
        System.out.println("\033[031mpoll: \033[030m" + cola.poll());
        System.out.println("\033[031mpoll: \033[030m" + cola.poll());
        System.out.println("\033[031mpoll: \033[030m" + cola.poll());
        System.out.println("\033[031mpoll: \033[030m" + cola.poll());
        System.out.println("");

        cola.add(1);
        cola.add(2);
        cola.add(3);
        cola.add(4);

        try {
            System.out.println("\033[031melement: \033[030m" + cola.element());
            cola.remove();
            cola.remove();
            cola.remove();
            cola.remove();
            System.out.println("\033[031melement: \033[030m" + cola.element());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("");
        cola.add(1);
        cola.add(2);
        System.out.println("\033[031mpeek: \033[030m" + cola.peek());
        try {
            cola.remove();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("\033[031mpeek: \033[030m" + cola.peek());
        try {
            cola.remove();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("\033[031mpeek: \033[030m" + cola.peek());

        /* --------------------CASO ANALISIS---------------------*/
        System.out.println("----------CASO ANALISIS----------");
        ArrayStack arregloPilas = new ArrayStack(8);
        ArrayStack arregloPilas2 = new ArrayStack(2);
        arregloPilas2.push1(2);
        arregloPilas2.push1(4);

        System.out.println("\033[31mPush 1:");
        System.out.println(arregloPilas.push1(2));
        System.out.println(arregloPilas.push1(3));
        System.out.println(arregloPilas.push1(2));
        System.out.println(arregloPilas.push1(3));
        System.out.println(arregloPilas.push1(4));
        System.out.println("");
        System.out.println("\033[31mPush 2:");
        System.out.println(arregloPilas.push2(5));
        System.out.println(arregloPilas.push2(4));
        System.out.println(arregloPilas.push2(8));
        System.out.println(arregloPilas.push2(8));

        System.out.println("");

        System.out.println("\033[31mPop 1:");
        System.out.println(arregloPilas.pop1());
        System.out.println(arregloPilas.pop1());
        System.out.println(arregloPilas.pop1());
        System.out.println("\033[31mPop 2:");
        System.out.println(arregloPilas.pop2());
        System.out.println(arregloPilas.pop2());
        System.out.println(arregloPilas.pop2());
        System.out.println(arregloPilas.pop2());
        System.out.println(arregloPilas.pop2());
        System.out.println(arregloPilas.pop2());

        System.out.println("");

        System.out.println("\033[31mArreglo 1 lleno: \033[30m" + arregloPilas.isFull());
        System.out.println("\033[31mArreglo 2 lleno: \033[30m" + arregloPilas2.isFull());

        System.out.println("");

        System.out.println("\033[31mBONUS: \033[30mDOS PILAS ENLAZADAS");
        System.out.println("");

        LinkedStack pilaEnlazada = new LinkedStack();

        System.out.println("\033[31mPush 1:");
        System.out.println(pilaEnlazada.push1(2));
        System.out.println(pilaEnlazada.push1(3));
        System.out.println(pilaEnlazada.push1(1));

        System.out.println("");

        System.out.println("\033[31mPush 2:");
        System.out.println(pilaEnlazada.push2(6));
        System.out.println(pilaEnlazada.push2(2));
        System.out.println(pilaEnlazada.push2(9));

        System.out.println("");

        System.out.println("\033[31mPop 1:");
        System.out.println(pilaEnlazada.pop1());
        System.out.println(pilaEnlazada.pop1());
        System.out.println(pilaEnlazada.pop1());
        System.out.println(pilaEnlazada.pop1());

        System.out.println("");

        System.out.println("\033[31mPop 2:");
        System.out.println(pilaEnlazada.pop2());
        System.out.println(pilaEnlazada.pop2());

        System.out.println("");

    }
}
