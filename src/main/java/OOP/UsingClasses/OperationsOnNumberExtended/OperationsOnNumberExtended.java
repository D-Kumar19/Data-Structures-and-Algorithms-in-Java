package OOP.UsingClasses.OperationsOnNumberExtended;

class OperationsOnNumberExtended {
    private final int number;
    private int limit;

    OperationsOnNumberExtended(int number) {
        this.number = number;
    }

    public int getLimit() {
        return limit;
    }

    void setLimit(int limit) {
        this.limit = limit;
    }

    int getNumber() {
        return number;
    }

    boolean isPrime() {
        if (number >= 2) {
            boolean isNumberPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isNumberPrime = false;
                    break;
                }
            }
            return isNumberPrime;
        }
        return false;
    }

    int sumUpToN() {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    int sumOfDivisors() {
        int sumOfDivisors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }
        return sumOfDivisors;
    }

    void printANumberTriangle() {
        System.out.println("\nThe Triangle is numbers is: ");
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void printSquareUpToLimit() {
        System.out.print("Square up to the " + limit + " are: ");
        int i = 1;
        while (i * i <= limit) {
            System.out.print(i * i + " ");
            i++;
        }
        System.out.println();
    }

    void printCubesUpToLimit() {
        System.out.print("Cubes up to the " + limit + " are: ");
        int i = 1;
        while (i * i * i <= limit) {
            System.out.print(i * i * i + " ");
            i++;
        }
        System.out.println();
    }
}
