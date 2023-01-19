public class weather {
    public static void main(String[] args) {
        boolean weather = true;   //Good = true Bad = false
        boolean time = false; //Sun = true Night = false
        if (weather && time) {
            System.out.println("Гулять");
        } if (!weather && time){
            System.out.println("Читать книгу");
        } if (weather && !time) {
            System.out.println("Сидеть дома");
        }
    }
}
