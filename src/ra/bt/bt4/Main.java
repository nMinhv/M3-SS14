package ra.bt.bt4;

import ra.bt.bt2.Student;

public class Main {
    static FootballTeam[] footballTeams = new FootballTeam[10];

    public static void main(String[] args) {
        for (int i = 0; i < footballTeams.length; i++) {
            footballTeams[i] = new FootballTeam(i, "student " + i, (int) (Math.random() * 10));
        }
        bubbleSort();
        selectionSort();
        insertSort();
        for (FootballTeam footballTeam : footballTeams
        ) {
            footballTeam.display();
        }
    }

    public static void bubbleSort() {
        for (int i = 1; i < footballTeams.length; i++) {
            for (int j = 0; j < footballTeams.length - i; j++) {
                if (footballTeams[j].getScore() > footballTeams[j + 1].getScore()) {
                    swap(footballTeams, j, j + 1);
                }
            }
        }
    }

    public static void selectionSort() {
        for (int i = 0; i < footballTeams.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < footballTeams.length; j++) {
                if (footballTeams[minIndex].getScore() > footballTeams[j].getScore()) {
                    minIndex = j;
                }
            }
            swap(footballTeams, minIndex, i);

        }
    }

    public static void insertSort() {
        for (int i = 1; i < footballTeams.length; i++) {
            for (int j = i; j > 0 && footballTeams[j].getScore() > footballTeams[j - 1].getScore(); j--) {
                swap(footballTeams, j, j - 1);
            }
        }
    }

    public static void swap(FootballTeam[] footballTeams, int a, int b) {
        FootballTeam temp = footballTeams[a];
        footballTeams[a] = footballTeams[b];
        footballTeams[b] = temp;
    }
}
