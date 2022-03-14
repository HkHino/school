import java.util.Scanner;

public class AdventureTime
{
    private String playerName;

    Scanner input = new Scanner(System.in);
public void intro()
{
    System.out.println("Welcome to the AMAZING GAME OF ADVENTURETIME!");
}

void nameOfPlayer()
{
    System.out.println("What is your name brave adventure?");
    playerName = input.nextLine();
}


public void lookAround()
{
    //todo insert description of environment
    System.out.println("description");
}

public void goNorth()
{
    if(currentRoom.matches(1,2,3)&& input == goNorth)
    {
        System.out.println("you encounter an unclimbable mountain side and are unable to go this way");

    }
    else
    {
        //insert room
    }
}
    public void goSouth()
    {
        if(currentRoom.matches(7,8,9))
        {
            System.out.println("you encounter an unending sea side and are unable to go this way");
        }
        else
        {
            //insert room
        }
    }
    public void goEast()
    {
        if(currentRoom.matches(3,6,9))
        {
            System.out.println("you encounter an uncrossable dessert side and are unable to go this way");
        }
        else
        {
            //insert room
        }
    }
    public void goWest()
    {
        if(currentRoom.matches(1,4,7))
        {
            System.out.println("you encounter an unscalable chasm side and are unable to go this way");
        }
        else
        {
            //insert room
        }
    }


}
