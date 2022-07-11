3.1

1) 		double log_Frac = 0.0;
		// находим сумму десятичных логарифмов чисел 2..N
        for(int i = 2; i <= N; i++) {
            log_Frac += Math.log10(i); 
        }
		
2)      Является ли строка line2 подстрокой в строке line1

	static boolean sublineFinder(String line1, String line2) {

        int l2Len = line2.length();

		// пустая подстрока есть в любой строке
        if(l2Len == 0) {
            return true;
        }

        int l1Len = line1.length();
        int sublinesNum = l1Len - l2Len + 1; // количество возможных подстрок

3)      (продолжение)

		int i = 0; // счетчик итераций
        int j = 0; // счетчик совпавших букв
        while(i < sublinesNum) {
			// если рассматриваемый символ не совпал, то переходим к следующей итерации
            if(line1.charAt(i+j) != line2.charAt(j)) {
                j = 0;
                i++;
            } else {
                if(j == l2Len - 1) {
                    if (i+j == l1Len - 1) {
                        return true;
                    }
                    if(l1Len > i+j + 1) {
                        if (line1.charAt(i + j + 1) == ' ') {
                            return true;
                        }
                    }
                    j = -1;
                    i++;
                }
                j++;
            }
        }

        return false;
    }

4)     Часть кода из метода, поворачивающего матрицу
			...
            //Angles
            for (int i = 0; i < min / 2; i++) {
                Mat[i][i] = Mat_c[i + 1][i];
                Mat[i][N - i - 1] = Mat_c[i][N - i - 2];
                Mat[M - i - 1][i] = Mat_c[M - i - 1][i + 1];
                Mat[M - i - 1][N - i - 1] = Mat_c[M - i - 2][N - i - 1];
            }

            //Rows
            for (int i = 0; i < min / 2; i++) {
                for (int j = i + 1; j < N - i - 1; j++) {
                    Mat[i][j] = Mat_c[i][j - 1];
                    Mat[M - i - 1][N - j - 1] = Mat_c[M - i - 1][N - j];
                }
            }

            //Columns
            for (int i = 0; i < min / 2; i++) {
                for (int j = i + 1; j < M - i - 1; j++) {
                    Mat[j][i] = Mat_c[j + 1][i];
                    Mat[M - j - 1][N - i - 1] = Mat_c[M - j - 2][N - i - 1];
                }
            }
			...

5)	Подсчет голосов
	public static String MassVote(int N, int [] Votes) {
        int total = 0;
        for (int i = 0; i < N; i++) {
            total += Votes[i];
        }
		
		//переводим голоса в проценты
        double[] VotesPerc = new double[N];
        for (int i = 0; i < N; i++) {
            double a = (Votes[i] / (total * 1.0) ) * 100;
            String s = String.format("%.3f",a);
            VotesPerc[i] += Double.parseDouble(s.replace(",","."));
        }
		...
	}
	
6)  Считаем количество слов в строке
     static int word_counter(String s) {
        int word_count = 0;

        if(s.length() > 0 && s.charAt(0) != ' ') // если строка не пуста и первый символ не пробел
          word_count++;

       for(int i = 0; i < s.length() - 1; i ++)
          if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ') // если символ есть пробел, и одновременно следующий - не пробел
            word_count++;
            
        return word_count;  
     }
	 
7)  
		String p = "" + command.charAt(0);
        // Если первый символ не число, то вернем пустую строку.
		try {
            Integer.parseInt(p);
        }
        catch (Exception e) {
            return "";
        }
        int x = Integer.parseInt(p);

3.2

1)  Было:
	int[] wait_time = new int[N]; // how many seconds to spend on each traffic light
	
	Стало (из контекста ясно для чего нужна переменная, поэтому комментарий можно убрать):
	int[] waitingTime = new int[N];
	
2)  Из детской задачи
	Было:
	int max1 = 0; // первое максимальное
    int max2 = 0; // второе максимальное

	Стало:
	int max1 = 0; 
    int max2 = 0;
	
3)  Было:
	int n = 3; //Работаем с трехмерными массивами
	
	Стало (контекст итак ясен, комментарии излишни):
	int n = 3;
	
4)  Было:
	int k = 0; //счетчик совпадений
	
	Стало:
	int coincidenceCount = 0;

5)  Было:
	int list2_2 [] = new int[n]; //копия второго массива
	
	Стало:
	int list2Copy [] = new int[n]; 
	