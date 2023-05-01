package uz.muu;

import uz.muu.exceptions.*;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        CarRepairing cr = new CarRepairing();

        // Adding list of auto services
        AutoService autoService1 = cr.createAutoService(1, "Avtoritet", new Coordinate(100, 250));
        AutoService autoService2 = cr.createAutoService(2, "Carbox", new Coordinate(-50, -150));
        AutoService autoService3 = cr.createAutoService(3, "Imagine", new Coordinate(-100, 150));
        AutoService autoService4 = cr.createAutoService(4, "Shina.uz", new Coordinate(20, 70));
        AutoService autoService5 = cr.createAutoService(5, "DA Service", new Coordinate(0, 0));
        AutoService autoService6 = cr.createAutoService(6, "AvtoUsta", new Coordinate(150, 350));
        AutoService autoService7 = cr.createAutoService(7, "FazJet", new Coordinate(100, -150));
        AutoService autoService8 = cr.createAutoService(8, "TuningHouse", new Coordinate(-150, -350));
        AutoService autoService9 = cr.createAutoService(9, "Koleso", new Coordinate(350, 550));
        AutoService autoService10 = cr.createAutoService(10, "Sprint", new Coordinate(-350, -450));

        Collection<AutoService> autoServices = cr.getAutoServices();
        try {
            AutoService autoService = cr.getAutoService(7);
        } catch (NoSuchAutoService e) {
            e.printStackTrace();
        }

        try {
            cr.addDriver(1, "Michael Schumacher", "Ferrari");
            cr.addDriver(2, "Max Verstappen", "Honda");
            cr.addDriver(3, "Lewis Hamilton", "Mercedes Benz");
        } catch (DriverAlreadyExist e){
            e.printStackTrace();
        }


        Driver driver=null, driver2=null;
        try {
            driver = cr.getDriver(1);
            driver2 = cr.getDriver(5);
        } catch (NoSuchDriver e){
            System.err.println("Driver NOT found.");
        }

        Collection<Driver> driversList = cr.getDrivers();

        cr.createService(1, "oil change", 50000);
        cr.createService(2, "body repair", 700000);
        cr.createService(3, "diagnostics", 150000);
        cr.createService(4, "battery replacement", 1000000);

        try{
            Service s1 = cr.getService(1);
            Service s2 = cr.getService(2);
        } catch (NoSuchService e){
            System.err.println("Service not fount with that ID");
        }

        List<Service> serviceList = new LinkedList<>();
        try {
            serviceList.add(cr.getService(1));
            serviceList.add(cr.getService(2));
            serviceList.add(cr.getService(3));
        } catch (NoSuchService noSuchService) {
            noSuchService.printStackTrace();
        }


        List<AutoService> autoServiceList = cr.availableAutoService(1, new Coordinate(0, 0), serviceList);
        cr.bookAutoService(1, autoServiceList.get(0).getID(), serviceList);

        double length = cr.findDistanceBetweenTwoCoordinates(new Coordinate(2, 1), new Coordinate(4, 3));

        try {
            System.out.println("Driver " + cr.getDriver(1).getName() + "has booked: " + cr.getNumberOfBookingsByDrivers(1) + " times.");
        } catch (NoSuchDriver noSuchDriver) {
            noSuchDriver.printStackTrace();
        }

        double totalProfit = cr.getAutoServiceTotalProfit(2);

    }


}
