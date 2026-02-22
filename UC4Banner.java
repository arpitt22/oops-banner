public class UC4Banner {

    public static void main(String[] args) {
        printBanner();
    }

    public static void printBanner() {

        String[] banner = {
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
                "*        WELCOME        *",
                "*      TO JAVA UC4      *",
                "*   Modular Banner Code *",
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
