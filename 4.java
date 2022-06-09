/*

7.1

1) res - isGood
   // является ли проверяемая строка хорошей в заданном смысле
2) res - isOrderable
   // можно ли упорядочить заданный массив заданным способом
3) res - isPassword
   // является ли проверяемая строка паролем в заданном смысле
4) x - isValue
   // соответствует ли проверяемое выражение заданному значению
5) res - found
   // является ли заданная строка подстрокой в другой заданной строке

7.2

1) Поиск заданного числа в массиве

   boolean found = false;
    for(int i = 0; i < 100; i++)
      if(Numbers[i] == currentNumber) {
        System.out.println("Число в массиве под номером " +i);
        found = true;
        break;
      }
    if(!found)
      System.out.println("Число в массиве не найдено");
  }
  
2) Проверяем размеры массивов

   boolean error = false; //переменная для выхода из циклов
      
   //Проверяем, совпадают ли размеры массивов
   for(int i = 0; i < n; i++)
    if(dimA[i] != dimB[i]) {
      x = true;
      break;
    }
          
    //Проверяем совпадают ли элементы массивов
    for(int i = 0; i < dimA[0]; i++) {
      if(x)
        break;
      for(int j = 0; j < dimA[1]; j++) {
        if(x)
          break;
        for(int k = 0; k < dimA[2]; k++) {
          if(A[i][j][k] != B[i][j][k]) {
            x = true;
            break;
          }
		}
      }
    }
          
    if(x)
      System.out.println("Массивы не равны");
    else System.out.println("Массивы равны");

3) res - done
   // выполнено ли удаленние узла из связнного списка


7.3

Кажется, что функцию поиска подстроки в строке можно сделать понятнее
с помощью замены i,j,k на более выразительные:

static boolean sublineFinder(String line1, String line2) {

        int l2Len = line2.length();

        if(l2Len == 0) {
            return true;
        }

        int l1Len = line1.length();
        int sublinesNum = l1Len - l2Len + 1;

        int currSubline = 0;
        int step = 0;
        while(i < sublinesNum) {
            if(line1.charAt(currSubline + step) != line2.charAt(step)) {
                step = 0;
                currSubline++;
            } else {
                if(step == l2Len - 1) {
                    if (currSubline + step == l1Len - 1) {
                        return true;
                    }
                    if(l1Len > currSubline + step + 1) {
                        if (line1.charAt(currSubline + step + 1) == ' ') {
                            return true;
                        }
                    }
                    step = -1;
                    currSubline++;
                }
                step++;
            }
        }

        return false;
    }



7.4

1) int bad, int good - количество хороших/плохих яблок в массиве
2) int red, int green - сколько раз по дороге встретился зеленый/красный светофор
3) String theFastest, String theSlowest -  имена самого быстрого бегуна и самого медленного

7.5

1) Было:
   ...
   for (int i = 0; i < n2; i++) {
      int x = c1[i] - '0';
      int y = c2[i] - '0';
   ...
   
   Стало:
   ...
   for (int i = 0; i < n2; i++) {
      int currCharInt1 = c1[i] - '0';
      int currCharInt2 = c2[i] - '0';
   ...
   
2) Было:
   ...
   for (int i = 0; i < N - 1; i++) {
      int x = hits[i];
      int y = hits[i+1];
   ...
   Стало:
   for (int i = 0; i < N - 1; i++) {
      int currHit = hits[i];
      int nextHit = hits[i+1];
   ...
   
3) Было:

   public static int Unmanned(int L, int N, int [][] track) {
       int[] t = new int[N]; // how many seconds to spend on each traffic light
	   ...
	   
   Стало:
   public static int Unmanned(int L, int N, int [][] track) {
       int[] waitTime = new int[N]; // how many seconds to spend on each traffic light
       ...
*/