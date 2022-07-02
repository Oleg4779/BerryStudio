package com.berryStudio.controllers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int menuPointNumber = 0;
		String enteredNumber = "";
		try (Scanner scanner = new Scanner(System.in)) {
			do {
				System.out.println("Выберите пункт меню: ");
				System.out.println("1. Добавить запись");
				System.out.println("2. Изменить запись");
				System.out.println("3. Удалить запись");
				System.out.println("4. Показать все записи");
				System.out.println("5. Выход");
				enteredNumber = scanner.next();
				try {
					menuPointNumber = Integer.parseInt(enteredNumber);
				} catch (NumberFormatException e) {
					System.out.println("Нужно ввести число");
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
					System.out.println("Работа программы завершена");
					break;
				}
				default:
					System.out.println("В меню нет такого пункта. Попробуйте ещё раз: ");
				}
			} while (menuPointNumber != 5);
		}
	}
}
