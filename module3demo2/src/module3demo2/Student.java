/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module3demo2;

public class Student extends Person
{
  
   private int studentID;
   private String major;
   
   
   /**
    * default constructor
    */
   public Student () {
	   super();
	   major = "Unknown";
	   studentID = 0;
	   
   }
   
   /**
    * 
    * @param name
    * @param birthYear
    * @param studentID
    * @param major
    */
   public Student (String name, int birthYear, int studentID, String major ) {
	   
	   super (name, birthYear);
	   this.major = major;
	   this.studentID = studentID;
   }
   
   /**
    * 
    * @return major of the student
    */
   public String getMajor() {
	   
	   return major;
   }
   
   /**
    * 
    * @return ID of the the student
    */
   public double getStudentID() {
	   
	   return studentID;
   }
  /**
   * 
   * @param major of the student
   */
   public void setMajor(String major) {
	   
	   this.major = major;
	   
   }
   /**
    * 
    * @param gpa of the student 
    */
   public void setStudentID(int studentID) {
	   
	   this.studentID = studentID;
   }
   
   /**
	 * The better way of writing equals method.
	 * This method overrides the equals method in the Object class
	 * @param p
	 * @return true if the major of the students are the same
	 */
   @Override
	public boolean equals (Object p) {
		
		boolean result ;
		if(p == null)
			result = false;
                else if (this.getClass() != p.getClass())
                    result = false;
		else 
		{
		  Student stu = (Student)p;
		
		  result = this.major.equals(stu.major) && this.getName().equals(stu.getName());
		}
		
		return result;
		
	}
        @Override
        public String getDescription()
        {
            return ("I am a student with a major " + major);
        }
   /**
    * @return string representation of the state of the student object
    */
   @Override
   public String  toString()
   {
        return 
        		super.toString()
        		+ ",[ Major = " + major 
        		+ " ,Student ID = " + studentID 
        		+ " ]";
   }
}
