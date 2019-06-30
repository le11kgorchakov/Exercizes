import javafx.scene.paint.Color;

/**
 * Created by gorch on 12/21/2017.
 */
public class HomeWork029 {
    public static void main (String args[]){
        int year = 2018;

        String rat = " rat ";
        String cow = " cow ";
        String tiger = " tiger ";
        String rabit = " rabit ";
        String dragon = " dragon ";
        String snake = " snake ";
        String horse = " horse ";
        String sheep = " sheep ";
        String monkey = " monkey ";
        String rooster = " rooster ";
        String dog = " dog ";
        String pig = " pig ";

        String trees = " green ";
        String fire = " red ";
        String earth = " yellow ";
        String iron = " white ";
        String water = " black ";

        int animalYear = year % 12;
        int colorYear = year % 10 / 2;

        System.out.println(animalYear);
        System.out.println(colorYear);

        for(int i = 4;i<=year;i+=10){
            if (i == year || i+1 == year){
                System.out.println(trees);
            }else if (i+2 == year || i+3 == year){
                System.out.println(fire);
            }else if (i+4 == year || i+5 == year){
                System.out.println(earth);
            }else if (i+6 == year || i+7 == year){
                System.out.println(iron);
            }else if (i+8 == year || i+9 == year){
                System.out.println(water);
            }
        }
        for(int i = 4; i <= year;i+=12){
            if (i == year) {
                System.out.println(rat);
            }if (i+1 == year){
                System.out.println(cow);
            }if (i+2 == year){
                System.out.println(tiger);
            } if (i+3 == year){
                System.out.println(rabit);
            }if (i+4 == year){
                System.out.println(dragon);
            }if (i+5 == year){
                System.out.println(snake);
            }if (i+6 == year){
                System.out.println(horse);
            }if (i+7 == year){
                System.out.println(sheep);
            }if (i+8 == year){
                System.out.println(monkey);
            }if (i+9 == year){
                System.out.println(rooster);
            }if (i+10 == year){
                System.out.println(dog);
            }if (i+11 == year){
                System.out.println(pig);
            }
        }

                /*switch(year){

                    case 1984:case 1996:case 2008:case 2020:{
                        if (year == 1984){
                            System.out.println(trees);
                        }else if (year == 1996){
                            System.out.println(fire);
                        }else if (year == 2008){
                            System.out.println(earth);
                        }else if (year == 2020){
                            System.out.println(iron);
                        }
                        System.out.println(rat);
                        break;
                    }
                    case 1985:case 1997:case 2009:case 2021:{
                        if (year == 1985){
                            System.out.println(trees);
                        }else if (year == 1997){
                            System.out.println(fire);
                        }else if (year == 2009){
                            System.out.println(earth);
                        }else if (year == 2021){
                            System.out.println(iron);
                        }
                        System.out.println(cow);
                        break;
                    }
                    case 1986:case 1998:case 2010:case 2022:{
                        if (year == 1986){
                            System.out.println(fire);
                        }else if (year == 1998){
                            System.out.println(earth);
                        }else if (year == 2010){
                            System.out.println(iron);
                        }else if (year == 2022){
                            System.out.println(water);
                        }
                        System.out.println(tiger);
                        break;
                    }
                    case 1987:case 1999:case 2011:case 2023:{
                        if (year == 1987){
                            System.out.println(fire);
                        }else if (year == 1999){
                            System.out.println(earth);
                        }else if (year == 2011){
                            System.out.println(iron);
                        }else if (year == 2023){
                            System.out.println(water);
                        }
                        System.out.println(rabit);
                        break;
                    }
                    case 1988:case 2000:case 2012:case 2024:{
                        if (year == 1988){
                            System.out.println(earth);
                        }else if (year == 2000){
                            System.out.println(iron);
                        }else if (year == 2012){
                            System.out.println(water);
                        }else if (year == 2024){
                            System.out.println(trees);
                        }
                        System.out.println(dragon);
                        break;
                    }
                    case 1989:case 2001:case 2013:case 2025:{
                        if (year == 1989){
                            System.out.println(earth);
                        }else if (year == 2001){
                            System.out.println(iron);
                        }else if (year == 2013){
                            System.out.println(water);
                        }else if (year == 2025){
                            System.out.println(trees);
                        }
                        System.out.println(snake);
                        break;
                    }
                    case 1990:case 2002:case 2014:case 2026:{
                        if (year == 1990){
                            System.out.println(iron);
                        }else if (year == 2002){
                            System.out.println(water);
                        }else if (year == 2014){
                            System.out.println(trees);
                        }else if (year == 2026){
                            System.out.println(fire);
                        }
                        System.out.println(horse);
                        break;
                    }
                    case 1991:case 2003:case 2015:case 2027:{
                        if (year == 1991){
                            System.out.println(iron);
                        }else if (year == 2003){
                            System.out.println(water);
                        }else if (year == 2015){
                            System.out.println(trees);
                        }else if (year == 2027){
                            System.out.println(fire);
                        }
                        System.out.println(sheep);
                        break;
                    }
                    case 1992:case 2004:case 2016:case 2028:{
                        if (year == 1992){
                            System.out.println(water);
                        }else if (year == 2004){
                            System.out.println(trees);
                        }else if (year == 2016){
                            System.out.println(fire);
                        }else if (year == 2028){
                            System.out.println(earth);
                        }
                        System.out.println(monkey);
                        break;
                    }
                    case 1993:case 2005:case 2017:case 2029:{
                        if (year == 1993){
                            System.out.println(water);
                        }else if (year == 2005){
                            System.out.println(trees);
                        }else if (year == 2017){
                            System.out.println(fire);
                        }else if (year == 2029){
                            System.out.println(earth);
                        }
                        System.out.println(rooster);
                        break;
                    }
                    case 1994:case 2006:case 2018:case 2030:{
                        if (year == 1994){
                            System.out.println(trees);
                        }else if (year == 2006){
                            System.out.println(fire);
                        }else if (year == 2018){
                            System.out.println(earth);
                        }else if (year == 2030){
                            System.out.println(iron);
                        }
                        System.out.println(dog);
                        break;
                    }
                    case 1995:case 2007:case 2019:case 2031:{
                        if (year == 1995){
                            System.out.println(trees);
                        }else if (year == 2007){
                            System.out.println(fire);
                        }else if (year == 2019){
                            System.out.println(earth);
                        }else if (year == 2031){
                            System.out.println(iron);
                        }
                        System.out.println(pig);
                    }
            }*/



    }

}


