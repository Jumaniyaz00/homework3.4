package com.company;

public class Main{

        public static void main(String[] args) {
            String[] names = {" Timur ", " Azat ", " Samat"};
            int num;
            num = 3;
            switch (num) {
                case 1:
                    System.out.println("  привет всем");
                    System.out.println(names[0] + "   доброго утра");
                    break;

                case 2:
                    System.out.println("  привет всем");
                    System.out.println(names[1] + "   доброго деня");
                    break;

                case 3:
                    System.out.println("  привет всем");
                    System.out.println(names[2] + "   доброго вечера ");
                    break;

                default:
                    System.out.println("  привет всем");
            }
            System.out.println(",.,.,.,.,.,.,.,.,.,.,.,.,,,.,.,.,.,.,.,.,.,.,");


            String[] names1 = {" Timur ", " Azat ", " Samat", " kk",};
            names1[3] = "Nurislan";
            int num7;
            num7 = 9;
            switch (num7) {
                case 1:
                    System.out.println("  привет всем");
                    System.out.println(names1[0] + "   доброго утра");
                    break;

                case 2:
                    System.out.println("  привет всем");
                    System.out.println(names1[1] + "   доброго деня");
                    break;

                case 3:
                    System.out.println("  привет всем");
                    System.out.println(names1[2] + "   доброго вечера ");
                    break;

                default:
                    System.out.println("  привет всем");
                    System.out.println(names1[3] + "  добрый ночи");

            }
        }
}

