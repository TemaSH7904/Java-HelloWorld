public class Array {
    public static void main(String[] args) {
//        String[] nameString = new String[12];
//        nameString[0] = "Январь";
//        nameString[1] = "Февраль";
//        nameString[2] = "Март";
//        nameString[3] = "Апрель";
//        nameString[4] = "Май";
//        nameString[5] = "Июнь";
//        nameString[6] = "Июль";
//        nameString[7] = "Август";
//        nameString[8] = "Сентябрь";
//        nameString[9] = "Октябрь";
//        nameString[10] = "Ноябрь";
//        nameString[11] = "Декабрь";
//
//        for (int i  = 0; i < nameString.length; i++){
//            if (i < nameString.length - 1){
//                System.out.print(nameString[i]+", ");
//            } else {
//                System.out.print(nameString[i]+".");
//            }
//
//        }

        int [] num = {4, 1, 4, 5, 6};

        for (int i = num.length-1; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }
}
