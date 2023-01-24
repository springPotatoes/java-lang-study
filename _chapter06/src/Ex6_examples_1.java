public class Ex6_examples_1 {


  public static void main(String[] args) {
    Student s = new Student();
    s.name = "학생이름";
    s.ban = 1;
    s.no = 1;
    s.kor = 100;
    s.eng = 60;
    s.math = 76;
  }
}

class Student {

  String name;
  int ban;
  int no;
  int kor;
  int eng;
  int math;
}