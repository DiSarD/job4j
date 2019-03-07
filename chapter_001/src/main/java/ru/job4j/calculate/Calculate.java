package ru.job4j.calculate;

/**
 * Class Класс для вывода текста на экран "Hello World"
 * @author a.mkakrov
 * @since 06.03.2018 
 * @version 1
 */
public class Calculate {
	
	/**
	 * Mian.
	 * @param args - args.
	 */	
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
	
	/**
     * Method echo.
     * @param name Your name.
     * @return Echo plus your name.
     */
	public String echo(String name) {
		return "Echo, echo, echo : " + name;
	}

}