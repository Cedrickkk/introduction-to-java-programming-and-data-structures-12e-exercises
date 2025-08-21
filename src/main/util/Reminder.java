package main.util;

import java.util.ArrayList;
import java.util.List;

public class Reminder {
    public static final List<String> quotes = new ArrayList<>(getMotivationalQuotes());

    public static void remind() {
        String randomQuote = quotes.get((int) (Math.random() * quotes.size()));
        System.out.println("\n" + randomQuote + "\n");
    }

    private static List<String> getMotivationalQuotes() {
        List<String> quotes = new ArrayList<>();

        // Core System/Habit philosophy
        quotes.add("📉 You do not rise to the level of your goals. You fall to the level of your systems. ⚙️");
        quotes.add("🚀 Motivation is what gets you started. Habit is what keeps you going. 🔄");
        quotes.add("🧑‍💻 We are what we repeatedly do. Excellence, then, is not an act, but a habit. ✨");
        quotes.add("📈 The results you get are a lagging measure of your habits. 📊");
        quotes.add("🐜 Success is the sum of small efforts, repeated day in and day out. ☀️");
        quotes.add("🗓️ It's not what we do once in a while that shapes our lives, but what we do consistently. ✅");
        quotes.add("🛠️ Your daily routine is your greatest tool. ⏰");
        quotes.add("🗳️ Every action you take is a vote for the type of person you wish to become. IDENTITY!");

        // Discipline and Consistency focus
        quotes.add("💪 Discipline is choosing between what you want now and what you want most.🎯");
        quotes.add("⚙️ Consistency is more important than perfection. 🧘");
        quotes.add("🌱 Small daily improvements are the key to staggering long-term results.🌳");
        quotes.add("🚶 The journey of a thousand miles begins with a single step.👣");
        quotes.add("👑 Either you run the day, or the day runs you. 🏃");
        quotes.add("🔗 Don't break the chain. ⛓️");

        // Process over Outcome
        quotes.add("🧭 What you get by achieving your goals is not as important as what you become by achieving your goals. TRANSFORMATION.");
        quotes.add("🦋 The value of a habit is not in how much it helps you achieve, but in what it helps you become.➡️🧘");

        // General wisdom
        quotes.add("💡 The best way to predict the future is to create it. 🏗️");
        quotes.add("✨ It always seems impossible until it's done. 🏆");
        quotes.add("🌱 Resilience: Success is not final, failure is not fatal: it is the courage to continue that counts. 🌟");
        quotes.add("🗝️ The secret of getting ahead is getting started. 🚶‍♂️‍➡️");

        // Trust the Process and Pace Yourself
        quotes.add("⏳ Don't rush the process. Great things take time. 🌸");
        quotes.add("🐢 It doesn't matter how slowly you go as long as you do not stop. ✨");
        quotes.add("🚶 The journey is not a race. You'll get there. Just keep walking. 🗺️");
        quotes.add("💧 A river cuts through rock not because of its power, but its persistence. ⛰️");
        quotes.add("💪 Patience is not the ability to wait, but the ability to keep a good attitude while waiting.🧘");

        // Avoiding Comparison
        quotes.add("📏 The only person you should try to be better than is the person you were yesterday.➡️");
        quotes.add("🌱 Comparison is the thief of joy. Focus on your own progress. ☀️");
        quotes.add("🏃‍♂️ Everyone's timing is different. Run your own race. 🏁");
        quotes.add("📖 Your life is your story. Don't compare your chapter one to someone else's chapter twenty. 📚");

        return quotes;
    }
}