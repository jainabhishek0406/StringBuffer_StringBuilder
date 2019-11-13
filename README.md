# StringBuffer_StringBuilder
StringBuffer &amp; StringBuilder code implementation

String, StringBuffer, & StringBuilder

What is the difference between String and StringBuffer classes?

Why Java Team introduce StringBuffer?

We already know, String class objects are immutable in nature and hence their contents cannot be modified.

In opposite, StringBuffer and StringBuilder both class objects are Mutable.
Mutable means, their contents can be modified.

StringBuffer is synchronized i.e. thread safe. 

It means two threads can't call the methods of StringBuffer simultaneously. StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously.
Note- FYI, all the Wrapper Classes are Immutable.

Program- StringBufferAndBuilder.java

/**
 * @author Abhishek Jain
 *
 * StringBuffer & StringBuilder
 *
 * StringBuffer class objects are Mutable, hence their contents can be modified
 */
 
 
public class StringBufferAndBuilder {

    public static void main(String[] args) {
    
        StringBufferAndBuilder stringBufferAndBuilder = new StringBufferAndBuilder();
        
        stringBufferAndBuilder.stringBufferMutableCheck();
        
        stringBufferAndBuilder.stringBuilderMutableCheck();
    }

    private void stringBufferMutableCheck()
    {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Abhishek");

        System.out.println("stringBuffer hashcode = " + stringBuffer.hashCode());
        System.out.println("stringBuffer value = " + stringBuffer);

        stringBuffer.append("Jain");
        System.out.println("stringBuffer hashcode = " + stringBuffer.hashCode());
        System.out.println("stringBuffer value = " + stringBuffer);

        //please check hashcode reference in both cases, its same.
        //it is clear now, StringBuffer objects are mutable.
    }

    private void stringBuilderMutableCheck()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Abhishek");

        System.out.println("\nstringBuilder hashcode = " + stringBuilder.hashCode());
        System.out.println("stringBuilder value = " + stringBuilder);

        stringBuilder.append("Jain");
        System.out.println("stringBuilder hashcode = " + stringBuilder.hashCode());
        System.out.println("stringBuilder value = " + stringBuilder);

        //please check hashcode reference in both cases, its same.
        //it is clear now, stringBuilder objects are mutable.
    }
}

Output

stringBuffer hashcode = 356573597

stringBuffer value = Abhishek

stringBuffer hashcode = 356573597

stringBuffer value = AbhishekJain

stringBuilder hashcode = 1735600054

stringBuilder value = Abhishek

stringBuilder hashcode = 1735600054

stringBuilder value = AbhishekJain

