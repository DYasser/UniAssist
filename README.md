# UniAssist DB Project

A system that allows students to create an account that will get stored in a database, and use it to use several options that will help him/her organize his/her university life better.

## Technology used

I used `Java` to code the application and `MySQL` to store important data such as login information. 

## How to run

To get started you can `git clone  https://github.com/DYasser/UniAssist.git` and have `Java` installed and initialized. You can run the file then by running the main class using an IDE.

## Coding process

I started by creating a main class that will regroup all the other classes that are going to be responsible of all the screens such as login screen or sign up screen to name a few.

```java
package main;

public class Main {
    public static LogIn login = new LogIn();
    public static Exam exams = new Exam();
    public static Home home = new Home();
    public static Notes notes = new Notes();
    public static PasswordKeeper passkeep = new PasswordKeeper();
    public static Settings sett = new Settings();
    public static TimeT tt = new TimeT();
    public static AddTbl addT = new AddTbl();
    public static SignInBG signbg = new SignInBG();
    public static SignInPopup signpop = new SignInPopup();
    public static Saved saved = new Saved();
    public static Reseted reseted = new Reseted();
    public static ChangeInfo changeInfo = new ChangeInfo();

    public static void main(String[] args)
    {
        login.show();
    }
}
```
As you can see in the main class we only run one command that makes the program show the user a login screen.

![LoginScreen](https://github.com/DYasser/UniAssist/blob/master/src/main/images/loginscreen.png)

In this screen the user is able to login by entering his/her credentials and clicking on the button to log in. They can also sign up if they haven't already so the program enters their information into the database so they will be able to log in anytime after and the program will still remember them.

![SignupScreen](https://github.com/DYasser/UniAssist/blob/master/src/main/images/signinscreen.png)

In this screen you have basic information with precise instruction to not waste the least amount of time possible.
After signin up, you should be able to login and see this screen.

I also created an option to show the password in case the user isn't sure of what he/she typed.

After signing up and entering the right credentials, the user is then brought to the main menu where he can see all the possible options

![MainMenuScreen](https://github.com/DYasser/UniAssist/blob/master/src/main/images/mainmenuscreen.png)

# Main Options:
- [Notes](https://github.com/DYasser/UniAssist/blob/master/src/main/Notes.java): In this option you can create notes, remove them, check them as 'complete' or modify them.
- [PasswordKeeper](https://github.com/DYasser/UniAssist/blob/master/src/main/PasswordKeeper.java): You are able to store the passwords you want to keep safe outside of all the website that remember all of your information.
- [TimeTable](https://github.com/DYasser/UniAssist/blob/master/src/main/TimeT.java): You can set your timetable to be able to see clearly what courses you have throughout the week, with professors' name, class name, credits and even how much weeks.
- [Exams](https://github.com/DYasser/UniAssist/blob/master/src/main/Exam.java): You are able to store the exams you passed and if you failed or not the course, specifying how much credit it is.
- [Settings](https://github.com/DYasser/UniAssist/blob/master/src/main/Settings.java): In this option you are able to reset all options stated before, change account information and even learn more about the project.

The user is able to use all these options, quit the program, re-run it, and still have all his/her data saved without any problem since I used `MySQL` to store all the data for each user.

>     This is the end of my documentation
