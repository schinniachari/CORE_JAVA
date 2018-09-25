package com.chinni.basics.covariant.returns;
class Test_CovariantReturns{
	public static void main(String[] args){
	 College cg=new ExamHall();
	 College cg1=new StaffRoom();

	 Person p=cg.getPerson();
	 Person p1=cg1.getPerson();
	 System.out.println(p.name);
	 System.out.println(p1.name);
	if (p instanceof  Student){
	 Student s=(Student)p; 
	 System.out.println(s.branch);
	}
    if (p1 instanceof  Faculty){
	Faculty f=(Faculty)p1; 
	 System.out.println(f.sal);
	}

	}
}
