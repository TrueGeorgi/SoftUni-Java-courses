import java.util.Scanner;

public class A01_WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String travelPlan = scanner.nextLine();
        StringBuilder builder = new StringBuilder(travelPlan);
        String command = scanner.nextLine();
        while (!command.equals("Travel")) {
            String action = command.split(":")[0];
            switch (action) {
                case "Add Stop":
                    int indexStop = Integer.parseInt(command.split(":")[1]);
                    String newInput = command.split(":")[2];
                    if (indexStop < builder.length() && indexStop >= 0) {
                        builder.insert(indexStop, newInput);
                    }
                    break;
                case "Remove Stop":
                    int indexStart = Integer.parseInt(command.split(":")[1]);
                    int indexEnd = Integer.parseInt(command.split(":")[2]);
                    if (indexStart >= 0 && indexStart < builder.length()
                            && indexEnd >=0 && indexEnd < builder.length()) {
                        builder.delete(indexStart, indexEnd + 1);
                    }
                    break;
                case "Switch":
                    String oldString = command.split(":")[1];
                    String newString = command.split(":")[2];
                    String builderStr = String.valueOf(builder);
                    if (builderStr.contains(oldString)) {
                       builderStr = builderStr.replaceAll(oldString, newString);
                       builder = new StringBuilder(builderStr);
                    }
                    break;
            }
            System.out.println(builder);
            command = scanner.nextLine();
        }
        System.out.print("Ready for world tour! Planned stops: ");
        System.out.println(builder);
    }
}
