//package FileOperation;
//
//import java.io.File;
//import java.io.IOException;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.edge.EdgeDriver;
//
// 
//
//public class ExcelWrite {
//	public static void main(String[] args)throws IOException{
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\eclipse-workspace\\Excel\\target\\msedgedriver.exe");	
//		Web
////		
////         WebDriver driver = new EdgeDriver();
////      
////         String url="https://www.facebook.com/";
////         driver.navigate().to(url);
////         driver.manage().window().maximize();
////         WebElement email = driver.findElement(By.id("email"));
////         email.sendKeys("varunkumarsaravanan@gmail.com");
////         WebElement pswd= driver.findElement(By.name("pass"));
////         pswd.sendKeys("Varun@9198");
//		
//	}
//	
//}

























//	File b=new File("C:\\Users\\DELL\\eclipse-workspace\\Excel\\target\\Book1.xlsx");
//	FileOutputStream b1= new FileOutputStream (b);
//XSSFWorkbook book= new XSSFWorkbook();
//XSSFSheet sheet= book.createSheet("NovBatch");
//
//List <String> l= new ArrayList<String>();
// l.add("hari");
// l.add("fathil");
// l.add("karthi");
// l.add("azar");
// l.add("arun");
// 
// for(int i=0;i<l.size();i++) {
//XSSFRow row= sheet.createRow(i+0);
//XSSFCell Cell = row.createCell (i+0);
//Cell.setCellValue(l.get(i));
//	
//}
//book.write(b1);
//}
	
//	FileInputStream b2= new FileInputStream (b);
//XSSFWorkbook book1= new XSSFWorkbook();
//XSSFSheet sheet1= book.getSheet("NovBatch");
//
//for(int i=0;i<sheet1.getPhysicalNumberOfRows();i++) {
//	XSSFRow row1= sheet1.getRow(i+0);
//	XSSFCell Cell1 = row1.getCell (0);
//	String CellValue=Cell1.getStringCellValue();
//	System.out.println(CellValue);
//	
//	}
//}



