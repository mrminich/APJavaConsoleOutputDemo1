// John Doe    this is an inline comment because only the line is commented-out

public class ConsoleOutputDemo1
{
    /*
    This is a block comment.
                                   Everything between the
                                   commment markers is commented-out.
    */
    
    /** 
    
     This is a javadoc comment because it begins with /** instead of /*

     */

    public static void main(String[] args)
    {
        System.out.println("Alice");
        System.out.println("Bob");
        System.out.println("Cathy");
        System.out.println("////////////////////////////");
        System.out.print("Alice");
        System.out.print("Bob");
        System.out.println("Cathy");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("Alice");
        System.out.println();
        System.out.println("Bob");
        System.out.println();
        System.out.println("Cathy");
        System.out.println("\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
        System.out.print("Alice");
        System.out.print(" ");
        System.out.print("Bob");
        System.out.print(" ");
        System.out.print("Cathy");
        System.out.println("\n\n\n");
        System.out.println(3);          // 3
        System.out.println("3");        // 3
        System.out.println(3 + 4);      // 7
        System.out.println("3 + 4");    // 3 + 4

    }
}

/*
 * 
 * 
Alice
Bob
Cathy
////////////////////////////
AliceBobCathy
\\\\\\\\\\\\\\
Alice

Bob

Cathy
"""""""""""""""""""""
Alice Bob Cathy



3
3
7
3 + 4


*/
