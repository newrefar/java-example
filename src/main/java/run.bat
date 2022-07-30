rm .\com\imlayo\java\demo\lombok\*.class
javac com/imlayo/java/demo/lombok/Getter*
javac -processor com.imlayo.java.demo.lombok.GetterProcessor com/imlayo/java/demo/lombok/Test.java