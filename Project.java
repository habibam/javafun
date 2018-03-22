class Project {
    private String name;
    private String description;

    public void Project()
    {

    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void Project (String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public String getIntroduction ()
    {
        return "my name is"+" "+ name + " " + "the description is " + description;

    }
    public String elevatorPitch () {
        return name + " : " + description;
    }

}