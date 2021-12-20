package Hard;

public class Squirrel {

    int[] nuts;
    int[] bigArray;

    public Squirrel(int[] nuts) {
        bigArray = new int[nuts.length + 1];
        this.nuts = nuts;
        for (int i = 0; i < nuts.length; i++) {
            bigArray[i] = nuts[i];
        }
    }
    public int getNuts(int index) {
        return bigArray[index - 1];
    }
    public int maxNuts() {
        int sum = 0;
        for (int i = 0; i < bigArray.length; i++) {
            if (bigArray[i] < 0 && bigArray[i+1] > bigArray[i]) {
                sum += bigArray[i + 1];

            } else {
                sum += bigArray[i];
            }
        }
        if (sum < 0) {sum = 0;}
        return sum;
    }
}
    /*
    конструктор, в который подают массив nuts ( в каждой ячейке которого хранится значение n,
                                                если n — положительное, то на пеньке с таким индексом белочка найдет n орешков,
                                                если отрицательное, то на этом пеньке белочка потеряет n орешков);
    метод getNuts(int index), возвращает число — сколько найдет или потеряет белочка на пеньке с индексом n;
    метод maxNuts(), также возвращает число — какое максимальное число орешков белочка донесет до дома.

    Пример:

    Ввод



    Вывод

6
        9



*/


