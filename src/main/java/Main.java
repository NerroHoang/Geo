
import check.Menu;
import java.util.ArrayList;
import newpackage.Country;
import validation.ManageEastAsiaCountries;


public class Main {
    public static void main(String[] args) {
        ArrayList<Country> lc = new ArrayList<>();
        //loop until user want to exist
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    ManageEastAsiaCountries.inputCountry(lc);
                    break;
                case 2:
                    ManageEastAsiaCountries.printCountry(lc);
                    break;
                case 3:
                    ManageEastAsiaCountries.searchByName(lc);
                    break;
                case 4:
                    ManageEastAsiaCountries.printCountrySorted(lc);
                    break;
                case 5:
                    return;
            }
        }
    }
}
