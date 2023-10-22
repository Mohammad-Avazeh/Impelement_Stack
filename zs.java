public class zs {

    public static void main (String[] args){
        Stack1 in=new Stack1();
        in.setArray(18);
        in.setArray(200);
        in.setArray(49);
        in.setArray(92);
        in.setArray(1679);
        in.setArray(2068);
        in.setArray(1390);

        System.out.println("*************\n\n");
        System.out.println("first output in stack   " + in.getValueArray());
        System.out.println("first output in stack   " + in.getValueArray());
        System.out.println("first output in stack   " + in.getValueArray());
/*        System.out.println("first output in stack   " + in.getValueArray());
        System.out.println("first output in stack   " + in.getValueArray());
        System.out.println("first output in stack   " + in.getValueArray());
        System.out.println("first output in stack   " + in.getValueArray());
        System.out.println("first output in stack   " + in.getValueArray());
        System.out.println("first output in stack   " + in.getValueArray());
*/
        System.out.println("\n---------------------");
        in.printArray();
    }
}
