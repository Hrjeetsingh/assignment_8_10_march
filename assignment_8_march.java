/*1.) Revise Java Internals
- Difference between JDK, JRE and JVM

JVM ------------------->
JVM (Java Virtual Machine) is an abstract machine. It is called a virtual machine because it doesn't
physically exist. It is a specification that provides a runtime environment in which Java bytecode 
can be executed. It can also run those programs which are written in other languages and compiled 
to Java bytecode.
JVMs are available for many hardware and software platforms. JVM, JRE, and JDK are platform 
dependent because the configuration of each OS is different from each other. However, 
Java is platform independent. There are three notions of the JVM: specification, implementation, and instance.
The JVM performs the following main tasks:

Loads code
Verifies code
Executes code
Provides runtime environment

JRE--------------------------->

JRE is an acronym for Java Runtime Environment. It is also written as Java RTE. 
The Java Runtime Environment is a set of software tools which are used for developing Java applications. 
It is used to provide the runtime environment. It is the implementation of JVM. It physically exists. 
It contains a set of libraries + other files that JVM uses at runtime.

JDK------------------------->

JDK is an acronym for Java Development Kit. The Java Development Kit (JDK) is a software development environment which is used to develop Java applications and applets. It physically exists. It contains JRE + development tools.

JDK is an implementation of any one of the below given Java Platforms released by Oracle Corporation:

Standard Edition Java Platform
Enterprise Edition Java Platform
Micro Edition Java Platform
The JDK contains a private Java Virtual Machine (JVM) and a few other resources such as an interpreter/loader (java), a compiler (javac), an archiver (jar), a documentation generator (Javadoc), etc. to complete the development of a Java Application.


- What is bytecode?

Java bytecode is the instruction set for the Java Virtual Machine. 
It acts similar to an assembler which is an alias representation of a C++ code. 
As soon as a java program is compiled, java bytecode is generated. In more apt terms, 
java bytecode is the machine code in the form of a .class file. With the help of java 
bytecode we achieve platform independence in java.


- What makes Java platform independent?

In the case of Java, it is the magic of Bytecode that makes it platform independent.
This adds to an important feature in the JAVA language termed as portability. Every 
system has its own JVM which gets installed automatically when the jdk software is installed.
For every operating system separate JVM is available which is capable to read the .class file or byte code.
An important point to be noted is that while JAVA is platform-independent language, 
the JVM is platform-dependent. Different JVM is designed for different OS and byte code is able to run on different OS.
The meaning of platform-independent is that the java compiled code(byte code) can run on all operating systems.
A program is written in a language that is a human-readable language. It may contain words, 
phrases, etc which the machine does not understand. For the source code to be understood by the machine,
it needs to be in a language understood by machines, typically a machine-level language. 
So, here comes the role of a compiler. The compiler converts the high-level language (human language) into a format understood by the machines. 
Therefore, a compiler is a program that translates the source code for another program from a programming language into executable code.

source code---> java compiler---->bytecode----->bytecode compilar------> machine code                                           
                                            |
                                            |
                                            |
                                    java interpreter



- Class loader functionalities


Java ClassLoader is an abstract class. It belongs to a java.lang package. It loads classes from different resources. 
Java ClassLoader is used to load the classes at run time. In other words, JVM performs the linking process at runtime. 
Classes are loaded into the JVM according to need. If a loaded class depends on another class, 
that class is loaded as well. When we request to load a class, it delegates the class to its parent. 
In this way, uniqueness is maintained in the runtime environment. It is essential to execute a Java program.

java ClassLoader is based on three principles: Delegation, Visibility, and Uniqueness.

Delegation principle: It forwards the request for class loading to parent class loader. It only loads the class if the parent does not find or load the class.
Visibility principle: It allows child class loader to see all the classes loaded by parent ClassLoader. But the parent class loader cannot see classes loaded by the child class loader.
Uniqueness principle: It allows to load a class once. It is achieved by delegation principle. It ensures that child ClassLoader doesn't reload the class, which is already loaded by the parent.
*/

//2.) Perform product of 2 Matrix class objects.

class ProdMatrix{    
    public static void main(String[] args) {    
        int row1, col1, row2, col2;    
     
        int a[][] = {{1, 3, 2},{3, 1, 1},{1, 2, 2}};     
        int b[][] = {{2, 1, 1},{1, 0, 1},{1, 3, 1}};    
        
        row1 = a.length;    
        col1 = a[0].length;      
    
        row2 = b.length;    
        col2 = b[0].length;     
        if(col1 != row2){    
            System.out.println("Matrices cannot be multiplied");    
        }    
        else{    
          
            int prod[][] = new int[row1][col2];    
                
               
            for(int i = 0; i < row1; i++){    
                for(int j = 0; j < col2; j++){    
                    for(int k = 0; k < row2; k++){    
                       prod[i][j] = prod[i][j] + a[i][k] * b[k][j];     
                    }    
                }    
            }    
                
            System.out.println("Product of two matrices: ");    
            for(int i = 0; i < row1; i++){    
                for(int j = 0; j < col2; j++){    
                   System.out.print(prod[i][j] + " ");    
                }    
                System.out.println();    
            }    
        }    
    }    
}    

//3.) Find transpose of Matrix Object

class Transpose_matrix {
   public static void main(String args[])
   {
      int m, n, c,d;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter the number of rows and columns of matrix");
      m = in.nextInt();
      n = in.nextInt();
 
      int first[][] = new int[m][n];
 
      System.out.println("Enter the elements of matrix");
 
      for (  c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
         {
            System.out.print(c+""+d+" Element : ");
            first[c][d] = in.nextInt();
         }
 
     int transpose[][] = new int[n][m];
 
      for ( c = 0 ; c < m ; c++ )
      {
         for ( d = 0 ; d < n ; d++ )               
            transpose[d][c] = first[c][d];
      }
 
      System.out.println("Transpose of entered matrix:-");
 
      for ( c = 0 ; c < n ; c++ )
      {
         for ( d = 0 ; d < m ; d++ )
               System.out.print(transpose[c][d]+"\t");
 
         System.out.print("\n");
      }
   }
}
