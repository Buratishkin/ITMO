import java.util.Arrays;

public class LabOne {
    public static double Round(double num){ //округление до 5 знаков после запятой
        return Math.round(num * 100000.0) / 100000.0;
    }

    public static double sitOne(double num) { //когда w[i] == 10
        return Round(Math.sin(num));
    }
    public static double sitTwo(double num) { //когда w[i] в {6, 12, 14, 16, 18}
        double el = Math.pow(num, num/2);
        el = Math.exp(el);
        el = Math.tan(el);
        return Round(el);
    }
    public static double sitThree(double num) { //остальные случаи
        double number, power;
        number = Math.log1p(Math.abs(num) * (Math.abs(num) + 1));
        number += 1.0 / 3.0;
        number /= 8 * Math.pow(2.0 / 3.0 * num, 3*num);
        number = Math.pow(Math.exp(Math.exp(num)), number);
        number *= 2;

        power = Math.cos(num);
        power = Math.pow(power, 2);
        power = Math.cbrt(-power);
        power = Math.exp(power);
        power = Math.asin(power);
        return Round(Math.pow(number, power));
    }

    public static void print(double[][] arr){ //вывод двухмерного массива
        System.out.println("Третье задание:");
        for (int i = 0; i < 11; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void main(String[] args) {
        //1
        short[] w = new short[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22};
        //2
        double[] x = new double[13];
        for (int i = 0; i < x.length; i++)
            x[i] = Math.random() * 21 - 6;
        //3
        double[][] z = new double[11][13];
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 13; j++) {
                if (w[i] == 10)
                    z[i][j] = sitOne(x[j]);
                else {
                    switch (w[i]){
                        case 6:
                        case 12:
                        case 14:
                        case 16:
                        case 18:
                            z[i][j] =  sitTwo(x[j]);
                            break;

                        default:
                            z[i][j] = sitThree(x[j]);
                    }
                }
            }
        }

        System.out.println("Первое задание: " + Arrays.toString(w));
        System.out.println("Второе задание: " + Arrays.toString(x));
        print(z);
    }
}
