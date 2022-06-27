1) Было:
        int len = str.length();
        double sqlen = Math.sqrt(len);
        int low = (int) sqlen;
   Стало:
        int len = str.length();
        double sqlen = Math.sqrt(len);
        int low = Math.floor(sqlen);
// Избавились от приведения типов

2) Было:
		double a = (Votes[i] / (total * 1.0) ) * 100;
   Стало:
		try {
			double a = (Votes[i] / (total * 1.0) ) * 100;
		}
		catch (ArithmeticException e) {...}
//Ловим возможное деление на ноль

3) Было:
		double x = 0;
		double y = 0;
		...
		if (x == y) {...}
   Стало:
		double x = 0;
		double y = 0;
		...
		if (Math.abs(x-y) < eps) {...}
//Сравниваем вещественные числа не "в лоб", а с заданной точностью eps

4) Было:
		double x = 0;
		double y = 0;
		...
		if (x == y) {...}
   Стало:
		BigDecimal x = 0;
		BigDecimal y = 0;
		...
		if (x.compareTo(y) == 0) {...}
		
// Используем тип данных BigDecimal для чисел с длинной дробной частью

5) Было:
		// finding the first digit of N!
        double z = Math.pow(10,log_Frac);
        int x = (int) z;
   Стало:
		// finding the first digit of N!
        int x = (int) Math.pow(10,log_Frac);

// Перешли от double к int по возможности

6) Было:
		try {...}
		catch (Exception e) {
			System.our.println("Сообщение об ошибке");
		}
   Стало:
		final String ERR_MESSAGE = "Сообщение об ошибке"
		try {...}
		catch (Exception e) {
			System.our.println(ERR_MESSAGE);
		}

// Завели константу для магической строки

7) Было:
       int a = 100000;
       int b = 100000;
       int c = a * b / a;
   Стало:
       int a = 100000;
       int b = 100000;
       int c = (int) ((long) a * (long) b / a);

// Следим за переполнением в промежуточных вычислениях

8) int a = 256 / 3 * 9; - int a = 256 * 9 / 3;

//Следим за целочисленностью деления

9) Было:
    public static float sum(float[] values, int count)
    {
        float sum = 0;
        for (int i = 0; i < count; ++i) {
            sum += values[i];
        }
        return sum;
    }
   Стало:
    public static float sum(float[] values, int count)
    {
        double sum = 0;
        for (int i = 0; i < count; ++i) {
            sum += values[i];
        }
        return (float) sum;
    }

// заменили одинарную точность на двойную

10) Было:
		double x = 10.56
		int y = 5
		...
		if ( x < y) {...}
    Стало:
		double x = 10.56
		int y = 5
		...
		if ( x < (double) y) {...}
// Избегаем сравнений разных типов

11) Было:
		int a = 100000;
        int b = 100000;
        int c = a*b;
    Стало:
		int a = 100000;
        int b = 100000;
        long c = (long) a*b;
// Следим за переполнением целых чисел

12) Было:
		double x = 0;
		double y = 0;
		...
		if (x == y) {...}
   Стало:
		double x = 0;
		double y = 0;
		...
		if (Math.abs(x-y) < eps) {...}
//Используем сравнение с точностью до eps для избежания ошибки округления

