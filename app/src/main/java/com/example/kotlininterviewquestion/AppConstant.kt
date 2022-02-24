package com.example.kotlininterviewquestion

import android.content.SharedPreferences
import android.util.Log



class AppConstant {


    lateinit var sharedPrefGlobal: SharedPreferences
    var INTERVIEW_FLAG = "ENGLISH_FLAG"
    fun gagan(): ArrayList<InterviewModel> {


           var arraylist = ArrayList<InterviewModel>()

            arraylist.add(
                InterviewModel(

                    1,
                    "How does Kotlin work on Android?",
                    "Just like Java, the Kotlin code is also compiled into the Java bytecode and is executed at runtime by the Java Virtual Machine i.e. JVM. When a Kotlin file named Main.kt is compiled then it will eventually turn into a class and then the bytecode of the class will be generated. The name of the bytecode file will be MainKt.class and this file will be executed by the JVM.",
                    false,"kotlin"
                )
            )



            arraylist.add(
                InterviewModel(
                    2,
                    "What is the difference between the variable declaration with var and val?",
                    "If you want to declare some mutable(changeable) variable, then you can use var. For the immutable variable, use val i.e. val variables can't be changed once assigned.",
                    false,"kotlin"
                )
            )




            arraylist.add(
                InterviewModel(
                    3,
                    "Can we use primitive types such as int, double, float in Kotlin?",
                    "In Kotlin, we can't use primitive types directly. We can use classes like Int, Double, etc. as an object wrapper for primitives. But the compiled bytecode has these primitive types.",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    4,
                    "What is String Interpolation in Kotlin?",
                    "If you want to use some variable or perform some operation inside a string then String Interpolation can be used. You can use the \$ sign to use some variable in the string or can perform some operation in between {} sign.",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    5,
                    "What do you mean by destructuring in Kotlin?",
                    "Destructuring is a convenient way of extracting multiple values from data stored in(possibly nested) objects and Arrays. It can be used in locations that receive data (such as the left-hand side of an assignment). Sometimes it is convenient to destructure an object into a number of variables",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    6,
                    "When to use the lateinit keyword in Kotlin?",
                    "lateinit is late initialization.",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    7,
                    "How to check if a lateinit variable has been initialized or not?",
                    "You can check if the lateinit variable has been initialized or not before using it with the help of isInitialized method. This method will return true if the lateinit property has been initialized otherwise it will return false.",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    8,
                    "What is the difference between lateinit and lazy in Kotlin?",
                    "lazy can only be used for val properties, whereas lateinit can only be applied to var because it can’t be compiled to a final field, thus no immutability can be guaranteed.",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    9,
                    "Is there any difference between == operator and === operator?",
                    "Yes. The == operator is used to compare the values stored in variables and the === operator is used to check if the reference of the variables are equal or not. But in the case of primitive types, the === operator also checks for the value and not reference.",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    10,
                    "What is the forEach in Kotlin?",
                    "In Kotlin, to use the functionality of a for-each loop just like in Java, we use a forEach function.",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    11,
                    "What are companion objects in Kotlin?",
                    "In Kotlin, if you want to write a function or any member of the class that can be called without having the instance of the class then you can write the same as a member of a companion object inside the class.",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    12,
                    "What is the difference between List and Array types in Kotlin?",
                    "If you have a list of data that is having a fixed size, then you can use an Array. But if the size of the list can vary, then we have to use a mutable list.",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    13,
                    "Can we use the new keyword to instantiate a class object in Kotlin? ",
                    "No, in Kotlin we don't have to use the new keyword to instantiate a class object. To instantiate a class object",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    14,
                    "How to create a Singleton class in Kotlin?",
                    "A singleton class is a class that is defined in such a way that only one instance of the class can be created and is used where we need only one instance of the class like in logging, database connections, etc.",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    15,
                    "What are init blocks in Kotlin?",
                    "init blocks are initializer blocks that are executed just after the execution of the primary constructor. A class file can have one or more init blocks that will be executed in series. If you want to perform some operation in the primary constructor, then it is not possible in Kotlin, for that, you need to use the init block.",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    16,
                    "What are the types of constructors in Kotlin?",
                    "Primary constructor: These constructors are defined in the class header and you can't perform some operation in it, unlike Java's constructor.\n" +
                            "Secondary constructor: These constructors are declared inside the class body by using the constructor keyword. You must call the primary constructor from the secondary constructor explicitly. Also, the property of the class can’t be declared inside the secondary constructor. There can be more than one secondary constructors in Kotlin.",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    17,
                    "What is the default type of argument used in a constructor?",
                    "By default, the type of arguments of a constructor in val. But you can change it to var explicitly.",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    18,
                    "What are Coroutines in Kotlin?",
                    "A framework to manage concurrency in a more performant and simple way with its lightweight thread which is written on top of the actual threading framework to get the most out of it by taking the advantage of cooperative nature of functions.",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    19,
                    "What is suspend function in Kotlin Coroutines?",
                    "Suspend function is the building block of the Coroutines in Kotlin. Suspend function is a function that could be started, paused, and resume. To use a suspend function, we need to use the suspend keyword in our normal function definition.",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    20,
                    " What is the difference between Launch and Async in Kotlin Coroutines?",
                    "The difference is that the launch{} does not return anything and the async{} returns an instance of Deferred<T>, which has an await() function that returns the result of the coroutine like we have future in Java in which we do future.get() to the get the result.",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    21,
                    " How to choose between a switch and when in Kotlin?",
                    "Whenever we want to handle many if-else conditions, then we generally use switch-case statements. But Kotlin provides a more concise option i.e. in Kotlin, we can use when in place of the switch",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    22,
                    "What is the open keyword in Kotlin used for",
                    "By default, the classes and functions are final in Kotlin. So, you can't inherit the class or override the functions. To do so, you need to use the open keyword before the class and function. For example:",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    23,
                    "What are lambdas expressions?",
                    "Lambdas expressions are anonymous functions that can be treated as values i.e. we can pass the lambdas expressions as arguments to a function return them, or do any other thing we could do with a normal object",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    24,
                    "What are Higher-Order functions in Kotlin",
                    "A higher-order function is a function that takes functions as parameters or returns a function",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    25,
                    "What are extension functions in Kotlin",
                    "Extension functions are like extensive properties attached to any class in Kotlin. By using extension functions, you can add some methods or functionalities to an existing class even without inheriting the class",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    26,
                    " What is an infix function in Kotlin?",
                    "An infix function is used to call the function without using any bracket or parenthesis.",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    27,
                    "What is an inline function in Kotlin?",
                    "Inline function instruct compiler to insert complete body of the function wherever that function got used in the code. To use an Inline function, all you need to do is just add an inline keyword at the beginning of the function declaration.",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    28,
                    "What is noinline in Kotlin?",
                    "While using an inline function and want to pass some lambda function and not all lambda function as inline, then you can explicitly tell the compiler which lambda it shouldn't inline.",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    29,
                    "What are Reified types in Kotlin?",
                    "When you are using the concept of Generics to pass some class as a parameter to some function and you need to access the type of that class, then you need to use the reified keyword in Kotlin.",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    30,
                    "What is the operator overloading in Kotlin?",
                    "n Kotlin, we can use the same operator to perform various tasks and this is known as operator overloading. To do so, we need to provide a member function or an extension function with a fixed name and operator keyword before the function name because normally also, when we are using some operator then under the hood some function gets called.",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    31,
                    "What are pair and triple in Kotlin? ",
                    "Pair and Triples are used to return two and three values respectively from a function and the returned values can be of the same data type or different.",
                    false,"kotlin"
                )
            )
            arraylist.add(
                InterviewModel(
                    32,
                    "What are labels in Kotlin?",
                    "Any expression written in Kotlin is called a label. For example, if we are having a for-loop in our Kotlin code then we can name that for-loop expression as a label and will use the label name for the for-loop.",
                    false,"kotlin"
                )
            )



            return arraylist

    }

