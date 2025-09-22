import java.util.Scanner;
public class PlayerSelection{
    public static void main (String[] args){
        System.out.println("Enter the following (Name, Age, Height(in meters), Weight(in pounds), and Jersey number)");
        Scanner input= new Scanner(System.in);
        
        System.out.println("Player Name:");
        String PlayerName = input.next();

        System.out.println("Age:");
        int age = input.nextInt();

        System.out.println("Height(m):");
        float height = input.nextFloat();

        System.out.println("Weight(lbs):");
        float weight = input.nextFloat();

        System.out.println("Jersey Number:");
        int jerseyNumber = input.nextInt();
        
        Double Pound_to_kg = 0.45359237;
        int meter_to_centimeters = 100;
        
        Double newweight= Pound_to_kg * weight;
        float newheight= meter_to_centimeters * height;
        
        Double weightinkg = newweight;
        int heightincm =(int)newheight;
        
        System.out.println("Player name-"+PlayerName);
        System.out.println("Age-" +age);
        System.out.println("Height(m)" +heightincm);
        System.out.println("Weight(lbs)" +weightinkg);
        System.out.println("Jersey Number-" +jerseyNumber);   
        int newAge= age+1;
        int newNumber=jerseyNumber-1;
        //System.out.println("A penalty was taken");
        //System.out.println("New Age:" +newAge);
        //System.out.println("New Jersey number:" +newNumber);
        String category = "";
        if (age <20) {
            category = "Rising Star";
        }
        else if (age<=20 && age<=30){
             category = "Prime player";
        }
        else {
             category ="Veteran";
        }
        System.out.println("Category = " +category);
        String position="";
        switch(jerseyNumber){
        case 1: 
        position = ("Goalkeeper");
        break;

        case 2,3: 
        position = ("Fullback");
        break;

        case 4,5: 
        position = ("Centre-back");
        break;

        case 6: 
        position = ("Defensive Midfeilder");
        break;
        
        case 8: 
        position = ("Central Midfeilder");
        break;

        case 10: 
        position = ("Attacking Midfeilder");
        break;

        case 7,11,20: 
        position = ("Winger");
        break;

        case 9: 
        position = ("Striker");
        break;

        default:
        System.out.println("Player");
        }
        if (position.equals("Attacking Midfeilder")){
            System.out.println("Yes");
        }
        else {
        System.out.println("No");
        }
        String finalLineup;
        if (category.equals ("Prime player")){
        
        if (weightinkg<80){
                finalLineup = ("Starting Lineup");
        }
            else{
                finalLineup=("Benched");
            }
        }
        else{
            finalLineup=("Benched");
        }
        String Final =( age<=18 && age<=35 && weightinkg<=90)? "Yes":"No";
        System.out.println("Final decision- " +Final);
    }
}