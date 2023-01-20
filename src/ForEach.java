public class ForEach {
    public static void main(String[] args) {
        int [] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = 100+i;
        }
       for (int number : numbers){
           System.out.println(number);
       }
    }
}