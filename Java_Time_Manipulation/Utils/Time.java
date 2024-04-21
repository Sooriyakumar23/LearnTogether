package Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Exception.SecondsRangeExceeded;
import Exception.TimeRangeExceeded;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time() {
    }

    public Time(String timeString) {
        String[] timeStringArray = timeString.split(" : ");
        this.hours = Integer.parseInt(timeStringArray[0]);
        this.minutes = Integer.parseInt(timeStringArray[1]);
        this.seconds = Integer.parseInt(timeStringArray[2]);
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return String.format("%02d : %02d : %02d", this.hours, this.minutes, this.seconds);
    }

    public String generateTimeByUser() {
        Scanner readData = new Scanner(System.in);

        System.out.print("Enter hours: ");
        String hoursString = readData.nextLine();

        System.out.print("Enter minutes: ");
        String minutesString = readData.nextLine();

        System.out.print("Enter seconds: ");
        String secondsString = readData.nextLine();

        try {
            this.hours = Integer.parseInt(hoursString);
            this.minutes = Integer.parseInt(minutesString);
            this.seconds = Integer.parseInt(secondsString);

            if (hours < 0 || minutes < 0 || minutes > 59 || seconds < 0 || seconds > 59) {
                throw new TimeRangeExceeded();
            }

            return this.toString();
        } catch (NumberFormatException ex) {
            return ("hours/minutes/seconds should be integer");
        } catch (TimeRangeExceeded ex) {
            return ("hours/minutes/seconds should be within a range");
        } catch (Exception ex) {
            return ("Unexpected Error Occurred");
        } finally {
            readData.close();
        }
    }

    public List<String> generateTimesBySystem(String countString) {

        List<String> generatedTimesBySystem = new ArrayList<>();

        if (countString == null) {
            Scanner readData = new Scanner(System.in);
            System.out.print("Enter Number Of Times to Generate: ");
            countString = readData.nextLine();
            readData.close();
        }

        int count = Integer.parseInt(countString);

        while (count > 0) {
            Random random = new Random();

            this.hours = random.nextInt(24);
            this.minutes = random.nextInt(60);
            this.seconds = random.nextInt(60);

            generatedTimesBySystem.add(this.toString());

            count -= 1;
        }
        
        return generatedTimesBySystem;
    }

    public String addTimes(List<Time> times) {

        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;

        int quotient = 0;
        int remainder = 0;

        seconds = quotient;
        for (Time time : times) {
            seconds += time.getSeconds();
        }
        quotient = seconds / 60;
        remainder = seconds % 60;
        this.seconds = remainder;

        minutes = quotient;
        for (Time time : times) {
            minutes += time.getMinutes();
        }
        quotient = minutes / 60;
        remainder = minutes % 60;
        this.minutes = remainder;

        hours = quotient;
        for (Time time : times) {
            hours += time.getHours();
        }

        return this.toString();
    }

    public List<String> convertSecondsToTimes(int secondsToConvertMax) {

        List<String> convertedSecondsToTimes = new ArrayList<>();

        Scanner readData = new Scanner(System.in);

        try {

            System.out.print("Enter Number Of Times to Generate: ");
            String iterations = readData.nextLine();

            for (int i=1; i<=Integer.parseInt(iterations); i++) {
                System.out.printf("%d. Enter Seconds to Convert: ", i);
                String secondsToConvertString = readData.nextLine();
                int secondsToConvert = Integer.parseInt(secondsToConvertString);

                if (secondsToConvert < 0 || secondsToConvert > secondsToConvertMax) {
                    throw new Exception("Seconds Range Exceeded");
                }

                this.seconds = secondsToConvert;
                this.minutes = secondsToConvert;
                this.hours = secondsToConvert;

                String convertedTimeString = this.toString();
                convertedSecondsToTimes.add(convertedTimeString);
            }

        } catch (NumberFormatException ex) {
            System.out.println("hours/minutes/seconds should be integer");
        } catch (SecondsRangeExceeded ex) {
            System.out.println("hours/minutes/seconds should be within a range");
        } catch (Exception ex) {
            System.out.println("Unexpected Error Occurred");
        }
        
        readData.close();
        return convertedSecondsToTimes;

    }

}