    fun java(): ArrayList<InterviewModel> {
        var arraylist = ArrayList<InterviewModel>()
        arraylist.add(
                InterviewModel(1," Why Java is platform independent?", "Java is called platform independent because of its byte codes which can run on any system irrespective of its underlying operating system.",false,"java"))
        arraylist.add(
                InterviewModel(2,"Why Java is not 100% Object-oriented?", "Java is not 100% Object-oriented because it makes use of eight primitive data types such as boolean, byte, char, int, float, double, long, short which are not objects.",false,"java"))
        arraylist.add(
                InterviewModel(3,"What are wrapper classes in Java?", "Wrapper classes convert the Java primitives into the reference types (objects). Every primitive data type has a class dedicated to it. These are known as wrapper classes because they “wrap” the primitive data type into an object of that class. Refer to the below image which displays different primitive type, wrapper class and constructor argument.",false,"java"))
        arraylist.add(
                InterviewModel(4," What are constructors in Java?", "In Java, constructor refers to a block of code which is used to initialize an object. It must have the same name as that of the class. Also, it has no return type and it is automatically called when an object is created.",false,"java"))
        arraylist.add(
                InterviewModel(5,"What is singleton class in Java and how can we make a class singleton?", "Singleton class is a class whose only one instance can be created at any given time, in one JVM. A class can be made singleton by making its constructor private.",false,"java"))
        arraylist.add(
                InterviewModel(6,"What is the difference between equals() and == in Java?", "Equals() method is defined in Object class in Java and used for checking equality of two objects defined by business logic.\n" +
                        "\n" +
                        "“==” or equality operator in Java is a binary operator provided by Java programming language and used to compare primitives and objects. public boolean equals(Object o) is the method provided by the Object class. The default implementation uses == operator to compare two objects. For example: method can be overridden like String class. equals() method is used to compare the values of two objects.",false,"java"))
        arraylist.add(
                InterviewModel(8," When can you use the super keyword?", "In Java, the super keyword is a reference variable that refers to an immediate parent class object.",false,"java"))
        arraylist.add(
                InterviewModel(9,"Can you call a constructor of a class inside another constructor?", "Yes, we can call a constructor of a class inside another constructor. This is also called as constructor chaining.",false,"java"))
        arraylist.add(
                InterviewModel(10,"Contiguous memory locations are usually used for storing actual values in an array but not in ArrayList. Explain.", "An array generally contains elements of the primitive data types such as int, float, etc. In such cases, the array directly stores these elements at contiguous memory locations. While an ArrayList does not contain primitive data types. An arrayList contains the reference of the objects at different memory locations instead of the object itself. That is why the objects are not stored at contiguous memory locations",
                        false,"java"))
        arraylist.add(
                InterviewModel(11,"How is the creation of a String using new() different from that of a literal? ", "When we create a string using new(), a new object is created. Whereas, if we create a string using the string literal syntax, it may return an already existing object with the same name.",false,"java"))
        arraylist.add(
                InterviewModel(12,"Why is synchronization necessary? Explain with the help of a relevant example.", "Java allows multiple threads to execute. They may be accessing the same variable or object. Synchronization helps to execute threads one after another.\n" +
                        "It is important as it helps to execute all concurrent threads while being in sync. It prevents memory consistency errors due to access to shared memory",false,"java"))
        arraylist.add(
                InterviewModel(13,"Explain the term “Double Brace Initialization” in Java?", "Double Brace Initialization is a Java term that refers to the combination of two independent processes. There are two braces used in this. The first brace creates an anonymous inner class. The second brace is an initialization block. When these both are used together, it is known as Double Brace Initialization. The inner class has a reference to the enclosing outer class, generally using the ‘this’ pointer. It is used to do both creation and initialization in a single statement. It is generally used to initialize collections. It reduces the code and also makes it more readable.",false,"java"))
        arraylist.add(
                InterviewModel(14," Why is it said that the length() method of String class doesn’t return accurate results?", "The length() method of String class doesn’t return accurate results because\n" +
                        "it simply takes into account the number of characters within in the String. In other words, code points outside of the BMP (Basic Multilingual Plane), that is, code points having a value of U+10000 or above, will be ignored." +
                        "\n" +
                        "The reason for this is historical. One of Java’s original goals was to consider all text as Unicode; yet, Unicode did not define code points outside of the BMP at the time. It was too late to modify char by the time Unicode specified such code points.",false,"java"))
        arraylist.add(
                InterviewModel(15,"Why pointers are not used in Java?", "Java doesn’t use pointers because they are unsafe and increases the complexity of the program. Since, Java is known for its simplicity of code, adding the concept of pointers will be contradicting. Moreover, since JVM is responsible for implicit memory allocation, thus in order to avoid direct access to memory by the user,  pointers are discouraged in Java.",false,"java"))
        arraylist.add(
                InterviewModel(16,"What is JIT compiler in Java?", "JIT stands for Just-In-Time compiler in Java. It is a program that helps in converting the Java bytecode into instructions that are sent directly to the processor. By default, the JIT compiler is enabled in Java and is activated whenever a Java method is invoked. The JIT compiler then compiles the bytecode of the invoked method into native machine code, compiling it “just in time” to execute. Once the method has been compiled, the JVM summons the compiled code of that method directly rather than interpreting it. This is why it is often responsible for the performance optimization of Java applications at the run time.",false,"java"))
        arraylist.add(
                InterviewModel(17,"What are access modifiers in Java?", "In Java, access modifiers are special keywords which are used to restrict the access of a class, constructor, data member and method in another class.",false,"java"))
        arraylist.add(
                InterviewModel(18,"Define a Java Class.", "A class in Java is a blueprint which includes all your data.  A class contains fields (variables) and methods to describe the behavior of an object.",false,"java"))
        arraylist.add(
                InterviewModel(19," What is an object in Java and how is it created?", "An object is a real-world entity that has a state and behavior",false,"java"))



        return arraylist
    }


}



