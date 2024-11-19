//вариант 30903
public class lab1 {
    public static double sitOne(double num) { //когда w[i] == 10
        return (Math.sin(num));
    }
    public static double sitTwo(double num) { //когда w[i] в {6, 12, 14, 16, 18}
        double el = Math.pow(num, num/2);
        el = Math.exp(el);
        el = Math.tan(el);
        return (el);
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
        return (Math.pow(number, power));
    }

    public static void print(double[][] arr){ //вывод двухмерного массива
        System.out.println("3:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%.5f ", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //1
        short[] z = new short[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22};
        System.out.println("1:");
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i] + " ");
        }
        System.out.println();
        //2
        double[] x = new double[13];
        System.out.println("2:");
        for (int i = 0; i < x.length; i++) {
            x[i] = Math.random() * 21 - 6;
            System.out.print(x[i] + " ");
        }
        System.out.println();
        //3
        double[][] z1 = new double[11][13];
        for (int i = 0; i < z1.length; i++) {
            for (int j = 0; j < z1[i].length; j++) {
                if (z[i] == 10)
                    z1[i][j] = sitOne(x[j]);
                else {
                    switch (z[i]){
                        case 6:
                        case 12:
                        case 14:
                        case 16:
                        case 18:
                            z1[i][j] =  sitTwo(x[j]);
                            break;

                        default:
                            z1[i][j] = sitThree(x[j]);
                    }
                }
            }
        }
        print(z1);
    }
}
