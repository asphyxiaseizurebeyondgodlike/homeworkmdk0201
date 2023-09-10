import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        boolean[] place = new boolean[21];
        String[] names = new String[21];
        String name;

        for(int i = 0; i != 21; i++){
            place[i] = true;
        }

        while(true){
            System.out.println("Список свободных мест: ");

            for(int i = 1; i != 21; i++){
                if(place[i] == true){
                    System.out.print(i + ", ");
                }
            }

            System.out.println("Какое место вы хотите купить? ");

            Scanner scan = new Scanner(System.in);
            int buy_place = scan.nextInt();


            if(buy_place < 0 || buy_place > 20){
                System.out.println("Вы ввели некоректное значения места, всего в автобусе 20 мест.");
                break;
            }else{
                if(place[buy_place] == true){
                    place[buy_place] = false;
                    System.out.println("На какое имя вы хотите зарегистрировать место? ");
                    name = scan.next();
                    names[buy_place] = name;
                } else{
                    System.out.println("Данное место уже занято: " + names[buy_place]);
                }
            }
        }
    }
}