package lb5;

public class Students
implements Comparable<Students>{
    private
    String Name;
    String Surname;
    String Po_batkovi;
    String Faculty;
    String Dateofbirth;
    String Number;
    String Address;
    double Bursary;
    int Number_of_membership;
    public Students(String Name, String Surname, String Po_batkovi,String Faculty,String Dateofbirth,String Number, String Address,double Bursary,int Number_of_membership) {
        this.Name = Name;
        this.Surname = Surname;
        this.Po_batkovi = Po_batkovi;
        this.Faculty = Faculty;
        this.Dateofbirth = Dateofbirth;
        this.Number = Number;
        this.Address = Address;
        this.Bursary = Bursary;
        this.Number_of_membership = Number_of_membership;

    }

    @Override
    public int compareTo(Students o) {
        return 0;
    }

    public void setName(String name) {
    }
}
