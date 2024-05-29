import java.io.*;
import java.net.Socket;

class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 6666)) {
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

            Operation operation = new Operation(2, 2, "+");
            output.writeObject(operation);

            int result = (int) input.readObject();
            System.out.println("Result: " + result);

            output.close();
            input.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
