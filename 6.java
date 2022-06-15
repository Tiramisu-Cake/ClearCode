3.1

1) Attack - AttackingUnit
2) Defend - DefenderUnit
3) UnitData - UnitStats
4) AccountInfo - Account
5) SearchID - idSearcher

3.2

1)  // метод меняет местами заданные индексы в массиве.
    public static void swapArr(int[] Arr, int i1, int i2) {}
2)  // метод "крутит" массив влево относительно заданного индекса 
    public static void leftRound(int[] A, int c) {}
3)  // метод разворачивает массив относительно заданных индексов 
    public static void turnAround(int[] A, int s, int t) {}
4)  // метод удаляет из строки все символы после последнего пробела
    public static String cutAfterLastSpace (String S) {}
5)  // ... до последнего пробела 
    public static String cutToLastSpace (String S) {}
6-7) //В методах выше можно добавлять суффикс для уточнения типа данных:
	public static void swapCharArr(char[] Arr, int i1, int i2) {}
	public static void turnAroundStringArr(int[] A, int s, int t) {}