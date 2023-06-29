package AE02_VehiclesExtension;

public interface Drivable {

    default String canDrive(String vehicle, double km) {
        String formattedKm = Utils.formatDouble(km);
        return String.format("%s travelled %s km", vehicle, formattedKm);
    };

    default String cannotDrive(String vehicle) {
        return String.format("%s needs refueling", vehicle);
    };
}
