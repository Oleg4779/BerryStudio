package com.berryStudio.controllers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int menuPointNumber = 0;
		String enteredNumber = "";
		try (Scanner scanner = new Scanner(System.in)) {
			do {
				System.out.println("�������� ����� ����: ");
				System.out.println("1. �������� ������");
				System.out.println("2. �������� ������");
				System.out.println("3. ������� ������");
				System.out.println("4. �������� ��� ������");
				System.out.println("5. �����");
				enteredNumber = scanner.next();
				try {
					menuPointNumber = Integer.parseInt(enteredNumber);
				} catch (NumberFormatException e) {
					System.out.println("����� ������ �����");
				}

				switch (menuPointNumber) {
				case 1: {
					InsertController insertController = new InsertController();
					insertController.insertRow();
					break;
				}
				case 2: {
					EditController editController = new EditController();
					editController.editRow();
					break;
				}
				case 3: {
					DeleteController deleteController = new DeleteController();
					deleteController.deleteRow();
					break;
				}
				case 4: {
					ShowAllController showAll = new ShowAllController();
					showAll.showAllRows();
					break;
				}
				case 5: {
					System.out.println("������ ��������� ���������");
					break;
				}
				default:
					System.out.println("� ���� ��� ������ ������. ���������� ��� ���: ");
				}
			} while (menuPointNumber != 5);
		}
	}
}
