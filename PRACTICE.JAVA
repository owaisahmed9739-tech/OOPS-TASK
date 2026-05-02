  Public class prctset5 {
    public static void main(String[] args) {

        //PROGRAM FOR STAR PATTERN:
        Scanner sc = new Scanner(System.in);
        int n = 5;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {

            }
            System.out.print("*");
        }
        
        // PROGRAM FOR CHECKING USER IS VALID OR NOT?
        System.out.println("ENTER PASSWORD");
        int password = 1234;
        int userpassword = sc.nextInt();
        while (password != userpassword) {
            System.out.println("try again");
            userpassword = sc.nextInt();
        }
        System.out.println("access granted");

//PROGRAM FOR CHECKING TRIANGLE IS VALID PR NOT:
        int a, c;
        System.out.print("A:");
        a = sc.nextInt();
        System.out.print("b:");
        b = sc.nextInt();
        System.out.print("c:");
        c = sc.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("VALID TRIANGLE");
        } else {
            System.out.println("NOT VALID");


