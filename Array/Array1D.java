public class Array1D {
    public static void main(String[] args) {
        System.out.println("Hello World Java : " + args[0]);

        Child child = new Child();

        A b = new B(args[0]);

        int array1[] = {01, 02, 03, 04, 05};
        System.out.println(array1[0]);
        int[] array2 = {11, 12, 13, 14, 15};
        System.out.println(array2[4]);

        String[] array3 = new String[5];
        array3[0] = "Hi";
        System.out.println(array3[0]);
        System.out.println(array3[1]);

        String string1 = null;
        System.out.println(string1 == null);
    }
}

class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child Constructor");
    }
}