public class Code {
    public static int getLastPos(String word, String ch) {
        return word.lastIndexOf(ch);
    }

    public static String nameInverter(String name) {
        if (name == null || name.equals("")) {
            return name;
        }

        name = name.replaceAll("\\s+", " ").trim();
        if (name.indexOf(" ") < 0) {
            return name;
        }

        int lastSpacePos = getLastPos(name, " ");
        String firstName = name.substring(0, lastSpacePos).trim();

        int firstNameLastSpacePos = getLastPos(firstName, " ");
        String title = "";
        if (firstNameLastSpacePos > -1) {
            String firstNameCpy = firstName.substring(firstNameLastSpacePos).trim();
            title = firstName.substring(0, firstNameLastSpacePos);
            firstName = firstNameCpy;
        }

        String lastName = name.substring(lastSpacePos).trim();

        String cName = lastName + ", " + firstName + " " + title;
        return cName;
    }

    public static void main(String args[]) {
        String name = "FirstName  LastName ";
        String name2 = "";
        String name3 = null;
        String name4 = "  singleWord  ";
        String name5 = "Mr. FirstName    LastName";
        String name6 = "Mr.     Phd.  FirstName LastName";

//        System.out.println(nameInverter(name));
//        System.out.println(nameInverter(name2));
//        System.out.println(nameInverter(name3));
//        System.out.println(nameInverter(name4));
//        System.out.println(nameInverter(name5));
//        System.out.println(nameInverter(name6));
    }
}
