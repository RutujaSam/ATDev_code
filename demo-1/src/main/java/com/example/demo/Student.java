
package com.example.demo;

import jakarta.persistence.*;

@Entity
	@Table(name = "students")
	public class Student {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false)
	    private String name;

	    @Column(nullable = false)
	    private int age;
	    
	    @Column(nullable = false)
	    private String emailId;
	    
	    @Column(nullable = false)
	    private String departmentName;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public String getDepartmentName() {
			return departmentName;
		}

		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", age=" + age + ", emailId=" + emailId
					+ ", departmentName=" + departmentName + "]";
		}

		public Student(Long id, String name, int age, String emailId, String departmentName) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.emailId = emailId;
			this.departmentName = departmentName;
		}

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
	    

	}



