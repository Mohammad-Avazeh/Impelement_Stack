public class Stack1 {
    private int valueArray;
    private int[] array1=new int[5];
    private int number;
    public Stack1(){
        number=0;
    }
    public void setArray(int inputValue){
        if(number<5) {
            array1[number] = inputValue;
            number++;
        }else{

        }
    }
    public int getValueArray(){
        if(number>=0) {
            valueArray = array1[--number];
            //number--;

        }else if(number<0){
            System.out.println("its Index of Array not in stack !!!  ");
        }
        return valueArray;
    }

    public void printArray(){

        for(int i=4 ; i>=0 ; i--){
            System.out.print(array1[i] + "\n");
        }
        System.out.println("");
    }

}
