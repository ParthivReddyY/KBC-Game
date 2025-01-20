# **Kaun Banega Crorepati (KBC) Game** 🎮🎉  

This is a Java-based implementation of the iconic quiz game **Kaun Banega Crorepati (KBC)**. The game features an engaging graphical user interface (GUI) 🖥️ and includes lifelines, a comprehensive question bank 📚, and a scoring mechanism 💰. It was developed as part of an Object-Oriented Programming (OOP) project.  

---

## **Key Features** ✨  
- **Interactive GUI** 🖱️: A user-friendly interface for immersive gameplay.  
- **Extensive Question Bank** 📖: Contains 50-60 unique questions to ensure a varied experience with minimal repetition.  
- **Lifelines for Assistance** 🆘:  
  - **50-50** ➗: Eliminates two incorrect options, leaving one correct and one incorrect answer.  
  - **Audience Poll** 📊: Simulates audience opinions, displaying percentage votes for each option.  
  - **Expert Advice** 💡: Provides a hint or suggestion to guide the player.  
- **Progress Tracking** 📈: Displays player winnings 💵 and progress after each question.  
- **Graceful Exit** 🚪: Handles incorrect answers by exiting the game in a user-friendly manner.  

---

## **Installation Instructions** 🛠️  
1. **Download the Project** 📥:  
   - Clone the repository or download the zip file.  
   - If downloaded as a zip file, extract the contents to your desired directory.  

2. **Compile the Source Code** 🔧:  
   - Navigate to the `src` folder where the Java files are located.  
   - Compile all the Java files using the following command:  
     ```bash  
     javac *.java  
     ```  

3. **Run the Game** ▶️:  
   - Execute the main class to start the game:  
     ```bash  
     java MainClass  
     ```  

4. **Optional: Create an Executable JAR File** 📦:  
   - Package the game into a runnable JAR file for easy execution. Follow the steps below:  
     - Navigate to the `src` folder.  
     - Create a manifest file (`manifest.txt`) with the following content:  
       ```
       Main-Class: MainClass  
       ```  
     - Package the JAR using:  
       ```bash  
       jar cfm KBCGame.jar manifest.txt *.class  
       ```  
     - Run the JAR file:  
       ```bash  
       java -jar KBCGame.jar  
       ```  

---

## **How to Play** 🎯  
1. Launch the game:  
   - Use the command line to execute the main program or the JAR file:  
     ```bash  
     java MainClass  
     ```  
     or  
     ```bash  
     java -jar KBCGame.jar  
     ```  

2. Answer questions by selecting the correct option from the multiple choices provided. ✅  

3. Utilize the lifelines strategically:  
   - **50-50** ➗: Removes two incorrect answers.  
   - **Audience Poll** 📊: Provides a graphical representation of audience votes.  
   - **Expert Advice** 💡: Offers helpful hints for challenging questions.  

4. Continue answering to accumulate winnings 💰. The game ends when:  
   - ❌ You answer incorrectly.  
   - 🏆 You reach the final question and win the grand prize!  

---

## **Future Improvements** 🚀  
- **Save Progress** 💾: Introduce a feature to save and resume the game.  
- **Custom Question Bank** ✍️: Allow users to add their own questions.  
- **Multiplayer Mode** 👥: Enable competitive play with friends.  

---

Feel free to suggest enhancements or report issues to improve the game further. Have fun playing **Kaun Banega Crorepati**! 🎉  

---  

### **Notes** 📝  
- Replace `MainClass` with the actual name of your main class if different.  
- If using a build tool (e.g., Maven or Gradle), include additional steps for setup and execution.  

--- 
