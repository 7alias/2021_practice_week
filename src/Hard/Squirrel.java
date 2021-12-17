package Hard;

public class Squirrel {


    int[] nuts;


    public Squirrel(int[] nuts) {
        this.nuts = nuts;
    }

    public int getNuts(int index) {

        return nuts[index - 1];

    }

    public int maxNuts() {
        int sum = 0;
        int i = 0;
        do {
            sum += nuts[i];
            i++;
            if (i+1 == nuts.length) {
                break;
            } else if (nuts[i] < 0) {
                sum += nuts[i + 1];
                continue;

            } else {
                sum += nuts[i];
            }

        } while (i < this.nuts.length - 1);
        if (sum < 0) {
            sum = 0;
        }

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


