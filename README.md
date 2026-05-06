# 📝 To-Do List App
### Final Project — Java Class 254

---

## 👩‍💻 Authors

- **Lorrany Evangelista Schiavo Magalhaes**
- **Elayne Vilela**

---

## 📖 Description

This project is a To-Do List application built as the final project for Java Class CIS 254. It comes in two versions:

- **Java Console Version** (`ToDoList.java`) — a terminal-based task manager that runs in the console. It uses `ArrayList` to store and manage tasks dynamically at runtime, allowing users to add, view, complete, and delete tasks through a numbered menu.

- **HTML Visual Version** (`index.html`) — a modern, browser-based interface for the same To-Do List. Built with HTML, CSS, and JavaScript, it offers a clean visual experience with real-time task tracking, a progress bar, filters, and data persistence through `localStorage` so tasks are saved even after closing the browser.

Both versions share the same core logic and features — the HTML version is simply a visual upgrade over the console version.

---

## 📁 Project Structure

```
project/
├── .git/                  ← Git version control (auto-generated)
├── .vscode/               ← VS Code workspace settings
├── src/                   ← All source files live here
│   ├── App.java           ← Java Swing welcome screen (name + age input)
│   ├── ToDoList.java      ← Java console-based To-Do List
│   ├── index.html         ← HTML/CSS/JS visual To-Do List
│   └── .gitignore         ← Tells Git what not to upload
├── lib/                   ← External libraries (currently empty)
├── bin/                   ← Compiled Java .class files (auto-generated)
└── README.md              ← This file
```

> **Note:** The `bin/` folder is auto-generated when you compile Java files. It does not need to be edited manually.

---

## 🚀 How to Use

### Running the HTML Version (recommended)

1. Open the project in **Visual Studio Code**
2. Install the **Live Server** extension by Ritwick Dey (Extensions tab → search "Live Server")
3. Open `src/index.html`
4. Click **"Go Live"** at the bottom right of VS Code
5. The app will open in your browser automatically

**Features available in the browser:**
- Add a new task by typing and pressing **Enter** or clicking **+ Add**
- Click the **circle button** on any task to mark it as completed
- Click the **✕ button** to delete a task
- Use the **All / Active / Completed** filters to sort your view
- Tasks are **automatically saved** in the browser — they persist after refresh

---

### Running the Java Console Version

1. Open the project in **Visual Studio Code**
2. Install the **Extension Pack for Java** by Microsoft (Extensions tab → search "Extension Pack for Java")
3. Open `src/ToDoList.java`
4. Click the **▶ Run** button above the `main` method
5. The console will open at the bottom of VS Code

**Console menu options:**
```
1. Add a task
2. View tasks
3. Mark a task as completed
4. Delete a task
5. Exit
```

---

### Running the Java Swing Welcome Screen

1. Open `src/App.java`
2. Click the **▶ Run** button above the `main` method
3. A small window will pop up asking for your first name and age
4. Type your name and age, then click **OK**

---

## 🛠️ Technologies Used

|Technology        | Purpose 

| Java             | Console app logic and Swing welcome screen 
| Java `ArrayList` | Dynamic task storage at runtime 
| Java Swing       | Desktop GUI window for welcome screen 
| HTML5            | Structure of the visual To-Do List 
| CSS3             | Styling, animations, and layout 
| JavaScript       | App logic and interactivity in the browser 
| `localStorage`   | Saves tasks in the browser between sessions 
| VS Code          | Code editor 
| GitHub           | Version control and project hosting 
