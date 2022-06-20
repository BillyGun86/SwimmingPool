public class Main {
    public static void main(String[] args) {

        int volume = 1200;
        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute
        int current_volume = 0;
        int count = 0;

        while (current_volume != volume) {
            current_volume = current_volume + fillingSpeed - devastationSpeed;
            count++;
        }

        System.out.println(count);
    }
}
