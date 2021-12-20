package Middle;



public class MidLauncher {

    public static void main(String[] args) {

     /*  ToTable toTable = new ToTable(new int[]{1, 2, 3, 4, 5, 6}, 3, 2);
        int[][] arr = toTable.resize();


        System.out.println(Arrays.deepToString(arr));

        ToLine toLine = new ToLine(new int[][] {{1, 2}, {3, 4}, {5, 6}});
        int[] line = toLine.resize();

        System.out.println(Arrays.toString(line));
        */

        Mage mage = new Mage("IceMaster", 10, 10, "ice");
        Mage mage2 = new Mage("FireMaster", 10, 10, "fire");
        Mage mage3 = new Mage("EarthMaster", 10, 10, "earth");

        Mage mage4 = new Mage("FireMaster2" , 12, 10, "ice");
        Mage mage5 = new Mage("EarthMaster2", 12, 12, "earth");
        Mage mage6 = new Mage("IceMaster2", 12, 12, "earth");
        String res = "";
        res += mage.fight(mage) + " ";
        res += mage.fight(mage2) + " ";
        res += mage.fight(mage3) + " ";
        res += mage4.fight(mage5) + " ";

        res += mage5.fight(mage6) + " ";
        res += mage.fight(mage3) + " ";
        res += mage2.fight(mage) + " ";
        res += mage3.fight(mage2) + " ";

        System.out.println(res);


    }
}


