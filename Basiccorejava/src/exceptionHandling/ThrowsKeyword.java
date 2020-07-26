/*
 * package exceptionHandling;
 * 
 * import java.io.FileInputStream; import java.io.FileNotFoundException;
 * 
 * public class ThrowsKeyword {
 * 
 * public static void main(String[] args) throws InterruptedException,
 * FileNotFoundException {
 * 
 * test();
 * 
 * test2();
 * 
 * test3();
 * 
 * test4();
 * 
 * Thread.sleep(10000);
 * 
 * }
 * 
 * public static void test() throws FileNotFoundException { FileInputStream file
 * = new FileInputStream(
 * "D:\\27062020\\27062020Automation\\Basiccorejava\\src\\fileHandling\\TestData.properties"
 * ); }
 * 
 * public static void test2() throws FileNotFoundException { try {
 * FileInputStream file = new FileInputStream(
 * "D:\\27062020\\27062020Automation\\Basiccorejava\\src\\fileHandling\\TestData.properties"
 * ); //} catch (FileNotFoundException e) {
 * 
 * // e.printStackTrace();
 * 
 * public static void test3() throws FileNotFoundException { try {
 * FileInputStream file = new FileInputStream(
 * "D:\\27062020\\27062020Automation\\Basiccorejava\\src\\fileHandling\\TestData.properties"
 * ); //} catch (FileNotFoundException e) {
 * 
 * public static void test4() throws FileNotFoundException { try {
 * FileInputStream file = new FileInputStream(
 * "D:\\27062020\\27062020Automation\\Basiccorejava\\src\\fileHandling\\TestData.properties"
 * ); } catch (FileNotFoundException e) { }
 * 
 * }
 * 
 * }}
 */