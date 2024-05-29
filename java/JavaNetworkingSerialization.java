import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

class Operation implements Serializable {
    private static final long serialVersionUID = 1L;
    private int num1;
    private int num2;
    private String operation;

    public Operation(int num1, int num2, String operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getOperation() {
        return operation;
    }
}

class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(6666)) {
            System.out.println("Server is listening on port 6666");
            Socket socket = serverSocket.accept();
            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());

            Operation operation = (Operation) input.readObject();
            int result = 0;

            switch (operation.getOperation()) {
                case "+":
                    result = operation.getNum1() + operation.getNum2();
                    break;
                case "-":
                    result = operation.getNum1() - operation.getNum2();
                    break;
                // Add other operations as needed
            }

            output.writeObject(result);
            input.close();
            output.close();
            socket.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
