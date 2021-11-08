package codingStudy;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class OldSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // ���� N���� �Է¹���
		Person[] ps = new Person[N]; // �Է¹��� ������ŭ�� PersonŬ������ �迭�� �������
		for (int i = 0; i < N; i++) {// ó�� �Է¹��� ������ŭ �ݺ�
			ps[i] = new Person(sc.nextInt(), sc.next());// ps[i]���� Person��ü ���� �� Scanner�� �Ű������� �Է¹ް� �־� ��
		}
//	�ϳ��� ��ü�� �� ���� �̻��� ������ �ִ� ����̰� ���̸� �������� �����ϱ� ������ Java���� �����ϴ� Comparable�� Comparator �������̽��� �̿�
		Arrays.sort(ps, new Comparator<Person>() {
			// ���̼����� ����
			@Override
			public int compare(Person o1, Person o2) { // ���,0,������ �ϳ��� ��ȯ�ϸ� ����� ��� �� ��ü�� ��ġ�� �ٲ���
				return o1.age - o2.age; //s1�� ���̿� s2�� ���̸� ���� �� �� ����� ��ȯ o1�� ���̰� ������ ��ü�� ��ġ ����
//				compare�޼ҵ�� �ռ� ���Ѱſ� ���� ���,0,������ ���ϵǰ� ����� ��쿡�� �� ��ü�� ��ġ�� �ٲ��ֱ� ������
//				���࿡ �� ����� ���̰� ���ٸ� 0�� ���� �� ���̰� �� ��ü�� �ڸ��� ������ ������ �ڿ������� ���� ������ ���ĵȴ�.
			}

		});

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			// ��ü�迭�� ��ü�� ����ϸ� �ش� �ε����� ��ü�� toString() �� ��� ��
			sb.append(ps[i]); //StringBuilder�� ������ ��ü�� sb�� .append�� ps[i]�� ���� �־��ش�.
		}

		System.out.println(sb);

	}

	public static class Person {
		int age; // �������� age����
		String name; // �������� name����

		public Person(int age, String name) {
			this.age = age; // �������� age�� �Ű������� �޾ƿ� age��
			this.name = name; // �������� name�� �Ű������� �޾ƿ� name��
		}

		@Override
		public String toString() { // toString�� override(������)
//�ν��Ͻ��� ���� ����� �� �׳� �ν��Ͻ��� �ְų� �⺻ toString()�޼ҵ带 ����ϸ� �ؽð��� ������ �̻��� ���� ���

			return age + " " + name + "\n";
		}

	}
//	���� : ��Կ�/Java/ 	ó������ for���� if���� ����Ͽ� �� �� intŸ���� ������ �����Ͽ� ū ���� ���Խ�Ű�� ������ �ڵ尡 ������� Array.sort�� ����Ͽ� �����Ͽ����ϴ�!
//					 	�迭�� ���� �� �ȴٰ� ���������� ������ Ǯ�鼭 ���� �迭�� �����ϴ� �������� ���� �ظ޼� �𸣴°� ���ٴ� ���� ���ݰ� �Ǿ����ϴ�!

}