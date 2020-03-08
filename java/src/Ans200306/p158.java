package Ans200306;

import java.io.*;
import java.util.Vector;

// 객체 직렬화, 제네릭 이용하기
// 객체 직렬화는 네트워크를 이용하거나 객체를 파일로 저장할때 사용
// 깊은 복사는 따로 클래스를 만들지 않아도 된다, Cloneable을 구현하여 clone메소드를 사용해준다
public class p158 {
    public static void main(String[] args) {
//        writeStudent();
        ObjectStudentRWG<Student> osw = new ObjectStudentRWG<>();
        try {
            osw.read("stu.obj");
        } catch (IOException e) {
            System.out.println(e);
        }
    }


    private static void writeStudent() {
        ObjectStudentRWG<Student> osw = new ObjectStudentRWG<>();
        Vector<Student> v = new Vector<>();
        v.add(new Student("홍길동", 17, "한양"));
        v.add(new Student("홍길순", 15, "순천"));
        v.add(new Student("몽룡", 20, "화천"));
        v.add(new Student("춘향", 18, "삼척"));
        try {
            //만든 객체를 특정경로에 저장한다
            osw.write("stu.obj", v);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    static class Student implements Cloneable, Serializable {
        // 자바 5 에서는 직렬화할떄 사용하는 UID값이다
        private static final long serialVersionUID = 12234214234L;
        private String name;
        private int age;
        private String addr;

        public Student(String name, int age, String addr) {
            this.name = name;
            this.age = age;
            this.addr = addr;
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

        public String getAddr() {
            return addr;
        }

        public void setAddr(String addr) {
            this.addr = addr;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + addr;
        }

        @Override
        protected Object clone() {
            try {
                // 데이터는 같지만 새로운객체를 만든다
                return super.clone();
            } catch (CloneNotSupportedException e) {
                return this;
            }
        }

        @Override
        public boolean equals(Object obj) {
            // 들어오는 데이터를 한꺼번에 비교하기 위해 바꿔준다
            boolean isE = false;
            Student temp = (Student) obj;
            if (temp.getName().equals(name) && temp.getAge() == age && temp.getAddr().equals(addr)) {
                isE = true;
            }
            return isE;
        }

        //equals도 오버라이드 했기에 해시코드도 오버라이드 해준다(부작용방지를 위함)
        // 해시코드값을 동일하게 맞춰준다
        @Override
        public int hashCode() {
            int temp = 0;
            temp = name.hashCode() + addr.hashCode() + age + 37;
            return temp;
        }
    }

    //네트워크 전송 기억하기
    // 1)빨대 꽂기
    // 2)객체 호스 연결
    // 3)객체 저장, 읽기
    static class ObjectStudentRWG<T> { // 제네릭 타입도 정할수 있다(괄호안에 원하는 타입을 만들어서 넣으면된다)
        public int write(String fname, Vector<T> v) throws IOException {
            int objectNumber = 0;
            try {
                // 빨대꽂기
                FileOutputStream fos = new FileOutputStream(fname);
                // 호스연결
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                objectNumber = v.size();
                // 객체 저장
                oos.writeInt(objectNumber);
                System.out.println(objectNumber + "개의 Data가 입력됨");

                for (int i = 0; i < objectNumber; i++) {
                    oos.writeInt(i);
                    oos.writeObject(v.get(i)); // vector에 저장된 객체를 저장한다, 이때 이 객체는 직렬화 되어잇다
                    // 이제 버퍼를 지운다
                    oos.flush();
                    System.out.println(i + "번째의 Data가 입력됨");
                }
                oos.close();
                fos.close();
            } catch (FileNotFoundException e) {
                System.out.println("잘못된 파일 이름을 입력했습니다.");
            } catch (Exception ee) {
                throw new IOException("타입이 이상합니다." + ee);
            }
            return objectNumber;
        }

        public void read(String fname) throws IOException {
            try {
                FileInputStream fis = new FileInputStream(fname);
                ObjectInputStream ois = new ObjectInputStream(fis);
                int objectNumber = ois.readInt();
                System.out.println(objectNumber + "개의 Data를 읽음");
                for (int i = 0; i < objectNumber; i++) {
                    try {
                        System.out.print(ois.readInt() + "번째 : ");
                        System.out.println(ois.readObject());
                    } catch (ClassNotFoundException e) {
                        System.out.println("잘못된 타입입니다.");
                    }
                }
                ois.close();
                fis.close();
            } catch (FileNotFoundException e) {
                System.out.println("잘못된 파일 이름을 입력했습니다.");
            }
        }
    }
}
