package com.reg.collections;

import java.util.ArrayList;
import java.util.List;

public class ObjectCall {

	public List<Student> getdata() {

		List<Student> sList = new ArrayList<>();

		Student s = new Student();

		s.name = "rahul";
		s.id = "12251006";
		s.mobileno = "8885558889";
		sList.add(s);

		StudentAddress sa = new StudentAddress();

		sa.doorno = "245";
		sa.city = "guntur";
		sa.streetname = "richfields";
		sa.pincode = 560037;

		s.sadd = sa;

		Student s1 = new Student();

		s1.name = "yash";
		s1.id = "12251007";
		s1.mobileno = "8885558881";
		sList.add(s1);

		StudentAddress sa1 = new StudentAddress();

		sa1.doorno = "246";
		sa1.city = "guntur";
		sa1.streetname = "richfields";
		sa1.pincode = 560038;

		s1.sadd = sa1;

		Student s2 = new Student();

		s2.name = "akhi";
		s2.id = "12251008";
		s2.mobileno = "8885558885";
		sList.add(s2);

		StudentAddress sa2 = new StudentAddress();

		sa2.doorno = "247";
		sa2.city = "guntur";
		sa2.streetname = "whitefield";
		sa2.pincode = 560039;

		s2.sadd = sa2;

		Student s3 = new Student();

		s3.name = "arulkarthik";
		s3.id = "12251022";
		s3.mobileno = "8885888803";
		sList.add(s3);

		StudentAddress sa3 = new StudentAddress();

		sa3.doorno = "249";
		sa3.city = "guntur";
		sa3.streetname = "domulur";
		sa3.pincode = 560025;

		s3.sadd = sa3;

		return sList;
	}

	public void display() {
		
		List<Student> disply = getdata();
		
		System.out.println("student details are:");
		
		for (Student st : disply) {
			
			System.out.println("\nstudent name :"+ st.name);
			System.out.println("student id:"+ st.id);
			System.out.println("student mobile no:"+ st.mobileno);
			
			System.out.println("\nstudent address----------- :");
			
			System.out.println("student door no:"+ st.sadd.doorno);
			System.out.println("student city"+ st.sadd.city);
			System.out.println("student streetname:"+st.sadd.streetname);
			System.out.println("student pincode:"+ st.sadd.pincode);
			
			
					}
		
		}
}
