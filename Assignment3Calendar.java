/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3calendar;

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author S0556309
 */
public class Assignment3Calendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int usrOpt, calNmr = 0, calChoice, m, y; //usrOpt - Users input for choice below
        String[] calName = new String[10]; // Variable for name of Calendar
        String mthYr;
        Event e;
        Scanner in = new Scanner(System.in);
        ArrayList<EventsCalendar> calendars = new ArrayList<EventsCalendar>();

        do {
            System.out.println("/nPlease enter your choice from the available options:"
                    + "/n1) Add a new Calendar."
                    + "/n2) Add a new event to an existing Calendar."
                    + "/n3) Display empty Calendar."
                    + "/n4) Display all events in a specific calendar for a specific month/year"
                    + "/n5) Display all event reminders for closely approaching within a coming number of days you specify"
                    + "/n6) Exit program.");
            System.out.print(": ");;
            usrOpt = in.nextInt(); // usrOption here

            switch (usrOpt) {
                case 1: //1) Add new Calendar
                    System.out.println("Enter name of the new Calendar: ");
                    calName[calNmr] = in.next();
                    calendars.add(new EventsCalendar(calName[calNmr]));
            }
        } while (usrOpt != 6);

    }
}

class EventsCalendar {
    //storng the coloring strings as class constants

    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_RED = "\u001B[31m";
    final String ANSI_BLUE = "\u001B[34m";
    final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    String name;
    ArrayList<Event> calEvents = new ArrayList<Event>();
    Calendar dispDate;
    static int calNum = 0;
    int thisCalNum;
    int eventsCtr;
    final int WIDTH = 20;
    final int WEEK = 7;

    public EventsCalendar(String n) {
        dispDate = Calendar.getInstance();
        dispDate.set(2000, 1, 1);
        name = n;
        calNum++;
        eventsCtr = 0;
        thisCalNum = calNum;
        printCalendar(true); // print calendar w/o events
    }

    public Event addEvent() {
        Scanner in = new Scanner(System.in);
        in.useDelimiter("\\n");
        Calendar eventCal;
        String[] inviteesList;
        String iList;
        Event e = new Event();
        eventsCtr++;
        calEvents.add(e);
        System.out.println("Please enter event's type? (meeting, appointment, social, birthday, deadline)");
        e.setEventsType((in.next()));
        System.out.println("Please enter event's title?");
        e.setTitle(in.next());
        System.out.println("Please enter event's priority?");
        e.setPriority((in.nextInt()));
        System.out.println("Please enter event's time: 00-23");
        e.setTime((in.nextInt()));
        System.out.println("Please enter event's day of month (1-31):");
        e.setDay((in.nextInt()));
        System.out.println("Please enter event's month (1-12):");
        e.setMonth((in.nextInt()));
        System.out.println("Please enter event's year:");
        e.setYear((in.nextInt()));
        System.out.println("Please enter list of invitees seperated by commas:");
        iList = in.next();
        inviteesList = iList.split(",",0);
        e.setInviteesList(inviteesList);
        
        return e;
    }

    class Event {
        

    }
}
