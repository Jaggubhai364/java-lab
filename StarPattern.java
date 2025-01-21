
public  class StarPattern {
        public static void main(String[] args){
            for (int i = 0; i <= 7; i++) {
                            System.out.print("*"); // Print the first star
                            for (int j = 2; j <= i; j++) {
                                if (i % 2 != 0) {
                                    System.out.print("*"); // Print star for odd rows
                                } else {
                                    System.out.print(" "); // Print space for even rows
                                }
                            }
                            System.out.println(); // Move to the next line
                        }
        }
}
