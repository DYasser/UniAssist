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
