package Garden;

public class Garden{

    Plant plant1;
    Plant plant2;
    Plant plant3;

    String getDescription(){

        return "Ogród:\n"+
                   plant1.getDescription() +"\n"
                 + plant2.getDescription() +"\n"
                 + plant3.getDescription() +"\n" ;
    }



}

