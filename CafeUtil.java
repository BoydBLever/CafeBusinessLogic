public class CafeUtil {
    // Inputs: no parameters
    // Return Type: integer
    // Output: (should be) 55
    public int getStreakGoal() {
        // Cafe Java wants to implement a reward system for customers who always buy
        // more drinks than they did the week before.
        // write a method that sums together every consecutive integer from 1 to 10 and
        // returns the sum.
        int num = 1;
        int sum = 0;
        while (num <= 10) {
            sum = sum + num;
            num++;
        }
        return sum;
    }
    // Ninja Bonus: Add a parameter, numWeeks so that an admin can change the number
    // from 10 to whatever they want.

    // **public double getOrderTotal(double[] prices)
    // Given an array of item prices from an order, sum all of the prices in the
    // array and return the total.
    // **void displayMenu(ArrayList<String> menuItems)
    // Given an ArrayList of menu items (strings), print out each index and menu
    // item.
    // Sample output given an ArrayList with the items "drip coffee", "cappuccino",
    // "latte" and "mocha"
    // 0 drip coffee
    // 1 cappuccino
    // 2 latte
    // 3 mocha
    // Re-cap of ArrayList Syntax:
    // String name = myArray.get(0); // to access an element in an ArrayList using
    // an index
    // **public addCustomer(ArrayList<String> customers)
    // Inside this method:
    // 1. Print this string to the console: "Please enter your name:"
    // 2. Then add this line of code to get user input from the terminal and store
    // it in the variable userName:
    // String userName = System.console().readLine();
    // 3. Next print the userName to the console, saying "Hello, [username here]!"
    // 4. Next print "There are ___ people in front of you" using the number for how
    // many people are ahead of them (how many items already in the array)
    // 5. Then, add the customer's name to the given custoners list. And print the
    // list.
    // 6. No need to return anything.
    // Re-cap of ArrayList Syntax:
    // myArray.add("Heidi"); // to add an item to an ArrayList

}
