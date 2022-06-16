import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Normalization {

    public static int generateARandomNumber(int bound) {
        Random random = new Random();
        int  randomNumber = random.nextInt(bound)+1;
        return randomNumber;
    }



    public static List<Double> normalizationMath (List<Integer> numbers, int min , int max){
        List<Double> normList = new ArrayList<>();

        for (double a : numbers){
            normList.add((a-min)/(max-min));
        }
        return normList;
    }

    public static List<Double> normalization (int factor, int bound) {
        int randomNumber = generateARandomNumber(bound);
        int min = 2147483647;
        int max = -1;
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < factor; i++) {


            while (numbers.contains(randomNumber)) {
                randomNumber = generateARandomNumber(bound);
            }

            if (randomNumber < min) {
                min = randomNumber;
            }
            if (max < randomNumber) {
                max = randomNumber;
            }


            numbers.add(randomNumber);
        }

        return normalizationMath(numbers,min, max);



    }



}
