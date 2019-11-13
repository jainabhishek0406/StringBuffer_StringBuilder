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
