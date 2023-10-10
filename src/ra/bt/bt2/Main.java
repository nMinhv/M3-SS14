package ra.bt.bt2;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(i, "student " + i, Math.random() * 10);
        }
        bubbleSort(students);
        selectionSort(students);
        insertSort(students);
        for (Student student : students
        ) {
            student.display();
        }
    }
    public static void bubbleSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            for (int j = 0; j < students.length - i; j++) {
                if (students[j].getScore() > students[j + 1].getScore()) {
                    swap(students,j,j+1);
                }
            }
        }
    }

    public static void selectionSort(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < students.length; j++) {
                if (students[minIndex].getScore() > students[j].getScore()) {
                    minIndex = j;
                }
            }
            swap(students, minIndex, i);

        }
    }


    public static void insertSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            for (int j = i; j > 0 && students[j].getScore() > students[j-1].getScore() ; j--) {
                swap(students,j,j-1);
            }
        }
    }


    public static void swap(Student[] students, int a, int b) {
        Student temp = students[a];
        students[a] = students[b];
        students[b] = temp;
    }
}
