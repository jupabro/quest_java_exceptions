import java.util.ArrayList;

public class OddSum {

    public static void main(String[] args) {
       try {
            int result = run(args, false);
            System.out.println("Sum of odd elements : " + result);
        } catch (NumberFormatException e) {
            System.err.println("Error: One or more input values is not a valid integer.");
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
        System.out.println("END!");
    }

    public static int run(String[] args, boolean test) {

        ArrayList<Integer> listInt = new ArrayList<>();
        
        if (!test) {
            System.out.println("Elements' list :");
            for (String v : args)
                System.out.print(" " + v);
            System.out.println();
        }
        for (int i = 0; i < args.length; i++) {
            listInt.add(Integer.parseInt(args[i]));
        }

        return = sum(listInt);
    }

    public static int sum(ArrayList<Integer> listInt) {

        int result = 0;
        for (int value : listInt) {
            if (value % 2 != 0) {
                result += value;
            }
        }
        return result;
    }
}
