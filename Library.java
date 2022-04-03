import java.util.*;
enum BookType{ SCIENCE("��ѧ"),MEDICINE("ҽҩ"),LITERATURE("��ѧ"),FOODCOOKING("��ʳ"),MAGAZINE("��־");
	private String Type;
	BookType(){
		
	}
	private BookType(String Type){
		this.Type=Type;
	}
	public String getType() {
		return this.Type;
	}
	
} //ͼ������ö��
enum Press{ 
	QINGHUA("�廪��ѧ������"),
	BEIJING("������ѧ������"),
	DIANZHI("���ӹ�ҵ������"),
	JIXIE("��е��ҵ������"),
	ZHUAZHI("��־�ڿ�������");
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
 //����������ö��
enum Sex{ 
	MAN("��"),WOMAN("Ů");
	
	private String sexName;
	Sex(){
		
	}
	private Sex(String sexName){
		this.sexName=sexName;
	}
	public String getSex() {
		return this.sexName;
	}
	} //�Ա�ö�� 
class Book{  //ͼ����
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
    }//��ӡͼ����Ϣ
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
    		System.out.print("�������");
    		break;
    	}
    	case 2:{
    		System.out.print("�������");
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
class Reader{  //������
    String readerName;
    Sex sex;
    Book[] books;
    void printBorrowInfo(String ReaderName,int i){ 
    	Reader r=new Reader();
    	r.readerName=ReaderName;
    	System.out.print("��������:"+r.readerName+" ");
    	switch(i) {
    	case 1:{
    		System.out.print("�Ա�:"+Sex.MAN.getSex()+" ");
    		break;
    	}
    	case 0:{
    		System.out.print("�Ա�:"+Sex.WOMAN.getSex()+" ");
    		break;
    	}
    	default:
    		System.out.print("����"+"  ");
    	}
    	System.out.println("�ö��ߵĽ�����Ϣ����");
    	System.out.println("ͼ������"+"\t\t"+"������"+"\t"+"����"+"\t"+"���");
    }  //��ӡ�ö��ߵĽ�����Ϣ
} 


public class Library {
	public static void main (String[] args) { 
	//Library Library=new Library();
	Reader R1=new Reader();
	Book B1=new Book();
	R1.printBorrowInfo("���",0);
	B1.printBookInfo("���ݿ�ԭ��",1,1,1);
	B1.printBookInfo("ҽѧ������",2,1,2);
	B1.printBookInfo("ƽ��������",3,1,3);
	System.out.println();
	Reader R2=new Reader();
	Book B2=new Book();
	R2.printBorrowInfo("Ф��",1);
	B2.printBookInfo("��ʳ�뽡��",4,1,4);
	B2.printBookInfo("���������",2,1,2);
	B2.printBookInfo("�������ѧ",5,2,5);
	
	}
	
}
