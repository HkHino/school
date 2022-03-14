public class Room {
    //attributes
    private String currentRoom;
    private String descriptionOfRoom;
    private String direction1 = "North";
    private String direction2 = "South";
    private String direction3 = "East";
    private String direction4 = "West";

    //constructor
    public void Room(String name, String descriptionOfRoom)
    {
    setcurrentRoom(name);
    setdescriptionOfRoom(descriptionOfRoom);
    }

    //getters and setters

    public void setcurrentRoom(String currentRoom)
    {
        this.currentRoom = currentRoom;
    }
    String getCurrentRoom()
    {
        return currentRoom;
    }
    public void setDescriptionOfRoom(String descriptionOfRoom)
    {
        this.descriptionOfRoom = descriptionOfRoom;
    }
    public String setdescriptionOfRoom(String descriptionOfRoom)
    {
        return descriptionOfRoom;
    }

    public void setDirection1(String direction1) {
        this.direction1 = direction1;
    }

    public String getDirection1()
    {
        return direction1;
    }

    public void setDirection2(String direction2) {
        this.direction2 = direction2;
    }

    public String getDirection2()
    {
        return direction2;
    }

    public void setDirection3(String direction3) {
        this.direction3 = direction3;
    }

    public String getDirection3()
    {
        return direction3;
    }

    public void setDirection4(String direction4)
    {
        this.direction4 = direction4;
    }

    public String getDirection4()
    {
        return direction4;
    }

    @Override
    public String toString()
    {
        return "Room{" +
                "currentRoom='" + currentRoom + '\'' +
                ", descriptionOfRoom='" + descriptionOfRoom + '\'' +
                ", direction1='" + direction1 + '\'' +
                ", direction2='" + direction2 + '\'' +
                ", direction3='" + direction3 + '\'' +
                ", direction4='" + direction4 + '\'' +
                '}';
    }
}
