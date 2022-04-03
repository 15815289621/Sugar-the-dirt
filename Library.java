import java.util.*;
enum BookType{ SCIENCE("科学"),MEDICINE("医药"),LITERATURE("文学"),FOODCOOKING("饮食"),MAGAZINE("杂志");
	private String Type;
	BookType(){
		
	}
	private BookType(String Type){
		this.Type=Type;
	}
	public String getType() {
		return this.Type;
	}
	
} //图书类型枚举
enum Press{ 
	QINGHUA("清华大学出版社"),
	BEIJING("北京大学出版社"),
	DIANZHI("电子工业出版社"),
	JIXIE("机械工业出版社"),
	ZHUAZHI("杂志期刊主办商");
	private String Press;
	Press(){
		
	}
	private Press(String PressName){
		this.Press=PressName;
	}
	public String getPress() {
		return this.Press;
	}
	}
 //出版社类型枚举
enum Sex{ 
	MAN("男"),WOMAN("女");
	
	private String sexName;
	Sex(){
		
	}
	private Sex(String sexName){
		this.sexName=sexName;
	}
	public String getSex() {
		return this.sexName;
	}
	} //性别枚举 
class Book{  //图书类
    String bookName;
    Press press;
    BookType bookType;
    void printBookInfo(String bookName,int press,int status,int booktype){ 
    	Book B=new Book();
    	B.bookName=bookName;
    	System.out.print(B.bookName+"\t");
    	printPress(press);
    	System.out.print("\t");
    	printStatus(status);
    	System.out.print("\t");
    	printBookType(booktype);
    	System.out.println();
    }//打印图书信息
    void printPress(int press) {
    	switch(press) {
    	case 1:{
    		System.out.print(BookType.SCIENCE.getType());
    		break;
    	}
    	case 2:{
    		System.out.print(BookType.MEDICINE.getType());
    		break;
    	}
    	case 3:{
    		System.out.print(BookType.LITERATURE.getType());
    		break;
    	}
    	case 4:{
    		System.out.print(BookType.FOODCOOKING.getType());
    		break;
    	}
    	case 5:{
    		System.out.print(BookType.MAGAZINE.getType());
    		break;
    	}
    	}
    }

    void printStatus(int i) {
    	switch(i) {
    	case 1:{
    		System.out.print("办理借阅");
    		break;
    	}
    	case 2:{
    		System.out.print("不能租借");
    		break;
    	}
    	}
    	
    }
    void printBookType(int i) {
    	switch(i) {
    	case 1:{
    	}
		System.out.print(Press.QINGHUA.getPress());
		break;
	case 2:{
		System.out.print(Press.BEIJING.getPress());
		break;
	}
	case 3:{
		System.out.print(Press.DIANZHI.getPress());
		break;
	}
	case 4:{
		System.out.print(Press.JIXIE.getPress());
		break;
	}
	case 5:{
		System.out.print(Press.ZHUAZHI.getPress());
		break;
	}
    }
    }
}
class Reader{  //读者类
    String readerName;
    Sex sex;
    Book[] books;
    void printBorrowInfo(String ReaderName,int i){ 
    	Reader r=new Reader();
    	r.readerName=ReaderName;
    	System.out.print("读者名字:"+r.readerName+" ");
    	switch(i) {
    	case 1:{
    		System.out.print("性别:"+Sex.MAN.getSex()+" ");
    		break;
    	}
    	case 0:{
    		System.out.print("性别:"+Sex.WOMAN.getSex()+" ");
    		break;
    	}
    	default:
    		System.out.print("错误！"+"  ");
    	}
    	System.out.println("该读者的借阅信息如下");
    	System.out.println("图书名称"+"\t\t"+"出版社"+"\t"+"借阅"+"\t"+"编号");
    }  //打印该读者的借阅信息
} 


public class Library {
	public static void main (String[] args) { 
	//Library Library=new Library();
	Reader R1=new Reader();
	Book B1=new Book();
	R1.printBorrowInfo("李红",0);
	B1.printBookInfo("数据库原理",1,1,1);
	B1.printBookInfo("医学与美容",2,1,2);
	B1.printBookInfo("平凡的世界",3,1,3);
	System.out.println();
	Reader R2=new Reader();
	Book B2=new Book();
	R2.printBorrowInfo("肖明",1);
	B2.printBookInfo("饮食与健康",4,1,4);
	B2.printBookInfo("计算机基础",2,1,2);
	B2.printBookInfo("计算机科学",5,2,5);
	
	}
	
}
