
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 Group Members:
	Chevannese Ellis, 2301109
	Kehvoi Thompson, 2304224
	Janae Bernard, 2209025
	Karlicia Sutherland, 2302691
	Kay-Ann Green, 2110490

	Day/Time of Practical Class: Wed3pm

	The admin Password for Processing Officer and JCFOfficer is admin
 */

public class Main {

	// Global variable to hold the ticket number
	private static int ticketNum = 7;
	//PPL1003
	private static int ppvNum = 1003;
	private static String ppvLicense;
	private static int option;
	private static String choice;
	private static String policeRecord;
	private static String accident;
	private static String outstandingTicket;
	private static String applicantResult;
	private static String newInfo;

	private static int trnInput;
	private static String parishInput;
	private static String dobString;

	private static String result;
	private static Scanner scan = new Scanner(System.in);
	private static String adminPass = "admin";
	private static String passcode;
	//Global variables for ticket

	private static LocalDate today = LocalDate.now();
	private static LocalDate weeks = today.plusWeeks(3);
	private static LocalDate courtDateInput = weeks.plusWeeks(1);
	private static int offenseCodeInput;
	private static String offenseDescInput;
	private static int fineAmtInput;
	private static int totalUnpaidTicInput;
	private static int totalFineAmtInput;
	private static boolean warrantInput = false;
	private static String ticketPayStatusInput = "Unpaid";
	private static boolean state = true;
	private static int ticketNumInput;

	//private static String filePath5 = "ppv_records.csv";
	//private static String filePath4 = "ppvCount.txt";
	private static String filePath3 = "ticket_records.csv";
	private static String filePath2 = "driver_records.csv";
	private static String filePath = "ticketCount.txt";


	public static void main(String[] args)
	{
		//Declaration of ArrayLists
		ArrayList<Driver> Drivers = new ArrayList<>();
		ArrayList<Ticket> Tickets = new ArrayList<>();
		ArrayList<PPVLicense> PPVHolders = new ArrayList<>();

		//Default User 1
		Name d1 = new Name("John", "Brown");
		Address a1 = new Address(19,"Maldave Avenue","Kingston");
		Driver driver1 = new Driver(123456789,d1, LocalDate.parse("2000-05-05"),a1, "john.brown@gmail.com", "8768403526", "Male");

		//Default Tickets for User 1
		Address t1 = new Address(144,"Maxfield Ave","Kingston");
		Address t2 = new Address(69,"Public West Building","Kingston");
		Address t3 = new Address(24,"Sutton Street","Kingston");
		Address t4 = new Address(36,"Camp Road","Kingston");
		Address t5 = new Address(79,"Duke Street","Kingston");
		Address t6 = new Address (69, "Wilford Street","Kingston");

		Ticket defaultTic1 = new Ticket(123456789, 1, LocalDate.parse("2019-01-01"), LocalDate.parse("2019-01-22"), 1, "Aid And Abet No Driverb
