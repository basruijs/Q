public class Main {
    public static void main(String[] args) {
        Queue q1= new QueueImplementation();
        Queue q2= new QueueImplementation();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.add(7);
        q1.add(8);
        q1.add(9);
        System.out.println(q1.remove() + " removed");
        System.out.println(q1.peek() + " is next in line");
        System.out.println("Q1 empty: " + q1.isEmpty());
        System.out.println("Q2 empty: " + q2.isEmpty());
        System.out.println("Size: " + q1.size());
        q1.print();
        System.out.println(" -- ");
        q1.printReverse();
        System.out.println(" -- ");
        q1.clear(3);
        q1.print();
        System.out.println(" -- ");
        q1.clear();
        q1.print();
        System.out.println(" -- ");
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.add(7);
        q1.add(8);
        q1.add(9);
        q1.print();
        System.out.println(" -- ");
        q1.jumpTheQueue(4,0);
        q1.print();
        q2.add(1);
        q2.add(1);
        q2.add(3);
        q2.add(1);
        q2.add(4);
        q2.add(1);
        q2.add(1);
        q2.add(1);
        q2.add(3);
        q2.add(1);
        System.out.println(q2);
        System.out.println("Index of 3 is : " + q2.indexOf(3));
        System.out.println("Last Index of 3 is : " + q2.lastIndexOf(3));
        System.out.println("first test: " + q1.equals(q2));

        q1.clear();
        System.out.println("second test: " + q1.equals(q2));

        q2.clear();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);

        q2.add(1);
        q2.add(2);
        q2.add(3);
        q2.add(4);
        q2.add(5);

        System.out.println("third test: " + q1.equals(q2));

        System.out.println(q1);
    }
}
