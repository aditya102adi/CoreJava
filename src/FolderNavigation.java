import java.util.*;

public class FolderNavigation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Deque<String> pathStack = new ArrayDeque<>();

        List<String> output = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String command = sc.nextLine().trim();

            if (command.startsWith("cd ")) {
                String arg = command.substring(3).trim();
                if (arg.equals("..")) {
                    if (!pathStack.isEmpty()) {
                        pathStack.removeLast();
                    }
                } else {
                    pathStack.addLast(arg);
                }
            } else if (command.equals("pwd")) {
                StringBuilder path = new StringBuilder("/");
                for (String dir : pathStack) {
                    path.append(dir).append("/");
                }
                output.add(path.toString());
            }
        }

        // Print all pwd outputs
        for (String out : output) {
            System.out.println(out);
        }

        // Print final path
        StringBuilder finalPath = new StringBuilder("/");
        for (String dir : pathStack) {
            finalPath.append(dir).append("/");
        }

        System.out.println("Final Path : " + finalPath.toString());
    }
}
