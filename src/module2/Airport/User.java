package module2.Airport;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private String fname;
    private String lname;
    private Date birthDate;
    Format formatDate = new SimpleDateFormat("yyyy.MM.dd");

    public User(String fname, String lname, String birthDate) {
        this.fname = fname;
        this.lname = lname;
        setBirthDate(birthDate);
    }

    public void setBirthDate(String str){
        try {
            this.birthDate = (Date) formatDate.parseObject(str);
        } catch(ParseException e) {
            System.out.println("The birth date format is not valid. Date format = yyyy.MM.dd." + e.getStackTrace());
        }
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    @Override
    public String toString() {
        return "User{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    public String displayUsers() {
        return  fname +
                " " +
                lname;
    }
}
