package carsclass;


public class Dogs {

    private String name;
    private int age;
    private String breed;
    
    public Dogs()
    {
        name = "unknown";
        this.breed = "mongrel";
    }

    public Dogs(String n, int age, String breed){
        //doesnt need to be this. if they arent the same. if they are the same variable name as the argument this. will fix this
        n = name;
        this.age = age;
        this.breed = breed;
        
        
    }
    public String getName(String n){
        return this.name;
    }
    public int getAge(int age){
        return this.age;
    }
    public String getBreed(String breed){
        return this.breed = breed;
    }
    
    public void setName(String n){
        this.name = n;
    }
    public boolean setAge(int age){
        boolean done = false;
        if (age>0){
            done = true;
            this.age = age;
        }
        return done;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    
    public void incAge(int a){
        this.age = this.age + a;
    }
}
