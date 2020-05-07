
/**
 * This is a lesson on block structure in java
 *
 * @author Jason Martinez
 * @version 1.0
 * @since April 18, 2020
 */

public class BlocksLesson
{
    private int age;
    private String name;
    
    public BlocksLesson() {
        // this is inside a block "{ <...> }"
        // a block can have as many instructions as you want, even 0;
        //this block has 0 instructions/lines of execution
    }
    
    {
        age = 5;
        // this block has one line of execution, assigning the int value of 5 to age
        // notice this block does not have a method or any kind of identifier,
        //      this is perfectly legal
    }
    
    // setters
    public void setAge(int agePassedIn) {
        this.age = agePassedIn;
        System.out.println("Set age to " + this.age);
        // this block has two lines of execution
    }
    
    public void setName(String name) {
        this.name = name;
        System.out.println("Set name to " + this.name);
    }
    
    // getters    
    public int getAge() {
        return this.age;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void whoCanSeeMe(String myStr) {
        // begining of method block
        System.out.println(myStr + "\nat function block, aka outside block");
        {
            // this block can still see "myStr", myStr is still in scope
            System.out.println(myStr + "\nat nested block level 1");
            {
                // this block can still see myStr, myStr is still in scope
                System.out.println(myStr + "\nat nested block level 2");
                {
                    // this block can still see myStr, myStr is still in scope
                    System.out.println(myStr + "\nat nested block level 3");
                    // and you can go down any number of levels in a block
                    {
                        System.out.println(myStr + "\nat nested block level 4");
                        {
                            System.out.println(myStr + "\nat nested block level 5");
                            {
                                System.out.println(myStr + "\nat nested block level 6");
                                {
                                    // this block can still see myStr, myStr is still in scope
                                    System.out.println(myStr + "\nat nested block level 7");
                                    // all instructions in this block will run before exiting block
                                    // you can access values of a containing block, they are in the scope of the block
                                }
                                // all instructions in this block will run before exiting block, and so on ...
                                // this block can still see myStr, myStr is still in scope
                                System.out.println(myStr + "\nat nested block level 6");
                            }
                            // this block can still see myStr, myStr is still in scope
                            System.out.println(myStr + "\nat nested block level 5");
                        }
                        System.out.println(myStr + "\nat nested block level 4");
                    }
                    System.out.println(myStr + "\nat nested block level 3");
                }
                System.out.println(myStr + "\nat nested block level 2");
            }
            // this block can still see myStr, myStr is still in scope
                System.out.println(myStr + "\nat nested block level 1");
        }
        // this block can still see myStr, myStr is still in scope
        System.out.println(myStr + "\nat nested block method level");
    }
    
    public void whoCanGetOut() {
        // block 1
        {
            // block 2
            {
                // block 3
                {
                    // block 4
                    int nestedBlockInt = 75;
                    System.out.println("nestedBlockInt = " + nestedBlockInt);
                }
                // this block is outside of block 4, so it cannot see "nestedBlockInt", it is out of scope
            }
            // this block is outside of block 4, so it cannot see "nestedBlockInt", it is out of scope
        }
        // this block is outside of block 4, so it cannot see "nestedBlockInt", it is out of scope
        // once a block finishes all of the data THAT WAS CREATED INSIDED OF THE BLOCK is removed from memory, so you can no longer access it
    }    
    
    public void watchMeAge() {        
        // you can have blocks withing blocks
        for (int i = 0; i < age; i++) {
            System.out.println("Happy Birfday, I am " + i + " years old today");
            int decade = i/10;
            switch (decade) {
                // this is a block inside of a block inside of another block
                // a block inside of a block is called a "nested block"
                // this block is nested four layers deep
                //      BlocksLesson -> watchMeAge -> for loop -> switch
                case 0:
                    System.out.println("Hurray, I am still a kid!");
                    break;
                case 1: 
                    System.out.println("So I'm a teenager, whatevs...");
                    break;
                case 2:
                    System.out.println("I have so many hopes and ideas, I am gonna change the world!");
                    break;
                case 3:
                    System.out.println("I don't have time to change the world! I gotta work on myself.");
                    break;
                case 4:
                    System.out.println("Where did my life go");
                    break;
                case 5:
                    System.out.println("I guess I should just buck up, looks like I still got a while to go");
                    break;
                case 6:
                    System.out.println("I am in my golden years");
                    break;
                default:
                    System.out.println("Huh, what did you say, I can't hear you, where am I");
                    break;
            }
            System.out.println("exited switch statement\n");
        }
        System.out.println("exited for loop\n");
    }
}
