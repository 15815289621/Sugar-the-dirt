import java.util.*;

public class Student {
	String name;
	String sex;
	public Student() {
		
	}
	public Student(String name,String sex) {
		this.name=name;
		this.sex=sex;
		
	}
	Subject[] subjects;
	Collection<Subject> subject=new ArrayList<Subject>();
	class Subject{
		String subjectName;
		String st;
		SubjectType SJ=new SubjectType();
		void setType() {
			SJ.Type=st;
			SJ.setRatio();
		}
		int atten;
		int assign;
		int lab;
		int finalExam;
		
	}
	//考查考试不同的比例情况（权重）
		static class SubjectType{
			String Type;
			double attenRatio;
			static final double assignRatio=0.1;
			static final double labRatio=0.1;
			double finalRatio;
			void setRatio() {
				if("考查".equals(Type)) {
					attenRatio=0.2;
					finalRatio=0.6;
				}else if("考试".equals(Type)) {
					attenRatio=0.1;
					finalRatio=0.7;
				}
			}
		}
	
	//输入成绩
	public void inScore(String name,String type,int atten,int assign,int lab,int finalExam )
	{
		Student s=new Student();
		Student.Subject sub=s.new Subject();
		sub.subjectName=name;
		sub.st=type;
		sub.setType();
		sub.atten=atten;
		sub.assign=assign;
		sub.lab=lab;
		sub.finalExam=finalExam;
		subject.add(sub);
	}
	
	//打印方法
	public void printInfo() {
		class calcScore{
			int calsTotal(Subject y) {
				double a=y.atten*y.SJ.attenRatio;
				double b=y.assign*y.SJ.assignRatio;
				double c=y.lab*y.SJ.labRatio;
				double d=y.finalExam*y.SJ.finalRatio;
				return(int)(a+b+c+d);
			}
		}
		calcScore cs=new calcScore();
		System.out.println("姓名："+name+"  "+"性别："+sex);
		System.out.println("课程"+"\t"+"性质"+"\t"+"出勤"+"\t"+"作业"+"\t"+"实验"+"\t"+"期末"+"\t"+"总分");
		System.out.println("====================================================");
		for(int i=0;i<subject.size();i++) {
			Subject y=((ArrayList<Subject>) subject).get(i);
			System.out.println(y.subjectName+"\t"+y.st+"\t"+y.atten+"\t"+y.assign+"\t"+y.lab+"\t"+y.finalExam+"\t"+cs.calsTotal(y));
			
		}
	}
	
	public static void main(String[] args) {
		Student s1=new Student("李红","女");
		s1.inScore("java","考查",90,85,75,80);
		s1.inScore("SQL","考查",80,90,82,75);
		s1.inScore("J2EE","考查",78,70,65,70);
		s1.printInfo();
		System.out.println();
		System.out.print("====================================================");
		System.out.println();
		Student s2=new Student("王晓明","男");
		s2.inScore("java","考查",86,67,71,70);
		s2.inScore("SQL","考查",77,70,85,66);
		s2.inScore("J2EE","考查",88,74,68,80);
		s2.printInfo();
		System.out.println();
	}
}
