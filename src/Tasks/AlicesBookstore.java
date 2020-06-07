package Tasks;

public class AlicesBookstore {

    // Java used in real life :)

    // Alice is opening a bookstore and wants to create a tracking system.
    // She will sell kids books, recipe books, novels and comics.
    // She has 10 of them each.
    // She wants to calculate how many books are left after each transaction.

    /** task 1: create 4 static int variables for each book type and equal it to 10 **/
            static int kidsbook=10;
            static int novels =10;
            static int recipes=10;
            static int comics=10;

            // variable kids
            // variable recipe
            // variable novels
            // variable comics


    /** task 2: create 4 methods named soldKids, soldRecipe, soldNovels, and soldComics.
    // for each method, have a parameter of int soldNum and subtract that number from the corresponding book count.
    // print "kids books left: ...", have void return type, have an int parameter as int soldNum **/
        public static void soldKids(int soldNum){
            kidsbook-=soldNum;
            System.out.println("Kids book left: "+kidsbook);
            if(kidsbook>=7) System.out.println("You are fine");
            else if(kidsbook>=4&&kidsbook<7) System.out.println("state the book as best seller");
            else if(kidsbook<4&&kidsbook>=1) System.out.println("order more");
            else System.out.println("pre-sold... ship later");

        }
        public static void soldNovels(int soldNum){
       novels-=soldNum;
        System.out.println("Novels book left: "+ novels);
            if(novels >=7) System.out.println("You are fine");
            else if(novels >=4&& novels <7) System.out.println("state the book as best seller");
            else if(novels <4&& novels >=1) System.out.println("order more");
            else System.out.println("pre-sold... ship later");
    }
        public static void soldRecipe(int soldNum){
        recipes-=soldNum;
        System.out.println("Recipes book left: "+recipes);
            if(recipes>=7) System.out.println("You are fine");
            else if(recipes>=4&&recipes<7) System.out.println("state the book as best seller");
            else if(recipes<4&&recipes>=1) System.out.println("order more");
            else System.out.println("pre-sold... ship later");
    }
        public static void soldComics(int soldNum){
        comics-=soldNum;
        System.out.println("Comics book left: "+comics);
            if(comics>=7) System.out.println("You are fine");
            else if(comics>=4&&comics<7) System.out.println("state the book as best seller");
            else if(comics<4&&comics>=1) System.out.println("order more");
            else System.out.println("pre-sold... ship later");
    }


            // method 1: soldKids
            // method 2: soldRecipe
            // method 3: soldNovels
            // method 4: soldComics


    /** go to AliceBookStoreTransaction class for task 3 and a bonus tasks **/

}
