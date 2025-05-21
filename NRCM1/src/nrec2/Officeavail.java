package nrec2;
class DeviceDefeatException extends Exception {
    public DeviceDefeatException(String message) {
        super(message);
    }
}
public class Officeavail {

	 public void use(String deviceName) throws DeviceDefeatException {
		 if (deviceName.equalsIgnoreCase("printer1") || deviceName.equalsIgnoreCase("printer3")) {
	            System.out.println("Available");
	        } else {
	            throw new DeviceDefeatException("Device failure: Not Available");
	        }
	    }

	    public static void main(String[] args) {
	        try {
	            if (args.length == 0) {
	                throw new IllegalArgumentException("No device name provided.");
	            }

	            String devname = args[0];
	            Officeavail device = new Officeavail();
	            device.use(devname);

	        } catch (DeviceDefeatException e) {
	            System.out.println(e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	}

}
