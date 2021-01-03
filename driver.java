/**
 * This is the driver class, it tests out the classes: ArrayList, Stack, and Queue.
 * @author Jay Darshan Vakil
 * @version 01/28/2020
 */
public class driver {
    public static void main(String[] args) {
        System.out.println("Testing arrayList: ");
        testArrayList();
        System.out.println("Testing Stacks: ");
        testStack();
        //System.out.println("Testing Queues: ");
        //testQueue();
    }

    public static void testArrayList() {
        Integer[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Integer[] array2 = { 10, 20, 30, 40, 50, 60 };
        Integer[] array1Copy = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        ArrayList arrayList1 = new ArrayList(array1);
        ArrayList arrayList2 = new ArrayList(array2);
        ArrayList arrayList3 = new ArrayList(array1Copy);

        System.out.println("value at index 4: " + arrayList2.get(4));
        System.out.println("Index of 40: " + arrayList2.indexOf(40));
        System.out.println("Size of arrayList2: " + arrayList2.size());

        System.out.println();

        boolean isEmpty = arrayList2.isEmpty();
        if (!isEmpty) {
            System.out.println(arrayList2 + " is not empty");
        }

        System.out.println();

        System.out.println();

        arrayList1.insert(0, 0);
        arrayList1.insert(69, 5);
        boolean equals = arrayList1.equals(arrayList3);
        if (equals) {
            System.out.println(arrayList1 + " is equals to " + arrayList3);
        } else {
            System.out.println(arrayList1 + " is not equals to " + arrayList3);
        }

        System.out.println();

        System.out.println("ArrayList2: " + arrayList2);
        System.out.println(arrayList2.remove(arrayList2.size() - 1) + " is removed");
        System.out.println("ArrayList2: " + arrayList2);
    }

    public static void testStack() {
        Stack a = new Stack();
        a.push('B');
        a.push('a');
        a.push('t');
        a.push('m');
        a.push('a');
        a.push('n');

        System.out.println(a);

        a.pop();
        a.pop();
        a.pop();

        System.out.println(a.size());
        System.out.println(a);
        System.out.println("Is empty: " + a.isEmpty());
    }

    public static void testQueue() {
        Queue q = new Queue();
        q.enqueue('b');
        q.enqueue('a');
        q.enqueue('t');
        q.enqueue('m');
        q.enqueue('a');
        q.enqueue('n');

        System.out.println(q);
        System.out.println(q + " is empty: "+q.isEmpty());
        while (!q.isEmpty()) {
            System.out.print(q.dequeue()+" ");
        }
        System.out.println(q + " is empty: "+q.isEmpty());
    }
}