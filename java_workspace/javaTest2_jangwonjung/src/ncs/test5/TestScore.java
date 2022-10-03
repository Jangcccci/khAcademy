package ncs.test5;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[][] scores = new double[3][3];
		for(int i = 0 ; i < scores.length; i++) {
			for(int j = 0; j < scores[0].length; j++) {
				System.out.print("학생" + (i + 1) + "의 과목" + (j + 1) + "점수를 입력하세요.");
				scores[i][j] = sc.nextDouble();
			}
		}

		double[] totalScore = new double[scores[0].length];
		double[] average = new double[totalScore.length];

		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[0].length; j++) {
				totalScore[i] += scores[i][j];
			}
		}

		for (int i = 0; i < totalScore.length; i++) {
			average[i] = totalScore[i] / 3;
		}

		System.out.printf("%-5s %-5s %-5s %-5s %-5s %-5s\n", "index", "과목1", "과목2", "과목3", "총점", "평균");
		for(int i = 0; i < scores.length; i++) {
			System.out.printf("%-5d %-5.1f %-5.1f %-5.1f %-5.1f %-5.1f\n", i, scores[i][0], scores[i][1], scores[i][2], totalScore[i], average[i]);
		}

	}
}
