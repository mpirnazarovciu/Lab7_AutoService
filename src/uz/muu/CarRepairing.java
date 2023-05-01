package uz.muu;

import uz.muu.exceptions.*;

import java.util.Collection;
import java.util.List;

public class CarRepairing {

	public AutoService createAutoService(int ID, String name, Coordinate coordinate) {
		return null;
	}

	public Collection<AutoService> getAutoServices() {
		return null;
	}

	public Driver addDriver(int ID, String fullName, String carModel) throws DriverAlreadyExist {
		return null;
	}

	public Collection<Driver> getDrivers() {
		return null;
	}

	public Driver getDriver(int ID) throws NoSuchDriver {
		return null;
	}

	public Service createService(int ID, String serviceName, double cost) {
		return null;
	}

	public Service getService(int ID) throws NoSuchService {
		return null;
	}

	public List<AutoService> availableAutoService(int driverID, Coordinate currentCoordinate, List<Service> serviceList){

		return null;
	}

	public boolean bookAutoService(int driverID, int autoServiceID, List<Service> serviceList){

		return false;
	}

	public double findDistanceBetweenTwoCoordinates(Coordinate startingCoordinate, Coordinate destinationCoordinate){
		double xMin = Math.min(Math.abs(startingCoordinate.getxAxes()), Math.abs(destinationCoordinate.getxAxes()));
		double xMax = Math.max(Math.abs(startingCoordinate.getxAxes()), Math.abs(destinationCoordinate.getxAxes()));
		double yMin = Math.min(Math.abs(startingCoordinate.getyAxes()), Math.abs(destinationCoordinate.getyAxes()));
		double yMax = Math.max(Math.abs(startingCoordinate.getyAxes()), Math.abs(destinationCoordinate.getyAxes()));

		double xLength = xMax - xMin;
		double yLength = yMax - yMin;
		double length = Math.sqrt(xLength*xLength + yLength*yLength);

		return length;
	}

	public int getNumberOfBookingsByDrivers(int driverID) {

		return -1;
	}

	public double getAutoServiceTotalProfit(int serviceID) {

		return -1;
	}

	public AutoService getAutoService(int ID) throws NoSuchAutoService{
		return null;
	}



}
