import java.util.*;

public class InspireBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Map<String, String[]> quotes = new HashMap<>();

        quotes.put("happy", new String[]{
            "Keep smiling - your happiness is contagious! 😊",
            "Happiness is not by chance, but by choice. 🌸",
            "You’re glowing today - keep spreading light! ✨"
        });

        quotes.put("sad", new String[]{
            "Tough times never last, but tough people do. 💪",
            "Even the darkest night will end and the sun will rise. 🌅",
            "You are stronger than you think, Preeti. ❤️"
        });

        quotes.put("tired", new String[]{
            "Rest if you must, but don’t quit. 🌻",
            "You’re doing amazing - take a deep breath. 🌬️",
            "Small breaks bring big energy! 🌞"
        });

        quotes.put("studying", new String[]{
            "The expert in anything was once a beginner. 📚",
            "Focus on progress, not perfection. 🎯",
            "Your hard work will open doors soon! 🚪"
        });

        quotes.put("anxious", new String[]{
            "Inhale courage, exhale fear. 🌿",
            "You’ve handled 100% of your bad days so far. 🌈",
            "Trust yourself - you are enough. 💖"
        });

        quotes.put("creative", new String[]{
            "Creativity takes courage - keep making magic! 🎨",
            "Art is how you decorate space; creativity is how you decorate your soul. 🌼",
            "Your ideas matter - bring them to life! 🚀"
        });

        System.out.println("🌟 Welcome to InspireBot!");
        System.out.print("How are you feeling today? (happy / sad / tired / studying / anxious / creative)\n> ");
        String mood = scanner.nextLine().trim().toLowerCase();

        if (quotes.containsKey(mood)) {
            String[] moodQuotes = quotes.get(mood);
            String quote = moodQuotes[random.nextInt(moodQuotes.length)];
            System.out.println("\n" + quote);
        } else {
            System.out.println("\n💬 I may not understand that mood yet, but remember: you’re amazing just as you are!");
        }

        System.out.println("\n💖 Thanks for chatting with InspireBot. Stay positive!");
        scanner.close();
    }
}
