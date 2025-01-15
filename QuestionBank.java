import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionBank {
    private static final int[] PRIZE_LEVELS = {
        1000, 2000, 3000, 5000, 10000, 20000, 40000, 80000, 
        160000, 320000, 640000, 1250000, 2500000, 5000000, 10000000
    };

    public static ArrayList<Question> getQuestions() {
        ArrayList<Question> questions = new ArrayList<>();
        
        // Easy Questions 
        questions.add(new Question("What is the capital of India?", 
            new String[]{"Delhi", "Mumbai", "Kolkata", "Chennai"}, 0, 1));
        questions.add(new Question("Which planet is known as the Red Planet?", 
            new String[]{"Mars", "Earth", "Venus", "Jupiter"}, 0, 1));
        questions.add(new Question("What is 2 + 2?", 
            new String[]{"4", "3", "5", "6"}, 0, 1));
        questions.add(new Question("Which animal is known as the king of the jungle?", 
            new String[]{"Lion", "Tiger", "Elephant", "Giraffe"}, 0, 1));
        questions.add(new Question("How many days are there in a week?", 
            new String[]{"7", "6", "8", "5"}, 0, 1));
        questions.add(new Question("Who was the first Prime Minister of India?", 
            new String[]{"Jawaharlal Nehru", "Mahatma Gandhi", "Lal Bahadur Shastri", "Indira Gandhi"}, 0, 1));
        questions.add(new Question("Which river is the longest in India?", 
            new String[]{"Ganga", "Yamuna", "Brahmaputra", "Godavari"}, 0, 1));
        questions.add(new Question("What is the national sport of India?", 
            new String[]{"Hockey", "Cricket", "Football", "Kabaddi"}, 0, 1));
        questions.add(new Question("Which city is known as the Pink City of India?", 
            new String[]{"Jaipur", "Udaipur", "Jodhpur", "Bikaner"}, 0, 1));
        questions.add(new Question("Who is known as the 'Iron Man of India'?", 
            new String[]{"Sardar Vallabhbhai Patel", "Jawaharlal Nehru", "Bhagat Singh", "Subhash Chandra Bose"}, 0, 1));

        // Medium-Easy Questions
        questions.add(new Question("Who wrote 'Romeo and Juliet'?", 
            new String[]{"William Shakespeare", "Charles Dickens", "Jane Austen", "Mark Twain"}, 0, 2));
        questions.add(new Question("What is the chemical symbol for Gold?", 
            new String[]{"Au", "Ag", "Fe", "Cu"}, 0, 2));
        questions.add(new Question("Which country is known for the Great Wall?", 
            new String[]{"China", "India", "Russia", "Japan"}, 0, 2));
        questions.add(new Question("What is the largest ocean on Earth?", 
            new String[]{"Pacific", "Atlantic", "Indian", "Arctic"}, 0, 2));
        questions.add(new Question("Who painted the Mona Lisa?", 
            new String[]{"Leonardo da Vinci", "Pablo Picasso", "Vincent van Gogh", "Michelangelo"}, 0, 2));
        questions.add(new Question("Which state in India is famous for the Sun Temple at Konark?", 
            new String[]{"Odisha", "Rajasthan", "Gujarat", "Uttar Pradesh"}, 0, 2));
        questions.add(new Question("What is the national tree of India?", 
            new String[]{"Banyan", "Neem", "Peepal", "Mango"}, 0, 2));
        questions.add(new Question("Who was the first Indian woman to win a Nobel Prize?", 
            new String[]{"Mother Teresa", "Indira Gandhi", "Sarojini Naidu", "Kiran Bedi"}, 0, 2));
        questions.add(new Question("Which Indian city is known as the 'Silicon Valley of India'?", 
            new String[]{"Bangalore", "Hyderabad", "Pune", "Chennai"}, 0, 2));
        questions.add(new Question("Which freedom fighter gave the slogan 'Do or Die'?", 
            new String[]{"Mahatma Gandhi", "Bhagat Singh", "Subhash Chandra Bose", "Lala Lajpat Rai"}, 0, 2));

        // Medium Questions 
        questions.add(new Question("Which element has the atomic number 1?", 
            new String[]{"Hydrogen", "Helium", "Carbon", "Oxygen"}, 0, 3));
        questions.add(new Question("What is the capital of Australia?", 
            new String[]{"Canberra", "Sydney", "Melbourne", "Perth"}, 0, 3));
        questions.add(new Question("Who discovered penicillin?", 
            new String[]{"Alexander Fleming", "Louis Pasteur", "Marie Curie", "Robert Koch"}, 0, 3));
        questions.add(new Question("What is the speed of light?", 
            new String[]{"299,792 km/s", "199,792 km/s", "399,792 km/s", "499,792 km/s"}, 0, 3));
        questions.add(new Question("Which year did World War II end?", 
            new String[]{"1945", "1944", "1946", "1943"}, 0, 3));
        questions.add(new Question("What is the capital of the Indian state of Sikkim?", 
            new String[]{"Gangtok", "Aizawl", "Itanagar", "Imphal"}, 0, 3));
        questions.add(new Question("Who was the first Indian to win an Oscar?", 
            new String[]{"Bhanu Athaiya", "A.R. Rahman", "Satyajit Ray", "Resul Pookutty"}, 0, 3));
        questions.add(new Question("Which Indian monument is known as the 'Symbol of Love'?", 
            new String[]{"Taj Mahal", "Qutub Minar", "Red Fort", "India Gate"}, 0, 3));
        questions.add(new Question("Which Indian classical instrument is associated with Pt. Ravi Shankar?", 
            new String[]{"Sitar", "Tabla", "Veena", "Flute"}, 0, 3));
        questions.add(new Question("Which Indian state is the largest producer of tea?", 
            new String[]{"Assam", "West Bengal", "Kerala", "Tamil Nadu"}, 0, 3));

        
        questions.add(new Question("What is the motto of the Indian Navy?", 
            new String[]{"Sham No Varunah", "Satyameva Jayate", "Bharat Mata Ki Jai", "Jai Hind"}, 0, 4));
        questions.add(new Question("Who founded the Indian National Army (INA)?", 
            new String[]{"Subhash Chandra Bose", "Bhagat Singh", "Mahatma Gandhi", "Bal Gangadhar Tilak"}, 0, 4));
        questions.add(new Question("Which planet is known as Earth's twin?", 
            new String[]{"Venus", "Mars", "Jupiter", "Saturn"}, 0, 4));
        questions.add(new Question("Which Indian state has the longest coastline?", 
            new String[]{"Gujarat", "Maharashtra", "Andhra Pradesh", "Tamil Nadu"}, 0, 4));
        questions.add(new Question("What is the name of the first satellite launched by India?", 
            new String[]{"Aryabhata", "Bhaskara", "Rohini", "INSAT-1A"}, 0, 4));

        // Level 4 Questions
        questions.add(new Question("Which Indian missile is named after a great mathematician?", 
            new String[]{"Agni", "Prithvi", "Brahmos", "Trishul"}, 0, 4));
        questions.add(new Question("Which Indian scientist is known as the 'Missile Man of India'?", 
            new String[]{"A.P.J. Abdul Kalam", "C.V. Raman", "Homi Bhabha", "Vikram Sarabhai"}, 0, 4));
        questions.add(new Question("What was the first nuclear test conducted by India called?", 
            new String[]{"Smiling Buddha", "Pokhran-II", "Operation Shakti", "Peaceful Nuclear"}, 0, 4));
        questions.add(new Question("Which space mission of ISRO discovered water on the Moon?", 
            new String[]{"Chandrayaan-1", "Mangalyaan", "ASTROSAT", "GSAT-1"}, 0, 4));

        // Level 5 Questions
        questions.add(new Question("In which year was the Quit India Movement launched?", 
            new String[]{"1942", "1940", "1945", "1930"}, 0, 5));
        questions.add(new Question("Which dynasty built the Khajuraho temples?", 
            new String[]{"Chandela", "Maurya", "Gupta", "Chola"}, 0, 5));
        questions.add(new Question("What is the full form of ISRO?", 
            new String[]{"Indian Space Research Organisation", "Indian Scientific Research Organisation", "Indian Satellite Research Organisation", "Indian Space Robotics Organisation"}, 0, 5));
        questions.add(new Question("Which battle marked the beginning of British rule in India?", 
            new String[]{"Battle of Plassey", "Battle of Panipat", "Battle of Buxar", "Battle of Haldi Ghati"}, 0, 5));
        questions.add(new Question("Who was the first Indian to receive the Bharat Ratna?", 
            new String[]{"Dr. S. Radhakrishnan", "C. Rajagopalachari", "Jawaharlal Nehru", "Dr. Rajendra Prasad"}, 0, 5));
        questions.add(new Question("Who was the first Indian woman in space?", 
            new String[]{"Kalpana Chawla", "Sunita Williams", "Valentina Tereshkova", "Sally Ride"}, 0, 5));
        questions.add(new Question("Which ancient Indian university is considered the oldest in the world?", 
            new String[]{"Nalanda", "Takshashila", "Vikramshila", "Vallabhi"}, 0, 5));
        questions.add(new Question("Who is known as the 'Father of the Indian Constitution'?", 
            new String[]{"B.R. Ambedkar", "Rajendra Prasad", "Jawaharlal Nehru", "Sardar Patel"}, 0, 5));
        questions.add(new Question("Which Indian scientist received the Nobel Prize for Physics in 1930?", 
            new String[]{"C.V. Raman", "Satyendra Nath Bose", "Jagadish Chandra Bose", "Meghnad Saha"}, 0, 5));
        questions.add(new Question("Which city hosted the first-ever Kumbh Mela in recorded history?", 
            new String[]{"Haridwar", "Prayagraj", "Ujjain", "Nashik"}, 0, 5));
        questions.add(new Question("What is the theme of the Indian National Emblem?", 
            new String[]{"Satyameva Jayate", "Unity in Diversity", "Vande Mataram", "Jai Hind"}, 0, 5));
        questions.add(new Question("Which ruler is credited for building the Grand Trunk Road?", 
            new String[]{"Sher Shah Suri", "Akbar", "Babur", "Humayun"}, 0, 5));
        questions.add(new Question("Which ancient Indian text is considered the first known treatise on politics?", 
            new String[]{"Arthashastra", "Manusmriti", "Mahabharata", "Ramayana"}, 0, 5));
        questions.add(new Question("Which Indian mathematician is known for his contributions to infinite series?", 
            new String[]{"Srinivasa Ramanujan", "Aryabhata", "Bhaskara", "Brahmagupta"}, 0, 5));

        
        for (Question question : questions) {
            shuffleOptions(question);
        }

        return questions;
    }

    private static void shuffleOptions(Question question) {
        String correctAnswer = question.getOptions()[question.getCorrectIndex()];
        List<String> optionsList = new ArrayList<>(List.of(question.getOptions()));
        Collections.shuffle(optionsList);
        question.setOptions(optionsList.toArray(new String[0]));
        question.updateCorrectIndex(correctAnswer);
    }

    public static int getPrizeMoney(int level) {
        if (level >= 0 && level < PRIZE_LEVELS.length) {
            return PRIZE_LEVELS[level];
        }
        return 0;
    }
}
