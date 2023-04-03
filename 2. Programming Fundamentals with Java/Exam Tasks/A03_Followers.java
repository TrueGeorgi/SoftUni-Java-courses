import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class A03_Followers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Integer> likes = new LinkedHashMap<>();
        Map<String, Integer> comments = new LinkedHashMap<>();

        while (!input.equals("Log out")) {
            String action = input.split("\\s+")[0];
            switch (action) {
                case "New":
                    String usernameNew = input.split("\\s+")[2];
                    if (!likes.containsKey(usernameNew)) {
                        likes.put(usernameNew, 0);
                        comments.put(usernameNew, 0);
                    }
                    break;
                case "Like:":
                    String username = input.split("\\s+")[1].replace(":", "");
                    int likesCount = Integer.parseInt(input.split("\\s+")[2]);
                    if (!likes.containsKey(username)) {
                        likes.put(username, likesCount);
                        comments.put(username, 0);
                    } else {
                        int newLikes = likesCount + likes.get(username);
                        likes.put(username, newLikes);
                    }
                    break;
                case "Comment:":
                    username = input.split("\\s+")[1];
                    if (!comments.containsKey(username)) {
                        comments.put(username, 1);
                        likes.put(username, 0);
                    } else {
                        int newCommentsCount = 1 + comments.get(username);
                        comments.put(username, newCommentsCount);
                    }
                    break;
                case "Blocked:":
                    username = input.split("\\s+")[1];
                    if (likes.containsKey(username)) {
                        likes.remove(username);
                        comments.remove(username);
                    } else {
                        System.out.println(username + " doesn't exist.");
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        int countFollowers = likes.size();
        System.out.printf("%d followers%n", countFollowers);
        for (Map.Entry<String, Integer> entry : likes.entrySet()) {
            String username = entry.getKey();
            int sumLikesAndComments = entry.getValue() + comments.get(entry.getKey());
            System.out.printf("%s: %d%n", username, sumLikesAndComments);
        }
    }
}
